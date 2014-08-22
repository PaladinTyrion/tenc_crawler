package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class VideoCollectSearchBean extends SearchBean{
	
	/** 原始属性源剧集ID 主键**/
	private String collectId;
	/** 原始属性剧集名称 **/
	private String collectName;
	/** 等于剧集名称 **/
	private String equalsCollectName;
	/** 是否为空剧集名称 **/
	private Boolean isNotNullCollectName;
	/** In剧集名称 **/
	private List<String> inCollectName;
	/** NotIn剧集名称 **/
	private List<String> notInCollectName;
	/** 不等于剧集名称 **/
	private String noEqualsCollectName;
	/** 大于剧集名称 **/
	private String greaterCollectName;
	/** 大于等于剧集名称 **/
	private String greaterEqualsCollectName;
	/** 小于剧集名称 **/
	private String lessCollectName;
	/** 小于等于剧集名称 **/
	private String lessEqualsCollectName;
	/** Like剧集名称 **/
	private String likeCollectName;
	/** Like左匹配剧集名称 **/
	private String leftLikeCollectName;
	/** Like右匹配剧集名称 **/
	private String rightLikeCollectName;
	/** 原始属性总集数 **/
	private Integer partCount;
	/** 等于总集数 **/
	private Integer equalsPartCount;
	/** 是否为空总集数 **/
	private Boolean isNotNullPartCount;
	/** In总集数 **/
	private List<Integer> inPartCount;
	/** NotIn总集数 **/
	private List<Integer> notInPartCount;
	/** 不等于总集数 **/
	private Integer noEqualsPartCount;
	/** 大于总集数 **/
	private Integer greaterPartCount;
	/** 大于等于总集数 **/
	private Integer greaterEqualsPartCount;
	/** 小于总集数 **/
	private Integer lessPartCount;
	/** 小于等于总集数 **/
	private Integer lessEqualsPartCount;
	/** 原始属性导演 **/
	private String director;
	/** 等于导演 **/
	private String equalsDirector;
	/** 是否为空导演 **/
	private Boolean isNotNullDirector;
	/** In导演 **/
	private List<String> inDirector;
	/** NotIn导演 **/
	private List<String> notInDirector;
	/** 不等于导演 **/
	private String noEqualsDirector;
	/** 大于导演 **/
	private String greaterDirector;
	/** 大于等于导演 **/
	private String greaterEqualsDirector;
	/** 小于导演 **/
	private String lessDirector;
	/** 小于等于导演 **/
	private String lessEqualsDirector;
	/** Like导演 **/
	private String likeDirector;
	/** Like左匹配导演 **/
	private String leftLikeDirector;
	/** Like右匹配导演 **/
	private String rightLikeDirector;
	/** 原始属性剧情介绍 **/
	private String collectDesc;
	/** 等于剧情介绍 **/
	private String equalsCollectDesc;
	/** 是否为空剧情介绍 **/
	private Boolean isNotNullCollectDesc;
	/** In剧情介绍 **/
	private List<String> inCollectDesc;
	/** NotIn剧情介绍 **/
	private List<String> notInCollectDesc;
	/** 不等于剧情介绍 **/
	private String noEqualsCollectDesc;
	/** 大于剧情介绍 **/
	private String greaterCollectDesc;
	/** 大于等于剧情介绍 **/
	private String greaterEqualsCollectDesc;
	/** 小于剧情介绍 **/
	private String lessCollectDesc;
	/** 小于等于剧情介绍 **/
	private String lessEqualsCollectDesc;
	/** Like剧情介绍 **/
	private String likeCollectDesc;
	/** Like左匹配剧情介绍 **/
	private String leftLikeCollectDesc;
	/** Like右匹配剧情介绍 **/
	private String rightLikeCollectDesc;
	/** 原始属性分类 **/
	private String collectCategory;
	/** 等于分类 **/
	private String equalsCollectCategory;
	/** 是否为空分类 **/
	private Boolean isNotNullCollectCategory;
	/** In分类 **/
	private List<String> inCollectCategory;
	/** NotIn分类 **/
	private List<String> notInCollectCategory;
	/** 不等于分类 **/
	private String noEqualsCollectCategory;
	/** 大于分类 **/
	private String greaterCollectCategory;
	/** 大于等于分类 **/
	private String greaterEqualsCollectCategory;
	/** 小于分类 **/
	private String lessCollectCategory;
	/** 小于等于分类 **/
	private String lessEqualsCollectCategory;
	/** Like分类 **/
	private String likeCollectCategory;
	/** Like左匹配分类 **/
	private String leftLikeCollectCategory;
	/** Like右匹配分类 **/
	private String rightLikeCollectCategory;
	/** 原始属性标签 **/
	private String collectTag;
	/** 等于标签 **/
	private String equalsCollectTag;
	/** 是否为空标签 **/
	private Boolean isNotNullCollectTag;
	/** In标签 **/
	private List<String> inCollectTag;
	/** NotIn标签 **/
	private List<String> notInCollectTag;
	/** 不等于标签 **/
	private String noEqualsCollectTag;
	/** 大于标签 **/
	private String greaterCollectTag;
	/** 大于等于标签 **/
	private String greaterEqualsCollectTag;
	/** 小于标签 **/
	private String lessCollectTag;
	/** 小于等于标签 **/
	private String lessEqualsCollectTag;
	/** Like标签 **/
	private String likeCollectTag;
	/** Like左匹配标签 **/
	private String leftLikeCollectTag;
	/** Like右匹配标签 **/
	private String rightLikeCollectTag;
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
	/** 原始属性总播放次数 **/
	private Long playCount;
	/** 等于总播放次数 **/
	private Long equalsPlayCount;
	/** 是否为空总播放次数 **/
	private Boolean isNotNullPlayCount;
	/** In总播放次数 **/
	private List<Long> inPlayCount;
	/** NotIn总播放次数 **/
	private List<Long> notInPlayCount;
	/** 不等于总播放次数 **/
	private Long noEqualsPlayCount;
	/** 大于总播放次数 **/
	private Long greaterPlayCount;
	/** 大于等于总播放次数 **/
	private Long greaterEqualsPlayCount;
	/** 小于总播放次数 **/
	private Long lessPlayCount;
	/** 小于等于总播放次数 **/
	private Long lessEqualsPlayCount;
	/** 原始属性评分 **/
	private Double score;
	/** 等于评分 **/
	private Double equalsScore;
	/** 是否为空评分 **/
	private Boolean isNotNullScore;
	/** In评分 **/
	private List<Double> inScore;
	/** NotIn评分 **/
	private List<Double> notInScore;
	/** 不等于评分 **/
	private Double noEqualsScore;
	/** 大于评分 **/
	private Double greaterScore;
	/** 大于等于评分 **/
	private Double greaterEqualsScore;
	/** 小于评分 **/
	private Double lessScore;
	/** 小于等于评分 **/
	private Double lessEqualsScore;
	/** 原始属性年份 **/
	private Integer year;
	/** 等于年份 **/
	private Integer equalsYear;
	/** 是否为空年份 **/
	private Boolean isNotNullYear;
	/** In年份 **/
	private List<Integer> inYear;
	/** NotIn年份 **/
	private List<Integer> notInYear;
	/** 不等于年份 **/
	private Integer noEqualsYear;
	/** 大于年份 **/
	private Integer greaterYear;
	/** 大于等于年份 **/
	private Integer greaterEqualsYear;
	/** 小于年份 **/
	private Integer lessYear;
	/** 小于等于年份 **/
	private Integer lessEqualsYear;
/** 原始属性所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
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
	/** 原始属性备注 **/
	private String remark;
	/** 等于备注 **/
	private String equalsRemark;
	/** 是否为空备注 **/
	private Boolean isNotNullRemark;
	/** In备注 **/
	private List<String> inRemark;
	/** NotIn备注 **/
	private List<String> notInRemark;
	/** 不等于备注 **/
	private String noEqualsRemark;
	/** 大于备注 **/
	private String greaterRemark;
	/** 大于等于备注 **/
	private String greaterEqualsRemark;
	/** 小于备注 **/
	private String lessRemark;
	/** 小于等于备注 **/
	private String lessEqualsRemark;
	/** Like备注 **/
	private String likeRemark;
	/** Like左匹配备注 **/
	private String leftLikeRemark;
	/** Like右匹配备注 **/
	private String rightLikeRemark;

	
  	public VideoCollectSearchBean() {
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
	public void setEqualsCollectName(String equalsCollectName){
		this.equalsCollectName=equalsCollectName;
	}
	public String getEqualsCollectName(){
		return equalsCollectName;
	}
	public void setIsNotNullCollectName(Boolean isNotNullCollectName){
		this.isNotNullCollectName=isNotNullCollectName;
	}
	public Boolean getIsNotNullCollectName(){
		return isNotNullCollectName;
	}
	public void setInCollectName(List<String> inCollectName){
		this.inCollectName=inCollectName;
	}
	public List<String> getInCollectName(){
		return inCollectName;
	}
	public void setNotInCollectName(List<String> notInCollectName){
		this.notInCollectName=notInCollectName;
	}
	public List<String> getNotInCollectName(){
		return notInCollectName;
	}
	public void setNoEqualsCollectName(String noEqualsCollectName){
		this.noEqualsCollectName=noEqualsCollectName;
	}
	public String getNoEqualsCollectName(){
		return noEqualsCollectName;
	}
	public void setGreaterCollectName(String greaterCollectName){
		this.greaterCollectName=greaterCollectName;
	}
	public String getGreaterCollectName(){
		return greaterCollectName;
	}
	public void setGreaterEqualsCollectName(String greaterEqualsCollectName){
		this.greaterEqualsCollectName=greaterEqualsCollectName;
	}
	public String getGreaterEqualsCollectName(){
		return greaterEqualsCollectName;
	}
	public void setLessCollectName(String lessCollectName){
		this.lessCollectName=lessCollectName;
	}
	public String getLessCollectName(){
		return lessCollectName;
	}
	public void setLessEqualsCollectName(String lessEqualsCollectName){
		this.lessEqualsCollectName=lessEqualsCollectName;
	}
	public String getLessEqualsCollectName(){
		return lessEqualsCollectName;
	}
	public void setLikeCollectName(String likeCollectName){
		this.likeCollectName=likeCollectName;
	}
	public String getLikeCollectName(){
		return likeCollectName;
	}
	public void setLeftLikeCollectName(String leftLikeCollectName){
		this.leftLikeCollectName=likeCollectName;
	}
	public String getLeftLikeCollectName(){
		return leftLikeCollectName;
	}
	public void setRightLikeCollectName(String rightLikeCollectName){
		this.rightLikeCollectName=rightLikeCollectName;
	}
	public String getRightLikeCollectName(){
		return rightLikeCollectName;
	}
	public void setPartCount(Integer partCount){
		this.partCount=partCount;
	}
	public Integer getPartCount(){
		return partCount;
	}
	public void setEqualsPartCount(Integer equalsPartCount){
		this.equalsPartCount=equalsPartCount;
	}
	public Integer getEqualsPartCount(){
		return equalsPartCount;
	}
	public void setIsNotNullPartCount(Boolean isNotNullPartCount){
		this.isNotNullPartCount=isNotNullPartCount;
	}
	public Boolean getIsNotNullPartCount(){
		return isNotNullPartCount;
	}
	public void setInPartCount(List<Integer> inPartCount){
		this.inPartCount=inPartCount;
	}
	public List<Integer> getInPartCount(){
		return inPartCount;
	}
	public void setNotInPartCount(List<Integer> notInPartCount){
		this.notInPartCount=notInPartCount;
	}
	public List<Integer> getNotInPartCount(){
		return notInPartCount;
	}
	public void setNoEqualsPartCount(Integer noEqualsPartCount){
		this.noEqualsPartCount=noEqualsPartCount;
	}
	public Integer getNoEqualsPartCount(){
		return noEqualsPartCount;
	}
	public void setGreaterPartCount(Integer greaterPartCount){
		this.greaterPartCount=greaterPartCount;
	}
	public Integer getGreaterPartCount(){
		return greaterPartCount;
	}
	public void setGreaterEqualsPartCount(Integer greaterEqualsPartCount){
		this.greaterEqualsPartCount=greaterEqualsPartCount;
	}
	public Integer getGreaterEqualsPartCount(){
		return greaterEqualsPartCount;
	}
	public void setLessPartCount(Integer lessPartCount){
		this.lessPartCount=lessPartCount;
	}
	public Integer getLessPartCount(){
		return lessPartCount;
	}
	public void setLessEqualsPartCount(Integer lessEqualsPartCount){
		this.lessEqualsPartCount=lessEqualsPartCount;
	}
	public Integer getLessEqualsPartCount(){
		return lessEqualsPartCount;
	}
	public void setDirector(String director){
		this.director=director;
	}
	public String getDirector(){
		return director;
	}
	public void setEqualsDirector(String equalsDirector){
		this.equalsDirector=equalsDirector;
	}
	public String getEqualsDirector(){
		return equalsDirector;
	}
	public void setIsNotNullDirector(Boolean isNotNullDirector){
		this.isNotNullDirector=isNotNullDirector;
	}
	public Boolean getIsNotNullDirector(){
		return isNotNullDirector;
	}
	public void setInDirector(List<String> inDirector){
		this.inDirector=inDirector;
	}
	public List<String> getInDirector(){
		return inDirector;
	}
	public void setNotInDirector(List<String> notInDirector){
		this.notInDirector=notInDirector;
	}
	public List<String> getNotInDirector(){
		return notInDirector;
	}
	public void setNoEqualsDirector(String noEqualsDirector){
		this.noEqualsDirector=noEqualsDirector;
	}
	public String getNoEqualsDirector(){
		return noEqualsDirector;
	}
	public void setGreaterDirector(String greaterDirector){
		this.greaterDirector=greaterDirector;
	}
	public String getGreaterDirector(){
		return greaterDirector;
	}
	public void setGreaterEqualsDirector(String greaterEqualsDirector){
		this.greaterEqualsDirector=greaterEqualsDirector;
	}
	public String getGreaterEqualsDirector(){
		return greaterEqualsDirector;
	}
	public void setLessDirector(String lessDirector){
		this.lessDirector=lessDirector;
	}
	public String getLessDirector(){
		return lessDirector;
	}
	public void setLessEqualsDirector(String lessEqualsDirector){
		this.lessEqualsDirector=lessEqualsDirector;
	}
	public String getLessEqualsDirector(){
		return lessEqualsDirector;
	}
	public void setLikeDirector(String likeDirector){
		this.likeDirector=likeDirector;
	}
	public String getLikeDirector(){
		return likeDirector;
	}
	public void setLeftLikeDirector(String leftLikeDirector){
		this.leftLikeDirector=likeDirector;
	}
	public String getLeftLikeDirector(){
		return leftLikeDirector;
	}
	public void setRightLikeDirector(String rightLikeDirector){
		this.rightLikeDirector=rightLikeDirector;
	}
	public String getRightLikeDirector(){
		return rightLikeDirector;
	}
	public void setCollectDesc(String collectDesc){
		this.collectDesc=collectDesc;
	}
	public String getCollectDesc(){
		return collectDesc;
	}
	public void setEqualsCollectDesc(String equalsCollectDesc){
		this.equalsCollectDesc=equalsCollectDesc;
	}
	public String getEqualsCollectDesc(){
		return equalsCollectDesc;
	}
	public void setIsNotNullCollectDesc(Boolean isNotNullCollectDesc){
		this.isNotNullCollectDesc=isNotNullCollectDesc;
	}
	public Boolean getIsNotNullCollectDesc(){
		return isNotNullCollectDesc;
	}
	public void setInCollectDesc(List<String> inCollectDesc){
		this.inCollectDesc=inCollectDesc;
	}
	public List<String> getInCollectDesc(){
		return inCollectDesc;
	}
	public void setNotInCollectDesc(List<String> notInCollectDesc){
		this.notInCollectDesc=notInCollectDesc;
	}
	public List<String> getNotInCollectDesc(){
		return notInCollectDesc;
	}
	public void setNoEqualsCollectDesc(String noEqualsCollectDesc){
		this.noEqualsCollectDesc=noEqualsCollectDesc;
	}
	public String getNoEqualsCollectDesc(){
		return noEqualsCollectDesc;
	}
	public void setGreaterCollectDesc(String greaterCollectDesc){
		this.greaterCollectDesc=greaterCollectDesc;
	}
	public String getGreaterCollectDesc(){
		return greaterCollectDesc;
	}
	public void setGreaterEqualsCollectDesc(String greaterEqualsCollectDesc){
		this.greaterEqualsCollectDesc=greaterEqualsCollectDesc;
	}
	public String getGreaterEqualsCollectDesc(){
		return greaterEqualsCollectDesc;
	}
	public void setLessCollectDesc(String lessCollectDesc){
		this.lessCollectDesc=lessCollectDesc;
	}
	public String getLessCollectDesc(){
		return lessCollectDesc;
	}
	public void setLessEqualsCollectDesc(String lessEqualsCollectDesc){
		this.lessEqualsCollectDesc=lessEqualsCollectDesc;
	}
	public String getLessEqualsCollectDesc(){
		return lessEqualsCollectDesc;
	}
	public void setLikeCollectDesc(String likeCollectDesc){
		this.likeCollectDesc=likeCollectDesc;
	}
	public String getLikeCollectDesc(){
		return likeCollectDesc;
	}
	public void setLeftLikeCollectDesc(String leftLikeCollectDesc){
		this.leftLikeCollectDesc=likeCollectDesc;
	}
	public String getLeftLikeCollectDesc(){
		return leftLikeCollectDesc;
	}
	public void setRightLikeCollectDesc(String rightLikeCollectDesc){
		this.rightLikeCollectDesc=rightLikeCollectDesc;
	}
	public String getRightLikeCollectDesc(){
		return rightLikeCollectDesc;
	}
	public void setCollectCategory(String collectCategory){
		this.collectCategory=collectCategory;
	}
	public String getCollectCategory(){
		return collectCategory;
	}
	public void setEqualsCollectCategory(String equalsCollectCategory){
		this.equalsCollectCategory=equalsCollectCategory;
	}
	public String getEqualsCollectCategory(){
		return equalsCollectCategory;
	}
	public void setIsNotNullCollectCategory(Boolean isNotNullCollectCategory){
		this.isNotNullCollectCategory=isNotNullCollectCategory;
	}
	public Boolean getIsNotNullCollectCategory(){
		return isNotNullCollectCategory;
	}
	public void setInCollectCategory(List<String> inCollectCategory){
		this.inCollectCategory=inCollectCategory;
	}
	public List<String> getInCollectCategory(){
		return inCollectCategory;
	}
	public void setNotInCollectCategory(List<String> notInCollectCategory){
		this.notInCollectCategory=notInCollectCategory;
	}
	public List<String> getNotInCollectCategory(){
		return notInCollectCategory;
	}
	public void setNoEqualsCollectCategory(String noEqualsCollectCategory){
		this.noEqualsCollectCategory=noEqualsCollectCategory;
	}
	public String getNoEqualsCollectCategory(){
		return noEqualsCollectCategory;
	}
	public void setGreaterCollectCategory(String greaterCollectCategory){
		this.greaterCollectCategory=greaterCollectCategory;
	}
	public String getGreaterCollectCategory(){
		return greaterCollectCategory;
	}
	public void setGreaterEqualsCollectCategory(String greaterEqualsCollectCategory){
		this.greaterEqualsCollectCategory=greaterEqualsCollectCategory;
	}
	public String getGreaterEqualsCollectCategory(){
		return greaterEqualsCollectCategory;
	}
	public void setLessCollectCategory(String lessCollectCategory){
		this.lessCollectCategory=lessCollectCategory;
	}
	public String getLessCollectCategory(){
		return lessCollectCategory;
	}
	public void setLessEqualsCollectCategory(String lessEqualsCollectCategory){
		this.lessEqualsCollectCategory=lessEqualsCollectCategory;
	}
	public String getLessEqualsCollectCategory(){
		return lessEqualsCollectCategory;
	}
	public void setLikeCollectCategory(String likeCollectCategory){
		this.likeCollectCategory=likeCollectCategory;
	}
	public String getLikeCollectCategory(){
		return likeCollectCategory;
	}
	public void setLeftLikeCollectCategory(String leftLikeCollectCategory){
		this.leftLikeCollectCategory=likeCollectCategory;
	}
	public String getLeftLikeCollectCategory(){
		return leftLikeCollectCategory;
	}
	public void setRightLikeCollectCategory(String rightLikeCollectCategory){
		this.rightLikeCollectCategory=rightLikeCollectCategory;
	}
	public String getRightLikeCollectCategory(){
		return rightLikeCollectCategory;
	}
	public void setCollectTag(String collectTag){
		this.collectTag=collectTag;
	}
	public String getCollectTag(){
		return collectTag;
	}
	public void setEqualsCollectTag(String equalsCollectTag){
		this.equalsCollectTag=equalsCollectTag;
	}
	public String getEqualsCollectTag(){
		return equalsCollectTag;
	}
	public void setIsNotNullCollectTag(Boolean isNotNullCollectTag){
		this.isNotNullCollectTag=isNotNullCollectTag;
	}
	public Boolean getIsNotNullCollectTag(){
		return isNotNullCollectTag;
	}
	public void setInCollectTag(List<String> inCollectTag){
		this.inCollectTag=inCollectTag;
	}
	public List<String> getInCollectTag(){
		return inCollectTag;
	}
	public void setNotInCollectTag(List<String> notInCollectTag){
		this.notInCollectTag=notInCollectTag;
	}
	public List<String> getNotInCollectTag(){
		return notInCollectTag;
	}
	public void setNoEqualsCollectTag(String noEqualsCollectTag){
		this.noEqualsCollectTag=noEqualsCollectTag;
	}
	public String getNoEqualsCollectTag(){
		return noEqualsCollectTag;
	}
	public void setGreaterCollectTag(String greaterCollectTag){
		this.greaterCollectTag=greaterCollectTag;
	}
	public String getGreaterCollectTag(){
		return greaterCollectTag;
	}
	public void setGreaterEqualsCollectTag(String greaterEqualsCollectTag){
		this.greaterEqualsCollectTag=greaterEqualsCollectTag;
	}
	public String getGreaterEqualsCollectTag(){
		return greaterEqualsCollectTag;
	}
	public void setLessCollectTag(String lessCollectTag){
		this.lessCollectTag=lessCollectTag;
	}
	public String getLessCollectTag(){
		return lessCollectTag;
	}
	public void setLessEqualsCollectTag(String lessEqualsCollectTag){
		this.lessEqualsCollectTag=lessEqualsCollectTag;
	}
	public String getLessEqualsCollectTag(){
		return lessEqualsCollectTag;
	}
	public void setLikeCollectTag(String likeCollectTag){
		this.likeCollectTag=likeCollectTag;
	}
	public String getLikeCollectTag(){
		return likeCollectTag;
	}
	public void setLeftLikeCollectTag(String leftLikeCollectTag){
		this.leftLikeCollectTag=likeCollectTag;
	}
	public String getLeftLikeCollectTag(){
		return leftLikeCollectTag;
	}
	public void setRightLikeCollectTag(String rightLikeCollectTag){
		this.rightLikeCollectTag=rightLikeCollectTag;
	}
	public String getRightLikeCollectTag(){
		return rightLikeCollectTag;
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
	public void setPlayCount(Long playCount){
		this.playCount=playCount;
	}
	public Long getPlayCount(){
		return playCount;
	}
	public void setEqualsPlayCount(Long equalsPlayCount){
		this.equalsPlayCount=equalsPlayCount;
	}
	public Long getEqualsPlayCount(){
		return equalsPlayCount;
	}
	public void setIsNotNullPlayCount(Boolean isNotNullPlayCount){
		this.isNotNullPlayCount=isNotNullPlayCount;
	}
	public Boolean getIsNotNullPlayCount(){
		return isNotNullPlayCount;
	}
	public void setInPlayCount(List<Long> inPlayCount){
		this.inPlayCount=inPlayCount;
	}
	public List<Long> getInPlayCount(){
		return inPlayCount;
	}
	public void setNotInPlayCount(List<Long> notInPlayCount){
		this.notInPlayCount=notInPlayCount;
	}
	public List<Long> getNotInPlayCount(){
		return notInPlayCount;
	}
	public void setNoEqualsPlayCount(Long noEqualsPlayCount){
		this.noEqualsPlayCount=noEqualsPlayCount;
	}
	public Long getNoEqualsPlayCount(){
		return noEqualsPlayCount;
	}
	public void setGreaterPlayCount(Long greaterPlayCount){
		this.greaterPlayCount=greaterPlayCount;
	}
	public Long getGreaterPlayCount(){
		return greaterPlayCount;
	}
	public void setGreaterEqualsPlayCount(Long greaterEqualsPlayCount){
		this.greaterEqualsPlayCount=greaterEqualsPlayCount;
	}
	public Long getGreaterEqualsPlayCount(){
		return greaterEqualsPlayCount;
	}
	public void setLessPlayCount(Long lessPlayCount){
		this.lessPlayCount=lessPlayCount;
	}
	public Long getLessPlayCount(){
		return lessPlayCount;
	}
	public void setLessEqualsPlayCount(Long lessEqualsPlayCount){
		this.lessEqualsPlayCount=lessEqualsPlayCount;
	}
	public Long getLessEqualsPlayCount(){
		return lessEqualsPlayCount;
	}
	public void setScore(Double score){
		this.score=score;
	}
	public Double getScore(){
		return score;
	}
	public void setEqualsScore(Double equalsScore){
		this.equalsScore=equalsScore;
	}
	public Double getEqualsScore(){
		return equalsScore;
	}
	public void setIsNotNullScore(Boolean isNotNullScore){
		this.isNotNullScore=isNotNullScore;
	}
	public Boolean getIsNotNullScore(){
		return isNotNullScore;
	}
	public void setInScore(List<Double> inScore){
		this.inScore=inScore;
	}
	public List<Double> getInScore(){
		return inScore;
	}
	public void setNotInScore(List<Double> notInScore){
		this.notInScore=notInScore;
	}
	public List<Double> getNotInScore(){
		return notInScore;
	}
	public void setNoEqualsScore(Double noEqualsScore){
		this.noEqualsScore=noEqualsScore;
	}
	public Double getNoEqualsScore(){
		return noEqualsScore;
	}
	public void setGreaterScore(Double greaterScore){
		this.greaterScore=greaterScore;
	}
	public Double getGreaterScore(){
		return greaterScore;
	}
	public void setGreaterEqualsScore(Double greaterEqualsScore){
		this.greaterEqualsScore=greaterEqualsScore;
	}
	public Double getGreaterEqualsScore(){
		return greaterEqualsScore;
	}
	public void setLessScore(Double lessScore){
		this.lessScore=lessScore;
	}
	public Double getLessScore(){
		return lessScore;
	}
	public void setLessEqualsScore(Double lessEqualsScore){
		this.lessEqualsScore=lessEqualsScore;
	}
	public Double getLessEqualsScore(){
		return lessEqualsScore;
	}
	public void setYear(Integer year){
		this.year=year;
	}
	public Integer getYear(){
		return year;
	}
	public void setEqualsYear(Integer equalsYear){
		this.equalsYear=equalsYear;
	}
	public Integer getEqualsYear(){
		return equalsYear;
	}
	public void setIsNotNullYear(Boolean isNotNullYear){
		this.isNotNullYear=isNotNullYear;
	}
	public Boolean getIsNotNullYear(){
		return isNotNullYear;
	}
	public void setInYear(List<Integer> inYear){
		this.inYear=inYear;
	}
	public List<Integer> getInYear(){
		return inYear;
	}
	public void setNotInYear(List<Integer> notInYear){
		this.notInYear=notInYear;
	}
	public List<Integer> getNotInYear(){
		return notInYear;
	}
	public void setNoEqualsYear(Integer noEqualsYear){
		this.noEqualsYear=noEqualsYear;
	}
	public Integer getNoEqualsYear(){
		return noEqualsYear;
	}
	public void setGreaterYear(Integer greaterYear){
		this.greaterYear=greaterYear;
	}
	public Integer getGreaterYear(){
		return greaterYear;
	}
	public void setGreaterEqualsYear(Integer greaterEqualsYear){
		this.greaterEqualsYear=greaterEqualsYear;
	}
	public Integer getGreaterEqualsYear(){
		return greaterEqualsYear;
	}
	public void setLessYear(Integer lessYear){
		this.lessYear=lessYear;
	}
	public Integer getLessYear(){
		return lessYear;
	}
	public void setLessEqualsYear(Integer lessEqualsYear){
		this.lessEqualsYear=lessEqualsYear;
	}
	public Integer getLessEqualsYear(){
		return lessEqualsYear;
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
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public void setEqualsRemark(String equalsRemark){
		this.equalsRemark=equalsRemark;
	}
	public String getEqualsRemark(){
		return equalsRemark;
	}
	public void setIsNotNullRemark(Boolean isNotNullRemark){
		this.isNotNullRemark=isNotNullRemark;
	}
	public Boolean getIsNotNullRemark(){
		return isNotNullRemark;
	}
	public void setInRemark(List<String> inRemark){
		this.inRemark=inRemark;
	}
	public List<String> getInRemark(){
		return inRemark;
	}
	public void setNotInRemark(List<String> notInRemark){
		this.notInRemark=notInRemark;
	}
	public List<String> getNotInRemark(){
		return notInRemark;
	}
	public void setNoEqualsRemark(String noEqualsRemark){
		this.noEqualsRemark=noEqualsRemark;
	}
	public String getNoEqualsRemark(){
		return noEqualsRemark;
	}
	public void setGreaterRemark(String greaterRemark){
		this.greaterRemark=greaterRemark;
	}
	public String getGreaterRemark(){
		return greaterRemark;
	}
	public void setGreaterEqualsRemark(String greaterEqualsRemark){
		this.greaterEqualsRemark=greaterEqualsRemark;
	}
	public String getGreaterEqualsRemark(){
		return greaterEqualsRemark;
	}
	public void setLessRemark(String lessRemark){
		this.lessRemark=lessRemark;
	}
	public String getLessRemark(){
		return lessRemark;
	}
	public void setLessEqualsRemark(String lessEqualsRemark){
		this.lessEqualsRemark=lessEqualsRemark;
	}
	public String getLessEqualsRemark(){
		return lessEqualsRemark;
	}
	public void setLikeRemark(String likeRemark){
		this.likeRemark=likeRemark;
	}
	public String getLikeRemark(){
		return likeRemark;
	}
	public void setLeftLikeRemark(String leftLikeRemark){
		this.leftLikeRemark=likeRemark;
	}
	public String getLeftLikeRemark(){
		return leftLikeRemark;
	}
	public void setRightLikeRemark(String rightLikeRemark){
		this.rightLikeRemark=rightLikeRemark;
	}
	public String getRightLikeRemark(){
		return rightLikeRemark;
	}

}
