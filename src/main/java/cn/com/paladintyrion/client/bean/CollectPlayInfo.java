package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 节目播放信息表，按省份存储
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class CollectPlayInfo implements Serializable{
  	public CollectPlayInfo() {
  	}
	/** 剧集ID 主键**/
	private String collectId;
	/** 身份代码 主键**/
	private String provinceCode;
	/** 播放量 **/
	private Long playCount;
	/**  主键**/
	private Integer site;
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
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
}
