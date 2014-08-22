package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class VideoCollectComment implements Serializable{
  	public VideoCollectComment() {
  	}
	/** 源剧集ID 主键**/
	private String collectId;
	/** 剧集名称 主键**/
	private String commentId;
	/** 用户ID **/
	private String userId;
	/** 剧评内容 **/
	private String commentContent;
	/** 评论时间 **/
	private String publishTime;
	/** 转发次数 **/
	private Integer forwardCount;
	/** 回复次数 **/
	private Integer commentCount;
	/** 喜欢次数 **/
	private Integer likeCount;
	/** 发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer publishClient;
	/** 入库时间 **/
	private String createTime;
	public void setCollectId(String collectId){
		this.collectId=collectId;
	}
	public String getCollectId(){
		return collectId;
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
