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
public class ParseInjectionTVUrlTask implements Callable<List<CollectAddress>>{
	private String tvSingleUrl;
	private final String reloadBaseUrl = "http://v.qq.com/detail/";
	
	public ParseInjectionTVUrlTask(String tvSingleUrl){
		this.tvSingleUrl = tvSingleUrl;
	}
	
	@Override
	public List<CollectAddress> call() throws Exception {
		List<CollectAddress> tvList = new ArrayList<CollectAddress>();
		
		//解析分页html
		String reloadHtml = HttpRequestUtil.httpGetRequest(tvSingleUrl, null);
		Document docReload = Jsoup.parse(reloadHtml);
		Elements lisReload = docReload.select("ul.mod_list_pic_130 > li");
		//解析每个剧获取剧集入口url及其名字
		if(!lisReload.isEmpty()){
			for(Element liReload : lisReload){
				CollectAddress collectAddress = new CollectAddress();
				//是否片花
				String isPianhua = liReload.select("sup[class=mark_clips]").text();
				//不是片花再处理
				if((isPianhua == null) || (isPianhua.equals(""))){
					//获取剧名
					String collectName = liReload.select("h6 > a").text();
					//获取评分
					String score = liReload.select("h6 > strong").text();
					//获取至更新集的地址
					String tempUrl = liReload.select("a").attr("href");
					//先跳转至最新集地址，获取其id，然后拼接标准入口
					String tempHtml = HttpRequestUtil.httpGetRequest(tempUrl, null);
					String id = ParseIdForTencent.getIdforTencent(tempHtml);
					log.info("reloadSingleUrl: " + tvSingleUrl +";  tempUrl: " + tempUrl + ";  collectName: " + collectName + ";  id: " + id);
					String reloadUrl = null;
					if((id != null)&&(!id.equals(""))){
						reloadUrl = reloadBaseUrl + id.substring(0,1) + "/" + id + ".html";
					}
					if(reloadUrl != null){
						try{
							String testHtml = HttpRequestUtil.httpGetRequest(reloadUrl, null);
						}catch(Exception e){
							log.error("ParseInjection ---》 该URL不能被重定向" + reloadUrl, e);
						}
						collectAddress.setUrl(reloadUrl);
						collectAddress.setCollectName(collectName);
						collectAddress.setCollectType(VideoType.dianshiju);
						collectAddress.setSite(SiteType.TENCENT);
						collectAddress.setState(1);
						collectAddress.setTaskType(0);
						collectAddress.setId(StringUtil.getUUID());
						tvList.add(collectAddress);
					}
				}
			}
		}
		
		return tvList;
	}

}
