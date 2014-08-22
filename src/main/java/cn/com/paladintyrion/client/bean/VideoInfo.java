package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 视频基础表
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class VideoInfo implements Serializable{
  	public VideoInfo() {
  	}
	/** 原网站视频ID 主键**/
	private String videoId;
	/** 视频名称 **/
	private String videoName;
	/** 期数或集数 **/
	private String videoSubName;
	/** 所属集合 **/
	private String collectId;
	/** 上传时间 **/
	private String uploadTime;
	/** 视频简介 **/
	private String videoDesc;
	/** 视频亮点 **/
	private String videoFocus;
	/** 分类 **/
	private String category;
	/** 演员 **/
	private String actor;
	/** 标签 **/
	private String tag;
	/** 视频时长，单位秒 **/
	private Integer videoTime;
	/** 所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 视频地址 **/
	private String url;
	/** 创建时间 **/
	private String createTime;
	public void setVideoId(String videoId){
		this.videoId=videoId;
	}
	public String getVideoId(){
		return videoId;
	}
	public void setVideoName(String videoName){
		this.videoName=videoName;
	}
	public String getVideoName(){
		return videoName;
	}
	public void setVideoSubName(String videoSubName){
		this.videoSubName=videoSubName;
	}
	public String getVideoSubName(){
		return videoSubName;
	}
	public void setCollectId(String collectId){
		this.collectId=collectId;
	}
	public String getCollectId(){
		return collectId;
	}
	public void setUploadTime(String uploadTime){
		this.uploadTime=uploadTime;
	}
	public String getUploadTime(){
		return uploadTime;
	}
	public void setVideoDesc(String videoDesc){
		this.videoDesc=videoDesc;
	}
	public String getVideoDesc(){
		return videoDesc;
	}
	public void setVideoFocus(String videoFocus){
		this.videoFocus=videoFocus;
	}
	public String getVideoFocus(){
		return videoFocus;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getCategory(){
		return category;
	}
	public void setActor(String actor){
		this.actor=actor;
	}
	public String getActor(){
		return actor;
	}
	public void setTag(String tag){
		this.tag=tag;
	}
	public String getTag(){
		return tag;
	}
	public void setVideoTime(Integer videoTime){
		this.videoTime=videoTime;
	}
	public Integer getVideoTime(){
		return videoTime;
	}
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getCreateTime(){
		return createTime;
	}
}
