package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 剧集表
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class VideoCollectHistory implements Serializable{
  	public VideoCollectHistory() {
  	}
	/** 源剧集ID 主键**/
	private String collectId;
	/** 剧集名称 **/
	private String collectName;
	/** 总集数 **/
	private Integer partCount;
	/** 导演 **/
	private String director;
	/** 剧情介绍 **/
	private String collectDesc;
	/** 分类 **/
	private String collectCategory;
	/** 标签 **/
	private String collectTag;
	/** 演员 **/
	private String actor;
	/** 总播放次数 **/
	private Long playCount;
	/** 评分 **/
	private Double score;
	/** 年份 **/
	private Integer year;
	/** 所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 入库时间 主键**/
	private String createTime;
	/** 备注 **/
	private String remark;
	public void setCollectId(String collectId){
		this.collectId=collectId;
	}
	public String getCollectId(){
		return collectId;
	}
	public void setCollectName(String collectName){
		this.collectName=collectName;
	}
	public String getCollectName(){
		return collectName;
	}
	public void setPartCount(Integer partCount){
		this.partCount=partCount;
	}
	public Integer getPartCount(){
		return partCount;
	}
	public void setDirector(String director){
		this.director=director;
	}
	public String getDirector(){
		return director;
	}
	public void setCollectDesc(String collectDesc){
		this.collectDesc=collectDesc;
	}
	public String getCollectDesc(){
		return collectDesc;
	}
	public void setCollectCategory(String collectCategory){
		this.collectCategory=collectCategory;
	}
	public String getCollectCategory(){
		return collectCategory;
	}
	public void setCollectTag(String collectTag){
		this.collectTag=collectTag;
	}
	public String getCollectTag(){
		return collectTag;
	}
	public void setActor(String actor){
		this.actor=actor;
	}
	public String getActor(){
		return actor;
	}
	public void setPlayCount(Long playCount){
		this.playCount=playCount;
	}
	public Long getPlayCount(){
		return playCount;
	}
	public void setScore(Double score){
		this.score=score;
	}
	public Double getScore(){
		return score;
	}
	public void setYear(Integer year){
		this.year=year;
	}
	public Integer getYear(){
		return year;
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
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
}
