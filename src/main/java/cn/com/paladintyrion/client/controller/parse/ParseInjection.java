/**
 * 
 */
package cn.com.paladintyrion.client.controller.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;

import lombok.extern.slf4j.Slf4j;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.com.paladintyrion.client.bean.CollectAddress;
import cn.com.paladintyrion.client.bean.VideoType;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;
import cn.com.paladintyrion.client.thread.ParseInjectionMovieUrlTask;
import cn.com.paladintyrion.client.thread.ParseInjectionShowUrlTask;
import cn.com.paladintyrion.client.thread.ParseInjectionTVUrlTask;
import cn.com.paladintyrion.client.thread.ParseThreadPool;
import cn.com.paladintyrion.client.thread.ParseVideoInfoTask;
import cn.com.paladintyrion.client.thread.ParseVideoPropertyTask;

/**
 * @author ZhouBin
 * 该类做腾讯视频入口页的解析，将解析到URL及剧集名入库至t_collect_address表
 */
@Slf4j
public class ParseInjection {
	public static final String TV_Injection = "http://v.qq.com/list/2_-1_-1_-1_1_0_0_20_-1_-1_0.html";//电视剧
	public static final String MOVIE_Injection = "http://v.qq.com/movielist/10001/0/0/1/0/20/0/0.html";//电影
	public static final String VARIETY_SHOW_Injection = "http://v.qq.com/variety/type/list_-1_1_0.html";//综艺: 按照热度订制的入口
	
	public static final String TV_HEAD_Injection = "http://v.qq.com/list/2_-1_-1_-1_1_0_";//Inject电视剧分页拼接头
	public static final String TV_2014HEAD_Injection = "http://v.qq.com/list/2_-1_-1_2014_1_0_";//Inject电视剧分页拼接头
	public static final String TV_2013HEAD_Injection = "http://v.qq.com/list/2_-1_-1_2013_1_0_";//Inject电视剧分页拼接头
	public static final String TV_2012HEAD_Injection = "http://v.qq.com/list/2_-1_-1_2012_1_0_";//Inject电视剧分页拼接头
	public static final String TV_2011HEAD_Injection = "http://v.qq.com/list/2_-1_-1_2011_1_0_";//Inject电视剧分页拼接头
	public static final String TV_END_Injection = "_20_-1_-1_0.html";//Inject电视剧分页拼接尾
	
	public static final String MOVIE_HEAD_Injection = "http://v.qq.com/movielist/10001/0/0/1/";//Inject电影分页拼接头
	public static final String MOVIE_2014HEAD_Injection = "http://v.qq.com/movielist/10001/10003-100034/0/1/";//Inject电影分页拼接头
	public static final String MOVIE_2013_2011HEAD_Injection = "http://v.qq.com/movielist/10001/10003-100035/0/1/";//Inject电影分页拼接头
	public static final String MOVIE_END_Injection = "/20/0/0.html";//Inject电影分页拼接尾
	
	public static final String VARIETY_SHOW_HEAD_Injection = "http://v.qq.com/variety/type/list_-1_1_";//Inject电影分页拼接头
	public static final String VARIETY_SHOW_END_Injection = ".html";//Inject电影分页拼接尾
	/**
	 * 
	 */
	public ParseInjection() {
		// TODO Auto-generated constructor stub
	}
	
	//电视剧获取整理的标准入口
	public static List<CollectAddress> getTVInjectionUrl(String injectionUrl){
		
		List<CollectAddress> crawlUrls = new ArrayList<CollectAddress>();
		String html = HttpRequestUtil.httpGetRequest(injectionUrl, null);
		Document docInjection = Jsoup.parse(html);
		//取出一共有多少页码
		String pageNumStr = docInjection.select("span.mod_pagenav_count2").html();
		pageNumStr = ToolforRegEx.getAfterFrontSlash(pageNumStr);
		int pageNum = Integer.parseInt(pageNumStr);
		
		CompletionService<List<CollectAddress>> parseInjectionTVUrlThreadPool = 
				new ExecutorCompletionService<List<CollectAddress>>(ParseThreadPool.parseInjectionTVUrlThreadPool);
		
		if(injectionUrl.indexOf("2014") != -1){//2014年份
			for(int i=0; i<pageNum; i++){
				//拼接获取的URL
				String reloadSingleUrl = TV_2014HEAD_Injection + String.valueOf(i) + TV_END_Injection;
				ParseInjectionTVUrlTask parseInjectionTVUrlTask = new ParseInjectionTVUrlTask(reloadSingleUrl);
				parseInjectionTVUrlThreadPool.submit(parseInjectionTVUrlTask);
			}
			for(int i=0; i<pageNum; i++){
				try {
					List<CollectAddress> listTemp = parseInjectionTVUrlThreadPool.take().get();
					crawlUrls.addAll(listTemp);
				} catch (Exception e) {
					log.error("解析ShowInjection2014异常",e);
				}
			}
		}else if(injectionUrl.indexOf("2013") != -1){//2013年份
			for(int i=0; i<pageNum; i++){
				//拼接获取的URL
				String reloadSingleUrl = TV_2013HEAD_Injection + String.valueOf(i) + TV_END_Injection;
				ParseInjectionTVUrlTask parseInjectionTVUrlTask = new ParseInjectionTVUrlTask(reloadSingleUrl);
				parseInjectionTVUrlThreadPool.submit(parseInjectionTVUrlTask);
			}
			for(int i=0; i<pageNum; i++){
				try {
					List<CollectAddress> listTemp = parseInjectionTVUrlThreadPool.take().get();
					crawlUrls.addAll(listTemp);
				} catch (Exception e) {
					log.error("解析ShowInjection2013异常",e);
				}
			}
		}else if(injectionUrl.indexOf("2012") != -1){//2012年份
			for(int i=0; i<pageNum; i++){
				//拼接获取的URL
				String reloadSingleUrl = TV_2012HEAD_Injection + String.valueOf(i) + TV_END_Injection;
				ParseInjectionTVUrlTask parseInjectionTVUrlTask = new ParseInjectionTVUrlTask(reloadSingleUrl);
				parseInjectionTVUrlThreadPool.submit(parseInjectionTVUrlTask);
			}
			for(int i=0; i<pageNum; i++){
				try {
					List<CollectAddress> listTemp = parseInjectionTVUrlThreadPool.take().get();
					crawlUrls.addAll(listTemp);
				} catch (Exception e) {
					log.error("解析ShowInjection2012异常",e);
				}
			}
		}else if(injectionUrl.indexOf("2011") != -1){//2011年份
			for(int i=0; i<pageNum; i++){
				//拼接获取的URL
				String reloadSingleUrl = TV_2011HEAD_Injection + String.valueOf(i) + TV_END_Injection;
				ParseInjectionTVUrlTask parseInjectionTVUrlTask = new ParseInjectionTVUrlTask(reloadSingleUrl);
				parseInjectionTVUrlThreadPool.submit(parseInjectionTVUrlTask);
			}
			for(int i=0; i<pageNum; i++){
				try {
					List<CollectAddress> listTemp = parseInjectionTVUrlThreadPool.take().get();
					crawlUrls.addAll(listTemp);
				} catch (Exception e) {
					log.error("解析ShowInjection2011异常",e);
				}
			}
		}

		return crawlUrls;
	}
	
	//电影获取整理的标准入口
	public static List<CollectAddress> getMovieInjectionUrl(String injectionUrl){

		List<CollectAddress> crawlUrls = new ArrayList<CollectAddress>();
		String html = HttpRequestUtil.httpGetRequest(injectionUrl, null);
		Document docInjection = Jsoup.parse(html);
		//取出一共有多少页码
		String pageNumStr = docInjection.select("span.mod_pagenav_count2").html();
		pageNumStr = ToolforRegEx.getAfterFrontSlash(pageNumStr);
		int pageNum = Integer.parseInt(pageNumStr);
		
		CompletionService<List<CollectAddress>> parseInjectionMovieUrlThreadPool = 
				new ExecutorCompletionService<List<CollectAddress>>(ParseThreadPool.parseInjectionMovieUrlThreadPool);
		
		if(injectionUrl.indexOf("100034") != -1){//2014年份
			for(int i=0; i<pageNum; i++){
				//拼接获取的URL
				String reloadSingleUrl = MOVIE_2014HEAD_Injection + String.valueOf(i) + MOVIE_END_Injection;
				ParseInjectionMovieUrlTask parseInjectionMovieUrlTask = new ParseInjectionMovieUrlTask(reloadSingleUrl);
				parseInjectionMovieUrlThreadPool.submit(parseInjectionMovieUrlTask);
			}
			for(int i=0; i<pageNum; i++){
				try {
					List<CollectAddress> listTemp = parseInjectionMovieUrlThreadPool.take().get();
					crawlUrls.addAll(listTemp);
				} catch (Exception e) {
					log.error("解析MovieInjection2014异常",e);
				}
			}
		}else if(injectionUrl.indexOf("100035") != -1){//2011-2013年份
			for(int i=0; i<pageNum; i++){
				//拼接获取的URL
				String reloadSingleUrl = MOVIE_2013_2011HEAD_Injection + String.valueOf(i) + MOVIE_END_Injection;
				ParseInjectionMovieUrlTask parseInjectionMovieUrlTask = new ParseInjectionMovieUrlTask(reloadSingleUrl);
				parseInjectionMovieUrlThreadPool.submit(parseInjectionMovieUrlTask);
			}
			for(int i=0; i<pageNum; i++){
				try {
					List<CollectAddress> listTemp = parseInjectionMovieUrlThreadPool.take().get();
					crawlUrls.addAll(listTemp);
				} catch (Exception e) {
					log.error("解析MovieInjection2011-2013异常",e);
				}
			}
		}
		
		return crawlUrls;
	}

	//综艺获取整理的标准入口
	public static List<CollectAddress> getVarietyShowInjectionUrl(String injectionUrl){
		
		List<CollectAddress> crawlUrls = new ArrayList<CollectAddress>();
		String html = HttpRequestUtil.httpGetRequest(injectionUrl, null);
		Document docInjection = Jsoup.parse(html);
		//取出一共有多少页码
		String pageNumStr = docInjection.select("span.mod_pagenav_count2").html();
		pageNumStr = ToolforRegEx.getAfterFrontSlash(pageNumStr);
		int pageNum = Integer.parseInt(pageNumStr);
		
		CompletionService<List<CollectAddress>> parseInjectionShowUrlThreadPool = 
				new ExecutorCompletionService<List<CollectAddress>>(ParseThreadPool.parseInjectionShowUrlThreadPool);
		
		for(int i=0; i<pageNum; i++){
			//拼接获取的URL
			String reloadSingleUrl = VARIETY_SHOW_HEAD_Injection + String.valueOf(i) + VARIETY_SHOW_END_Injection;
			ParseInjectionShowUrlTask parseInjectionShowUrlTask = new ParseInjectionShowUrlTask(reloadSingleUrl);
			parseInjectionShowUrlThreadPool.submit(parseInjectionShowUrlTask);
		}
		for(int i=0; i<pageNum; i++){
			try {
				List<CollectAddress> listTemp = parseInjectionShowUrlThreadPool.take().get();
				crawlUrls.addAll(listTemp);
			} catch (Exception e) {
				log.error("解析ShowInjection异常",e);
			}
		}
		return crawlUrls;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}

}
