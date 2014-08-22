package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class CollectAddressSearchBean extends SearchBean{
	
	/** 原始属性UUID 主键**/
	private String id;
	/** 原始属性节目名称 **/
	private String collectName;
	/** 等于节目名称 **/
	private String equalsCollectName;
	/** 是否为空节目名称 **/
	private Boolean isNotNullCollectName;
	/** In节目名称 **/
	private List<String> inCollectName;
	/** NotIn节目名称 **/
	private List<String> notInCollectName;
	/** 不等于节目名称 **/
	private String noEqualsCollectName;
	/** 大于节目名称 **/
	private String greaterCollectName;
	/** 大于等于节目名称 **/
	private String greaterEqualsCollectName;
	/** 小于节目名称 **/
	private String lessCollectName;
	/** 小于等于节目名称 **/
	private String lessEqualsCollectName;
	/** Like节目名称 **/
	private String likeCollectName;
	/** Like左匹配节目名称 **/
	private String leftLikeCollectName;
	/** Like右匹配节目名称 **/
	private String rightLikeCollectName;
	/** 原始属性节目url **/
	private String url;
	/** 等于节目url **/
	private String equalsUrl;
	/** 是否为空节目url **/
	private Boolean isNotNullUrl;
	/** In节目url **/
	private List<String> inUrl;
	/** NotIn节目url **/
	private List<String> notInUrl;
	/** 不等于节目url **/
	private String noEqualsUrl;
	/** 大于节目url **/
	private String greaterUrl;
	/** 大于等于节目url **/
	private String greaterEqualsUrl;
	/** 小于节目url **/
	private String lessUrl;
	/** 小于等于节目url **/
	private String lessEqualsUrl;
	/** Like节目url **/
	private String likeUrl;
	/** Like左匹配节目url **/
	private String leftLikeUrl;
	/** Like右匹配节目url **/
	private String rightLikeUrl;
	/** 原始属性 **/
	private String collectType;
	/** 等于 **/
	private String equalsCollectType;
	/** 是否为空 **/
	private Boolean isNotNullCollectType;
	/** In **/
	private List<String> inCollectType;
	/** NotIn **/
	private List<String> notInCollectType;
	/** 不等于 **/
	private String noEqualsCollectType;
	/** 大于 **/
	private String greaterCollectType;
	/** 大于等于 **/
	private String greaterEqualsCollectType;
	/** 小于 **/
	private String lessCollectType;
	/** 小于等于 **/
	private String lessEqualsCollectType;
	/** Like **/
	private String likeCollectType;
	/** Like左匹配 **/
	private String leftLikeCollectType;
	/** Like右匹配 **/
	private String rightLikeCollectType;
	/** 原始属性0优酷，1爱奇艺，2乐视 **/
	private Integer site;
	/** 等于0优酷，1爱奇艺，2乐视 **/
	private Integer equalsSite;
	/** 是否为空0优酷，1爱奇艺，2乐视 **/
	private Boolean isNotNullSite;
	/** In0优酷，1爱奇艺，2乐视 **/
	private List<Integer> inSite;
	/** NotIn0优酷，1爱奇艺，2乐视 **/
	private List<Integer> notInSite;
	/** 不等于0优酷，1爱奇艺，2乐视 **/
	private Integer noEqualsSite;
	/** 大于0优酷，1爱奇艺，2乐视 **/
	private Integer greaterSite;
	/** 大于等于0优酷，1爱奇艺，2乐视 **/
	private Integer greaterEqualsSite;
	/** 小于0优酷，1爱奇艺，2乐视 **/
	private Integer lessSite;
	/** 小于等于0优酷，1爱奇艺，2乐视 **/
	private Integer lessEqualsSite;
	/** 原始属性任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer taskType;
	/** 等于任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer equalsTaskType;
	/** 是否为空任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Boolean isNotNullTaskType;
	/** In任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private List<Integer> inTaskType;
	/** NotIn任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private List<Integer> notInTaskType;
	/** 不等于任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer noEqualsTaskType;
	/** 大于任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer greaterTaskType;
	/** 大于等于任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer greaterEqualsTaskType;
	/** 小于任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer lessTaskType;
	/** 小于等于任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer lessEqualsTaskType;
	/** 原始属性0禁用，1启用 **/
	private Integer state;
	/** 等于0禁用，1启用 **/
	private Integer equalsState;
	/** 是否为空0禁用，1启用 **/
	private Boolean isNotNullState;
	/** In0禁用，1启用 **/
	private List<Integer> inState;
	/** NotIn0禁用，1启用 **/
	private List<Integer> notInState;
	/** 不等于0禁用，1启用 **/
	private Integer noEqualsState;
	/** 大于0禁用，1启用 **/
	private Integer greaterState;
	/** 大于等于0禁用，1启用 **/
	private Integer greaterEqualsState;
	/** 小于0禁用，1启用 **/
	private Integer lessState;
	/** 小于等于0禁用，1启用 **/
	private Integer lessEqualsState;

	
  	public CollectAddressSearchBean() {
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
  	
  	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
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
	public void setCollectType(String collectType){
		this.collectType=collectType;
	}
	public String getCollectType(){
		return collectType;
	}
	public void setEqualsCollectType(String equalsCollectType){
		this.equalsCollectType=equalsCollectType;
	}
	public String getEqualsCollectType(){
		return equalsCollectType;
	}
	public void setIsNotNullCollectType(Boolean isNotNullCollectType){
		this.isNotNullCollectType=isNotNullCollectType;
	}
	public Boolean getIsNotNullCollectType(){
		return isNotNullCollectType;
	}
	public void setInCollectType(List<String> inCollectType){
		this.inCollectType=inCollectType;
	}
	public List<String> getInCollectType(){
		return inCollectType;
	}
	public void setNotInCollectType(List<String> notInCollectType){
		this.notInCollectType=notInCollectType;
	}
	public List<String> getNotInCollectType(){
		return notInCollectType;
	}
	public void setNoEqualsCollectType(String noEqualsCollectType){
		this.noEqualsCollectType=noEqualsCollectType;
	}
	public String getNoEqualsCollectType(){
		return noEqualsCollectType;
	}
	public void setGreaterCollectType(String greaterCollectType){
		this.greaterCollectType=greaterCollectType;
	}
	public String getGreaterCollectType(){
		return greaterCollectType;
	}
	public void setGreaterEqualsCollectType(String greaterEqualsCollectType){
		this.greaterEqualsCollectType=greaterEqualsCollectType;
	}
	public String getGreaterEqualsCollectType(){
		return greaterEqualsCollectType;
	}
	public void setLessCollectType(String lessCollectType){
		this.lessCollectType=lessCollectType;
	}
	public String getLessCollectType(){
		return lessCollectType;
	}
	public void setLessEqualsCollectType(String lessEqualsCollectType){
		this.lessEqualsCollectType=lessEqualsCollectType;
	}
	public String getLessEqualsCollectType(){
		return lessEqualsCollectType;
	}
	public void setLikeCollectType(String likeCollectType){
		this.likeCollectType=likeCollectType;
	}
	public String getLikeCollectType(){
		return likeCollectType;
	}
	public void setLeftLikeCollectType(String leftLikeCollectType){
		this.leftLikeCollectType=likeCollectType;
	}
	public String getLeftLikeCollectType(){
		return leftLikeCollectType;
	}
	public void setRightLikeCollectType(String rightLikeCollectType){
		this.rightLikeCollectType=rightLikeCollectType;
	}
	public String getRightLikeCollectType(){
		return rightLikeCollectType;
	}
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
	public void setEqualsSite(Integer equalsSite){
		this.equalsSite=equalsSite;
	}
	public Integer getEqualsSite(){
		return equalsSite;
	}
	public void setIsNotNullSite(Boolean isNotNullSite){
		this.isNotNullSite=isNotNullSite;
	}
	public Boolean getIsNotNullSite(){
		return isNotNullSite;
	}
	public void setInSite(List<Integer> inSite){
		this.inSite=inSite;
	}
	public List<Integer> getInSite(){
		return inSite;
	}
	public void setNotInSite(List<Integer> notInSite){
		this.notInSite=notInSite;
	}
	public List<Integer> getNotInSite(){
		return notInSite;
	}
	public void setNoEqualsSite(Integer noEqualsSite){
		this.noEqualsSite=noEqualsSite;
	}
	public Integer getNoEqualsSite(){
		return noEqualsSite;
	}
	public void setGreaterSite(Integer greaterSite){
		this.greaterSite=greaterSite;
	}
	public Integer getGreaterSite(){
		return greaterSite;
	}
	public void setGreaterEqualsSite(Integer greaterEqualsSite){
		this.greaterEqualsSite=greaterEqualsSite;
	}
	public Integer getGreaterEqualsSite(){
		return greaterEqualsSite;
	}
	public void setLessSite(Integer lessSite){
		this.lessSite=lessSite;
	}
	public Integer getLessSite(){
		return lessSite;
	}
	public void setLessEqualsSite(Integer lessEqualsSite){
		this.lessEqualsSite=lessEqualsSite;
	}
	public Integer getLessEqualsSite(){
		return lessEqualsSite;
	}
	public void setTaskType(Integer taskType){
		this.taskType=taskType;
	}
	public Integer getTaskType(){
		return taskType;
	}
	public void setEqualsTaskType(Integer equalsTaskType){
		this.equalsTaskType=equalsTaskType;
	}
	public Integer getEqualsTaskType(){
		return equalsTaskType;
	}
	public void setIsNotNullTaskType(Boolean isNotNullTaskType){
		this.isNotNullTaskType=isNotNullTaskType;
	}
	public Boolean getIsNotNullTaskType(){
		return isNotNullTaskType;
	}
	public void setInTaskType(List<Integer> inTaskType){
		this.inTaskType=inTaskType;
	}
	public List<Integer> getInTaskType(){
		return inTaskType;
	}
	public void setNotInTaskType(List<Integer> notInTaskType){
		this.notInTaskType=notInTaskType;
	}
	public List<Integer> getNotInTaskType(){
		return notInTaskType;
	}
	public void setNoEqualsTaskType(Integer noEqualsTaskType){
		this.noEqualsTaskType=noEqualsTaskType;
	}
	public Integer getNoEqualsTaskType(){
		return noEqualsTaskType;
	}
	public void setGreaterTaskType(Integer greaterTaskType){
		this.greaterTaskType=greaterTaskType;
	}
	public Integer getGreaterTaskType(){
		return greaterTaskType;
	}
	public void setGreaterEqualsTaskType(Integer greaterEqualsTaskType){
		this.greaterEqualsTaskType=greaterEqualsTaskType;
	}
	public Integer getGreaterEqualsTaskType(){
		return greaterEqualsTaskType;
	}
	public void setLessTaskType(Integer lessTaskType){
		this.lessTaskType=lessTaskType;
	}
	public Integer getLessTaskType(){
		return lessTaskType;
	}
	public void setLessEqualsTaskType(Integer lessEqualsTaskType){
		this.lessEqualsTaskType=lessEqualsTaskType;
	}
	public Integer getLessEqualsTaskType(){
		return lessEqualsTaskType;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getState(){
		return state;
	}
	public void setEqualsState(Integer equalsState){
		this.equalsState=equalsState;
	}
	public Integer getEqualsState(){
		return equalsState;
	}
	public void setIsNotNullState(Boolean isNotNullState){
		this.isNotNullState=isNotNullState;
	}
	public Boolean getIsNotNullState(){
		return isNotNullState;
	}
	public void setInState(List<Integer> inState){
		this.inState=inState;
	}
	public List<Integer> getInState(){
		return inState;
	}
	public void setNotInState(List<Integer> notInState){
		this.notInState=notInState;
	}
	public List<Integer> getNotInState(){
		return notInState;
	}
	public void setNoEqualsState(Integer noEqualsState){
		this.noEqualsState=noEqualsState;
	}
	public Integer getNoEqualsState(){
		return noEqualsState;
	}
	public void setGreaterState(Integer greaterState){
		this.greaterState=greaterState;
	}
	public Integer getGreaterState(){
		return greaterState;
	}
	public void setGreaterEqualsState(Integer greaterEqualsState){
		this.greaterEqualsState=greaterEqualsState;
	}
	public Integer getGreaterEqualsState(){
		return greaterEqualsState;
	}
	public void setLessState(Integer lessState){
		this.lessState=lessState;
	}
	public Integer getLessState(){
		return lessState;
	}
	public void setLessEqualsState(Integer lessEqualsState){
		this.lessEqualsState=lessEqualsState;
	}
	public Integer getLessEqualsState(){
		return lessEqualsState;
	}

}
