package cn.com.paladintyrion.client.thread;

import java.util.concurrent.Callable;

import cn.com.paladintyrion.client.bean.CommentPageCountVO;
import cn.com.paladintyrion.client.controller.parse.ParseVideoInfoProperty;
import cn.com.paladintyrion.client.controller.util.HttpRequestUtil;

public class ParseCommentUserInfoTask implements Callable<CommentPageCountVO>{
	private String commentId;
	private int pageSize;
	private int pageNum;
	private String videoId;
	private int pageCount;
	
	public ParseCommentUserInfoTask(String commentId, int pageSize, int pageNum, String videoId, int pageCount){
		this.commentId = commentId;
		this.pageSize = pageSize;
		this.pageNum = pageNum;
		this.videoId = videoId;
		this.pageCount = pageCount;
	}
	
	@Override
	public CommentPageCountVO call() throws Exception {	
		CommentPageCountVO commentPageCountVO = ParseVideoInfoProperty.parseOnePageCommentUserInfo(commentId,pageSize,pageNum, videoId, pageCount);
		return commentPageCountVO;
	}

}
