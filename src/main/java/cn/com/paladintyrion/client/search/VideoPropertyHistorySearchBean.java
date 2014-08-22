package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class VideoPropertyHistorySearchBean extends SearchBean{
	
	/** 原始属性视频ID 主键**/
	private String videoId;
	/** 原始属性播放次数 **/
	private Integer playCount;
	/** 等于播放次数 **/
	private Integer equalsPlayCount;
	/** 是否为空播放次数 **/
	private Boolean isNotNullPlayCount;
	/** In播放次数 **/
	private List<Integer> inPlayCount;
	/** NotIn播放次数 **/
	private List<Integer> notInPlayCount;
	/** 不等于播放次数 **/
	private Integer noEqualsPlayCount;
	/** 大于播放次数 **/
	private Integer greaterPlayCount;
	/** 大于等于播放次数 **/
	private Integer greaterEqualsPlayCount;
	/** 小于播放次数 **/
	private Integer lessPlayCount;
	/** 小于等于播放次数 **/
	private Integer lessEqualsPlayCount;
	/** 原始属性顶的次数 **/
	private Integer upCount;
	/** 等于顶的次数 **/
	private Integer equalsUpCount;
	/** 是否为空顶的次数 **/
	private Boolean isNotNullUpCount;
	/** In顶的次数 **/
	private List<Integer> inUpCount;
	/** NotIn顶的次数 **/
	private List<Integer> notInUpCount;
	/** 不等于顶的次数 **/
	private Integer noEqualsUpCount;
	/** 大于顶的次数 **/
	private Integer greaterUpCount;
	/** 大于等于顶的次数 **/
	private Integer greaterEqualsUpCount;
	/** 小于顶的次数 **/
	private Integer lessUpCount;
	/** 小于等于顶的次数 **/
	private Integer lessEqualsUpCount;
	/** 原始属性踩的次数 **/
	private Integer downCount;
	/** 等于踩的次数 **/
	private Integer equalsDownCount;
	/** 是否为空踩的次数 **/
	private Boolean isNotNullDownCount;
	/** In踩的次数 **/
	private List<Integer> inDownCount;
	/** NotIn踩的次数 **/
	private List<Integer> notInDownCount;
	/** 不等于踩的次数 **/
	private Integer noEqualsDownCount;
	/** 大于踩的次数 **/
	private Integer greaterDownCount;
	/** 大于等于踩的次数 **/
	private Integer greaterEqualsDownCount;
	/** 小于踩的次数 **/
	private Integer lessDownCount;
	/** 小于等于踩的次数 **/
	private Integer lessEqualsDownCount;
	/** 原始属性评论数 **/
	private Integer commentCount;
	/** 等于评论数 **/
	private Integer equalsCommentCount;
	/** 是否为空评论数 **/
	private Boolean isNotNullCommentCount;
	/** In评论数 **/
	private List<Integer> inCommentCount;
	/** NotIn评论数 **/
	private List<Integer> notInCommentCount;
	/** 不等于评论数 **/
	private Integer noEqualsCommentCount;
	/** 大于评论数 **/
	private Integer greaterCommentCount;
	/** 大于等于评论数 **/
	private Integer greaterEqualsCommentCount;
	/** 小于评论数 **/
	private Integer lessCommentCount;
	/** 小于等于评论数 **/
	private Integer lessEqualsCommentCount;
/** 原始属性所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
/** 原始属性创建时间 主键**/
	private String createTime;

	
  	public VideoPropertyHistorySearchBean() {
  	}
  	
  	public void buildSql(){
  		//注意手工拼接sql和动态拼接sql的不同
  		StringBuffer whereBuf=new StringBuffer("");
  		StringBuffer orderBuf=new StringBuffer();
  		//TODO 在此处增加查询条件
  		setCountSql(whereBuf.toString());
  		//TODO 在此处增加排序,为更好兼容各种数据库建议增加排序条件
  		setOrderSql(orderBuf.toString());
  		setSql(whereBuf.append(" ").append(orderBuf).toString());
  	}
  	
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
	public void setEqualsPlayCount(Integer equalsPlayCount){
		this.equalsPlayCount=equalsPlayCount;
	}
	public Integer getEqualsPlayCount(){
		return equalsPlayCount;
	}
	public void setIsNotNullPlayCount(Boolean isNotNullPlayCount){
		this.isNotNullPlayCount=isNotNullPlayCount;
	}
	public Boolean getIsNotNullPlayCount(){
		return isNotNullPlayCount;
	}
	public void setInPlayCount(List<Integer> inPlayCount){
		this.inPlayCount=inPlayCount;
	}
	public List<Integer> getInPlayCount(){
		return inPlayCount;
	}
	public void setNotInPlayCount(List<Integer> notInPlayCount){
		this.notInPlayCount=notInPlayCount;
	}
	public List<Integer> getNotInPlayCount(){
		return notInPlayCount;
	}
	public void setNoEqualsPlayCount(Integer noEqualsPlayCount){
		this.noEqualsPlayCount=noEqualsPlayCount;
	}
	public Integer getNoEqualsPlayCount(){
		return noEqualsPlayCount;
	}
	public void setGreaterPlayCount(Integer greaterPlayCount){
		this.greaterPlayCount=greaterPlayCount;
	}
	public Integer getGreaterPlayCount(){
		return greaterPlayCount;
	}
	public void setGreaterEqualsPlayCount(Integer greaterEqualsPlayCount){
		this.greaterEqualsPlayCount=greaterEqualsPlayCount;
	}
	public Integer getGreaterEqualsPlayCount(){
		return greaterEqualsPlayCount;
	}
	public void setLessPlayCount(Integer lessPlayCount){
		this.lessPlayCount=lessPlayCount;
	}
	public Integer getLessPlayCount(){
		return lessPlayCount;
	}
	public void setLessEqualsPlayCount(Integer lessEqualsPlayCount){
		this.lessEqualsPlayCount=lessEqualsPlayCount;
	}
	public Integer getLessEqualsPlayCount(){
		return lessEqualsPlayCount;
	}
	public void setUpCount(Integer upCount){
		this.upCount=upCount;
	}
	public Integer getUpCount(){
		return upCount;
	}
	public void setEqualsUpCount(Integer equalsUpCount){
		this.equalsUpCount=equalsUpCount;
	}
	public Integer getEqualsUpCount(){
		return equalsUpCount;
	}
	public void setIsNotNullUpCount(Boolean isNotNullUpCount){
		this.isNotNullUpCount=isNotNullUpCount;
	}
	public Boolean getIsNotNullUpCount(){
		return isNotNullUpCount;
	}
	public void setInUpCount(List<Integer> inUpCount){
		this.inUpCount=inUpCount;
	}
	public List<Integer> getInUpCount(){
		return inUpCount;
	}
	public void setNotInUpCount(List<Integer> notInUpCount){
		this.notInUpCount=notInUpCount;
	}
	public List<Integer> getNotInUpCount(){
		return notInUpCount;
	}
	public void setNoEqualsUpCount(Integer noEqualsUpCount){
		this.noEqualsUpCount=noEqualsUpCount;
	}
	public Integer getNoEqualsUpCount(){
		return noEqualsUpCount;
	}
	public void setGreaterUpCount(Integer greaterUpCount){
		this.greaterUpCount=greaterUpCount;
	}
	public Integer getGreaterUpCount(){
		return greaterUpCount;
	}
	public void setGreaterEqualsUpCount(Integer greaterEqualsUpCount){
		this.greaterEqualsUpCount=greaterEqualsUpCount;
	}
	public Integer getGreaterEqualsUpCount(){
		return greaterEqualsUpCount;
	}
	public void setLessUpCount(Integer lessUpCount){
		this.lessUpCount=lessUpCount;
	}
	public Integer getLessUpCount(){
		return lessUpCount;
	}
	public void setLessEqualsUpCount(Integer lessEqualsUpCount){
		this.lessEqualsUpCount=lessEqualsUpCount;
	}
	public Integer getLessEqualsUpCount(){
		return lessEqualsUpCount;
	}
	public void setDownCount(Integer downCount){
		this.downCount=downCount;
	}
	public Integer getDownCount(){
		return downCount;
	}
	public void setEqualsDownCount(Integer equalsDownCount){
		this.equalsDownCount=equalsDownCount;
	}
	public Integer getEqualsDownCount(){
		return equalsDownCount;
	}
	public void setIsNotNullDownCount(Boolean isNotNullDownCount){
		this.isNotNullDownCount=isNotNullDownCount;
	}
	public Boolean getIsNotNullDownCount(){
		return isNotNullDownCount;
	}
	public void setInDownCount(List<Integer> inDownCount){
		this.inDownCount=inDownCount;
	}
	public List<Integer> getInDownCount(){
		return inDownCount;
	}
	public void setNotInDownCount(List<Integer> notInDownCount){
		this.notInDownCount=notInDownCount;
	}
	public List<Integer> getNotInDownCount(){
		return notInDownCount;
	}
	public void setNoEqualsDownCount(Integer noEqualsDownCount){
		this.noEqualsDownCount=noEqualsDownCount;
	}
	public Integer getNoEqualsDownCount(){
		return noEqualsDownCount;
	}
	public void setGreaterDownCount(Integer greaterDownCount){
		this.greaterDownCount=greaterDownCount;
	}
	public Integer getGreaterDownCount(){
		return greaterDownCount;
	}
	public void setGreaterEqualsDownCount(Integer greaterEqualsDownCount){
		this.greaterEqualsDownCount=greaterEqualsDownCount;
	}
	public Integer getGreaterEqualsDownCount(){
		return greaterEqualsDownCount;
	}
	public void setLessDownCount(Integer lessDownCount){
		this.lessDownCount=lessDownCount;
	}
	public Integer getLessDownCount(){
		return lessDownCount;
	}
	public void setLessEqualsDownCount(Integer lessEqualsDownCount){
		this.lessEqualsDownCount=lessEqualsDownCount;
	}
	public Integer getLessEqualsDownCount(){
		return lessEqualsDownCount;
	}
	public void setCommentCount(Integer commentCount){
		this.commentCount=commentCount;
	}
	public Integer getCommentCount(){
		return commentCount;
	}
	public void setEqualsCommentCount(Integer equalsCommentCount){
		this.equalsCommentCount=equalsCommentCount;
	}
	public Integer getEqualsCommentCount(){
		return equalsCommentCount;
	}
	public void setIsNotNullCommentCount(Boolean isNotNullCommentCount){
		this.isNotNullCommentCount=isNotNullCommentCount;
	}
	public Boolean getIsNotNullCommentCount(){
		return isNotNullCommentCount;
	}
	public void setInCommentCount(List<Integer> inCommentCount){
		this.inCommentCount=inCommentCount;
	}
	public List<Integer> getInCommentCount(){
		return inCommentCount;
	}
	public void setNotInCommentCount(List<Integer> notInCommentCount){
		this.notInCommentCount=notInCommentCount;
	}
	public List<Integer> getNotInCommentCount(){
		return notInCommentCount;
	}
	public void setNoEqualsCommentCount(Integer noEqualsCommentCount){
		this.noEqualsCommentCount=noEqualsCommentCount;
	}
	public Integer getNoEqualsCommentCount(){
		return noEqualsCommentCount;
	}
	public void setGreaterCommentCount(Integer greaterCommentCount){
		this.greaterCommentCount=greaterCommentCount;
	}
	public Integer getGreaterCommentCount(){
		return greaterCommentCount;
	}
	public void setGreaterEqualsCommentCount(Integer greaterEqualsCommentCount){
		this.greaterEqualsCommentCount=greaterEqualsCommentCount;
	}
	public Integer getGreaterEqualsCommentCount(){
		return greaterEqualsCommentCount;
	}
	public void setLessCommentCount(Integer lessCommentCount){
		this.lessCommentCount=lessCommentCount;
	}
	public Integer getLessCommentCount(){
		return lessCommentCount;
	}
	public void setLessEqualsCommentCount(Integer lessEqualsCommentCount){
		this.lessEqualsCommentCount=lessEqualsCommentCount;
	}
	public Integer getLessEqualsCommentCount(){
		return lessEqualsCommentCount;
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
