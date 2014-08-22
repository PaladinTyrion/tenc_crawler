package cn.com.paladintyrion.client.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import lombok.extern.slf4j.Slf4j;
import cn.com.paladintyrion.client.bean.CollectAddress;
import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.VideoType;
import cn.com.paladintyrion.client.controller.parse.ParseIdForTencent;
import cn.com.paladintyrion.client.controller.parse.ParseInjection;
import cn.com.paladintyrion.client.controller.parse.SiteType;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;
import cn.com.paladintyrion.common.util.StringUtil;
@Slf4j
public class ParseInjectionMovieUrlTask implements Callable<List<CollectAddress>>{
	private String movieSingelUrl;
	private final String reloadBaseUrl = "http://v.qq.com/detail/";
	private final String errorStr = "film.qq.com";
	
	public ParseInjectionMovieUrlTask(String movieSingelUrl){
		this.movieSingelUrl = movieSingelUrl;
	}
	
	@Override
	public List<CollectAddress> call() throws Exception {
		List<CollectAddress> movieList = new ArrayList<CollectAddress>();
		
		//解析分页html
		String reloadHtml = HttpRequestUtil.httpGetRequest(movieSingelUrl, null);
		Document docReload = Jsoup.parse(reloadHtml);
		Elements lisReload = docReload.select("ul.mod_list_pic_130 > li");
		//解析每个剧获取剧集入口url及其名字
		if(!lisReload.isEmpty()){
			for(Element liReload : lisReload){
				CollectAddress collectAddress = new CollectAddress();
				//获取剧名
				String collectName = liReload.select("h6 > a").text();
				//获取评分
				String score = liReload.select("h6 > strong").text();
				//获取至更新集的地址
				String tempUrl = liReload.select("a").attr("href");
				if((tempUrl.indexOf(errorStr) != -1)&&(tempUrl.indexOf(errorStr) != 0)){
					//先跳转至最新集地址，获取其id，然后拼接标准入口
					String tempHtml = HttpRequestUtil.httpGetRequest(tempUrl, null);
					String id = ParseIdForTencent.getIdforTencent(tempHtml);
					String reloadUrl = "";
					if((id != null)&&(!id.equals(""))){
						reloadUrl = reloadBaseUrl + id.substring(0,1) + "/" + id + ".html";
					}
					log.info("reloadSingleUrl: " + movieSingelUrl +";  tempUrl: " + tempUrl + ";  collectName: " + collectName + ";  id: " + id);
					if(!reloadUrl.equals("")){
						try{
							String testHtml = HttpRequestUtil.httpGetRequest(reloadUrl, null);
						}catch(Exception e){
							log.error("ParseInjection ---》 该URL不能被重定向" + reloadUrl, e);
						}
						collectAddress.setUrl(reloadUrl);
						collectAddress.setCollectName(collectName);
						collectAddress.setCollectType(VideoType.dianying);
						collectAddress.setSite(SiteType.TENCENT);
						collectAddress.setState(1);
						collectAddress.setTaskType(0);
						collectAddress.setId(StringUtil.getUUID());
						movieList.add(collectAddress);
					}
				}
			}
		}
		
		return movieList;
	}

}
