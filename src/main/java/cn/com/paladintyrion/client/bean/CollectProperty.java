package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 指数信息
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class CollectProperty implements Serializable{
  	public CollectProperty() {
  	}
	/** 节目ID 主键**/
	private String collectId;
	/**  主键**/
	private String propertyKey;
	/**  **/
	private String propertyValue;
	/**  主键**/
	private Integer site;
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
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
}
