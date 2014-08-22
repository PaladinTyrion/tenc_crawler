package cn.com.paladintyrion.client.bean;

import java.io.Serializable;
import java.util.*;

/**
 * 用户信息
 * @author Guodang Zuo
 * @since 1.0
 *
 */
public class UserInfo implements Serializable{
  	public UserInfo() {
  	}
	/** 源网站用户ID 主键**/
	private String userId;
	/** 所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 昵称 **/
	private String nickName;
	/** 性别，0女，1男 **/
	private Integer gender;
	/** 年龄 **/
	private Integer age;
	/** 省份 **/
	private String province;
	/** 城市 **/
	private String city;
	/** 头像地址 **/
	private String headerPic;
	/** 主页地址 **/
	private String profileUrl;
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}
	public void setSite(Integer site){
		this.site=site;
	}
	public Integer getSite(){
		return site;
	}
	public void setNickName(String nickName){
		this.nickName=nickName;
	}
	public String getNickName(){
		return nickName;
	}
	public void setGender(Integer gender){
		this.gender=gender;
	}
	public Integer getGender(){
		return gender;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public Integer getAge(){
		return age;
	}
	public void setProvince(String province){
		this.province=province;
	}
	public String getProvince(){
		return province;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
	public void setHeaderPic(String headerPic){
		this.headerPic=headerPic;
	}
	public String getHeaderPic(){
		return headerPic;
	}
	public void setProfileUrl(String profileUrl){
		this.profileUrl=profileUrl;
	}
	public String getProfileUrl(){
		return profileUrl;
	}
}
