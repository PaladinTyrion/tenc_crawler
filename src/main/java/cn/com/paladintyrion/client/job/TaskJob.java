package cn.com.paladintyrion.client.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.paladintyrion.client.bean.CollectAddress;
import cn.com.paladintyrion.client.bean.CollectPlayInfo;
import cn.com.paladintyrion.client.bean.CollectProperty;
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
import cn.com.paladintyrion.client.search.CommentSearchBean;
import cn.com.paladintyrion.client.search.VideoCollectSearchBean;
import cn.com.paladintyrion.client.service.CollectAddressService;
import cn.com.paladintyrion.client.service.CollectPlayInfoService;
import cn.com.paladintyrion.client.service.CollectPropertyService;
import cn.com.paladintyrion.client.service.CommentService;
import cn.com.paladintyrion.client.service.UserInfoService;
import cn.com.paladintyrion.client.service.VideoCollectHistoryService;
import cn.com.paladintyrion.client.service.VideoCollectService;
import cn.com.paladintyrion.client.service.VideoInfoService;
import cn.com.paladintyrion.client.service.VideoPropertyHistoryService;
import cn.com.paladintyrion.client.service.VideoPropertyService;
import cn.com.paladintyrion.common.spring.BeanFactory;
import cn.com.screendata.monitor.client.MonitorClient;

@Component(value="taskJob")
@Slf4j
public class TaskJob {

	@Autowired
	@Getter
	@Setter
	private CommentService commentService;
	@Autowired
	@Getter
	@Setter
	private VideoCollectService videoCollectService;
	@Autowired
	@Getter
	@Setter
	private VideoInfoService videoInfoService;
	@Autowired
	@Getter
	@Setter
	private VideoPropertyService videoPropertyService;
	@Autowired
	@Getter
	@Setter
	private CollectPlayInfoService collectPlayInfoService;
	@Autowired
	@Getter
	@Setter
	private CollectPropertyService collectPropertyService;
	@Autowired
	@Getter
	@Setter
	private UserInfoService userInfoService;
	@Autowired
	@Getter
	@Setter
	private CollectAddressService collectAddressService;
	@Autowired
	@Getter
	@Setter
	private VideoCollectHistoryService videoCollectHistoryService;
	@Autowired
	@Getter
	@Setter
	private VideoPropertyHistoryService videoPropertyHistoryService;
	
	public void execute(){
		
		TaskJsonBean taskJsonBean = TaskMsgQueue.getTask();
		if(taskJsonBean == null){
			return;
		}
		String type = taskJsonBean.getType();//电影、综艺、电视剧
		String url = taskJsonBean.getUrl();
		int taskType = taskJsonBean.getTaskType();//0抓取标准入口，1浅抓取，2深抓取
		
		if(taskType == 0){//0抓取标准入口
			if(type.equals(VideoType.dianshiju)){
				try{
					//电视剧入口
					List<CollectAddress> collectAddresslist = ParseInjection.getTVInjectionUrl(url);
					List<CollectAddress> collectAddressfinalList = new ArrayList<CollectAddress>();
					if((collectAddresslist != null) && (!collectAddresslist.isEmpty())){
						for (CollectAddress collectAddress : collectAddresslist) {
							CollectAddress collectAddressTemp = new CollectAddress();
							collectAddressTemp.setUrl(collectAddress.getUrl());
							collectAddressTemp.setSite(SiteType.TENCENT);
							int countTemp = collectAddressService.getCollectAddressCountByExample(collectAddressTemp);
							if(countTemp == 0){
								collectAddressfinalList.add(collectAddress);
							}
						}
						collectAddressService.batchAddCollectAddress(collectAddressfinalList);
					}
				}catch(Exception e){
					log.error("电视剧更新标准入口出错", e);
				}	
				log.info("TV Finished!");
			}else if(type.equals(VideoType.dianying)){
				try{
					//电影入口
					List<CollectAddress> collectAddresslist = ParseInjection.getMovieInjectionUrl(url);
					List<CollectAddress> collectAddressfinalList = new ArrayList<CollectAddress>();
					if((collectAddresslist != null) && (!collectAddresslist.isEmpty())){
						for (CollectAddress collectAddress : collectAddresslist) {
							CollectAddress collectAddressTemp = new CollectAddress();
							collectAddressTemp.setUrl(collectAddress.getUrl());
							collectAddressTemp.setSite(SiteType.TENCENT);
							int countTemp = collectAddressService.getCollectAddressCountByExample(collectAddressTemp);
							if(countTemp == 0){
								collectAddressfinalList.add(collectAddress);
							}
						}
						collectAddressService.batchAddCollectAddress(collectAddressfinalList);
					}
				}catch(Exception e){
					log.error("电影更新标准入口出错", e);
				}
				log.info("Movie Finished!");
			}else if(type.equals(VideoType.zongyi)){
				try{
					//综艺入口
					List<CollectAddress> collectAddresslist = ParseInjection.getVarietyShowInjectionUrl(url);
					List<CollectAddress> collectAddressfinalList = new ArrayList<CollectAddress>();
					for (CollectAddress collectAddress : collectAddresslist) {
						CollectAddress collectAddressTemp = new CollectAddress();
						collectAddressTemp.setUrl(collectAddress.getUrl());
						collectAddressTemp.setSite(SiteType.TENCENT);
						int countTemp = collectAddressService.getCollectAddressCountByExample(collectAddressTemp);
						if(countTemp == 0){
							collectAddressfinalList.add(collectAddress);
						}
					}
					collectAddressService.batchAddCollectAddress(collectAddressfinalList);
				}catch(Exception e){
					log.error("综艺更新标准入口出错", e);
				}
				log.info("Show Finished!");
			}
		}
		
		if(taskType == 1){//1浅抓取
			log.info("url --> "+url);
			try{
				TencentCrawler crawler = new TencentCrawler();
				UrlBeanExt urlBeanExt = crawler.execute(url);
				
				if(urlBeanExt != null){
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
						//插入历史数据库
						VideoCollectHistory videoCollectHistory = new VideoCollectHistory();
						videoCollectHistory.setActor(videoCollect.getActor());
						videoCollectHistory.setCollectCategory(videoCollect.getCollectCategory());
						videoCollectHistory.setCollectDesc(videoCollect.getCollectDesc());
						videoCollectHistory.setCollectId(videoCollect.getCollectId());
						videoCollectHistory.setCollectName(videoCollect.getCollectName());
						videoCollectHistory.setCollectTag(videoCollect.getCollectTag());
						videoCollectHistory.setCreateTime(videoCollect.getCreateTime());
						videoCollectHistory.setDirector(videoCollect.getDirector());
						videoCollectHistory.setPartCount(videoCollect.getPartCount());
						videoCollectHistory.setPlayCount(videoCollect.getPlayCount());
						videoCollectHistory.setRemark(videoCollect.getRemark());
						videoCollectHistory.setSite(videoCollect.getSite());
						videoCollectHistory.setYear(videoCollect.getYear());
						videoCollectHistoryService.addVideoCollectHistory(videoCollectHistory);
					}
				}
				
			}catch(Exception e){
				log.error("URL:--------->" + url + "处理异常", e);
			}
		}
		
		if(taskType == 2){//2浅抓取
			log.info("url --> "+url);
			try{
				TencentCrawler crawler = new TencentCrawler();
				UrlBeanExt urlBeanExt = crawler.execute(url);
				
				if(urlBeanExt != null){
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
						//插入历史数据库
						VideoCollectHistory videoCollectHistory = new VideoCollectHistory();
						videoCollectHistory.setActor(videoCollect.getActor());
						videoCollectHistory.setCollectCategory(videoCollect.getCollectCategory());
						videoCollectHistory.setCollectDesc(videoCollect.getCollectDesc());
						videoCollectHistory.setCollectId(videoCollect.getCollectId());
						videoCollectHistory.setCollectName(videoCollect.getCollectName());
						videoCollectHistory.setCollectTag(videoCollect.getCollectTag());
						videoCollectHistory.setCreateTime(videoCollect.getCreateTime());
						videoCollectHistory.setDirector(videoCollect.getDirector());
						videoCollectHistory.setPartCount(videoCollect.getPartCount());
						videoCollectHistory.setPlayCount(videoCollect.getPlayCount());
						videoCollectHistory.setRemark(videoCollect.getRemark());
						videoCollectHistory.setSite(videoCollect.getSite());
						videoCollectHistory.setYear(videoCollect.getYear());
						videoCollectHistoryService.addVideoCollectHistory(videoCollectHistory);
						
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
						//插入历史数据库
						List<VideoPropertyHistory> videoPropertyHistoryList = new ArrayList<VideoPropertyHistory>();
						for(VideoProperty videoProperty : videoPropertyList){
							VideoPropertyHistory videoPropertyHistory = new VideoPropertyHistory();
							
							videoPropertyHistory.setCommentCount(videoProperty.getCommentCount());
							videoPropertyHistory.setCreateTime(videoProperty.getCreateTime());
							videoPropertyHistory.setDownCount(videoProperty.getDownCount());
							videoPropertyHistory.setPlayCount(videoProperty.getPlayCount());
							videoPropertyHistory.setSite(videoProperty.getSite());
							videoPropertyHistory.setUpCount(videoProperty.getUpCount());
							videoPropertyHistory.setVideoId(videoProperty.getVideoId());
							
							videoPropertyHistoryList.add(videoPropertyHistory);
						}
						videoPropertyHistoryService.batchAddVideoPropertyHistory(videoPropertyHistoryList);
						
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
				}
				
			}catch(Exception e){
				log.error("URL:--------->" + url + "处理异常", e);
			}
		}
		
		//本次任务执行完毕，向服务端发送空闲消息
		log.info("Tencent Finished!");
		MonitorClient monitorClient=BeanFactory.getBean("monitorClient",MonitorClient.class);
		monitorClient.sendModifyStatusMessage();
	}

}
