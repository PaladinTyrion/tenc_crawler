/**
 * @author Yotouchen
 */

package cn.com.paladintyrion.client.controller.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import cn.com.paladintyrion.client.bean.HttpRequestInfo;
import cn.com.paladintyrion.client.cache.HttpInfoQueue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpRequestUtil {

	/**
	 * 发送http get请求
	 * @param url
	 * @param params
	 * @return
	 */
	public static String httpGetRequest(String url,Map<String,String> params){
		
		String result = "";
		
		if(url == null){
			log.info("url == null");
			return null;
		}
		
		if(url.equals("")){
			log.info("url is an empty string");
			return null;
		}
		
		HttpClient httpClient = new DefaultHttpClient();
		
		if(params == null){
			
		}else if(params.size() < 1){
			
		}else{
			
			url = url + "?";
			
			Set<Entry<String,String>> set = params.entrySet();
			Iterator<Entry<String,String>> it = set.iterator();
			while(it.hasNext()){
				Entry<String,String> entry = it.next();
				String key = entry.getKey();
				String value = entry.getValue();
				url = url + key + "=" + value;
				
				if(it.hasNext()){
					url += "&";
				}
				
			}
		}
		
		StringBuffer urlBuffer = new StringBuffer(url);
        StringBuffer resultBuffer = new StringBuffer(); 
        //利用URL生成一个HttpGet请求  
        HttpGet httpGet;
        try {
        	httpGet = new HttpGet(urlBuffer.toString()); 
		} catch (Exception e) {
			log.error("传进来的Url错误" + urlBuffer);
			return null;
		}
        
        HttpHead header=new HttpHead();
//        header.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//        header.addHeader("Accept-Encoding", "gzip,deflate,sdch");
//        header.addHeader("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6");
//        header.addHeader("Cache-Control", "max-age=0");
//        header.addHeader("Connection", "keep-alive");
//        header.addHeader("Host", "so.iqiyi.com");
//        header.addHeader("Referer", "http://www.iqiyi.com/");
        header.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.116 Safari/537.36");
        
        httpGet.setHeaders(header.getAllHeaders());
        
        BufferedReader bufferedReader = null;
        HttpResponse httpResponse = null;
        try {  
        	
        	Long requestStart = System.currentTimeMillis();
        	
            //HttpClient发出一个HttpGet请求  
        	httpResponse = httpClient.execute(httpGet); 
        	
        	Long requestEnd = System.currentTimeMillis();
        	
	        //得到httpResponse的状态响应码  
	        int statusCode = httpResponse.getStatusLine().getStatusCode(); 
//	        log.debug("status code:"+statusCode+"  url:"+url);
	        
	        //获取http请求信息
        	HttpRequestInfo info = new HttpRequestInfo();
        	info.setUrl(url);
        	info.setMethod(httpGet.getMethod());
        	info.setStatusCode(statusCode);
        	Header[] requestHeaders = httpGet.getAllHeaders();
        	info.setRequestHeaders(requestHeaders);
        	Header[] responseHeaders = httpResponse.getAllHeaders();
        	info.setResponseHeaders(responseHeaders);
        	List<Cookie> requestCookies = ((AbstractHttpClient) httpClient).getCookieStore().getCookies();
        	info.setRequestCookies(requestCookies);
        	info.setRequestStart(requestStart);
        	info.setRequestEnd(requestEnd);
        	
        	HttpInfoQueue.addInfoAtEnd(info);
	        
	        if (statusCode == HttpStatus.SC_OK) {  
	            //得到httpResponse的实体数据  
	            HttpEntity httpEntity=httpResponse.getEntity();  
	            if (httpEntity!=null) {  
	            
	                bufferedReader=new BufferedReader  
	                (new InputStreamReader(httpEntity.getContent(), "UTF-8"), 8*1024);  
	                String line=null;  
	                while ((line=bufferedReader.readLine())!=null) {  
	                    resultBuffer.append(line+"\n");  
	                }  
	                //利用从HttpEntity中得到的String
	                result = resultBuffer.toString();
	                 
	            }  
	        } 
	        
        } catch (Exception e) {  
        	log.error("http get请求出错");
        } finally{
        	//HttpClientUtils.closeQuietly(httpClient);
        	httpGet.releaseConnection();
        	httpClient.getConnectionManager().closeIdleConnections(0, TimeUnit.SECONDS);
        }
		
		return result;
	}
	
	public static String httpPostRequest(String url,Map<String,String> params){
		
		String result = "";
		List<NameValuePair> paramsList = new ArrayList<NameValuePair>();
		
		if(params == null){
			
		}else{
			Set<Entry<String,String>> entrySet = params.entrySet();
			for(Entry<String,String> entry:entrySet){
				NameValuePair nameValuePair = new BasicNameValuePair(entry.getKey(),entry.getValue());
				paramsList.add(nameValuePair);
			}
		}
		HttpClient httpClient = new DefaultHttpClient();
		try {
			UrlEncodedFormEntity entity = null;
			entity = new UrlEncodedFormEntity(paramsList, "UTF-8");
			
			HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(entity);
			
			
			
			Long requestStart = System.currentTimeMillis();
			
			HttpResponse httpResponse = httpClient.execute(httpPost); 
			
			Long requestEnd = System.currentTimeMillis();
			
            int statusCode = httpResponse.getStatusLine().getStatusCode();
//            log.debug("status code:"+statusCode+"  url:"+url);
            
            //获取http请求信息
        	HttpRequestInfo info = new HttpRequestInfo();
        	info.setUrl(url);
        	info.setMethod(httpPost.getMethod());
        	info.setStatusCode(statusCode);
        	Header[] requestHeaders = httpPost.getAllHeaders();
        	info.setRequestHeaders(requestHeaders);
        	Header[] responseHeaders = httpResponse.getAllHeaders();
        	info.setResponseHeaders(responseHeaders);
        	List<Cookie> requestCookies = ((AbstractHttpClient) httpClient).getCookieStore().getCookies();
        	info.setRequestCookies(requestCookies);
        	info.setRequestStart(requestStart);
        	info.setRequestEnd(requestEnd);
        	
        	HttpInfoQueue.addInfoAtEnd(info);
			
            if (statusCode == 200) {  
                // 得到httpResponse的实体数据  
                HttpEntity httpEntity = httpResponse.getEntity();  
                if (httpEntity != null) {  
    
                    BufferedReader bufferedReader = new BufferedReader(  
                    new InputStreamReader(httpEntity.getContent(),"UTF-8"), 8 * 1024);  
                    StringBuffer resultBuffer = new StringBuffer();  
                    String line = null;  
                    while ((line = bufferedReader.readLine()) != null) {  
                    	resultBuffer.append(line + "\n");  
                        }  
                    // 利用从HttpEntity中得到的String生成JsonObject  
                    result =resultBuffer.toString();  
                    
                }  
			}
			httpPost.releaseConnection();
		} catch (Exception e) {
			log.error("http post请求出错",e);
		}finally{
        	//HttpClientUtils.closeQuietly(httpClient);
			httpClient.getConnectionManager().closeIdleConnections(0, TimeUnit.SECONDS);
        }
		
		return result;
	}
	
}
