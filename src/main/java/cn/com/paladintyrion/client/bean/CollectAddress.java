package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 预录入节目地址
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class CollectAddress implements Serializable{
  	public CollectAddress() {
  	}
	/** UUID 主键**/
	private String id;
	/** 节目名称 **/
	private String collectName;
	/** 节目url **/
	private String url;
	/**  **/
	private String collectType;
	/** 0优酷，1爱奇艺，2乐视 **/
	private Integer site;
	/** 任务类型，0只抓取剧集信息，1抓取更加详细的信息 **/
	private Integer taskType;
	/** 0禁用，1启用 **/
	private Integer state;
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
	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public void setCollectType(String collectType){
		this.collectType=collectType;
	}
	public String getCollectType(){
		return collectType;
	}
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
	public void setTaskType(Integer taskType){
		this.taskType=taskType;
	}
	public Integer getTaskType(){
		return taskType;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getState(){
		return state;
	}
}
