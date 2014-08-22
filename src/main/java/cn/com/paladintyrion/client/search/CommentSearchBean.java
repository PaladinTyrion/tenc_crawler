package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class CommentSearchBean extends SearchBean{
	
	/** 原始属性源视频ID 主键**/
	private String videoId;
/** 原始属性评论ID 主键**/
	private String commentId;
	/** 原始属性用户ID **/
	private String userId;
	/** 等于用户ID **/
	private String equalsUserId;
	/** 是否为空用户ID **/
	private Boolean isNotNullUserId;
	/** In用户ID **/
	private List<String> inUserId;
	/** NotIn用户ID **/
	private List<String> notInUserId;
	/** 不等于用户ID **/
	private String noEqualsUserId;
	/** 大于用户ID **/
	private String greaterUserId;
	/** 大于等于用户ID **/
	private String greaterEqualsUserId;
	/** 小于用户ID **/
	private String lessUserId;
	/** 小于等于用户ID **/
	private String lessEqualsUserId;
	/** Like用户ID **/
	private String likeUserId;
	/** Like左匹配用户ID **/
	private String leftLikeUserId;
	/** Like右匹配用户ID **/
	private String rightLikeUserId;
	/** 原始属性评论内容 **/
	private String commentContent;
	/** 等于评论内容 **/
	private String equalsCommentContent;
	/** 是否为空评论内容 **/
	private Boolean isNotNullCommentContent;
	/** In评论内容 **/
	private List<String> inCommentContent;
	/** NotIn评论内容 **/
	private List<String> notInCommentContent;
	/** 不等于评论内容 **/
	private String noEqualsCommentContent;
	/** 大于评论内容 **/
	private String greaterCommentContent;
	/** 大于等于评论内容 **/
	private String greaterEqualsCommentContent;
	/** 小于评论内容 **/
	private String lessCommentContent;
	/** 小于等于评论内容 **/
	private String lessEqualsCommentContent;
	/** Like评论内容 **/
	private String likeCommentContent;
	/** Like左匹配评论内容 **/
	private String leftLikeCommentContent;
	/** Like右匹配评论内容 **/
	private String rightLikeCommentContent;
/** 原始属性所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 原始属性评论时间 **/
	private String publishTime;
	/** 等于评论时间 **/
	private String equalsPublishTime;
	/** 是否为空评论时间 **/
	private Boolean isNotNullPublishTime;
	/** In评论时间 **/
	private List<String> inPublishTime;
	/** NotIn评论时间 **/
	private List<String> notInPublishTime;
	/** 不等于评论时间 **/
	private String noEqualsPublishTime;
	/** 大于评论时间 **/
	private String greaterPublishTime;
	/** 大于等于评论时间 **/
	private String greaterEqualsPublishTime;
	/** 小于评论时间 **/
	private String lessPublishTime;
	/** 小于等于评论时间 **/
	private String lessEqualsPublishTime;
	/** Like评论时间 **/
	private String likePublishTime;
	/** Like左匹配评论时间 **/
	private String leftLikePublishTime;
	/** Like右匹配评论时间 **/
	private String rightLikePublishTime;
	/** 原始属性转发次数 **/
	private Integer forwardCount;
	/** 等于转发次数 **/
	private Integer equalsForwardCount;
	/** 是否为空转发次数 **/
	private Boolean isNotNullForwardCount;
	/** In转发次数 **/
	private List<Integer> inForwardCount;
	/** NotIn转发次数 **/
	private List<Integer> notInForwardCount;
	/** 不等于转发次数 **/
	private Integer noEqualsForwardCount;
	/** 大于转发次数 **/
	private Integer greaterForwardCount;
	/** 大于等于转发次数 **/
	private Integer greaterEqualsForwardCount;
	/** 小于转发次数 **/
	private Integer lessForwardCount;
	/** 小于等于转发次数 **/
	private Integer lessEqualsForwardCount;
	/** 原始属性回复次数 **/
	private Integer commentCount;
	/** 等于回复次数 **/
	private Integer equalsCommentCount;
	/** 是否为空回复次数 **/
	private Boolean isNotNullCommentCount;
	/** In回复次数 **/
	private List<Integer> inCommentCount;
	/** NotIn回复次数 **/
	private List<Integer> notInCommentCount;
	/** 不等于回复次数 **/
	private Integer noEqualsCommentCount;
	/** 大于回复次数 **/
	private Integer greaterCommentCount;
	/** 大于等于回复次数 **/
	private Integer greaterEqualsCommentCount;
	/** 小于回复次数 **/
	private Integer lessCommentCount;
	/** 小于等于回复次数 **/
	private Integer lessEqualsCommentCount;
	/** 原始属性喜欢次数 **/
	private Integer likeCount;
	/** 等于喜欢次数 **/
	private Integer equalsLikeCount;
	/** 是否为空喜欢次数 **/
	private Boolean isNotNullLikeCount;
	/** In喜欢次数 **/
	private List<Integer> inLikeCount;
	/** NotIn喜欢次数 **/
	private List<Integer> notInLikeCount;
	/** 不等于喜欢次数 **/
	private Integer noEqualsLikeCount;
	/** 大于喜欢次数 **/
	private Integer greaterLikeCount;
	/** 大于等于喜欢次数 **/
	private Integer greaterEqualsLikeCount;
	/** 小于喜欢次数 **/
	private Integer lessLikeCount;
	/** 小于等于喜欢次数 **/
	private Integer lessEqualsLikeCount;
	/** 原始属性不喜欢次数 **/
	private Integer unlikeCount;
	/** 等于不喜欢次数 **/
	private Integer equalsUnlikeCount;
	/** 是否为空不喜欢次数 **/
	private Boolean isNotNullUnlikeCount;
	/** In不喜欢次数 **/
	private List<Integer> inUnlikeCount;
	/** NotIn不喜欢次数 **/
	private List<Integer> notInUnlikeCount;
	/** 不等于不喜欢次数 **/
	private Integer noEqualsUnlikeCount;
	/** 大于不喜欢次数 **/
	private Integer greaterUnlikeCount;
	/** 大于等于不喜欢次数 **/
	private Integer greaterEqualsUnlikeCount;
	/** 小于不喜欢次数 **/
	private Integer lessUnlikeCount;
	/** 小于等于不喜欢次数 **/
	private Integer lessEqualsUnlikeCount;
	/** 原始属性发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer publishClient;
	/** 等于发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer equalsPublishClient;
	/** 是否为空发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Boolean isNotNullPublishClient;
	/** In发表终端，0电脑，1iPhone，2Android，3iPad **/
	private List<Integer> inPublishClient;
	/** NotIn发表终端，0电脑，1iPhone，2Android，3iPad **/
	private List<Integer> notInPublishClient;
	/** 不等于发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer noEqualsPublishClient;
	/** 大于发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer greaterPublishClient;
	/** 大于等于发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer greaterEqualsPublishClient;
	/** 小于发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer lessPublishClient;
	/** 小于等于发表终端，0电脑，1iPhone，2Android，3iPad **/
	private Integer lessEqualsPublishClient;
	/** 原始属性入库时间 **/
	private String createTime;
	/** 等于入库时间 **/
	private String equalsCreateTime;
	/** 是否为空入库时间 **/
	private Boolean isNotNullCreateTime;
	/** In入库时间 **/
	private List<String> inCreateTime;
	/** NotIn入库时间 **/
	private List<String> notInCreateTime;
	/** 不等于入库时间 **/
	private String noEqualsCreateTime;
	/** 大于入库时间 **/
	private String greaterCreateTime;
	/** 大于等于入库时间 **/
	private String greaterEqualsCreateTime;
	/** 小于入库时间 **/
	private String lessCreateTime;
	/** 小于等于入库时间 **/
	private String lessEqualsCreateTime;
	/** Like入库时间 **/
	private String likeCreateTime;
	/** Like左匹配入库时间 **/
	private String leftLikeCreateTime;
	/** Like右匹配入库时间 **/
	private String rightLikeCreateTime;

	
  	public CommentSearchBean() {
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
	public void setEqualsUserId(String equalsUserId){
		this.equalsUserId=equalsUserId;
	}
	public String getEqualsUserId(){
		return equalsUserId;
	}
	public void setIsNotNullUserId(Boolean isNotNullUserId){
		this.isNotNullUserId=isNotNullUserId;
	}
	public Boolean getIsNotNullUserId(){
		return isNotNullUserId;
	}
	public void setInUserId(List<String> inUserId){
		this.inUserId=inUserId;
	}
	public List<String> getInUserId(){
		return inUserId;
	}
	public void setNotInUserId(List<String> notInUserId){
		this.notInUserId=notInUserId;
	}
	public List<String> getNotInUserId(){
		return notInUserId;
	}
	public void setNoEqualsUserId(String noEqualsUserId){
		this.noEqualsUserId=noEqualsUserId;
	}
	public String getNoEqualsUserId(){
		return noEqualsUserId;
	}
	public void setGreaterUserId(String greaterUserId){
		this.greaterUserId=greaterUserId;
	}
	public String getGreaterUserId(){
		return greaterUserId;
	}
	public void setGreaterEqualsUserId(String greaterEqualsUserId){
		this.greaterEqualsUserId=greaterEqualsUserId;
	}
	public String getGreaterEqualsUserId(){
		return greaterEqualsUserId;
	}
	public void setLessUserId(String lessUserId){
		this.lessUserId=lessUserId;
	}
	public String getLessUserId(){
		return lessUserId;
	}
	public void setLessEqualsUserId(String lessEqualsUserId){
		this.lessEqualsUserId=lessEqualsUserId;
	}
	public String getLessEqualsUserId(){
		return lessEqualsUserId;
	}
	public void setLikeUserId(String likeUserId){
		this.likeUserId=likeUserId;
	}
	public String getLikeUserId(){
		return likeUserId;
	}
	public void setLeftLikeUserId(String leftLikeUserId){
		this.leftLikeUserId=likeUserId;
	}
	public String getLeftLikeUserId(){
		return leftLikeUserId;
	}
	public void setRightLikeUserId(String rightLikeUserId){
		this.rightLikeUserId=rightLikeUserId;
	}
	public String getRightLikeUserId(){
		return rightLikeUserId;
	}
	public void setCommentContent(String commentContent){
		this.commentContent=commentContent;
	}
	public String getCommentContent(){
		return commentContent;
	}
	public void setEqualsCommentContent(String equalsCommentContent){
		this.equalsCommentContent=equalsCommentContent;
	}
	public String getEqualsCommentContent(){
		return equalsCommentContent;
	}
	public void setIsNotNullCommentContent(Boolean isNotNullCommentContent){
		this.isNotNullCommentContent=isNotNullCommentContent;
	}
	public Boolean getIsNotNullCommentContent(){
		return isNotNullCommentContent;
	}
	public void setInCommentContent(List<String> inCommentContent){
		this.inCommentContent=inCommentContent;
	}
	public List<String> getInCommentContent(){
		return inCommentContent;
	}
	public void setNotInCommentContent(List<String> notInCommentContent){
		this.notInCommentContent=notInCommentContent;
	}
	public List<String> getNotInCommentContent(){
		return notInCommentContent;
	}
	public void setNoEqualsCommentContent(String noEqualsCommentContent){
		this.noEqualsCommentContent=noEqualsCommentContent;
	}
	public String getNoEqualsCommentContent(){
		return noEqualsCommentContent;
	}
	public void setGreaterCommentContent(String greaterCommentContent){
		this.greaterCommentContent=greaterCommentContent;
	}
	public String getGreaterCommentContent(){
		return greaterCommentContent;
	}
	public void setGreaterEqualsCommentContent(String greaterEqualsCommentContent){
		this.greaterEqualsCommentContent=greaterEqualsCommentContent;
	}
	public String getGreaterEqualsCommentContent(){
		return greaterEqualsCommentContent;
	}
	public void setLessCommentContent(String lessCommentContent){
		this.lessCommentContent=lessCommentContent;
	}
	public String getLessCommentContent(){
		return lessCommentContent;
	}
	public void setLessEqualsCommentContent(String lessEqualsCommentContent){
		this.lessEqualsCommentContent=lessEqualsCommentContent;
	}
	public String getLessEqualsCommentContent(){
		return lessEqualsCommentContent;
	}
	public void setLikeCommentContent(String likeCommentContent){
		this.likeCommentContent=likeCommentContent;
	}
	public String getLikeCommentContent(){
		return likeCommentContent;
	}
	public void setLeftLikeCommentContent(String leftLikeCommentContent){
		this.leftLikeCommentContent=likeCommentContent;
	}
	public String getLeftLikeCommentContent(){
		return leftLikeCommentContent;
	}
	public void setRightLikeCommentContent(String rightLikeCommentContent){
		this.rightLikeCommentContent=rightLikeCommentContent;
	}
	public String getRightLikeCommentContent(){
		return rightLikeCommentContent;
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
	public void setEqualsPublishTime(String equalsPublishTime){
		this.equalsPublishTime=equalsPublishTime;
	}
	public String getEqualsPublishTime(){
		return equalsPublishTime;
	}
	public void setIsNotNullPublishTime(Boolean isNotNullPublishTime){
		this.isNotNullPublishTime=isNotNullPublishTime;
	}
	public Boolean getIsNotNullPublishTime(){
		return isNotNullPublishTime;
	}
	public void setInPublishTime(List<String> inPublishTime){
		this.inPublishTime=inPublishTime;
	}
	public List<String> getInPublishTime(){
		return inPublishTime;
	}
	public void setNotInPublishTime(List<String> notInPublishTime){
		this.notInPublishTime=notInPublishTime;
	}
	public List<String> getNotInPublishTime(){
		return notInPublishTime;
	}
	public void setNoEqualsPublishTime(String noEqualsPublishTime){
		this.noEqualsPublishTime=noEqualsPublishTime;
	}
	public String getNoEqualsPublishTime(){
		return noEqualsPublishTime;
	}
	public void setGreaterPublishTime(String greaterPublishTime){
		this.greaterPublishTime=greaterPublishTime;
	}
	public String getGreaterPublishTime(){
		return greaterPublishTime;
	}
	public void setGreaterEqualsPublishTime(String greaterEqualsPublishTime){
		this.greaterEqualsPublishTime=greaterEqualsPublishTime;
	}
	public String getGreaterEqualsPublishTime(){
		return greaterEqualsPublishTime;
	}
	public void setLessPublishTime(String lessPublishTime){
		this.lessPublishTime=lessPublishTime;
	}
	public String getLessPublishTime(){
		return lessPublishTime;
	}
	public void setLessEqualsPublishTime(String lessEqualsPublishTime){
		this.lessEqualsPublishTime=lessEqualsPublishTime;
	}
	public String getLessEqualsPublishTime(){
		return lessEqualsPublishTime;
	}
	public void setLikePublishTime(String likePublishTime){
		this.likePublishTime=likePublishTime;
	}
	public String getLikePublishTime(){
		return likePublishTime;
	}
	public void setLeftLikePublishTime(String leftLikePublishTime){
		this.leftLikePublishTime=likePublishTime;
	}
	public String getLeftLikePublishTime(){
		return leftLikePublishTime;
	}
	public void setRightLikePublishTime(String rightLikePublishTime){
		this.rightLikePublishTime=rightLikePublishTime;
	}
	public String getRightLikePublishTime(){
		return rightLikePublishTime;
	}
	public void setForwardCount(Integer forwardCount){
		this.forwardCount=forwardCount;
	}
	public Integer getForwardCount(){
		return forwardCount;
	}
	public void setEqualsForwardCount(Integer equalsForwardCount){
		this.equalsForwardCount=equalsForwardCount;
	}
	public Integer getEqualsForwardCount(){
		return equalsForwardCount;
	}
	public void setIsNotNullForwardCount(Boolean isNotNullForwardCount){
		this.isNotNullForwardCount=isNotNullForwardCount;
	}
	public Boolean getIsNotNullForwardCount(){
		return isNotNullForwardCount;
	}
	public void setInForwardCount(List<Integer> inForwardCount){
		this.inForwardCount=inForwardCount;
	}
	public List<Integer> getInForwardCount(){
		return inForwardCount;
	}
	public void setNotInForwardCount(List<Integer> notInForwardCount){
		this.notInForwardCount=notInForwardCount;
	}
	public List<Integer> getNotInForwardCount(){
		return notInForwardCount;
	}
	public void setNoEqualsForwardCount(Integer noEqualsForwardCount){
		this.noEqualsForwardCount=noEqualsForwardCount;
	}
	public Integer getNoEqualsForwardCount(){
		return noEqualsForwardCount;
	}
	public void setGreaterForwardCount(Integer greaterForwardCount){
		this.greaterForwardCount=greaterForwardCount;
	}
	public Integer getGreaterForwardCount(){
		return greaterForwardCount;
	}
	public void setGreaterEqualsForwardCount(Integer greaterEqualsForwardCount){
		this.greaterEqualsForwardCount=greaterEqualsForwardCount;
	}
	public Integer getGreaterEqualsForwardCount(){
		return greaterEqualsForwardCount;
	}
	public void setLessForwardCount(Integer lessForwardCount){
		this.lessForwardCount=lessForwardCount;
	}
	public Integer getLessForwardCount(){
		return lessForwardCount;
	}
	public void setLessEqualsForwardCount(Integer lessEqualsForwardCount){
		this.lessEqualsForwardCount=lessEqualsForwardCount;
	}
	public Integer getLessEqualsForwardCount(){
		return lessEqualsForwardCount;
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
	public void setLikeCount(Integer likeCount){
		this.likeCount=likeCount;
	}
	public Integer getLikeCount(){
		return likeCount;
	}
	public void setEqualsLikeCount(Integer equalsLikeCount){
		this.equalsLikeCount=equalsLikeCount;
	}
	public Integer getEqualsLikeCount(){
		return equalsLikeCount;
	}
	public void setIsNotNullLikeCount(Boolean isNotNullLikeCount){
		this.isNotNullLikeCount=isNotNullLikeCount;
	}
	public Boolean getIsNotNullLikeCount(){
		return isNotNullLikeCount;
	}
	public void setInLikeCount(List<Integer> inLikeCount){
		this.inLikeCount=inLikeCount;
	}
	public List<Integer> getInLikeCount(){
		return inLikeCount;
	}
	public void setNotInLikeCount(List<Integer> notInLikeCount){
		this.notInLikeCount=notInLikeCount;
	}
	public List<Integer> getNotInLikeCount(){
		return notInLikeCount;
	}
	public void setNoEqualsLikeCount(Integer noEqualsLikeCount){
		this.noEqualsLikeCount=noEqualsLikeCount;
	}
	public Integer getNoEqualsLikeCount(){
		return noEqualsLikeCount;
	}
	public void setGreaterLikeCount(Integer greaterLikeCount){
		this.greaterLikeCount=greaterLikeCount;
	}
	public Integer getGreaterLikeCount(){
		return greaterLikeCount;
	}
	public void setGreaterEqualsLikeCount(Integer greaterEqualsLikeCount){
		this.greaterEqualsLikeCount=greaterEqualsLikeCount;
	}
	public Integer getGreaterEqualsLikeCount(){
		return greaterEqualsLikeCount;
	}
	public void setLessLikeCount(Integer lessLikeCount){
		this.lessLikeCount=lessLikeCount;
	}
	public Integer getLessLikeCount(){
		return lessLikeCount;
	}
	public void setLessEqualsLikeCount(Integer lessEqualsLikeCount){
		this.lessEqualsLikeCount=lessEqualsLikeCount;
	}
	public Integer getLessEqualsLikeCount(){
		return lessEqualsLikeCount;
	}
	public void setUnlikeCount(Integer unlikeCount){
		this.unlikeCount=unlikeCount;
	}
	public Integer getUnlikeCount(){
		return unlikeCount;
	}
	public void setEqualsUnlikeCount(Integer equalsUnlikeCount){
		this.equalsUnlikeCount=equalsUnlikeCount;
	}
	public Integer getEqualsUnlikeCount(){
		return equalsUnlikeCount;
	}
	public void setIsNotNullUnlikeCount(Boolean isNotNullUnlikeCount){
		this.isNotNullUnlikeCount=isNotNullUnlikeCount;
	}
	public Boolean getIsNotNullUnlikeCount(){
		return isNotNullUnlikeCount;
	}
	public void setInUnlikeCount(List<Integer> inUnlikeCount){
		this.inUnlikeCount=inUnlikeCount;
	}
	public List<Integer> getInUnlikeCount(){
		return inUnlikeCount;
	}
	public void setNotInUnlikeCount(List<Integer> notInUnlikeCount){
		this.notInUnlikeCount=notInUnlikeCount;
	}
	public List<Integer> getNotInUnlikeCount(){
		return notInUnlikeCount;
	}
	public void setNoEqualsUnlikeCount(Integer noEqualsUnlikeCount){
		this.noEqualsUnlikeCount=noEqualsUnlikeCount;
	}
	public Integer getNoEqualsUnlikeCount(){
		return noEqualsUnlikeCount;
	}
	public void setGreaterUnlikeCount(Integer greaterUnlikeCount){
		this.greaterUnlikeCount=greaterUnlikeCount;
	}
	public Integer getGreaterUnlikeCount(){
		return greaterUnlikeCount;
	}
	public void setGreaterEqualsUnlikeCount(Integer greaterEqualsUnlikeCount){
		this.greaterEqualsUnlikeCount=greaterEqualsUnlikeCount;
	}
	public Integer getGreaterEqualsUnlikeCount(){
		return greaterEqualsUnlikeCount;
	}
	public void setLessUnlikeCount(Integer lessUnlikeCount){
		this.lessUnlikeCount=lessUnlikeCount;
	}
	public Integer getLessUnlikeCount(){
		return lessUnlikeCount;
	}
	public void setLessEqualsUnlikeCount(Integer lessEqualsUnlikeCount){
		this.lessEqualsUnlikeCount=lessEqualsUnlikeCount;
	}
	public Integer getLessEqualsUnlikeCount(){
		return lessEqualsUnlikeCount;
	}
	public void setPublishClient(Integer publishClient){
		this.publishClient=publishClient;
	}
	public Integer getPublishClient(){
		return publishClient;
	}
	public void setEqualsPublishClient(Integer equalsPublishClient){
		this.equalsPublishClient=equalsPublishClient;
	}
	public Integer getEqualsPublishClient(){
		return equalsPublishClient;
	}
	public void setIsNotNullPublishClient(Boolean isNotNullPublishClient){
		this.isNotNullPublishClient=isNotNullPublishClient;
	}
	public Boolean getIsNotNullPublishClient(){
		return isNotNullPublishClient;
	}
	public void setInPublishClient(List<Integer> inPublishClient){
		this.inPublishClient=inPublishClient;
	}
	public List<Integer> getInPublishClient(){
		return inPublishClient;
	}
	public void setNotInPublishClient(List<Integer> notInPublishClient){
		this.notInPublishClient=notInPublishClient;
	}
	public List<Integer> getNotInPublishClient(){
		return notInPublishClient;
	}
	public void setNoEqualsPublishClient(Integer noEqualsPublishClient){
		this.noEqualsPublishClient=noEqualsPublishClient;
	}
	public Integer getNoEqualsPublishClient(){
		return noEqualsPublishClient;
	}
	public void setGreaterPublishClient(Integer greaterPublishClient){
		this.greaterPublishClient=greaterPublishClient;
	}
	public Integer getGreaterPublishClient(){
		return greaterPublishClient;
	}
	public void setGreaterEqualsPublishClient(Integer greaterEqualsPublishClient){
		this.greaterEqualsPublishClient=greaterEqualsPublishClient;
	}
	public Integer getGreaterEqualsPublishClient(){
		return greaterEqualsPublishClient;
	}
	public void setLessPublishClient(Integer lessPublishClient){
		this.lessPublishClient=lessPublishClient;
	}
	public Integer getLessPublishClient(){
		return lessPublishClient;
	}
	public void setLessEqualsPublishClient(Integer lessEqualsPublishClient){
		this.lessEqualsPublishClient=lessEqualsPublishClient;
	}
	public Integer getLessEqualsPublishClient(){
		return lessEqualsPublishClient;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getCreateTime(){
		return createTime;
	}
	public void setEqualsCreateTime(String equalsCreateTime){
		this.equalsCreateTime=equalsCreateTime;
	}
	public String getEqualsCreateTime(){
		return equalsCreateTime;
	}
	public void setIsNotNullCreateTime(Boolean isNotNullCreateTime){
		this.isNotNullCreateTime=isNotNullCreateTime;
	}
	public Boolean getIsNotNullCreateTime(){
		return isNotNullCreateTime;
	}
	public void setInCreateTime(List<String> inCreateTime){
		this.inCreateTime=inCreateTime;
	}
	public List<String> getInCreateTime(){
		return inCreateTime;
	}
	public void setNotInCreateTime(List<String> notInCreateTime){
		this.notInCreateTime=notInCreateTime;
	}
	public List<String> getNotInCreateTime(){
		return notInCreateTime;
	}
	public void setNoEqualsCreateTime(String noEqualsCreateTime){
		this.noEqualsCreateTime=noEqualsCreateTime;
	}
	public String getNoEqualsCreateTime(){
		return noEqualsCreateTime;
	}
	public void setGreaterCreateTime(String greaterCreateTime){
		this.greaterCreateTime=greaterCreateTime;
	}
	public String getGreaterCreateTime(){
		return greaterCreateTime;
	}
	public void setGreaterEqualsCreateTime(String greaterEqualsCreateTime){
		this.greaterEqualsCreateTime=greaterEqualsCreateTime;
	}
	public String getGreaterEqualsCreateTime(){
		return greaterEqualsCreateTime;
	}
	public void setLessCreateTime(String lessCreateTime){
		this.lessCreateTime=lessCreateTime;
	}
	public String getLessCreateTime(){
		return lessCreateTime;
	}
	public void setLessEqualsCreateTime(String lessEqualsCreateTime){
		this.lessEqualsCreateTime=lessEqualsCreateTime;
	}
	public String getLessEqualsCreateTime(){
		return lessEqualsCreateTime;
	}
	public void setLikeCreateTime(String likeCreateTime){
		this.likeCreateTime=likeCreateTime;
	}
	public String getLikeCreateTime(){
		return likeCreateTime;
	}
	public void setLeftLikeCreateTime(String leftLikeCreateTime){
		this.leftLikeCreateTime=likeCreateTime;
	}
	public String getLeftLikeCreateTime(){
		return leftLikeCreateTime;
	}
	public void setRightLikeCreateTime(String rightLikeCreateTime){
		this.rightLikeCreateTime=rightLikeCreateTime;
	}
	public String getRightLikeCreateTime(){
		return rightLikeCreateTime;
	}

}
