package cn.com.paladintyrion.client.controller.crawler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.UrlBeanExt;
import cn.com.paladintyrion.client.bean.VideoCollect;
import cn.com.paladintyrion.client.bean.VideoType;
import cn.com.paladintyrion.client.controller.parse.ParseIdForTencent;
import cn.com.paladintyrion.client.controller.parse.SiteType;
import cn.com.paladintyrion.client.controller.parse.ToolforRegEx;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;
import cn.com.paladintyrion.common.util.DateUtil;

@Slf4j
public class TencentCrawler {
	
	private final String reloadBaseUrl = "http://v.qq.com/detail/";
	private final String getlistBaseUrl = "http://s.video.qq.com/loadplaylist";
	
	
	public UrlBeanExt execute(String url){
		
		UrlBeanExt urlBeanExt = new UrlBeanExt();
		
		String html = HttpRequestUtil.httpGetRequest(url, null);
		
		VideoCollect videoCollect = new VideoCollect();
		
		Document document = Jsoup.parse(html);
		
		//存放类型：电视剧、综艺、电影
		String type = "";
		//电视剧、电影
		Elements typeElems = document.select("span[class=video_current_state]>span[class=type]");
		if(!typeElems.isEmpty()){
			Element typeElem = typeElems.get(0);
			type = typeElem.text();
		}
		//综艺
		if(type.equals("")){
			Elements typeEles = document.select("div[class=mod_paths] > a");
			if(!typeEles.isEmpty()){
				Element typeEle = typeEles.get(0);
				type = typeEle.text();
			}
		}
		
		if(type.equals(VideoType.dianshiju)){
			urlBeanExt.setVideoCollectType(VideoType.dianshiju);
			urlBeanExt = parseDianshiju(html, VideoType.dianshiju);
		}else if(type.equals(VideoType.dianying)){
			urlBeanExt.setVideoCollectType(VideoType.dianying);
			urlBeanExt = parseDianying(html, VideoType.dianying);
		}else if(type.equals(VideoType.zongyi)){
			urlBeanExt.setVideoCollectType(VideoType.zongyi);
			urlBeanExt = parseZongyi(html, VideoType.zongyi);
		}else{
			log.info("不是来自于电影、电视剧、综艺的分类.");
			return null;
		}
		
		return urlBeanExt;
	}
	
	private UrlBeanExt parseDianshiju(String html, String videoCollectType){
		String REQ_BASE_URL = "http://s.video.qq.com/loadplaylist";
		String PLAY_COUNT_BASE_URL = "http://sns.video.qq.com/tvideo/fcgi-bin/batchgetplaymount";
		
		UrlBeanExt urlBeanExt = new UrlBeanExt();
		List<UrlBean> list = new ArrayList<UrlBean>();
		VideoCollect videoCollect = new VideoCollect();
		
		//剧集id
		String idStr = ToolforRegEx.getCuts(html, "vid :", ",");
		if((idStr != null)&&(!idStr.equals(""))){
			idStr = ToolforRegEx.getInSinglequotes(idStr);
			videoCollect.setCollectId(idStr);
		}
		
		Document document = Jsoup.parse(html);
		
		//剧集名称、年份
		Elements TitleEles = document.select("div[class=video_title]");
		if(!TitleEles.isEmpty()){
			Element TitleEle = TitleEles.get(0);
			//剧集名称
			Elements NameEles = TitleEle.select("strong[class=title]>a");
			if(!NameEles.isEmpty()){
				Element NameEle = NameEles.get(0);
				String collectName = NameEle.text();
				videoCollect.setCollectName(collectName);
			}
			//年份
			Elements spanYears = TitleEle.select("span[class=current_state]");
			if(!spanYears.isEmpty()){
				Element spanYear = spanYears.get(0);
				String yearStr = spanYear.text();
				yearStr = ToolforRegEx.getNumfromStr(yearStr);
				videoCollect.setYear(Integer.parseInt(yearStr));
			}
		}
		
		//标签 主演 导演
		Elements divBaseInfos = document.select("div[class=video_info cf]");
		if(!divBaseInfos.isEmpty()){
			Element divBaseInfo = divBaseInfos.get(0);
			//标签
			Elements divTags = divBaseInfo.select("div[class=info_tags]");
			if(!divTags.isEmpty()){
				Element divTag = divTags.get(0);
				Elements aTags = divTag.select("a");
				if(!aTags.isEmpty()){
					String tagsCon = "";
					for(Element aTag : aTags){
						if(tagsCon.equals("")){
							tagsCon = aTag.text();
						}else{
							tagsCon += "_" + aTag.text();
						}
					}
					videoCollect.setCollectTag(tagsCon);
				}
			}
			//主演
			Elements divActors = divBaseInfo.select("div[class=info_cast]");
			if(!divActors.isEmpty()){
				Element divActor = divActors.get(0);
				Elements aActors = divActor.select("a");
				if(!aActors.isEmpty()){
					String actorStr = "";
					for(Element aActor:aActors){
						if(actorStr.equals("")){
							actorStr = aActor.text();
						}else{
							actorStr += "_" + aActor.text();
						}
					}
					videoCollect.setActor(actorStr);
				}
			}
			//导演
			Elements divDirectors = divBaseInfo.select("div[class=info_director]");
			if(!divDirectors.isEmpty()){
				Element divDirector = divDirectors.get(0);
				Elements aDirectors = divDirector.select("a");
				if(!aDirectors.isEmpty()){
					String directorStr = "";
					for(Element aDirector:aDirectors){
						if(directorStr.equals("")){
							directorStr = aDirector.text();
						}else{
							directorStr += "_" + aDirector.text();
						}
					}
					videoCollect.setDirector(directorStr);
				}
			}
		}

		//类型
		videoCollect.setCollectCategory("电视剧");
		
		//剧集介绍
		Elements descDivs = document.select("div[class=info_summary cf]");
		if(!descDivs.isEmpty()){
			Element descDiv = descDivs.get(0);
			Elements descSpans = descDiv.select("span[class=summary]");
			if(!descSpans.isEmpty()){
				Element descSpan = descSpans.get(0);
				String descStr = descSpan.text();
				videoCollect.setCollectDesc(descStr);
			}
		}
		//剧集来源网站
		videoCollect.setSite(SiteType.TENCENT);
		//抓取时间
		videoCollect.setCreateTime(DateUtil.getCurrentDateTime());
		
		//获取url、获取剧集集数
		Elements divSources = document.select("div[class=mod_bd sourceCont]");
		if(!divSources.isEmpty()){
			Element divSource = divSources.get(0);
			String sourceId = divSource.attr("sourceid");
			Map<String,String> params = new HashMap<String,String>();
			params.put("vkey", sourceId);
			params.put("otype", "json");
			String getListUrlJson = HttpRequestUtil.httpGetRequest(REQ_BASE_URL, params);
			getListUrlJson = ToolforRegEx.getInBigbrackets(getListUrlJson);
			JSONObject jsonObject = null;
			jsonObject = JSONObject.parseObject(getListUrlJson);
			JSONArray jsonArray = jsonObject.getJSONObject("video_play_list").getJSONArray("playlist");
			for(int k=0; k<jsonArray.size(); k++){
				JSONObject jsonObj = jsonArray.getJSONObject(k);
				String url = jsonObj.getString("url");
				UrlBean urlBean = new UrlBean();
				urlBean.setUrl(url);
				urlBean.setType(VideoType.dianshiju);
				urlBean.setCollectId(videoCollect.getCollectId());
				list.add(urlBean);
			}
		}
		
		//播放量
		if(list.size() > 0){
			//取出第一个url，为了进去获取播放量
			String getPlayCountUrl = list.get(0).getUrl();
			String htmlStr = HttpRequestUtil.httpGetRequest(getPlayCountUrl, null);
			//取出id
			String video_id = "";
			video_id = ParseIdForTencent.getIdforTencent(htmlStr);
	  		if(video_id.equals("")){
	  			log.error("getVideoProperty没有解析到VideoId");
	  		}
	  		//单集播放量，请求URL--->http://sns.video.qq.com/tvideo/fcgi-bin/batchgetplaymount?id=0uw2h4nsr5g4yug&otype=json	
	  		String playCount = "";
	  		Map<String,String> paramsPlayCount = new HashMap<String,String>();
	  		paramsPlayCount.put("id", video_id);
	  		paramsPlayCount.put("otype", "json");
	  		String getPlayCountJson = HttpRequestUtil.httpGetRequest(PLAY_COUNT_BASE_URL, paramsPlayCount);
	  		if(getPlayCountJson != null){
	  			getPlayCountJson = ToolforRegEx.getInBigbrackets(getPlayCountJson);
	  	  		if(getPlayCountJson != null){
	  	  			JSONObject jsonObjectPC = null;
	  	  	  		jsonObjectPC = JSONObject.parseObject(getPlayCountJson);
	  	  	  		if(jsonObjectPC.containsKey("node")){
		  	  	  		JSONArray jsonArrayPC = jsonObjectPC.getJSONArray("node");
	  	  				JSONObject jsonObj = jsonArrayPC.getJSONObject(0);
	  	  				playCount = jsonObj.getString("num");
	  	  	  		}
	  	  		}
	  		}
	  		if((playCount != null)&&(!playCount.equals(""))){
	  			videoCollect.setPlayCount(Long.parseLong(playCount));
	  		}
		}

		urlBeanExt.setUrlList(list);
		urlBeanExt.setVideoCollect(videoCollect);
		urlBeanExt.setVideoCollectType(videoCollectType);
		return urlBeanExt;
	}
	
	private UrlBeanExt parseDianying(String html, String videoCollectType){
		String REQ_BASE_URL = "http://s.video.qq.com/loadplaylist";
		String PLAY_COUNT_BASE_URL = "http://sns.video.qq.com/tvideo/fcgi-bin/batchgetplaymount";
		
		UrlBeanExt urlBeanExt = new UrlBeanExt();
		List<UrlBean> list = new ArrayList<UrlBean>();
		VideoCollect videoCollect = new VideoCollect();
		
		//剧集id
		String idStr = ToolforRegEx.getCuts(html, "vid :", ",");
		if((idStr != null)&&(!idStr.equals(""))){
			idStr = ToolforRegEx.getInSinglequotes(idStr);
			videoCollect.setCollectId(idStr);
		}

		Document document = Jsoup.parse(html);
		
		//剧集名称、年份
		Elements TitleEles = document.select("div[class=video_title]");
		if(!TitleEles.isEmpty()){
			Element TitleEle = TitleEles.get(0);
			//剧集名称
			Elements NameEles = TitleEle.select("strong[class=title]>a");
			if(!NameEles.isEmpty()){
				Element NameEle = NameEles.get(0);
				String collectName = NameEle.text();
				videoCollect.setCollectName(collectName);
			}
			//年份
			Elements spanYears = TitleEle.select("span[class=current_state]");
			if(!spanYears.isEmpty()){
				Element spanYear = spanYears.get(0);
				String yearStr = spanYear.text();
				yearStr = ToolforRegEx.getNumfromStr(yearStr);
				videoCollect.setYear(Integer.parseInt(yearStr));
			}
		}
		
		//标签 主演 导演
		Elements divBaseInfos = document.select("div[class=video_info cf]");
		if(!divBaseInfos.isEmpty()){
			Element divBaseInfo = divBaseInfos.get(0);
			//标签
			Elements divTags = divBaseInfo.select("div[class=info_tags]");
			if(!divTags.isEmpty()){
				Element divTag = divTags.get(0);
				Elements aTags = divTag.select("a");
				if(aTags != null){
					String tagsCon = "";
					for(Element aTag : aTags){
						if(tagsCon.equals("")){
							tagsCon = aTag.text();
						}else{
							tagsCon += "_" + aTag.text();
						}
					}
					videoCollect.setCollectTag(tagsCon);
				}
			}
			//主演
			Elements divActors = divBaseInfo.select("div[class=info_cast]");
			if(!divActors.isEmpty()){
				Element divActor = divActors.get(0);
				Elements aActors = divActor.select("a");
				if(!aActors.isEmpty()){
					String actorStr = "";
					for(Element aActor:aActors){
						if(actorStr.equals("")){
							actorStr = aActor.text();
						}else{
							actorStr += "_" + aActor.text();
						}
					}
					videoCollect.setActor(actorStr);
				}
			}
			//导演
			Elements divDirectors = divBaseInfo.select("div[class=info_director]");
			if(!divDirectors.isEmpty()){
				Element divDirector = divDirectors.get(0);
				Elements aDirectors = divDirector.select("a");
				if(!aDirectors.isEmpty()){
					String directorStr = "";
					for(Element aDirector:aDirectors){
						if(directorStr.equals("")){
							directorStr = aDirector.text();
						}else{
							directorStr += "_" + aDirector.text();
						}
					}
					if(directorStr.split("_").length > 3){
						String[] directorStrTeam = directorStr.split("_", 3);
						directorStr = directorStrTeam[0] + "_" + directorStrTeam[1] + "_" + directorStrTeam[2];
					}
					videoCollect.setDirector(directorStr);
				}
			}
		}
		
		//类型
		videoCollect.setCollectCategory("电影");
		
		//剧集介绍
		Elements descDivs = document.select("div[class=info_summary cf]");
		if(!descDivs.isEmpty()){
			Element descDiv = descDivs.get(0);
			Elements descSpans = descDiv.select("span[class=summary]");
			if(!descSpans.isEmpty()){
				Element descSpan = descSpans.get(0);
				String descStr = descSpan.text();
				videoCollect.setCollectDesc(descStr);	
			}
		}
		
		//剧集来源网站
		videoCollect.setSite(SiteType.TENCENT);
		//抓取时间
		videoCollect.setCreateTime(DateUtil.getCurrentDateTime());
		
		//获取url
		Elements divSources = document.select("div[class=mod_bd sourceCont]");
		if(!divSources.isEmpty()){
			Element divSource = divSources.get(0);
			String sourceId = divSource.attr("sourceid");
			Map<String,String> params = new HashMap<String,String>();
			params.put("vkey", sourceId);
			params.put("otype", "json");
			String getListUrlJson = HttpRequestUtil.httpGetRequest(REQ_BASE_URL, params);
			getListUrlJson = ToolforRegEx.getInBigbrackets(getListUrlJson);
			JSONObject jsonObject = null;
			jsonObject = JSONObject.parseObject(getListUrlJson);
			JSONObject jsonObjPlayList = jsonObject.getJSONObject("video_play_list");
			if(!jsonObjPlayList.isEmpty()){
				if(jsonObjPlayList.containsKey("playlist")){
					JSONArray jsonArray = jsonObjPlayList.getJSONArray("playlist");
					if(!jsonArray.isEmpty()){
						UrlBean urlBean = new UrlBean();
						for(int k=0; k<jsonArray.size(); k++){
							JSONObject jsonObj = jsonArray.getJSONObject(k);
							String url = jsonObj.getString("url");
							urlBean.setUrl(url);
						}
						urlBean.setCollectId(videoCollect.getCollectId());
						urlBean.setType(VideoType.dianying);
						list.add(urlBean);
					}
				}
			}
		}
		
		//播放量
		if(list.size() > 0){
			//取出第一个url，为了进去获取播放量
			String getPlayCountUrl = list.get(0).getUrl();
			String htmlStr = HttpRequestUtil.httpGetRequest(getPlayCountUrl, null);
			//取出id
			String video_id = "";
			video_id = ParseIdForTencent.getIdforTencent(htmlStr);
	  		if(video_id.equals("")){
	  			log.error("此电影非v.qq.com的播放源, getVideoProperty没有解析到VideoId");
	  		}else{
	  			//单集播放量，请求URL--->http://sns.video.qq.com/tvideo/fcgi-bin/batchgetplaymount?id=0uw2h4nsr5g4yug&otype=json	
		  		String playCount = "";
		  		Map<String,String> paramsPlayCount = new HashMap<String,String>();
		  		paramsPlayCount.put("id", video_id);
		  		paramsPlayCount.put("otype", "json");
		  		String getPlayCountJson = HttpRequestUtil.httpGetRequest(PLAY_COUNT_BASE_URL, paramsPlayCount);
		  		if(getPlayCountJson != null){
		  			getPlayCountJson = ToolforRegEx.getInBigbrackets(getPlayCountJson);
		  	  		if(getPlayCountJson != null){
		  	  			JSONObject jsonObjectPC = null;
		  	  	  		jsonObjectPC = JSONObject.parseObject(getPlayCountJson);
		  	  			JSONArray jsonArrayPC = jsonObjectPC.getJSONArray("node");
		  	  			if(!jsonArrayPC.isEmpty()){
		  	  				JSONObject jsonObj = jsonArrayPC.getJSONObject(0);
		  	  				playCount = jsonObj.getString("num");
		  	  			}
		  	  		}
		  		}
		  		if(!playCount.equals("")){
		  			videoCollect.setPlayCount(Long.parseLong(playCount));
		  		}
	  		}
		}
		
		urlBeanExt.setUrlList(list);
		urlBeanExt.setVideoCollect(videoCollect);
		urlBeanExt.setVideoCollectType(videoCollectType);
		return urlBeanExt;
	}
	
	private UrlBeanExt parseZongyi(String html, String videoCollectType){
		
		UrlBeanExt urlBeanExt = new UrlBeanExt();
		List<UrlBean> list = new ArrayList<UrlBean>();
		VideoCollect videoCollect = new VideoCollect();

		//剧集id
		String idStr = ToolforRegEx.getCuts(html, "txv.variety_column.init", ";");
		if((idStr != null)&&(!idStr.equals(""))){
			idStr = ToolforRegEx.getInbrackets(idStr);
			videoCollect.setCollectId(idStr);
			log.info(idStr);
		}
		
		Document document = Jsoup.parse(html);
		
		//剧集名称
		String collectName = document.select("div[class=mod_banner] > a >img").attr("alt");
		videoCollect.setCollectName(collectName);
//		Elements divNames = document.select("div[class=mod_paths]");
//		if(!divNames.isEmpty()){
//			Element divName = divNames.get(0);
//			String collectName = divName.text();
////			collectName = ToolforRegEx.getInDoublequotes(collectName);
////			collectName = collectName.substring(3);//去掉" > "
//			videoCollect.setCollectName(collectName);
//		}

		//总播放量
		Elements divPlays = document.select("div[class=mod_total]");
		if(!divPlays.isEmpty()){
			Element divPlay = divPlays.get(0);
			String playCountStr = divPlay.text();
			playCountStr = ToolforRegEx.getNumfromStr(playCountStr);
			videoCollect.setPlayCount(Long.parseLong(playCountStr));
		}
		
		//剧集来源网站
		videoCollect.setSite(SiteType.TENCENT);
		//类型
		videoCollect.setCollectCategory("综艺");
		//抓取时间
		videoCollect.setCreateTime(DateUtil.getCurrentDateTime());
		//备注信息
		videoCollect.setRemark("");

		//获取urls、剧集基本属性
		//首先获得重定向网页，然后抓取所有url
		String reloadUrl = reloadBaseUrl + idStr.substring(0,1) + "/" + idStr + ".html";
		String reloadHtml = HttpRequestUtil.httpGetRequest(reloadUrl, null);
		if((reloadHtml != null)&&(!reloadHtml.equals(""))){
			Document reloadDoc = Jsoup.parse(reloadHtml);
			
			//获取基本信息
			//标签 主持人(主演)
			Elements divBaseInfos = reloadDoc.select("div[class=video_info cf]");
			if(!divBaseInfos.isEmpty()){
				Element divBaseInfo = divBaseInfos.get(0);
				//标签
				Elements divTags = divBaseInfo.select("div[class=info_tags]");
				if(!divTags.isEmpty()){
					Element divTag = divTags.get(0);
					Elements aTags = divTag.select("a");
					if(!aTags.isEmpty()){
						String tagsCon = "";
						for(Element aTag : aTags){
							if(tagsCon.equals("")){
								tagsCon = aTag.text();
							}else{
								tagsCon += "_" + aTag.text();
							}
						}
						videoCollect.setCollectTag(tagsCon);
					}
				}
				//主演
				Elements divActors = divBaseInfo.select("div[class=info_cast]");
				if(!divActors.isEmpty()){
					Element divActor = divActors.get(0);
					Elements aActors = divActor.select("a");
					if(!aActors.isEmpty()){
						String actorStr = "";
						for(Element aActor:aActors){
							if(actorStr.equals("")){
								actorStr = aActor.text();
							}else{
								actorStr += "_" + aActor.text();
							}
						}
						videoCollect.setActor(actorStr);
					}
				}
			}
			
			//剧集介绍
			Elements descDivs = reloadDoc.select("div[class=info_summary cf]");
			if(!descDivs.isEmpty()){
				Element descDiv = descDivs.get(0);
				Elements descSpans = descDiv.select("span[class=summary]");
				if(!descSpans.isEmpty()){
					Element descSpan = descSpans.get(0);
					String descStr = descSpan.text();
					videoCollect.setCollectDesc(descStr);	
				}
			}
			
			//获取urls
			Elements divSources = reloadDoc.select("div[class=mod_bd sourceCont]");
			String sourceId = "";
			if(!divSources.isEmpty()){
				for(Element divSource : divSources){
					String sourceName = divSource.attr("sourcename");
					if(sourceName.equals("qq")){
						sourceId = divSource.attr("sourceid");
						break;
					}
				}
			}
			if(!sourceId.equals("")){
				Map<String,String> params = new HashMap<String,String>();
				params.put("vkey", sourceId);
				params.put("otype", "json");
				String getListUrlJson = HttpRequestUtil.httpGetRequest(getlistBaseUrl, params);
				getListUrlJson = ToolforRegEx.getInBigbrackets(getListUrlJson);
				JSONObject jsonObject = null;
				jsonObject = JSONObject.parseObject(getListUrlJson);
				JSONObject jsonObjPlayList = jsonObject.getJSONObject("video_play_list");
				if(!jsonObjPlayList.isEmpty()){
					if(jsonObjPlayList.containsKey("playlist")){
						JSONArray jsonArray = jsonObjPlayList.getJSONArray("playlist");
						if(!jsonArray.isEmpty()){
							for(int k=0; k<jsonArray.size(); k++){
								JSONObject jsonObj = jsonArray.getJSONObject(k);
								String url = jsonObj.getString("url");
								UrlBean urlBean = new UrlBean();
								urlBean.setUrl(url);
								urlBean.setType(VideoType.zongyi);
								urlBean.setCollectId(videoCollect.getCollectId());
								list.add(urlBean);
							}
						}
					}
				}
			}
		}
		urlBeanExt.setUrlList(list);
		urlBeanExt.setVideoCollect(videoCollect);
		urlBeanExt.setVideoCollectType(videoCollectType);
		return urlBeanExt;
	}
	
}
