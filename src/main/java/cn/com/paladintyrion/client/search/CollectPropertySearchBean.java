package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class CollectPropertySearchBean extends SearchBean{
	
	/** 原始属性节目ID 主键**/
	private String collectId;
/** 原始属性 主键**/
	private String propertyKey;
	/** 原始属性 **/
	private String propertyValue;
	/** 等于 **/
	private String equalsPropertyValue;
	/** 是否为空 **/
	private Boolean isNotNullPropertyValue;
	/** In **/
	private List<String> inPropertyValue;
	/** NotIn **/
	private List<String> notInPropertyValue;
	/** 不等于 **/
	private String noEqualsPropertyValue;
	/** 大于 **/
	private String greaterPropertyValue;
	/** 大于等于 **/
	private String greaterEqualsPropertyValue;
	/** 小于 **/
	private String lessPropertyValue;
	/** 小于等于 **/
	private String lessEqualsPropertyValue;
	/** Like **/
	private String likePropertyValue;
	/** Like左匹配 **/
	private String leftLikePropertyValue;
	/** Like右匹配 **/
	private String rightLikePropertyValue;
/** 原始属性 主键**/
	private Integer site;

	
  	public CollectPropertySearchBean() {
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
public void setPropertyKey(String propertyKey){
		this.propertyKey=propertyKey;
	}
	public String getPropertyKey(){
		return propertyKey;
	}
	public void setPropertyValue(String propertyValue){
		this.propertyValue=propertyValue;
	}
	public String getPropertyValue(){
		return propertyValue;
	}
	public void setEqualsPropertyValue(String equalsPropertyValue){
		this.equalsPropertyValue=equalsPropertyValue;
	}
	public String getEqualsPropertyValue(){
		return equalsPropertyValue;
	}
	public void setIsNotNullPropertyValue(Boolean isNotNullPropertyValue){
		this.isNotNullPropertyValue=isNotNullPropertyValue;
	}
	public Boolean getIsNotNullPropertyValue(){
		return isNotNullPropertyValue;
	}
	public void setInPropertyValue(List<String> inPropertyValue){
		this.inPropertyValue=inPropertyValue;
	}
	public List<String> getInPropertyValue(){
		return inPropertyValue;
	}
	public void setNotInPropertyValue(List<String> notInPropertyValue){
		this.notInPropertyValue=notInPropertyValue;
	}
	public List<String> getNotInPropertyValue(){
		return notInPropertyValue;
	}
	public void setNoEqualsPropertyValue(String noEqualsPropertyValue){
		this.noEqualsPropertyValue=noEqualsPropertyValue;
	}
	public String getNoEqualsPropertyValue(){
		return noEqualsPropertyValue;
	}
	public void setGreaterPropertyValue(String greaterPropertyValue){
		this.greaterPropertyValue=greaterPropertyValue;
	}
	public String getGreaterPropertyValue(){
		return greaterPropertyValue;
	}
	public void setGreaterEqualsPropertyValue(String greaterEqualsPropertyValue){
		this.greaterEqualsPropertyValue=greaterEqualsPropertyValue;
	}
	public String getGreaterEqualsPropertyValue(){
		return greaterEqualsPropertyValue;
	}
	public void setLessPropertyValue(String lessPropertyValue){
		this.lessPropertyValue=lessPropertyValue;
	}
	public String getLessPropertyValue(){
		return lessPropertyValue;
	}
	public void setLessEqualsPropertyValue(String lessEqualsPropertyValue){
		this.lessEqualsPropertyValue=lessEqualsPropertyValue;
	}
	public String getLessEqualsPropertyValue(){
		return lessEqualsPropertyValue;
	}
	public void setLikePropertyValue(String likePropertyValue){
		this.likePropertyValue=likePropertyValue;
	}
	public String getLikePropertyValue(){
		return likePropertyValue;
	}
	public void setLeftLikePropertyValue(String leftLikePropertyValue){
		this.leftLikePropertyValue=likePropertyValue;
	}
	public String getLeftLikePropertyValue(){
		return leftLikePropertyValue;
	}
	public void setRightLikePropertyValue(String rightLikePropertyValue){
		this.rightLikePropertyValue=rightLikePropertyValue;
	}
	public String getRightLikePropertyValue(){
		return rightLikePropertyValue;
	}
public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}

}
