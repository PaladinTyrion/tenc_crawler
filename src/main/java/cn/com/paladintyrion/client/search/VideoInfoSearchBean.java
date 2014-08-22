package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class VideoInfoSearchBean extends SearchBean{
	
	/** 原始属性原网站视频ID 主键**/
	private String videoId;
	/** 原始属性视频名称 **/
	private String videoName;
	/** 等于视频名称 **/
	private String equalsVideoName;
	/** 是否为空视频名称 **/
	private Boolean isNotNullVideoName;
	/** In视频名称 **/
	private List<String> inVideoName;
	/** NotIn视频名称 **/
	private List<String> notInVideoName;
	/** 不等于视频名称 **/
	private String noEqualsVideoName;
	/** 大于视频名称 **/
	private String greaterVideoName;
	/** 大于等于视频名称 **/
	private String greaterEqualsVideoName;
	/** 小于视频名称 **/
	private String lessVideoName;
	/** 小于等于视频名称 **/
	private String lessEqualsVideoName;
	/** Like视频名称 **/
	private String likeVideoName;
	/** Like左匹配视频名称 **/
	private String leftLikeVideoName;
	/** Like右匹配视频名称 **/
	private String rightLikeVideoName;
	/** 原始属性期数或集数 **/
	private String videoSubName;
	/** 等于期数或集数 **/
	private String equalsVideoSubName;
	/** 是否为空期数或集数 **/
	private Boolean isNotNullVideoSubName;
	/** In期数或集数 **/
	private List<String> inVideoSubName;
	/** NotIn期数或集数 **/
	private List<String> notInVideoSubName;
	/** 不等于期数或集数 **/
	private String noEqualsVideoSubName;
	/** 大于期数或集数 **/
	private String greaterVideoSubName;
	/** 大于等于期数或集数 **/
	private String greaterEqualsVideoSubName;
	/** 小于期数或集数 **/
	private String lessVideoSubName;
	/** 小于等于期数或集数 **/
	private String lessEqualsVideoSubName;
	/** Like期数或集数 **/
	private String likeVideoSubName;
	/** Like左匹配期数或集数 **/
	private String leftLikeVideoSubName;
	/** Like右匹配期数或集数 **/
	private String rightLikeVideoSubName;
	/** 原始属性所属集合 **/
	private String collectId;
	/** 等于所属集合 **/
	private String equalsCollectId;
	/** 是否为空所属集合 **/
	private Boolean isNotNullCollectId;
	/** In所属集合 **/
	private List<String> inCollectId;
	/** NotIn所属集合 **/
	private List<String> notInCollectId;
	/** 不等于所属集合 **/
	private String noEqualsCollectId;
	/** 大于所属集合 **/
	private String greaterCollectId;
	/** 大于等于所属集合 **/
	private String greaterEqualsCollectId;
	/** 小于所属集合 **/
	private String lessCollectId;
	/** 小于等于所属集合 **/
	private String lessEqualsCollectId;
	/** Like所属集合 **/
	private String likeCollectId;
	/** Like左匹配所属集合 **/
	private String leftLikeCollectId;
	/** Like右匹配所属集合 **/
	private String rightLikeCollectId;
	/** 原始属性上传时间 **/
	private String uploadTime;
	/** 等于上传时间 **/
	private String equalsUploadTime;
	/** 是否为空上传时间 **/
	private Boolean isNotNullUploadTime;
	/** In上传时间 **/
	private List<String> inUploadTime;
	/** NotIn上传时间 **/
	private List<String> notInUploadTime;
	/** 不等于上传时间 **/
	private String noEqualsUploadTime;
	/** 大于上传时间 **/
	private String greaterUploadTime;
	/** 大于等于上传时间 **/
	private String greaterEqualsUploadTime;
	/** 小于上传时间 **/
	private String lessUploadTime;
	/** 小于等于上传时间 **/
	private String lessEqualsUploadTime;
	/** Like上传时间 **/
	private String likeUploadTime;
	/** Like左匹配上传时间 **/
	private String leftLikeUploadTime;
	/** Like右匹配上传时间 **/
	private String rightLikeUploadTime;
	/** 原始属性视频简介 **/
	private String videoDesc;
	/** 等于视频简介 **/
	private String equalsVideoDesc;
	/** 是否为空视频简介 **/
	private Boolean isNotNullVideoDesc;
	/** In视频简介 **/
	private List<String> inVideoDesc;
	/** NotIn视频简介 **/
	private List<String> notInVideoDesc;
	/** 不等于视频简介 **/
	private String noEqualsVideoDesc;
	/** 大于视频简介 **/
	private String greaterVideoDesc;
	/** 大于等于视频简介 **/
	private String greaterEqualsVideoDesc;
	/** 小于视频简介 **/
	private String lessVideoDesc;
	/** 小于等于视频简介 **/
	private String lessEqualsVideoDesc;
	/** Like视频简介 **/
	private String likeVideoDesc;
	/** Like左匹配视频简介 **/
	private String leftLikeVideoDesc;
	/** Like右匹配视频简介 **/
	private String rightLikeVideoDesc;
	/** 原始属性视频亮点 **/
	private String videoFocus;
	/** 等于视频亮点 **/
	private String equalsVideoFocus;
	/** 是否为空视频亮点 **/
	private Boolean isNotNullVideoFocus;
	/** In视频亮点 **/
	private List<String> inVideoFocus;
	/** NotIn视频亮点 **/
	private List<String> notInVideoFocus;
	/** 不等于视频亮点 **/
	private String noEqualsVideoFocus;
	/** 大于视频亮点 **/
	private String greaterVideoFocus;
	/** 大于等于视频亮点 **/
	private String greaterEqualsVideoFocus;
	/** 小于视频亮点 **/
	private String lessVideoFocus;
	/** 小于等于视频亮点 **/
	private String lessEqualsVideoFocus;
	/** Like视频亮点 **/
	private String likeVideoFocus;
	/** Like左匹配视频亮点 **/
	private String leftLikeVideoFocus;
	/** Like右匹配视频亮点 **/
	private String rightLikeVideoFocus;
	/** 原始属性分类 **/
	private String category;
	/** 等于分类 **/
	private String equalsCategory;
	/** 是否为空分类 **/
	private Boolean isNotNullCategory;
	/** In分类 **/
	private List<String> inCategory;
	/** NotIn分类 **/
	private List<String> notInCategory;
	/** 不等于分类 **/
	private String noEqualsCategory;
	/** 大于分类 **/
	private String greaterCategory;
	/** 大于等于分类 **/
	private String greaterEqualsCategory;
	/** 小于分类 **/
	private String lessCategory;
	/** 小于等于分类 **/
	private String lessEqualsCategory;
	/** Like分类 **/
	private String likeCategory;
	/** Like左匹配分类 **/
	private String leftLikeCategory;
	/** Like右匹配分类 **/
	private String rightLikeCategory;
	/** 原始属性演员 **/
	private String actor;
	/** 等于演员 **/
	private String equalsActor;
	/** 是否为空演员 **/
	private Boolean isNotNullActor;
	/** In演员 **/
	private List<String> inActor;
	/** NotIn演员 **/
	private List<String> notInActor;
	/** 不等于演员 **/
	private String noEqualsActor;
	/** 大于演员 **/
	private String greaterActor;
	/** 大于等于演员 **/
	private String greaterEqualsActor;
	/** 小于演员 **/
	private String lessActor;
	/** 小于等于演员 **/
	private String lessEqualsActor;
	/** Like演员 **/
	private String likeActor;
	/** Like左匹配演员 **/
	private String leftLikeActor;
	/** Like右匹配演员 **/
	private String rightLikeActor;
	/** 原始属性标签 **/
	private String tag;
	/** 等于标签 **/
	private String equalsTag;
	/** 是否为空标签 **/
	private Boolean isNotNullTag;
	/** In标签 **/
	private List<String> inTag;
	/** NotIn标签 **/
	private List<String> notInTag;
	/** 不等于标签 **/
	private String noEqualsTag;
	/** 大于标签 **/
	private String greaterTag;
	/** 大于等于标签 **/
	private String greaterEqualsTag;
	/** 小于标签 **/
	private String lessTag;
	/** 小于等于标签 **/
	private String lessEqualsTag;
	/** Like标签 **/
	private String likeTag;
	/** Like左匹配标签 **/
	private String leftLikeTag;
	/** Like右匹配标签 **/
	private String rightLikeTag;
	/** 原始属性视频时长，单位秒 **/
	private Integer videoTime;
	/** 等于视频时长，单位秒 **/
	private Integer equalsVideoTime;
	/** 是否为空视频时长，单位秒 **/
	private Boolean isNotNullVideoTime;
	/** In视频时长，单位秒 **/
	private List<Integer> inVideoTime;
	/** NotIn视频时长，单位秒 **/
	private List<Integer> notInVideoTime;
	/** 不等于视频时长，单位秒 **/
	private Integer noEqualsVideoTime;
	/** 大于视频时长，单位秒 **/
	private Integer greaterVideoTime;
	/** 大于等于视频时长，单位秒 **/
	private Integer greaterEqualsVideoTime;
	/** 小于视频时长，单位秒 **/
	private Integer lessVideoTime;
	/** 小于等于视频时长，单位秒 **/
	private Integer lessEqualsVideoTime;
/** 原始属性所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 原始属性视频地址 **/
	private String url;
	/** 等于视频地址 **/
	private String equalsUrl;
	/** 是否为空视频地址 **/
	private Boolean isNotNullUrl;
	/** In视频地址 **/
	private List<String> inUrl;
	/** NotIn视频地址 **/
	private List<String> notInUrl;
	/** 不等于视频地址 **/
	private String noEqualsUrl;
	/** 大于视频地址 **/
	private String greaterUrl;
	/** 大于等于视频地址 **/
	private String greaterEqualsUrl;
	/** 小于视频地址 **/
	private String lessUrl;
	/** 小于等于视频地址 **/
	private String lessEqualsUrl;
	/** Like视频地址 **/
	private String likeUrl;
	/** Like左匹配视频地址 **/
	private String leftLikeUrl;
	/** Like右匹配视频地址 **/
	private String rightLikeUrl;
	/** 原始属性创建时间 **/
	private String createTime;
	/** 等于创建时间 **/
	private String equalsCreateTime;
	/** 是否为空创建时间 **/
	private Boolean isNotNullCreateTime;
	/** In创建时间 **/
	private List<String> inCreateTime;
	/** NotIn创建时间 **/
	private List<String> notInCreateTime;
	/** 不等于创建时间 **/
	private String noEqualsCreateTime;
	/** 大于创建时间 **/
	private String greaterCreateTime;
	/** 大于等于创建时间 **/
	private String greaterEqualsCreateTime;
	/** 小于创建时间 **/
	private String lessCreateTime;
	/** 小于等于创建时间 **/
	private String lessEqualsCreateTime;
	/** Like创建时间 **/
	private String likeCreateTime;
	/** Like左匹配创建时间 **/
	private String leftLikeCreateTime;
	/** Like右匹配创建时间 **/
	private String rightLikeCreateTime;

	
  	public VideoInfoSearchBean() {
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
	public void setVideoName(String videoName){
		this.videoName=videoName;
	}
	public String getVideoName(){
		return videoName;
	}
	public void setEqualsVideoName(String equalsVideoName){
		this.equalsVideoName=equalsVideoName;
	}
	public String getEqualsVideoName(){
		return equalsVideoName;
	}
	public void setIsNotNullVideoName(Boolean isNotNullVideoName){
		this.isNotNullVideoName=isNotNullVideoName;
	}
	public Boolean getIsNotNullVideoName(){
		return isNotNullVideoName;
	}
	public void setInVideoName(List<String> inVideoName){
		this.inVideoName=inVideoName;
	}
	public List<String> getInVideoName(){
		return inVideoName;
	}
	public void setNotInVideoName(List<String> notInVideoName){
		this.notInVideoName=notInVideoName;
	}
	public List<String> getNotInVideoName(){
		return notInVideoName;
	}
	public void setNoEqualsVideoName(String noEqualsVideoName){
		this.noEqualsVideoName=noEqualsVideoName;
	}
	public String getNoEqualsVideoName(){
		return noEqualsVideoName;
	}
	public void setGreaterVideoName(String greaterVideoName){
		this.greaterVideoName=greaterVideoName;
	}
	public String getGreaterVideoName(){
		return greaterVideoName;
	}
	public void setGreaterEqualsVideoName(String greaterEqualsVideoName){
		this.greaterEqualsVideoName=greaterEqualsVideoName;
	}
	public String getGreaterEqualsVideoName(){
		return greaterEqualsVideoName;
	}
	public void setLessVideoName(String lessVideoName){
		this.lessVideoName=lessVideoName;
	}
	public String getLessVideoName(){
		return lessVideoName;
	}
	public void setLessEqualsVideoName(String lessEqualsVideoName){
		this.lessEqualsVideoName=lessEqualsVideoName;
	}
	public String getLessEqualsVideoName(){
		return lessEqualsVideoName;
	}
	public void setLikeVideoName(String likeVideoName){
		this.likeVideoName=likeVideoName;
	}
	public String getLikeVideoName(){
		return likeVideoName;
	}
	public void setLeftLikeVideoName(String leftLikeVideoName){
		this.leftLikeVideoName=likeVideoName;
	}
	public String getLeftLikeVideoName(){
		return leftLikeVideoName;
	}
	public void setRightLikeVideoName(String rightLikeVideoName){
		this.rightLikeVideoName=rightLikeVideoName;
	}
	public String getRightLikeVideoName(){
		return rightLikeVideoName;
	}
	public void setVideoSubName(String videoSubName){
		this.videoSubName=videoSubName;
	}
	public String getVideoSubName(){
		return videoSubName;
	}
	public void setEqualsVideoSubName(String equalsVideoSubName){
		this.equalsVideoSubName=equalsVideoSubName;
	}
	public String getEqualsVideoSubName(){
		return equalsVideoSubName;
	}
	public void setIsNotNullVideoSubName(Boolean isNotNullVideoSubName){
		this.isNotNullVideoSubName=isNotNullVideoSubName;
	}
	public Boolean getIsNotNullVideoSubName(){
		return isNotNullVideoSubName;
	}
	public void setInVideoSubName(List<String> inVideoSubName){
		this.inVideoSubName=inVideoSubName;
	}
	public List<String> getInVideoSubName(){
		return inVideoSubName;
	}
	public void setNotInVideoSubName(List<String> notInVideoSubName){
		this.notInVideoSubName=notInVideoSubName;
	}
	public List<String> getNotInVideoSubName(){
		return notInVideoSubName;
	}
	public void setNoEqualsVideoSubName(String noEqualsVideoSubName){
		this.noEqualsVideoSubName=noEqualsVideoSubName;
	}
	public String getNoEqualsVideoSubName(){
		return noEqualsVideoSubName;
	}
	public void setGreaterVideoSubName(String greaterVideoSubName){
		this.greaterVideoSubName=greaterVideoSubName;
	}
	public String getGreaterVideoSubName(){
		return greaterVideoSubName;
	}
	public void setGreaterEqualsVideoSubName(String greaterEqualsVideoSubName){
		this.greaterEqualsVideoSubName=greaterEqualsVideoSubName;
	}
	public String getGreaterEqualsVideoSubName(){
		return greaterEqualsVideoSubName;
	}
	public void setLessVideoSubName(String lessVideoSubName){
		this.lessVideoSubName=lessVideoSubName;
	}
	public String getLessVideoSubName(){
		return lessVideoSubName;
	}
	public void setLessEqualsVideoSubName(String lessEqualsVideoSubName){
		this.lessEqualsVideoSubName=lessEqualsVideoSubName;
	}
	public String getLessEqualsVideoSubName(){
		return lessEqualsVideoSubName;
	}
	public void setLikeVideoSubName(String likeVideoSubName){
		this.likeVideoSubName=likeVideoSubName;
	}
	public String getLikeVideoSubName(){
		return likeVideoSubName;
	}
	public void setLeftLikeVideoSubName(String leftLikeVideoSubName){
		this.leftLikeVideoSubName=likeVideoSubName;
	}
	public String getLeftLikeVideoSubName(){
		return leftLikeVideoSubName;
	}
	public void setRightLikeVideoSubName(String rightLikeVideoSubName){
		this.rightLikeVideoSubName=rightLikeVideoSubName;
	}
	public String getRightLikeVideoSubName(){
		return rightLikeVideoSubName;
	}
	public void setCollectId(String collectId){
		this.collectId=collectId;
	}
	public String getCollectId(){
		return collectId;
	}
	public void setEqualsCollectId(String equalsCollectId){
		this.equalsCollectId=equalsCollectId;
	}
	public String getEqualsCollectId(){
		return equalsCollectId;
	}
	public void setIsNotNullCollectId(Boolean isNotNullCollectId){
		this.isNotNullCollectId=isNotNullCollectId;
	}
	public Boolean getIsNotNullCollectId(){
		return isNotNullCollectId;
	}
	public void setInCollectId(List<String> inCollectId){
		this.inCollectId=inCollectId;
	}
	public List<String> getInCollectId(){
		return inCollectId;
	}
	public void setNotInCollectId(List<String> notInCollectId){
		this.notInCollectId=notInCollectId;
	}
	public List<String> getNotInCollectId(){
		return notInCollectId;
	}
	public void setNoEqualsCollectId(String noEqualsCollectId){
		this.noEqualsCollectId=noEqualsCollectId;
	}
	public String getNoEqualsCollectId(){
		return noEqualsCollectId;
	}
	public void setGreaterCollectId(String greaterCollectId){
		this.greaterCollectId=greaterCollectId;
	}
	public String getGreaterCollectId(){
		return greaterCollectId;
	}
	public void setGreaterEqualsCollectId(String greaterEqualsCollectId){
		this.greaterEqualsCollectId=greaterEqualsCollectId;
	}
	public String getGreaterEqualsCollectId(){
		return greaterEqualsCollectId;
	}
	public void setLessCollectId(String lessCollectId){
		this.lessCollectId=lessCollectId;
	}
	public String getLessCollectId(){
		return lessCollectId;
	}
	public void setLessEqualsCollectId(String lessEqualsCollectId){
		this.lessEqualsCollectId=lessEqualsCollectId;
	}
	public String getLessEqualsCollectId(){
		return lessEqualsCollectId;
	}
	public void setLikeCollectId(String likeCollectId){
		this.likeCollectId=likeCollectId;
	}
	public String getLikeCollectId(){
		return likeCollectId;
	}
	public void setLeftLikeCollectId(String leftLikeCollectId){
		this.leftLikeCollectId=likeCollectId;
	}
	public String getLeftLikeCollectId(){
		return leftLikeCollectId;
	}
	public void setRightLikeCollectId(String rightLikeCollectId){
		this.rightLikeCollectId=rightLikeCollectId;
	}
	public String getRightLikeCollectId(){
		return rightLikeCollectId;
	}
	public void setUploadTime(String uploadTime){
		this.uploadTime=uploadTime;
	}
	public String getUploadTime(){
		return uploadTime;
	}
	public void setEqualsUploadTime(String equalsUploadTime){
		this.equalsUploadTime=equalsUploadTime;
	}
	public String getEqualsUploadTime(){
		return equalsUploadTime;
	}
	public void setIsNotNullUploadTime(Boolean isNotNullUploadTime){
		this.isNotNullUploadTime=isNotNullUploadTime;
	}
	public Boolean getIsNotNullUploadTime(){
		return isNotNullUploadTime;
	}
	public void setInUploadTime(List<String> inUploadTime){
		this.inUploadTime=inUploadTime;
	}
	public List<String> getInUploadTime(){
		return inUploadTime;
	}
	public void setNotInUploadTime(List<String> notInUploadTime){
		this.notInUploadTime=notInUploadTime;
	}
	public List<String> getNotInUploadTime(){
		return notInUploadTime;
	}
	public void setNoEqualsUploadTime(String noEqualsUploadTime){
		this.noEqualsUploadTime=noEqualsUploadTime;
	}
	public String getNoEqualsUploadTime(){
		return noEqualsUploadTime;
	}
	public void setGreaterUploadTime(String greaterUploadTime){
		this.greaterUploadTime=greaterUploadTime;
	}
	public String getGreaterUploadTime(){
		return greaterUploadTime;
	}
	public void setGreaterEqualsUploadTime(String greaterEqualsUploadTime){
		this.greaterEqualsUploadTime=greaterEqualsUploadTime;
	}
	public String getGreaterEqualsUploadTime(){
		return greaterEqualsUploadTime;
	}
	public void setLessUploadTime(String lessUploadTime){
		this.lessUploadTime=lessUploadTime;
	}
	public String getLessUploadTime(){
		return lessUploadTime;
	}
	public void setLessEqualsUploadTime(String lessEqualsUploadTime){
		this.lessEqualsUploadTime=lessEqualsUploadTime;
	}
	public String getLessEqualsUploadTime(){
		return lessEqualsUploadTime;
	}
	public void setLikeUploadTime(String likeUploadTime){
		this.likeUploadTime=likeUploadTime;
	}
	public String getLikeUploadTime(){
		return likeUploadTime;
	}
	public void setLeftLikeUploadTime(String leftLikeUploadTime){
		this.leftLikeUploadTime=likeUploadTime;
	}
	public String getLeftLikeUploadTime(){
		return leftLikeUploadTime;
	}
	public void setRightLikeUploadTime(String rightLikeUploadTime){
		this.rightLikeUploadTime=rightLikeUploadTime;
	}
	public String getRightLikeUploadTime(){
		return rightLikeUploadTime;
	}
	public void setVideoDesc(String videoDesc){
		this.videoDesc=videoDesc;
	}
	public String getVideoDesc(){
		return videoDesc;
	}
	public void setEqualsVideoDesc(String equalsVideoDesc){
		this.equalsVideoDesc=equalsVideoDesc;
	}
	public String getEqualsVideoDesc(){
		return equalsVideoDesc;
	}
	public void setIsNotNullVideoDesc(Boolean isNotNullVideoDesc){
		this.isNotNullVideoDesc=isNotNullVideoDesc;
	}
	public Boolean getIsNotNullVideoDesc(){
		return isNotNullVideoDesc;
	}
	public void setInVideoDesc(List<String> inVideoDesc){
		this.inVideoDesc=inVideoDesc;
	}
	public List<String> getInVideoDesc(){
		return inVideoDesc;
	}
	public void setNotInVideoDesc(List<String> notInVideoDesc){
		this.notInVideoDesc=notInVideoDesc;
	}
	public List<String> getNotInVideoDesc(){
		return notInVideoDesc;
	}
	public void setNoEqualsVideoDesc(String noEqualsVideoDesc){
		this.noEqualsVideoDesc=noEqualsVideoDesc;
	}
	public String getNoEqualsVideoDesc(){
		return noEqualsVideoDesc;
	}
	public void setGreaterVideoDesc(String greaterVideoDesc){
		this.greaterVideoDesc=greaterVideoDesc;
	}
	public String getGreaterVideoDesc(){
		return greaterVideoDesc;
	}
	public void setGreaterEqualsVideoDesc(String greaterEqualsVideoDesc){
		this.greaterEqualsVideoDesc=greaterEqualsVideoDesc;
	}
	public String getGreaterEqualsVideoDesc(){
		return greaterEqualsVideoDesc;
	}
	public void setLessVideoDesc(String lessVideoDesc){
		this.lessVideoDesc=lessVideoDesc;
	}
	public String getLessVideoDesc(){
		return lessVideoDesc;
	}
	public void setLessEqualsVideoDesc(String lessEqualsVideoDesc){
		this.lessEqualsVideoDesc=lessEqualsVideoDesc;
	}
	public String getLessEqualsVideoDesc(){
		return lessEqualsVideoDesc;
	}
	public void setLikeVideoDesc(String likeVideoDesc){
		this.likeVideoDesc=likeVideoDesc;
	}
	public String getLikeVideoDesc(){
		return likeVideoDesc;
	}
	public void setLeftLikeVideoDesc(String leftLikeVideoDesc){
		this.leftLikeVideoDesc=likeVideoDesc;
	}
	public String getLeftLikeVideoDesc(){
		return leftLikeVideoDesc;
	}
	public void setRightLikeVideoDesc(String rightLikeVideoDesc){
		this.rightLikeVideoDesc=rightLikeVideoDesc;
	}
	public String getRightLikeVideoDesc(){
		return rightLikeVideoDesc;
	}
	public void setVideoFocus(String videoFocus){
		this.videoFocus=videoFocus;
	}
	public String getVideoFocus(){
		return videoFocus;
	}
	public void setEqualsVideoFocus(String equalsVideoFocus){
		this.equalsVideoFocus=equalsVideoFocus;
	}
	public String getEqualsVideoFocus(){
		return equalsVideoFocus;
	}
	public void setIsNotNullVideoFocus(Boolean isNotNullVideoFocus){
		this.isNotNullVideoFocus=isNotNullVideoFocus;
	}
	public Boolean getIsNotNullVideoFocus(){
		return isNotNullVideoFocus;
	}
	public void setInVideoFocus(List<String> inVideoFocus){
		this.inVideoFocus=inVideoFocus;
	}
	public List<String> getInVideoFocus(){
		return inVideoFocus;
	}
	public void setNotInVideoFocus(List<String> notInVideoFocus){
		this.notInVideoFocus=notInVideoFocus;
	}
	public List<String> getNotInVideoFocus(){
		return notInVideoFocus;
	}
	public void setNoEqualsVideoFocus(String noEqualsVideoFocus){
		this.noEqualsVideoFocus=noEqualsVideoFocus;
	}
	public String getNoEqualsVideoFocus(){
		return noEqualsVideoFocus;
	}
	public void setGreaterVideoFocus(String greaterVideoFocus){
		this.greaterVideoFocus=greaterVideoFocus;
	}
	public String getGreaterVideoFocus(){
		return greaterVideoFocus;
	}
	public void setGreaterEqualsVideoFocus(String greaterEqualsVideoFocus){
		this.greaterEqualsVideoFocus=greaterEqualsVideoFocus;
	}
	public String getGreaterEqualsVideoFocus(){
		return greaterEqualsVideoFocus;
	}
	public void setLessVideoFocus(String lessVideoFocus){
		this.lessVideoFocus=lessVideoFocus;
	}
	public String getLessVideoFocus(){
		return lessVideoFocus;
	}
	public void setLessEqualsVideoFocus(String lessEqualsVideoFocus){
		this.lessEqualsVideoFocus=lessEqualsVideoFocus;
	}
	public String getLessEqualsVideoFocus(){
		return lessEqualsVideoFocus;
	}
	public void setLikeVideoFocus(String likeVideoFocus){
		this.likeVideoFocus=likeVideoFocus;
	}
	public String getLikeVideoFocus(){
		return likeVideoFocus;
	}
	public void setLeftLikeVideoFocus(String leftLikeVideoFocus){
		this.leftLikeVideoFocus=likeVideoFocus;
	}
	public String getLeftLikeVideoFocus(){
		return leftLikeVideoFocus;
	}
	public void setRightLikeVideoFocus(String rightLikeVideoFocus){
		this.rightLikeVideoFocus=rightLikeVideoFocus;
	}
	public String getRightLikeVideoFocus(){
		return rightLikeVideoFocus;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getCategory(){
		return category;
	}
	public void setEqualsCategory(String equalsCategory){
		this.equalsCategory=equalsCategory;
	}
	public String getEqualsCategory(){
		return equalsCategory;
	}
	public void setIsNotNullCategory(Boolean isNotNullCategory){
		this.isNotNullCategory=isNotNullCategory;
	}
	public Boolean getIsNotNullCategory(){
		return isNotNullCategory;
	}
	public void setInCategory(List<String> inCategory){
		this.inCategory=inCategory;
	}
	public List<String> getInCategory(){
		return inCategory;
	}
	public void setNotInCategory(List<String> notInCategory){
		this.notInCategory=notInCategory;
	}
	public List<String> getNotInCategory(){
		return notInCategory;
	}
	public void setNoEqualsCategory(String noEqualsCategory){
		this.noEqualsCategory=noEqualsCategory;
	}
	public String getNoEqualsCategory(){
		return noEqualsCategory;
	}
	public void setGreaterCategory(String greaterCategory){
		this.greaterCategory=greaterCategory;
	}
	public String getGreaterCategory(){
		return greaterCategory;
	}
	public void setGreaterEqualsCategory(String greaterEqualsCategory){
		this.greaterEqualsCategory=greaterEqualsCategory;
	}
	public String getGreaterEqualsCategory(){
		return greaterEqualsCategory;
	}
	public void setLessCategory(String lessCategory){
		this.lessCategory=lessCategory;
	}
	public String getLessCategory(){
		return lessCategory;
	}
	public void setLessEqualsCategory(String lessEqualsCategory){
		this.lessEqualsCategory=lessEqualsCategory;
	}
	public String getLessEqualsCategory(){
		return lessEqualsCategory;
	}
	public void setLikeCategory(String likeCategory){
		this.likeCategory=likeCategory;
	}
	public String getLikeCategory(){
		return likeCategory;
	}
	public void setLeftLikeCategory(String leftLikeCategory){
		this.leftLikeCategory=likeCategory;
	}
	public String getLeftLikeCategory(){
		return leftLikeCategory;
	}
	public void setRightLikeCategory(String rightLikeCategory){
		this.rightLikeCategory=rightLikeCategory;
	}
	public String getRightLikeCategory(){
		return rightLikeCategory;
	}
	public void setActor(String actor){
		this.actor=actor;
	}
	public String getActor(){
		return actor;
	}
	public void setEqualsActor(String equalsActor){
		this.equalsActor=equalsActor;
	}
	public String getEqualsActor(){
		return equalsActor;
	}
	public void setIsNotNullActor(Boolean isNotNullActor){
		this.isNotNullActor=isNotNullActor;
	}
	public Boolean getIsNotNullActor(){
		return isNotNullActor;
	}
	public void setInActor(List<String> inActor){
		this.inActor=inActor;
	}
	public List<String> getInActor(){
		return inActor;
	}
	public void setNotInActor(List<String> notInActor){
		this.notInActor=notInActor;
	}
	public List<String> getNotInActor(){
		return notInActor;
	}
	public void setNoEqualsActor(String noEqualsActor){
		this.noEqualsActor=noEqualsActor;
	}
	public String getNoEqualsActor(){
		return noEqualsActor;
	}
	public void setGreaterActor(String greaterActor){
		this.greaterActor=greaterActor;
	}
	public String getGreaterActor(){
		return greaterActor;
	}
	public void setGreaterEqualsActor(String greaterEqualsActor){
		this.greaterEqualsActor=greaterEqualsActor;
	}
	public String getGreaterEqualsActor(){
		return greaterEqualsActor;
	}
	public void setLessActor(String lessActor){
		this.lessActor=lessActor;
	}
	public String getLessActor(){
		return lessActor;
	}
	public void setLessEqualsActor(String lessEqualsActor){
		this.lessEqualsActor=lessEqualsActor;
	}
	public String getLessEqualsActor(){
		return lessEqualsActor;
	}
	public void setLikeActor(String likeActor){
		this.likeActor=likeActor;
	}
	public String getLikeActor(){
		return likeActor;
	}
	public void setLeftLikeActor(String leftLikeActor){
		this.leftLikeActor=likeActor;
	}
	public String getLeftLikeActor(){
		return leftLikeActor;
	}
	public void setRightLikeActor(String rightLikeActor){
		this.rightLikeActor=rightLikeActor;
	}
	public String getRightLikeActor(){
		return rightLikeActor;
	}
	public void setTag(String tag){
		this.tag=tag;
	}
	public String getTag(){
		return tag;
	}
	public void setEqualsTag(String equalsTag){
		this.equalsTag=equalsTag;
	}
	public String getEqualsTag(){
		return equalsTag;
	}
	public void setIsNotNullTag(Boolean isNotNullTag){
		this.isNotNullTag=isNotNullTag;
	}
	public Boolean getIsNotNullTag(){
		return isNotNullTag;
	}
	public void setInTag(List<String> inTag){
		this.inTag=inTag;
	}
	public List<String> getInTag(){
		return inTag;
	}
	public void setNotInTag(List<String> notInTag){
		this.notInTag=notInTag;
	}
	public List<String> getNotInTag(){
		return notInTag;
	}
	public void setNoEqualsTag(String noEqualsTag){
		this.noEqualsTag=noEqualsTag;
	}
	public String getNoEqualsTag(){
		return noEqualsTag;
	}
	public void setGreaterTag(String greaterTag){
		this.greaterTag=greaterTag;
	}
	public String getGreaterTag(){
		return greaterTag;
	}
	public void setGreaterEqualsTag(String greaterEqualsTag){
		this.greaterEqualsTag=greaterEqualsTag;
	}
	public String getGreaterEqualsTag(){
		return greaterEqualsTag;
	}
	public void setLessTag(String lessTag){
		this.lessTag=lessTag;
	}
	public String getLessTag(){
		return lessTag;
	}
	public void setLessEqualsTag(String lessEqualsTag){
		this.lessEqualsTag=lessEqualsTag;
	}
	public String getLessEqualsTag(){
		return lessEqualsTag;
	}
	public void setLikeTag(String likeTag){
		this.likeTag=likeTag;
	}
	public String getLikeTag(){
		return likeTag;
	}
	public void setLeftLikeTag(String leftLikeTag){
		this.leftLikeTag=likeTag;
	}
	public String getLeftLikeTag(){
		return leftLikeTag;
	}
	public void setRightLikeTag(String rightLikeTag){
		this.rightLikeTag=rightLikeTag;
	}
	public String getRightLikeTag(){
		return rightLikeTag;
	}
	public void setVideoTime(Integer videoTime){
		this.videoTime=videoTime;
	}
	public Integer getVideoTime(){
		return videoTime;
	}
	public void setEqualsVideoTime(Integer equalsVideoTime){
		this.equalsVideoTime=equalsVideoTime;
	}
	public Integer getEqualsVideoTime(){
		return equalsVideoTime;
	}
	public void setIsNotNullVideoTime(Boolean isNotNullVideoTime){
		this.isNotNullVideoTime=isNotNullVideoTime;
	}
	public Boolean getIsNotNullVideoTime(){
		return isNotNullVideoTime;
	}
	public void setInVideoTime(List<Integer> inVideoTime){
		this.inVideoTime=inVideoTime;
	}
	public List<Integer> getInVideoTime(){
		return inVideoTime;
	}
	public void setNotInVideoTime(List<Integer> notInVideoTime){
		this.notInVideoTime=notInVideoTime;
	}
	public List<Integer> getNotInVideoTime(){
		return notInVideoTime;
	}
	public void setNoEqualsVideoTime(Integer noEqualsVideoTime){
		this.noEqualsVideoTime=noEqualsVideoTime;
	}
	public Integer getNoEqualsVideoTime(){
		return noEqualsVideoTime;
	}
	public void setGreaterVideoTime(Integer greaterVideoTime){
		this.greaterVideoTime=greaterVideoTime;
	}
	public Integer getGreaterVideoTime(){
		return greaterVideoTime;
	}
	public void setGreaterEqualsVideoTime(Integer greaterEqualsVideoTime){
		this.greaterEqualsVideoTime=greaterEqualsVideoTime;
	}
	public Integer getGreaterEqualsVideoTime(){
		return greaterEqualsVideoTime;
	}
	public void setLessVideoTime(Integer lessVideoTime){
		this.lessVideoTime=lessVideoTime;
	}
	public Integer getLessVideoTime(){
		return lessVideoTime;
	}
	public void setLessEqualsVideoTime(Integer lessEqualsVideoTime){
		this.lessEqualsVideoTime=lessEqualsVideoTime;
	}
	public Integer getLessEqualsVideoTime(){
		return lessEqualsVideoTime;
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
	public void setEqualsUrl(String equalsUrl){
		this.equalsUrl=equalsUrl;
	}
	public String getEqualsUrl(){
		return equalsUrl;
	}
	public void setIsNotNullUrl(Boolean isNotNullUrl){
		this.isNotNullUrl=isNotNullUrl;
	}
	public Boolean getIsNotNullUrl(){
		return isNotNullUrl;
	}
	public void setInUrl(List<String> inUrl){
		this.inUrl=inUrl;
	}
	public List<String> getInUrl(){
		return inUrl;
	}
	public void setNotInUrl(List<String> notInUrl){
		this.notInUrl=notInUrl;
	}
	public List<String> getNotInUrl(){
		return notInUrl;
	}
	public void setNoEqualsUrl(String noEqualsUrl){
		this.noEqualsUrl=noEqualsUrl;
	}
	public String getNoEqualsUrl(){
		return noEqualsUrl;
	}
	public void setGreaterUrl(String greaterUrl){
		this.greaterUrl=greaterUrl;
	}
	public String getGreaterUrl(){
		return greaterUrl;
	}
	public void setGreaterEqualsUrl(String greaterEqualsUrl){
		this.greaterEqualsUrl=greaterEqualsUrl;
	}
	public String getGreaterEqualsUrl(){
		return greaterEqualsUrl;
	}
	public void setLessUrl(String lessUrl){
		this.lessUrl=lessUrl;
	}
	public String getLessUrl(){
		return lessUrl;
	}
	public void setLessEqualsUrl(String lessEqualsUrl){
		this.lessEqualsUrl=lessEqualsUrl;
	}
	public String getLessEqualsUrl(){
		return lessEqualsUrl;
	}
	public void setLikeUrl(String likeUrl){
		this.likeUrl=likeUrl;
	}
	public String getLikeUrl(){
		return likeUrl;
	}
	public void setLeftLikeUrl(String leftLikeUrl){
		this.leftLikeUrl=likeUrl;
	}
	public String getLeftLikeUrl(){
		return leftLikeUrl;
	}
	public void setRightLikeUrl(String rightLikeUrl){
		this.rightLikeUrl=rightLikeUrl;
	}
	public String getRightLikeUrl(){
		return rightLikeUrl;
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
