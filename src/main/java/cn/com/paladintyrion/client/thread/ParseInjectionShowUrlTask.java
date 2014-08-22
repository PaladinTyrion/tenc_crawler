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
import cn.com.paladintyrion.client.controller.parse.ParseInjection;
import cn.com.paladintyrion.client.controller.parse.SiteType;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;
import cn.com.paladintyrion.common.util.StringUtil;
@Slf4j
public class ParseInjectionShowUrlTask implements Callable<List<CollectAddress>>{
	private String showSingleUrl;
	private final String reloadBaseUrl = "http://v.qq.com";
	
	public ParseInjectionShowUrlTask(String showSingleUrl){
		this.showSingleUrl = showSingleUrl;
	}
	
	@Override
	public List<CollectAddress> call() throws Exception {

		List<CollectAddress> showList = new ArrayList<CollectAddress>();
		//解析分页html
		String reloadHtml = HttpRequestUtil.httpGetRequest(showSingleUrl, null);
		Document docReload = Jsoup.parse(reloadHtml);
		Elements divsReload = docReload.select("div[class=mod_video_list details] > div.mod_cont > div[class=mod_item pic_160]");
		//解析每个剧获取剧集入口url及其名字
		if(!divsReload.isEmpty()){
			for(Element divReload : divsReload){
				CollectAddress collectAddress = new CollectAddress();
				//获取剧名
				String collectName = divReload.select("h6 > a").html();
				//获取至更新集的地址
				Elements moreElems = divReload.select("div.mod_more");
				if(!moreElems.isEmpty()){
					Elements moreAs = moreElems.get(0).select("a");
					if(!moreAs.isEmpty()){
						Element moreA = moreAs.get(0);
						String tempUrl = moreA.attr("href");
						String reloadUrl = reloadBaseUrl + tempUrl;
						log.info("reloadSingleUrl: " + showSingleUrl +";  tempUrl: " + tempUrl + ";  collectName: " + collectName);
						collectAddress.setUrl(reloadUrl);
						collectAddress.setCollectName(collectName);
						collectAddress.setCollectType(VideoType.zongyi);
						collectAddress.setSite(SiteType.TENCENT);
						collectAddress.setState(1);
						collectAddress.setTaskType(0);
						collectAddress.setId(StringUtil.getUUID());
						showList.add(collectAddress);
					}
				}
			}
		}
		
		return showList;
	}

}
