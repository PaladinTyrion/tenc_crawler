package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 评论表
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class Comment implements Serializable{
  	public Comment() {
  	}
	/** 源视频ID 主键**/
	private String videoId;
	/** 评论ID 主键**/
	private String commentId;
	/** 用户ID **/
	private String userId;
	/** 评论内容 **/
	private String commentContent;
	/** 所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 评论时间 **/
	private String publishTime;
	/** 转发次数 **/
	private Integer forwardCount;
	/** 回复次数 **/
	private Integer commentCount;
	/** 喜欢次数 **/
	private Integer likeCount;
	/** 不喜欢次数 **/
	private Integer unlikeCount;
	/** 发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer publishClient;
	/** 入库时间 **/
	private String createTime;
	public void setVideoId(String videoId){
		this.videoId=videoId;
	}
	public String getVideoId(){
		return videoId;
	}
	public void setCommentId(String commentId){
		this.commentId=commentId;
	}
	public String getCommentId(){
		return commentId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}
	public void setCommentContent(String commentContent){
		this.commentContent=commentContent;
	}
	public String getCommentContent(){
		return commentContent;
	}
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
	public void setPublishTime(String publishTime){
		this.publishTime=publishTime;
	}
	public String getPublishTime(){
		return publishTime;
	}
	public void setForwardCount(Integer forwardCount){
		this.forwardCount=forwardCount;
	}
	public Integer getForwardCount(){
		return forwardCount;
	}
	public void setCommentCount(Integer commentCount){
		this.commentCount=commentCount;
	}
	public Integer getCommentCount(){
		return commentCount;
	}
	public void setLikeCount(Integer likeCount){
		this.likeCount=likeCount;
	}
	public Integer getLikeCount(){
		return likeCount;
	}
	public void setUnlikeCount(Integer unlikeCount){
		this.unlikeCount=unlikeCount;
	}
	public Integer getUnlikeCount(){
		return unlikeCount;
	}
	public void setPublishClient(Integer publishClient){
		this.publishClient=publishClient;
	}
	public Integer getPublishClient(){
		return publishClient;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getCreateTime(){
		return createTime;
	}
}
