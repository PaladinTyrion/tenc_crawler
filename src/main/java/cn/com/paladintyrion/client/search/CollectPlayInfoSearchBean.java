package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class CollectPlayInfoSearchBean extends SearchBean{
	
	/** 原始属性剧集ID 主键**/
	private String collectId;
/** 原始属性身份代码 主键**/
	private String provinceCode;
	/** 原始属性播放量 **/
	private Long playCount;
	/** 等于播放量 **/
	private Long equalsPlayCount;
	/** 是否为空播放量 **/
	private Boolean isNotNullPlayCount;
	/** In播放量 **/
	private List<Long> inPlayCount;
	/** NotIn播放量 **/
	private List<Long> notInPlayCount;
	/** 不等于播放量 **/
	private Long noEqualsPlayCount;
	/** 大于播放量 **/
	private Long greaterPlayCount;
	/** 大于等于播放量 **/
	private Long greaterEqualsPlayCount;
	/** 小于播放量 **/
	private Long lessPlayCount;
	/** 小于等于播放量 **/
	private Long lessEqualsPlayCount;
/** 原始属性 主键**/
	private Integer site;

	
  	public CollectPlayInfoSearchBean() {
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
public void setProvinceCode(String provinceCode){
		this.provinceCode=provinceCode;
	}
	public String getProvinceCode(){
		return provinceCode;
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
public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}

}
