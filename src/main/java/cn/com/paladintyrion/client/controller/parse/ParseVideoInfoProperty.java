package cn.com.paladintyrion.client.controller.parse;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.com.paladintyrion.client.bean.CollectPlayInfo;
import cn.com.paladintyrion.client.bean.CollectProperty;
import cn.com.paladintyrion.client.bean.Comment;
import cn.com.paladintyrion.client.bean.CommentPageCountVO;
import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.UrlBeanExt;
import cn.com.paladintyrion.client.bean.UserInfo;
import cn.com.paladintyrion.client.bean.VideoCommentUserInfoVO;
import cn.com.paladintyrion.client.bean.VideoInfo;
import cn.com.paladintyrion.client.bean.VideoInfoPropertyVO;
import cn.com.paladintyrion.client.bean.VideoProperty;
import cn.com.paladintyrion.client.bean.VideoType;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;
import cn.com.paladintyrion.client.thread.ParseThreadPool;
import cn.com.paladintyrion.client.thread.ParseVideoCommentTask;
import cn.com.paladintyrion.client.thread.ParseVideoInfoTask;
import cn.com.paladintyrion.client.thread.ParseVideoPropertyTask;
import cn.com.paladintyrion.common.util.DateUtil;
import cn.com.paladintyrion.common.util.StringUtil;

/**
 * 爬取解析VideoInfo & VideoProperty
 * @author Zhoubin
 *
 */
public class ParseVideoInfoProperty {
	private final static Logger log = Logger.getLogger(ParseVideoInfoProperty.class);
	
	public VideoInfoPropertyVO getVideoInfoProperty(UrlBeanExt urlBeanExt){
		//解析视频信息和属性 VideoInfo & VideoProperty 
		VideoInfoPropertyVO videoInfoPropertyVO = new VideoInfoPropertyVO();
		List<VideoInfo> videoInfoList = new ArrayList<VideoInfo>();
		List<VideoProperty> videoPropertyList = new ArrayList<VideoProperty>();
		
		CompletionService<VideoInfo> parseVideoInfoThread = 
				new ExecutorCompletionService<VideoInfo>(ParseThreadPool.parseVideoInfoThreadPool); 
		
		CompletionService<VideoProperty> parseVideoPropertyThread = 
				new ExecutorCompletionService<VideoProperty>(ParseThreadPool.parseVideoPropertyThreadPool);
		
		List<UrlBean> urlBeanList = urlBeanExt.getUrlList();
		String videoCollectType = urlBeanExt.getVideoCollectType();
		log.info("来自getVideoInfoProperty" + "*********" + videoCollectType);
		
		for(int i=0;i<urlBeanList.size();i++){
			UrlBean urlBean = urlBeanList.get(i);
			ParseVideoInfoTask videoInfoTask = new ParseVideoInfoTask(urlBean, videoCollectType);
			parseVideoInfoThread.submit(videoInfoTask);
			ParseVideoPropertyTask videoPropertyTask = new ParseVideoPropertyTask(urlBean);
			parseVideoPropertyThread.submit(videoPropertyTask);
		}
		for(int j=0;j<urlBeanList.size();j++){
			try {
				VideoInfo videoInfo  = parseVideoInfoThread.take().get();
				videoInfoList.add(videoInfo);
				VideoProperty videoProperty = parseVideoPropertyThread.take().get();
				videoPropertyList.add(videoProperty);
			} catch (Exception e) {
//				log.error("异常",e);
			}
		}
		videoInfoPropertyVO.setVideoInfoList(videoInfoList);
		videoInfoPropertyVO.setVideoPropertyList(videoPropertyList);
		return videoInfoPropertyVO;
	}
	
	public static VideoInfo getVideoInfo(String urlStr, String collectId, String videoCollectType){
		//取出类型:电视剧、电影、综艺，不同类解析不同
//		String videoCollectType = urlBeanExt.getVideoCollectType();
		
		VideoInfo videoInfo = new VideoInfo();
		String htmlStr = HttpRequestUtil.httpGetRequest(urlStr, null);
		Document videoInfoDoc = HtmlDocUtil.getHtmlDocFromStr(htmlStr);
  		//获取视频标题
		String title = "";
		if(videoCollectType.equals(VideoType.zongyi)){
			title = videoInfoDoc.select("h1[class=mod_player_title] > strong").html();
		}else{
			title = videoInfoDoc.select("div[class=mod_video_intro mod_video_intro_rich] > div[class=video_title] > strong[class=title] > a").html();
		}
  	    log.info("urlStr:  " + urlStr + "getVideoInfo : title: " + title);
  	    //获取视频期数或集数
  	    String subTitle = ToolforRegEx.getCuts(htmlStr, "varietyDate:", ",");
  	    subTitle = ToolforRegEx.getInDoublequotes(subTitle);
      	//获取视频栏目category
  	    String category = "";
		if(videoCollectType.equals(VideoType.zongyi)){
			if(videoInfoDoc.select("p.info_director").size() > 1){
				Elements categoryEles = videoInfoDoc.select("p.info_director").get(1).select("a");
				if(!categoryEles.isEmpty()){
	  	    		for(Element categoryEle : categoryEles){
	  	    			if(category.equals("")){
	  	    				category = categoryEle.text();
	  	    			}else{
	  	    				category += "_" + categoryEle.text();
	  	    			}
	  	    		}
	  	    	}
			}
  	    }else{
  	    	Elements categoryEles = videoInfoDoc.select("div.info_category > span.content > a");
  	    	if(!categoryEles.isEmpty()){
  	    		for(Element categoryEle : categoryEles){
  	    			if(category.equals("")){
  	    				category = categoryEle.text();
  	    			}else{
  	    				category += "_" + categoryEle.text();
  	    			}
  	    		}
  	    	}
  	    }
	    //获取视频标签
		String type ="";
    	try {
	  	    Elements typeEles = videoInfoDoc.select("div.info_tags > a");
	    	if(!typeEles.isEmpty()){
	    		for(Element typeEle : typeEles){
	    			if(type.equals("")){
	    				type = typeEle.text();
	    			}else{
	    				type += "_" + typeEle.text();
	    			}
	    		}
	    	}
		} catch (Exception e) {
			log.error("综艺节目没有视频标签",e);
		}
  		//演员或者主持人
    	String director ="";
		String actor ="";
		String vmainactor = "";
    	try{
    		if(videoCollectType.equals(VideoType.zongyi)){
    			Elements mainEles = videoInfoDoc.select("p.info_director");
    			if(!mainEles.isEmpty()){
    				if(mainEles.size() > 2){
        				Elements actorEles = videoInfoDoc.select("p.info_director").get(2).select("a");
            			if(!actorEles.isEmpty()){
                    		for(Element actorEle : actorEles){
                    			if(vmainactor.equals("")){
                    				vmainactor = actorEle.text();
                    			}else{
                    				vmainactor += "_" + actorEle.text();
                    			}	
                    		}
                    	}
        			}
    			}
    		}else{
    			Elements directorEles = videoInfoDoc.select("div.info_director > a");
            	if(!directorEles.isEmpty()){
            		for(Element directorEle : directorEles){
            			if(director.equals("")){
            				director = directorEle.text();
            			}else{
            				director += "_" + directorEle.text();
            			}
            			if(director.split("_").length > 2){
            				String[] directorTeam = director.split("_", 2);
            				director = directorTeam[0] + "_" + directorTeam[1];
            			}
            		}
            	}
          	    Elements actorEles = videoInfoDoc.select("div.info_cast > a");
            	if(!actorEles.isEmpty()){
            		for(Element actorEle : actorEles){
            			if(actor.equals("")){
            				actor = actorEle.text();
            			}else{
            				actor += "_" + actorEle.text();
            			}
            			if(actor.split("_").length > 3){
            				String[] actorTeam = actor.split("_", 3);
            				actor = actorTeam[0] + "_" + actorTeam[1] + "_" + actorTeam[2];
            			}
            		}
            	}
          		vmainactor= director + "|" +actor;
    		}
    	} catch (Exception e) {
			log.error("不同类型的节目可能无演员或主持人信息",e);
		}
  		//单个视频简介
    	String vprofile = "";
    	try{
    		vprofile = videoInfoDoc.select("div[class=info_summary cf] > span.summary").html();
    	} catch (Exception e) {
			log.error("电影及电视剧无视频简介信息",e);
		}
  		//视频URL,如果是传过来的是URL则可以直接用，否则用下面解析
  		String vUrl = urlStr;
  		//视频video_id(综艺是id，电影、电视剧是vid)
  		String videoId = "";
  		if(videoCollectType.equals(VideoType.zongyi)){
  			videoId = ParseIdForTencent.getIdforTencent(htmlStr);
		}else{
			videoId = ParseIdForTencent.getVidforTencent(htmlStr);
		}
  		if(videoId == null || title == null ){
  			log.error("videoinfo没有解析到VideoId或VideoName");
  		}
  		if(videoId.equals("") || title.equals("") ){
  			log.error("videoinfo没有解析到VideoId或VideoName");
  		}
		videoInfo.setVideoId(videoId);
		videoInfo.setSite(SiteType.TENCENT);
		videoInfo.setCollectId(collectId);
		videoInfo.setVideoName(title);
		videoInfo.setVideoSubName(subTitle);
		videoInfo.setTag(type);
		videoInfo.setCategory(category);
		videoInfo.setActor(vmainactor);
		videoInfo.setVideoDesc(vprofile);
		videoInfo.setUrl(vUrl);
		videoInfo.setCreateTime(DateUtil.getCurrentDateTime());
		return videoInfo;
	}
	
	public static VideoProperty getVideoProperty(String urlStr, String videoCollectType){
//		log.info("getVideoProperty + problem --> "+urlStr);
		String PLAY_UPANDDOWN_BASE_URL = "http://sns.video.qq.com/tvideo/fcgi-bin/spvote";
		String PLAY_COUNT_BASE_URL = "http://sns.video.qq.com/tvideo/fcgi-bin/batchgetplaymount";
		String COMMENT_COUNT_BASE_URL = "http://video.coral.qq.com/article/";
		String COMMENT_COUNT_LAST_URL = "/commentnum"; 
		
		VideoProperty videoPro = new VideoProperty();
		String htmlStr = HttpRequestUtil.httpGetRequest(urlStr, null);
		Document videoPropertyDoc = HtmlDocUtil.getHtmlDocFromStr(htmlStr);
		//顶踩以及评论使用vid，playCount使用id
		String vid = ParseIdForTencent.getVidforTencent(htmlStr);
		if(vid.indexOf("|") != -1){
			int end = vid.indexOf("|");
			vid = vid.substring(0,end);
		}
		log.info("getVideoProperty + url --> "+urlStr + ";   vid: " + vid);
		//踩顶:url = "http://sns.video.qq.com/tvideo/fcgi-bin/spvote?t=3&otype=json&keyid=i0013gzp309"
		//首先获取vid，然后根据vid拼得url获得踩顶
		//顶
  		String up = "";
  		//踩
  		String down = "";
		Map<String,String> paramsUandD = new HashMap<String,String>();
		paramsUandD.put("t", "3");
		paramsUandD.put("otype", "json");
		paramsUandD.put("keyid", vid);
		String getupAdownJson = HttpRequestUtil.httpGetRequest(PLAY_UPANDDOWN_BASE_URL, paramsUandD);
		if(getupAdownJson != null){
			getupAdownJson = ToolforRegEx.getInBigbrackets(getupAdownJson);
			JSONObject jsonObjectUD = null;
			jsonObjectUD = JSONObject.parseObject(getupAdownJson);
			JSONArray jsonArrayUD = jsonObjectUD.getJSONArray("vote");
			if(!jsonArrayUD.isEmpty()){
				for(int k=0; k<jsonArrayUD.size(); k++){
					JSONObject jsonObj = jsonArrayUD.getJSONObject(k);
					String updownId = jsonObj.getString("id");
					if(updownId.equals("-1")){
						down = jsonObj.getString("num");//踩
					}
					if(updownId.equals("1")){
						up = jsonObj.getString("num");//顶
					}
				}
			}
		}

  		//单集播放量，请求URL--->http://sns.video.qq.com/tvideo/fcgi-bin/batchgetplaymount?id=0uw2h4nsr5g4yug&otype=json
  		String playCount = "";
  		if(!videoCollectType.equals("电视剧")){
  			//取出id
  			String video_id = "";
  			video_id = ParseIdForTencent.getIdforTencent(htmlStr);
  	  		if(video_id.equals("")){
  	  			log.error("getVideoProperty没有解析到VideoId");
  	  		}else{
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
	  	  	  			if(jsonArrayPC.size() > 0){
	  	  	  				JSONObject jsonObj = jsonArrayPC.getJSONObject(0);
	  	  	  				playCount = jsonObj.getString("num");
	  	  	  			}
	  	  	  		}
	  	  		}
  	  		}
  		}
  		
  		//评论条数
		String commentCount = "";
		String commentId = ParseIdForTencent.getCommentIdforTencent(vid);
		log.info("URL" + urlStr + ";    commentId 评论条数获取的vid" + commentId);
		String commentCountUrl = COMMENT_COUNT_BASE_URL + commentId + COMMENT_COUNT_LAST_URL;
		String getCommentCountJson = HttpRequestUtil.httpGetRequest(commentCountUrl, null);
		if(getCommentCountJson != null){
			JSONObject jsonObjectCC = null;
			jsonObjectCC = JSONObject.parseObject(getCommentCountJson);
			JSONObject jsonObj = jsonObjectCC.getJSONObject("data");
			commentCount = jsonObj.getString("commentnum");
		}

		
		//视频video_id(综艺是id，电影、电视剧是vid)
		String videoId = "";
		if(videoCollectType.equals(VideoType.zongyi)){
  			videoId = ParseIdForTencent.getIdforTencent(htmlStr);
		}else{
			videoId = ParseIdForTencent.getVidforTencent(htmlStr);
		}
  		if(videoId.equals("") || videoId == null){
  			log.error("getVideoProperty没有解析到VideoId");
  		}
  		
		videoPro.setVideoId(videoId);
		videoPro.setSite(SiteType.TENCENT);
		videoPro.setCommentCount(Integer.parseInt(commentCount));
		videoPro.setCreateTime(DateUtil.getCurrentDateTime());
    	try {
    		if(!playCount.equals("")){
    			videoPro.setPlayCount(Integer.parseInt(playCount));
    		}
			if(!up.equals("")){
				videoPro.setUpCount(Integer.parseInt(up));
			}
			if(!down.equals("")){
				videoPro.setDownCount(Integer.parseInt(down));
			}
		} catch (Exception e) {
			log.error("解析VideoProperty异常, urlStr: " + urlStr, e);
		}
		return videoPro;
	}
	
	//解析评论
	public static VideoCommentUserInfoVO getCommentUserInfo(UrlBeanExt urlBeanExt){
		List<VideoCommentUserInfoVO> totalVideoCommentUserInfoVOList = new ArrayList<VideoCommentUserInfoVO>();
		VideoCommentUserInfoVO videoCommentUserInfoVO  = new VideoCommentUserInfoVO();
		
		CompletionService<List<VideoCommentUserInfoVO>> parseVideoCommentUserInfoThread 
			= new ExecutorCompletionService<List<VideoCommentUserInfoVO>>(ParseThreadPool.parseVideoCommentThreadPool);
		
		List<UrlBean> urlBeanList = urlBeanExt.getUrlList();
		for(int i=0;i<urlBeanList.size();i++){
			UrlBean urlBean = urlBeanList.get(i);
			ParseVideoCommentTask parseVideoCommentTask = new ParseVideoCommentTask(urlBean);
			parseVideoCommentUserInfoThread.submit(parseVideoCommentTask);
		}
		for(int j=0;j<urlBeanList.size();j++){
			List<VideoCommentUserInfoVO> videoCommentUserInfoVOList;
			try {
				videoCommentUserInfoVOList = parseVideoCommentUserInfoThread.take().get();
				totalVideoCommentUserInfoVOList.addAll(videoCommentUserInfoVOList);
			} catch (Exception e) {
				log.error("线程回收异常",e);
			}
		}
		List<Comment> totalCommentList = new ArrayList<Comment>();
		List<UserInfo> totalUserInfoList = new ArrayList<UserInfo>();
		for (VideoCommentUserInfoVO videoCommentUserInfoVOTemp : totalVideoCommentUserInfoVOList) {
			totalCommentList.addAll(videoCommentUserInfoVOTemp.getCommentList());
			totalUserInfoList.addAll(videoCommentUserInfoVOTemp.getUserInfoList());
		}
		
		videoCommentUserInfoVO.setCommentList(totalCommentList);
		videoCommentUserInfoVO.setUserInfoList(totalUserInfoList);
		
		return videoCommentUserInfoVO;
	}
	
	//返回评论页数
	public static int getCommentCount(String commentId, int pageSize){
		double commentCount = 0;
		int pageCount = 0;
		String COMMENT_COUNT_BASE_URL = "http://video.coral.qq.com/article/";
		String COMMENT_COUNT_LAST_URL = "/commentnum";	
		String commentCountStr = "";
		String commentCountUrl = COMMENT_COUNT_BASE_URL + commentId + COMMENT_COUNT_LAST_URL;
		String getCommentCountJson = HttpRequestUtil.httpGetRequest(commentCountUrl, null);
		if(getCommentCountJson != null){
			JSONObject jsonObjectCC = null;
			jsonObjectCC = JSONObject.parseObject(getCommentCountJson);
			JSONObject jsonObj = null;
			if(jsonObjectCC.containsKey("data")){
				jsonObj = jsonObjectCC.getJSONObject("data");
				if(jsonObj.containsKey("commentnum")){
					commentCountStr = jsonObj.getString("commentnum");
				}
			}
		}
		if(!commentCountStr.equals("")){
			commentCount = Double.parseDouble(commentCountStr);
		}
		pageCount = (int)Math.ceil(commentCount/pageSize);
		return pageCount;
	}
	
	//解析每页的评论
	public static CommentPageCountVO parseOnePageCommentUserInfo(String targetId, int pageSize, int pageNum, String videoid, int pageCount){
		//获取Comment的URL基
		String COMMENT_BASE_URL = "http://video.coral.qq.com/article/" + targetId + "/comment";
		log.info("targetId:" + targetId + ",   pageNum:" + pageNum + ",   videoid:" + videoid);
		//初始化接受数据
		CommentPageCountVO commentPageCountVO = new CommentPageCountVO();
		VideoCommentUserInfoVO videoCommentUserInfoVO = new VideoCommentUserInfoVO();
		List<Comment> commentList = new ArrayList<Comment>();
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		//发送获取评论请求，每页pageSize条，默认是30条
		Map<String,String> params = new HashMap<String,String>();
		params.put("reqnum", String.valueOf(pageSize));
		params.put("page", String.valueOf(pageNum));
		String getCommentJson = HttpRequestUtil.httpGetRequest(COMMENT_BASE_URL, params);
		//解析数据
		if(getCommentJson != null){
			JSONObject jsonObject = jsonObject = JSONObject.parseObject(getCommentJson);
			JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("commentid");
			if(jsonArray.size() != 0){
				for(int j=0; j<jsonArray.size(); j++){
					Comment commentOne = new Comment();	
		        	UserInfo userInfoOne = new UserInfo();
					
					JSONObject commentObj = jsonArray.getJSONObject(j);
					/*********评论内容*********/
					//videoId，传参过来
					String videoId = videoid;
					//评论Id
		        	String commentId = commentObj.getString("id");
		        	//获取评论内容:为了防止碰到乱码，处理方式，先编码，再解码
		        	String commentContent = commentObj.getString("content");
		        	//第一种
		        	try {
						String gbk = java.net.URLEncoder.encode(commentContent, "GBK");
						commentContent = java.net.URLDecoder.decode(gbk, "GBK");
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	
		        	//获取评论的回复数，喜欢数
		            int commentCount = commentObj.getIntValue("rep");
		            int likeCount =  commentObj.getIntValue("up");
		            /*获取评论时间*/
		            //获取返回的时间戳
		            long timestamp = commentObj.getLong("time");
		            //转换成字符串
		            String publishTime = DateUtil.getDateFromTimeStamp(timestamp);
		            
		            /*********用户信息*********/
		            JSONObject userinfo = commentObj.getJSONObject("userinfo");
		            //用户id
		            String userId = userinfo.getString("userid");
		            //用户名
		            String userNick = userinfo.getString("userid");
		        	//用户性别
		        	String userGender = userinfo.getString("gender");
		        	//用户所在地区
		        	String userRegion = userinfo.getString("region");
		        	//评论用户头像地址url
		        	String headerPic = userinfo.getString("head");
		        	//评论用户个人空间介绍地址URL,暂无信息
		            
		        	//设置评论信息
		        	commentOne.setVideoId(videoId);
		        	commentOne.setCommentId(commentId);
		        	commentOne.setUserId(userId);
		        	commentOne.setCommentContent(commentContent);
		        	commentOne.setSite(SiteType.TENCENT);
		        	commentOne.setPublishTime(publishTime);
		        	commentOne.setCommentCount(commentCount);
		        	commentOne.setLikeCount(likeCount);
		        	commentOne.setCreateTime(DateUtil.getCurrentDateTime());
		        	
		            commentList.add(commentOne); 
		            
		        	//设置用户信息
		            userInfoOne.setUserId(userId);
		            userInfoOne.setSite(SiteType.TENCENT);
		        	userInfoOne.setNickName(userNick);
		        	userInfoOne.setGender(Integer.parseInt(userGender));
		        	userInfoOne.setHeaderPic(headerPic);
		        	userInfoOne.setProvince(userRegion);
		        	
		        	userInfoList.add(userInfoOne);
				}
			}
		}

		videoCommentUserInfoVO.setCommentList(commentList);
		videoCommentUserInfoVO.setUserInfoList(userInfoList);
		commentPageCountVO.setPageCount(pageCount);
		commentPageCountVO.setVideoCommentUserInfoVO(videoCommentUserInfoVO);
		
		return commentPageCountVO;
	}
	
	
	/**
     * 对由于抓取过程中突然有人评论导致之前的
     * 评论重复抓取的情况，去重
     * @param commentListBefore  去重前
     * @return commentListAfter  去重后
     */
    public static List<Comment> removeDuplicateComment(List<Comment> commentListBefore){
		Map<String,Comment> commentMap = new HashMap<String,Comment>();
		List<Comment> commentListAfter = new ArrayList<Comment>();
		for(int i=0;i<commentListBefore.size();i++){
			commentMap.put(commentListBefore.get(i).getVideoId()+"-"+commentListBefore.get(i).getCommentId()+"-"+commentListBefore.get(i).getSite(), commentListBefore.get(i));
		}
		commentListAfter.addAll(commentMap.values());
    	return commentListAfter;
    }
    
    
    /**
     * 对用户进行去重操作
     * @param commentListBefore  去重前
     * @return commentListAfter  去重后
     */
    public static List<UserInfo> removeDuplicateUser(List<UserInfo> userListBefore){
		Map<String,UserInfo> commentMap = new HashMap<String,UserInfo>();
		List<UserInfo> commentListAfter = new ArrayList<UserInfo>();
		for(int i=0;i<userListBefore.size();i++){
			commentMap.put(userListBefore.get(i).getUserId()+"-"+userListBefore.get(i).getSite(), userListBefore.get(i));
		}
		commentListAfter.addAll(commentMap.values());
    	return commentListAfter;
    }
    
}
