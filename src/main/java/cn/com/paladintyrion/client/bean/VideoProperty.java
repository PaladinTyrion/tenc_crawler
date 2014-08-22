package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 视频高级属性表
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class VideoProperty implements Serializable{
  	public VideoProperty() {
  	}
	/** 视频ID 主键**/
	private String videoId;
	/** 播放次数 **/
	private Integer playCount;
	/** 顶的次数 **/
	private Integer upCount;
	/** 踩的次数 **/
	private Integer downCount;
	/** 评论数 **/
	private Integer commentCount;
	/** 所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 创建时间 **/
	private String createTime;
	public void setVideoId(String videoId){
		this.videoId=videoId;
	}
	public String getVideoId(){
		return videoId;
	}
	public void setPlayCount(Integer playCount){
		this.playCount=playCount;
	}
	public Integer getPlayCount(){
		return playCount;
	}
	public void setUpCount(Integer upCount){
		this.upCount=upCount;
	}
	public Integer getUpCount(){
		return upCount;
	}
	public void setDownCount(Integer downCount){
		this.downCount=downCount;
	}
	public Integer getDownCount(){
		return downCount;
	}
	public void setCommentCount(Integer commentCount){
		this.commentCount=commentCount;
	}
	public Integer getCommentCount(){
		return commentCount;
	}
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getCreateTime(){
		return createTime;
	}
}
