import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.com.paladintyrion.client.bean.CollectAddress;
import cn.com.paladintyrion.client.bean.Comment;
import cn.com.paladintyrion.client.bean.TaskJsonBean;
import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.UrlBeanExt;
import cn.com.paladintyrion.client.bean.UserInfo;
import cn.com.paladintyrion.client.bean.VideoCollect;
import cn.com.paladintyrion.client.bean.VideoCollectHistory;
import cn.com.paladintyrion.client.bean.VideoCommentUserInfoVO;
import cn.com.paladintyrion.client.bean.VideoInfo;
import cn.com.paladintyrion.client.bean.VideoInfoPropertyVO;
import cn.com.paladintyrion.client.bean.VideoProperty;
import cn.com.paladintyrion.client.bean.VideoPropertyHistory;
import cn.com.paladintyrion.client.bean.VideoType;
import cn.com.paladintyrion.client.cache.TaskMsgQueue;
import cn.com.paladintyrion.client.controller.crawler.TencentCrawler;
import cn.com.paladintyrion.client.controller.parse.ParseInjection;
import cn.com.paladintyrion.client.controller.parse.ParseVideoInfoProperty;
import cn.com.paladintyrion.client.controller.parse.SiteType;
import cn.com.paladintyrion.client.controller.parse.ToolforRegEx;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;
import cn.com.paladintyrion.client.search.CollectAddressSearchBean;
import cn.com.paladintyrion.client.search.VideoCollectSearchBean;
import cn.com.paladintyrion.client.service.CollectAddressService;
import cn.com.paladintyrion.client.service.CommentService;
import cn.com.paladintyrion.client.service.UserInfoService;
import cn.com.paladintyrion.client.service.VideoCollectService;
import cn.com.paladintyrion.client.service.VideoInfoService;
import cn.com.paladintyrion.client.service.VideoPropertyService;
import cn.com.paladintyrion.common.spring.BeanFactory;
import cn.com.screendata.monitor.client.MonitorClient;

@Slf4j
public class TestCrawlParse {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String url = "http://v.qq.com/variety/column/column_769.html";
//		String url = "http://v.qq.com/variety/column/column_6077.html";
		
//		String url = "http://v.qq.com/detail/b/b6mser4rir2b61k.html";
//		String url = "http://v.qq.com/detail/c/creca1j3ko3e5wg.html";
//		String url = "http://v.qq.com/variety/column/column_304.html";
//		String url = "http://v.qq.com/p/tv/detail/gong3/";
		
		String url = "http://v.qq.com/detail/0/0hdxhb9oug3z9th.html";
		
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
		VideoCollectService videoCollectService = (VideoCollectService) ctx.getBean("videoCollectService");
		CommentService commentService = (CommentService) ctx.getBean("commentService");
		VideoInfoService videoInfoService = (VideoInfoService) ctx.getBean("videoInfoService");
		VideoPropertyService videoPropertyService = (VideoPropertyService) ctx.getBean("videoPropertyService");
		UserInfoService userInfoService = (UserInfoService) ctx.getBean("userInfoService");	
		CollectAddressService collectAddressService = (CollectAddressService) ctx.getBean("collectAddressService");	
		
		try{
			TencentCrawler crawler = new TencentCrawler();
			UrlBeanExt urlBeanExt = crawler.execute(url);
			
			List<UrlBean> list = urlBeanExt.getUrlList();
			VideoCollect videoCollect = urlBeanExt.getVideoCollect();
			
			if((list != null)&&(videoCollect != null)){
				//把历史数据删掉
				VideoCollectSearchBean vcSearchBean = new VideoCollectSearchBean();
				vcSearchBean.setCollectId(videoCollect.getCollectId());
				vcSearchBean.setSite(SiteType.TENCENT);
				videoCollectService.removeVideoCollectByCondition(vcSearchBean);
				//插入数据库
				videoCollectService.addVideoCollect(videoCollect);
				
				//VideoInfo&VideoProperty
				ParseVideoInfoProperty parseVideoInfoProperty = new ParseVideoInfoProperty();
				
				VideoInfoPropertyVO videoInfoPropertyVO = parseVideoInfoProperty.getVideoInfoProperty(urlBeanExt);
				List<VideoInfo> videoInfoList = videoInfoPropertyVO.getVideoInfoList();
				List<VideoProperty> videoPropertyList = videoInfoPropertyVO.getVideoPropertyList();

				//VideoInfo 
				for(VideoInfo videoInfo : videoInfoList){
					VideoInfo videoInfoTemp = new VideoInfo();
					videoInfoTemp.setVideoId(videoInfo.getVideoId());
					videoInfoTemp = videoInfoService.getVideoInfoByExample(videoInfoTemp);
					if(videoInfoTemp == null){
						videoInfoService.addVideoInfo(videoInfo);
					}
				
				}
				//VideoProperty
				List<VideoProperty> videoProListTemp = new ArrayList<VideoProperty>();
				for(VideoProperty videoProperty : videoPropertyList){
					VideoProperty videoPropertyTemp = new VideoProperty();
					videoPropertyTemp.setVideoId(videoProperty.getVideoId());
					videoPropertyTemp.setSite(videoProperty.getSite());
					videoProListTemp.add(videoPropertyTemp);
				}
				videoPropertyService.batchRemoveVideoPropertyByExample(videoProListTemp);
				videoPropertyService.batchAddVideoProperty(videoPropertyList);
				
				//Commment
				VideoCommentUserInfoVO videoCommentUserInfoVO = parseVideoInfoProperty.getCommentUserInfo(urlBeanExt);
				List<Comment> totalCommentListBefore = videoCommentUserInfoVO.getCommentList();
				
				//去重
				List<Comment> totalCommentList = ParseVideoInfoProperty.removeDuplicateComment(totalCommentListBefore);
				List<Comment> commentListTemp = new ArrayList<Comment>();
				
				for (Comment comment : totalCommentList) {
					Comment commentTemp = new Comment();
					commentTemp.setVideoId(comment.getVideoId());
					commentTemp.setCommentId(comment.getCommentId());
					commentTemp.setSite(comment.getSite());
					commentListTemp.add(commentTemp);
				}
				commentService.batchRemoveCommentByExample(commentListTemp);
				commentService.batchAddComment(totalCommentList);
				
				//UserInfo
				List<UserInfo> totalUserListBefore = videoCommentUserInfoVO.getUserInfoList();
				//去重
				List<UserInfo> totalUserList = ParseVideoInfoProperty.removeDuplicateUser(totalUserListBefore);
				List<UserInfo> userListTemp = new ArrayList<UserInfo>();
				
				for (UserInfo userinfo : totalUserList) {
					UserInfo userTemp = new UserInfo();
					userTemp.setUserId(userinfo.getUserId());
					userTemp.setSite(userinfo.getSite());
					userListTemp.add(userTemp);
				}
				userInfoService.batchRemoveUserInfoByExample(userListTemp);
				userInfoService.batchAddUserInfo(totalUserList);
			}
		}catch(Exception e){
			log.error("处理异常", e);
		}

//		String url = "http://v.qq.com/variety/type/list_-1_1_0.html";
//		String type = "综艺";
		
//		String url = "http://v.qq.com/list/2_-1_-1_2012_1_0_0_20_-1_-1_0.html";
//		String type = "电视剧";
		
//		String url = "http://v.qq.com/movielist/10001/10003-100035/0/1/0/20/0/0.html";
//		String type = "电影";
//		
//		try{
//			if(type.equals(VideoType.dianshiju)){
//				try{
//					//电视剧入口
//					List<CollectAddress> collectAddresslist = ParseInjection.getTVInjectionUrl(url);
//					List<CollectAddress> collectAddressfinalList = new ArrayList<CollectAddress>();
//					if((collectAddresslist != null) && (!collectAddresslist.isEmpty())){
//						for (CollectAddress collectAddress : collectAddresslist) {
//							CollectAddress collectAddressTemp = new CollectAddress();
//							collectAddressTemp.setUrl(collectAddress.getUrl());
//							collectAddressTemp.setSite(SiteType.TENCENT);
//							int countTemp = collectAddressService.getCollectAddressCountByExample(collectAddressTemp);
//							if(countTemp == 0){
//								collectAddressfinalList.add(collectAddress);
//							}
//						}
//						collectAddressService.batchAddCollectAddress(collectAddressfinalList);
//					}
//				}catch(Exception e){
//					log.error("电视剧更新标准入口出错", e);
//				}	
//				log.info("TV Finished!");
//			}else if(type.equals(VideoType.dianying)){
//				try{
//					//电影入口
//					List<CollectAddress> collectAddresslist = ParseInjection.getMovieInjectionUrl(url);
//					List<CollectAddress> collectAddressfinalList = new ArrayList<CollectAddress>();
//					if((collectAddresslist != null) && (!collectAddresslist.isEmpty())){
//						for (CollectAddress collectAddress : collectAddresslist) {
//							CollectAddress collectAddressTemp = new CollectAddress();
//							collectAddressTemp.setUrl(collectAddress.getUrl());
//							collectAddressTemp.setSite(SiteType.TENCENT);
//							int countTemp = collectAddressService.getCollectAddressCountByExample(collectAddressTemp);
//							if(countTemp == 0){
//								collectAddressfinalList.add(collectAddress);
//							}
//						}
//						collectAddressService.batchAddCollectAddress(collectAddressfinalList);
//					}
//				}catch(Exception e){
//					log.error("电影更新标准入口出错", e);
//				}
//				log.info("Movie Finished!");
//			}else if(type.equals(VideoType.zongyi)){
//				try{
//					//综艺入口
//					List<CollectAddress> collectAddresslist = ParseInjection.getVarietyShowInjectionUrl(url);
//					List<CollectAddress> collectAddressfinalList = new ArrayList<CollectAddress>();
//					for (CollectAddress collectAddress : collectAddresslist) {
//						CollectAddress collectAddressTemp = new CollectAddress();
//						collectAddressTemp.setUrl(collectAddress.getUrl());
//						collectAddressTemp.setSite(SiteType.TENCENT);
//						int countTemp = collectAddressService.getCollectAddressCountByExample(collectAddressTemp);
//						if(countTemp == 0){
//							collectAddressfinalList.add(collectAddress);
//						}
//					}
//					collectAddressService.batchAddCollectAddress(collectAddressfinalList);
//				}catch(Exception e){
//					log.error("综艺更新标准入口出错", e);
//				}
//				log.info("Show Finished!");
//			}
//		}catch(Exception e){
//			log.error("处理异常", e);
//		}
		//本次任务执行完毕，向服务端发送空闲消息
		log.info("Tencent Finished!");

		
	}

}
