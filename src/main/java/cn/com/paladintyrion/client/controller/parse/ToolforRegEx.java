/**
 * 
 */
package cn.com.paladintyrion.client.controller.parse;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.extern.slf4j.Slf4j;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.VideoType;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;

/**
 * @author ZhouBin
 * 对请求返回的数据进行标准化截断; 对接收的url进行内容提取
 */
@Slf4j
public class ToolforRegEx {

	/**
	 * 解析Json需要使用的正则匹配
	 */
	public ToolforRegEx() {
		
	}
	
	public static String getNumfromStr(String Str){//取出字符串中所有数字
		String Num = "";
		Pattern pattern = Pattern.compile("[^0-9]"); 
	    Matcher matcher = pattern.matcher(Str);
	    Num = matcher.replaceAll("").trim();
		return Num;	
	}
	
	public static String getMidbrackets(String str){//取出中括号中的内容
		String strInMidbrackets = null;
		Pattern pattern = Pattern.compile("\\[(.*)\\]");  
	    Matcher matcher = pattern.matcher(str);
	    if (matcher.find()){
	    	strInMidbrackets = matcher.group(1);
	    }
		return strInMidbrackets;	
	}
	
	public static String getInBigbrackets(String str){//取出最外层大括号中的内容
		String strInBigbrackets = null;
		Pattern pattern = Pattern.compile("(\\{(.*)\\})");  
	    Matcher matcher = pattern.matcher(str);
	    if (matcher.find()){
	    	strInBigbrackets = matcher.group(1);
	    }
		return strInBigbrackets;	
	}
	
	public static String getInbrackets(String str){//取出小括号中的内容
		String strInMidbrackets = null;
		Pattern pattern = Pattern.compile("\\((.*)\\)");  
	    Matcher matcher = pattern.matcher(str);
	    if (matcher.find()){
	    	strInMidbrackets = matcher.group(1);
	    }
		return strInMidbrackets;	
	}

	public static String getInSinglequotes(String str){//取出''中的内容
		String strInSinglequotes = null;
		Pattern pattern = Pattern.compile("\\'(.*)\\'");  
	    Matcher matcher = pattern.matcher(str);
	    if (matcher.find()){
	    	strInSinglequotes = matcher.group(1);
	    }
		return strInSinglequotes;	
	}
	
	public static String getInDoublequotes(String str){//取出""中的内容
		String strInSinglequotes = null;
		Pattern pattern = Pattern.compile("\\\"(.*)\\\"");  
	    Matcher matcher = pattern.matcher(str);
	    if (matcher.find()){
	    	strInSinglequotes = matcher.group(1);
	    }
		return strInSinglequotes;	
	}
	
	public static String getCuts(String html, String begin, String end){//取出begin与end中的截断内容
		int beginlocation = html.indexOf(begin);
		String idStr ="";
		if(beginlocation != -1){
			idStr = html.substring(beginlocation+begin.length());
			int endlocation = idStr.indexOf(end);
			idStr = idStr.substring(0, endlocation);
		}
		return idStr;
	}
	
	public static String getAfterFrontSlash(String SlashStr) {//取出左斜杠右边的数字内容
		// TODO Auto-generated method stub
		String strAfterFrontSlash = "";
		Pattern pattern = Pattern.compile("\\/(.*)");  
	    Matcher matcher = pattern.matcher(SlashStr);
	    if (matcher.find()){
	    	strAfterFrontSlash = matcher.group(1);
	    }
	    strAfterFrontSlash = ToolforRegEx.getNumfromStr(strAfterFrontSlash);
		return strAfterFrontSlash;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vid = "7Di6QuN8AYq|7jnA8cOkq7W|7Ed94Hgl9tE|7aa92Vaqxva|7uDhkr7yCvk";
		int end = vid.indexOf("|");
		vid = vid.substring(0,end);
		log.info(vid);
	}
}
