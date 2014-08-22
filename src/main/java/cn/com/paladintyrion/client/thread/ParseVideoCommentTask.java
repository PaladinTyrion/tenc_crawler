package cn.com.paladintyrion.client.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;

import cn.com.paladintyrion.client.bean.CommentPageCountVO;
import cn.com.paladintyrion.client.bean.UrlBean;
import cn.com.paladintyrion.client.bean.VideoCommentUserInfoVO;
import cn.com.paladintyrion.client.controller.parse.HtmlDocUtil;
import cn.com.paladintyrion.client.controller.parse.ParseIdForTencent;
import cn.com.paladintyrion.client.controller.parse.ParseVideoInfoProperty;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;

public class ParseVideoCommentTask implements Callable<List<VideoCommentUserInfoVO>> {
	private final static Logger log = Logger.getLogger(ParseVideoCommentTask.class);
	private UrlBean urlBean;
	private final static int pageSize = 30;
	
	public ParseVideoCommentTask(UrlBean urlBean){
		this.urlBean = urlBean;
	}

	@Override
	public List<VideoCommentUserInfoVO> call() throws Exception {
		List<VideoCommentUserInfoVO> videoCommentUserInfoVOList = new ArrayList<VideoCommentUserInfoVO>();
		
		String urlStr = urlBean.getUrl();
		String htmlStr = HttpRequestUtil.httpGetRequest(urlStr, null);
		//获取videoId
		String videoId = ParseIdForTencent.getIdforTencent(htmlStr);
		//获取vid
		String vid = ParseIdForTencent.getVidforTencent(htmlStr);
		if(vid.indexOf("|") != -1){
			int end = vid.indexOf("|");
			vid = vid.substring(0,end);
		}
		//获取targetId
		String targetId = ParseIdForTencent.getCommentIdforTencent(vid);
		//第一次获取总页数
		int pageCount = 0;
		try{
			pageCount = ParseVideoInfoProperty.getCommentCount(targetId, pageSize);
		}catch(Exception e){
			log.error("urlStr:" + urlStr + "   pageCount解析错误,  vid: " + vid +"  targetId:" + targetId, e);
		}
		
		log.info("urlStr: " + urlStr + "    videoId: " + videoId + "   pageCount: " + pageCount);
		CompletionService<CommentPageCountVO> parseVideoCommentUserInfoThread 
			= new ExecutorCompletionService<CommentPageCountVO>(ParseThreadPool.parseUrlBeanListThreadPool);
		
		for(int i=1;i<=pageCount;i++){
			ParseCommentUserInfoTask parseCommentUserInfoTask = new ParseCommentUserInfoTask(targetId, pageSize, i, videoId, pageCount);
			parseVideoCommentUserInfoThread.submit(parseCommentUserInfoTask);
		}
		for(int j=1;j<=pageCount;j++){
			try {
				CommentPageCountVO commentPageCountVO = parseVideoCommentUserInfoThread.take().get();
				videoCommentUserInfoVOList.add(commentPageCountVO.getVideoCommentUserInfoVO());
			} catch (Exception e) {
				log.error("ParseVideoCommentTask中userinfo线程回收异常",e);
			}
		}
		
		return videoCommentUserInfoVOList;
	}

}
