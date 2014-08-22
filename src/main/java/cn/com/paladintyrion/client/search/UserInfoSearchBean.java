package cn.com.paladintyrion.client.search;

import java.util.*;

import cn.com.paladintyrion.common.util.SearchBean;

public class UserInfoSearchBean extends SearchBean{
	
	/** 原始属性源网站用户ID 主键**/
	private String userId;
/** 原始属性所属网站，0优酷，1爱奇艺，2乐视，3PPTV，4土豆，5搜狐视频，6腾讯，8迅雷看看 主键**/
	private Integer site;
	/** 原始属性昵称 **/
	private String nickName;
	/** 等于昵称 **/
	private String equalsNickName;
	/** 是否为空昵称 **/
	private Boolean isNotNullNickName;
	/** In昵称 **/
	private List<String> inNickName;
	/** NotIn昵称 **/
	private List<String> notInNickName;
	/** 不等于昵称 **/
	private String noEqualsNickName;
	/** 大于昵称 **/
	private String greaterNickName;
	/** 大于等于昵称 **/
	private String greaterEqualsNickName;
	/** 小于昵称 **/
	private String lessNickName;
	/** 小于等于昵称 **/
	private String lessEqualsNickName;
	/** Like昵称 **/
	private String likeNickName;
	/** Like左匹配昵称 **/
	private String leftLikeNickName;
	/** Like右匹配昵称 **/
	private String rightLikeNickName;
	/** 原始属性性别，0女，1男 **/
	private Integer gender;
	/** 等于性别，0女，1男 **/
	private Integer equalsGender;
	/** 是否为空性别，0女，1男 **/
	private Boolean isNotNullGender;
	/** In性别，0女，1男 **/
	private List<Integer> inGender;
	/** NotIn性别，0女，1男 **/
	private List<Integer> notInGender;
	/** 不等于性别，0女，1男 **/
	private Integer noEqualsGender;
	/** 大于性别，0女，1男 **/
	private Integer greaterGender;
	/** 大于等于性别，0女，1男 **/
	private Integer greaterEqualsGender;
	/** 小于性别，0女，1男 **/
	private Integer lessGender;
	/** 小于等于性别，0女，1男 **/
	private Integer lessEqualsGender;
	/** 原始属性年龄 **/
	private Integer age;
	/** 等于年龄 **/
	private Integer equalsAge;
	/** 是否为空年龄 **/
	private Boolean isNotNullAge;
	/** In年龄 **/
	private List<Integer> inAge;
	/** NotIn年龄 **/
	private List<Integer> notInAge;
	/** 不等于年龄 **/
	private Integer noEqualsAge;
	/** 大于年龄 **/
	private Integer greaterAge;
	/** 大于等于年龄 **/
	private Integer greaterEqualsAge;
	/** 小于年龄 **/
	private Integer lessAge;
	/** 小于等于年龄 **/
	private Integer lessEqualsAge;
	/** 原始属性省份 **/
	private String province;
	/** 等于省份 **/
	private String equalsProvince;
	/** 是否为空省份 **/
	private Boolean isNotNullProvince;
	/** In省份 **/
	private List<String> inProvince;
	/** NotIn省份 **/
	private List<String> notInProvince;
	/** 不等于省份 **/
	private String noEqualsProvince;
	/** 大于省份 **/
	private String greaterProvince;
	/** 大于等于省份 **/
	private String greaterEqualsProvince;
	/** 小于省份 **/
	private String lessProvince;
	/** 小于等于省份 **/
	private String lessEqualsProvince;
	/** Like省份 **/
	private String likeProvince;
	/** Like左匹配省份 **/
	private String leftLikeProvince;
	/** Like右匹配省份 **/
	private String rightLikeProvince;
	/** 原始属性城市 **/
	private String city;
	/** 等于城市 **/
	private String equalsCity;
	/** 是否为空城市 **/
	private Boolean isNotNullCity;
	/** In城市 **/
	private List<String> inCity;
	/** NotIn城市 **/
	private List<String> notInCity;
	/** 不等于城市 **/
	private String noEqualsCity;
	/** 大于城市 **/
	private String greaterCity;
	/** 大于等于城市 **/
	private String greaterEqualsCity;
	/** 小于城市 **/
	private String lessCity;
	/** 小于等于城市 **/
	private String lessEqualsCity;
	/** Like城市 **/
	private String likeCity;
	/** Like左匹配城市 **/
	private String leftLikeCity;
	/** Like右匹配城市 **/
	private String rightLikeCity;
	/** 原始属性头像地址 **/
	private String headerPic;
	/** 等于头像地址 **/
	private String equalsHeaderPic;
	/** 是否为空头像地址 **/
	private Boolean isNotNullHeaderPic;
	/** In头像地址 **/
	private List<String> inHeaderPic;
	/** NotIn头像地址 **/
	private List<String> notInHeaderPic;
	/** 不等于头像地址 **/
	private String noEqualsHeaderPic;
	/** 大于头像地址 **/
	private String greaterHeaderPic;
	/** 大于等于头像地址 **/
	private String greaterEqualsHeaderPic;
	/** 小于头像地址 **/
	private String lessHeaderPic;
	/** 小于等于头像地址 **/
	private String lessEqualsHeaderPic;
	/** Like头像地址 **/
	private String likeHeaderPic;
	/** Like左匹配头像地址 **/
	private String leftLikeHeaderPic;
	/** Like右匹配头像地址 **/
	private String rightLikeHeaderPic;
	/** 原始属性主页地址 **/
	private String profileUrl;
	/** 等于主页地址 **/
	private String equalsProfileUrl;
	/** 是否为空主页地址 **/
	private Boolean isNotNullProfileUrl;
	/** In主页地址 **/
	private List<String> inProfileUrl;
	/** NotIn主页地址 **/
	private List<String> notInProfileUrl;
	/** 不等于主页地址 **/
	private String noEqualsProfileUrl;
	/** 大于主页地址 **/
	private String greaterProfileUrl;
	/** 大于等于主页地址 **/
	private String greaterEqualsProfileUrl;
	/** 小于主页地址 **/
	private String lessProfileUrl;
	/** 小于等于主页地址 **/
	private String lessEqualsProfileUrl;
	/** Like主页地址 **/
	private String likeProfileUrl;
	/** Like左匹配主页地址 **/
	private String leftLikeProfileUrl;
	/** Like右匹配主页地址 **/
	private String rightLikeProfileUrl;

	
  	public UserInfoSearchBean() {
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
	public void setEqualsNickName(String equalsNickName){
		this.equalsNickName=equalsNickName;
	}
	public String getEqualsNickName(){
		return equalsNickName;
	}
	public void setIsNotNullNickName(Boolean isNotNullNickName){
		this.isNotNullNickName=isNotNullNickName;
	}
	public Boolean getIsNotNullNickName(){
		return isNotNullNickName;
	}
	public void setInNickName(List<String> inNickName){
		this.inNickName=inNickName;
	}
	public List<String> getInNickName(){
		return inNickName;
	}
	public void setNotInNickName(List<String> notInNickName){
		this.notInNickName=notInNickName;
	}
	public List<String> getNotInNickName(){
		return notInNickName;
	}
	public void setNoEqualsNickName(String noEqualsNickName){
		this.noEqualsNickName=noEqualsNickName;
	}
	public String getNoEqualsNickName(){
		return noEqualsNickName;
	}
	public void setGreaterNickName(String greaterNickName){
		this.greaterNickName=greaterNickName;
	}
	public String getGreaterNickName(){
		return greaterNickName;
	}
	public void setGreaterEqualsNickName(String greaterEqualsNickName){
		this.greaterEqualsNickName=greaterEqualsNickName;
	}
	public String getGreaterEqualsNickName(){
		return greaterEqualsNickName;
	}
	public void setLessNickName(String lessNickName){
		this.lessNickName=lessNickName;
	}
	public String getLessNickName(){
		return lessNickName;
	}
	public void setLessEqualsNickName(String lessEqualsNickName){
		this.lessEqualsNickName=lessEqualsNickName;
	}
	public String getLessEqualsNickName(){
		return lessEqualsNickName;
	}
	public void setLikeNickName(String likeNickName){
		this.likeNickName=likeNickName;
	}
	public String getLikeNickName(){
		return likeNickName;
	}
	public void setLeftLikeNickName(String leftLikeNickName){
		this.leftLikeNickName=likeNickName;
	}
	public String getLeftLikeNickName(){
		return leftLikeNickName;
	}
	public void setRightLikeNickName(String rightLikeNickName){
		this.rightLikeNickName=rightLikeNickName;
	}
	public String getRightLikeNickName(){
		return rightLikeNickName;
	}
	public void setGender(Integer gender){
		this.gender=gender;
	}
	public Integer getGender(){
		return gender;
	}
	public void setEqualsGender(Integer equalsGender){
		this.equalsGender=equalsGender;
	}
	public Integer getEqualsGender(){
		return equalsGender;
	}
	public void setIsNotNullGender(Boolean isNotNullGender){
		this.isNotNullGender=isNotNullGender;
	}
	public Boolean getIsNotNullGender(){
		return isNotNullGender;
	}
	public void setInGender(List<Integer> inGender){
		this.inGender=inGender;
	}
	public List<Integer> getInGender(){
		return inGender;
	}
	public void setNotInGender(List<Integer> notInGender){
		this.notInGender=notInGender;
	}
	public List<Integer> getNotInGender(){
		return notInGender;
	}
	public void setNoEqualsGender(Integer noEqualsGender){
		this.noEqualsGender=noEqualsGender;
	}
	public Integer getNoEqualsGender(){
		return noEqualsGender;
	}
	public void setGreaterGender(Integer greaterGender){
		this.greaterGender=greaterGender;
	}
	public Integer getGreaterGender(){
		return greaterGender;
	}
	public void setGreaterEqualsGender(Integer greaterEqualsGender){
		this.greaterEqualsGender=greaterEqualsGender;
	}
	public Integer getGreaterEqualsGender(){
		return greaterEqualsGender;
	}
	public void setLessGender(Integer lessGender){
		this.lessGender=lessGender;
	}
	public Integer getLessGender(){
		return lessGender;
	}
	public void setLessEqualsGender(Integer lessEqualsGender){
		this.lessEqualsGender=lessEqualsGender;
	}
	public Integer getLessEqualsGender(){
		return lessEqualsGender;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public Integer getAge(){
		return age;
	}
	public void setEqualsAge(Integer equalsAge){
		this.equalsAge=equalsAge;
	}
	public Integer getEqualsAge(){
		return equalsAge;
	}
	public void setIsNotNullAge(Boolean isNotNullAge){
		this.isNotNullAge=isNotNullAge;
	}
	public Boolean getIsNotNullAge(){
		return isNotNullAge;
	}
	public void setInAge(List<Integer> inAge){
		this.inAge=inAge;
	}
	public List<Integer> getInAge(){
		return inAge;
	}
	public void setNotInAge(List<Integer> notInAge){
		this.notInAge=notInAge;
	}
	public List<Integer> getNotInAge(){
		return notInAge;
	}
	public void setNoEqualsAge(Integer noEqualsAge){
		this.noEqualsAge=noEqualsAge;
	}
	public Integer getNoEqualsAge(){
		return noEqualsAge;
	}
	public void setGreaterAge(Integer greaterAge){
		this.greaterAge=greaterAge;
	}
	public Integer getGreaterAge(){
		return greaterAge;
	}
	public void setGreaterEqualsAge(Integer greaterEqualsAge){
		this.greaterEqualsAge=greaterEqualsAge;
	}
	public Integer getGreaterEqualsAge(){
		return greaterEqualsAge;
	}
	public void setLessAge(Integer lessAge){
		this.lessAge=lessAge;
	}
	public Integer getLessAge(){
		return lessAge;
	}
	public void setLessEqualsAge(Integer lessEqualsAge){
		this.lessEqualsAge=lessEqualsAge;
	}
	public Integer getLessEqualsAge(){
		return lessEqualsAge;
	}
	public void setProvince(String province){
		this.province=province;
	}
	public String getProvince(){
		return province;
	}
	public void setEqualsProvince(String equalsProvince){
		this.equalsProvince=equalsProvince;
	}
	public String getEqualsProvince(){
		return equalsProvince;
	}
	public void setIsNotNullProvince(Boolean isNotNullProvince){
		this.isNotNullProvince=isNotNullProvince;
	}
	public Boolean getIsNotNullProvince(){
		return isNotNullProvince;
	}
	public void setInProvince(List<String> inProvince){
		this.inProvince=inProvince;
	}
	public List<String> getInProvince(){
		return inProvince;
	}
	public void setNotInProvince(List<String> notInProvince){
		this.notInProvince=notInProvince;
	}
	public List<String> getNotInProvince(){
		return notInProvince;
	}
	public void setNoEqualsProvince(String noEqualsProvince){
		this.noEqualsProvince=noEqualsProvince;
	}
	public String getNoEqualsProvince(){
		return noEqualsProvince;
	}
	public void setGreaterProvince(String greaterProvince){
		this.greaterProvince=greaterProvince;
	}
	public String getGreaterProvince(){
		return greaterProvince;
	}
	public void setGreaterEqualsProvince(String greaterEqualsProvince){
		this.greaterEqualsProvince=greaterEqualsProvince;
	}
	public String getGreaterEqualsProvince(){
		return greaterEqualsProvince;
	}
	public void setLessProvince(String lessProvince){
		this.lessProvince=lessProvince;
	}
	public String getLessProvince(){
		return lessProvince;
	}
	public void setLessEqualsProvince(String lessEqualsProvince){
		this.lessEqualsProvince=lessEqualsProvince;
	}
	public String getLessEqualsProvince(){
		return lessEqualsProvince;
	}
	public void setLikeProvince(String likeProvince){
		this.likeProvince=likeProvince;
	}
	public String getLikeProvince(){
		return likeProvince;
	}
	public void setLeftLikeProvince(String leftLikeProvince){
		this.leftLikeProvince=likeProvince;
	}
	public String getLeftLikeProvince(){
		return leftLikeProvince;
	}
	public void setRightLikeProvince(String rightLikeProvince){
		this.rightLikeProvince=rightLikeProvince;
	}
	public String getRightLikeProvince(){
		return rightLikeProvince;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
	public void setEqualsCity(String equalsCity){
		this.equalsCity=equalsCity;
	}
	public String getEqualsCity(){
		return equalsCity;
	}
	public void setIsNotNullCity(Boolean isNotNullCity){
		this.isNotNullCity=isNotNullCity;
	}
	public Boolean getIsNotNullCity(){
		return isNotNullCity;
	}
	public void setInCity(List<String> inCity){
		this.inCity=inCity;
	}
	public List<String> getInCity(){
		return inCity;
	}
	public void setNotInCity(List<String> notInCity){
		this.notInCity=notInCity;
	}
	public List<String> getNotInCity(){
		return notInCity;
	}
	public void setNoEqualsCity(String noEqualsCity){
		this.noEqualsCity=noEqualsCity;
	}
	public String getNoEqualsCity(){
		return noEqualsCity;
	}
	public void setGreaterCity(String greaterCity){
		this.greaterCity=greaterCity;
	}
	public String getGreaterCity(){
		return greaterCity;
	}
	public void setGreaterEqualsCity(String greaterEqualsCity){
		this.greaterEqualsCity=greaterEqualsCity;
	}
	public String getGreaterEqualsCity(){
		return greaterEqualsCity;
	}
	public void setLessCity(String lessCity){
		this.lessCity=lessCity;
	}
	public String getLessCity(){
		return lessCity;
	}
	public void setLessEqualsCity(String lessEqualsCity){
		this.lessEqualsCity=lessEqualsCity;
	}
	public String getLessEqualsCity(){
		return lessEqualsCity;
	}
	public void setLikeCity(String likeCity){
		this.likeCity=likeCity;
	}
	public String getLikeCity(){
		return likeCity;
	}
	public void setLeftLikeCity(String leftLikeCity){
		this.leftLikeCity=likeCity;
	}
	public String getLeftLikeCity(){
		return leftLikeCity;
	}
	public void setRightLikeCity(String rightLikeCity){
		this.rightLikeCity=rightLikeCity;
	}
	public String getRightLikeCity(){
		return rightLikeCity;
	}
	public void setHeaderPic(String headerPic){
		this.headerPic=headerPic;
	}
	public String getHeaderPic(){
		return headerPic;
	}
	public void setEqualsHeaderPic(String equalsHeaderPic){
		this.equalsHeaderPic=equalsHeaderPic;
	}
	public String getEqualsHeaderPic(){
		return equalsHeaderPic;
	}
	public void setIsNotNullHeaderPic(Boolean isNotNullHeaderPic){
		this.isNotNullHeaderPic=isNotNullHeaderPic;
	}
	public Boolean getIsNotNullHeaderPic(){
		return isNotNullHeaderPic;
	}
	public void setInHeaderPic(List<String> inHeaderPic){
		this.inHeaderPic=inHeaderPic;
	}
	public List<String> getInHeaderPic(){
		return inHeaderPic;
	}
	public void setNotInHeaderPic(List<String> notInHeaderPic){
		this.notInHeaderPic=notInHeaderPic;
	}
	public List<String> getNotInHeaderPic(){
		return notInHeaderPic;
	}
	public void setNoEqualsHeaderPic(String noEqualsHeaderPic){
		this.noEqualsHeaderPic=noEqualsHeaderPic;
	}
	public String getNoEqualsHeaderPic(){
		return noEqualsHeaderPic;
	}
	public void setGreaterHeaderPic(String greaterHeaderPic){
		this.greaterHeaderPic=greaterHeaderPic;
	}
	public String getGreaterHeaderPic(){
		return greaterHeaderPic;
	}
	public void setGreaterEqualsHeaderPic(String greaterEqualsHeaderPic){
		this.greaterEqualsHeaderPic=greaterEqualsHeaderPic;
	}
	public String getGreaterEqualsHeaderPic(){
		return greaterEqualsHeaderPic;
	}
	public void setLessHeaderPic(String lessHeaderPic){
		this.lessHeaderPic=lessHeaderPic;
	}
	public String getLessHeaderPic(){
		return lessHeaderPic;
	}
	public void setLessEqualsHeaderPic(String lessEqualsHeaderPic){
		this.lessEqualsHeaderPic=lessEqualsHeaderPic;
	}
	public String getLessEqualsHeaderPic(){
		return lessEqualsHeaderPic;
	}
	public void setLikeHeaderPic(String likeHeaderPic){
		this.likeHeaderPic=likeHeaderPic;
	}
	public String getLikeHeaderPic(){
		return likeHeaderPic;
	}
	public void setLeftLikeHeaderPic(String leftLikeHeaderPic){
		this.leftLikeHeaderPic=likeHeaderPic;
	}
	public String getLeftLikeHeaderPic(){
		return leftLikeHeaderPic;
	}
	public void setRightLikeHeaderPic(String rightLikeHeaderPic){
		this.rightLikeHeaderPic=rightLikeHeaderPic;
	}
	public String getRightLikeHeaderPic(){
		return rightLikeHeaderPic;
	}
	public void setProfileUrl(String profileUrl){
		this.profileUrl=profileUrl;
	}
	public String getProfileUrl(){
		return profileUrl;
	}
	public void setEqualsProfileUrl(String equalsProfileUrl){
		this.equalsProfileUrl=equalsProfileUrl;
	}
	public String getEqualsProfileUrl(){
		return equalsProfileUrl;
	}
	public void setIsNotNullProfileUrl(Boolean isNotNullProfileUrl){
		this.isNotNullProfileUrl=isNotNullProfileUrl;
	}
	public Boolean getIsNotNullProfileUrl(){
		return isNotNullProfileUrl;
	}
	public void setInProfileUrl(List<String> inProfileUrl){
		this.inProfileUrl=inProfileUrl;
	}
	public List<String> getInProfileUrl(){
		return inProfileUrl;
	}
	public void setNotInProfileUrl(List<String> notInProfileUrl){
		this.notInProfileUrl=notInProfileUrl;
	}
	public List<String> getNotInProfileUrl(){
		return notInProfileUrl;
	}
	public void setNoEqualsProfileUrl(String noEqualsProfileUrl){
		this.noEqualsProfileUrl=noEqualsProfileUrl;
	}
	public String getNoEqualsProfileUrl(){
		return noEqualsProfileUrl;
	}
	public void setGreaterProfileUrl(String greaterProfileUrl){
		this.greaterProfileUrl=greaterProfileUrl;
	}
	public String getGreaterProfileUrl(){
		return greaterProfileUrl;
	}
	public void setGreaterEqualsProfileUrl(String greaterEqualsProfileUrl){
		this.greaterEqualsProfileUrl=greaterEqualsProfileUrl;
	}
	public String getGreaterEqualsProfileUrl(){
		return greaterEqualsProfileUrl;
	}
	public void setLessProfileUrl(String lessProfileUrl){
		this.lessProfileUrl=lessProfileUrl;
	}
	public String getLessProfileUrl(){
		return lessProfileUrl;
	}
	public void setLessEqualsProfileUrl(String lessEqualsProfileUrl){
		this.lessEqualsProfileUrl=lessEqualsProfileUrl;
	}
	public String getLessEqualsProfileUrl(){
		return lessEqualsProfileUrl;
	}
	public void setLikeProfileUrl(String likeProfileUrl){
		this.likeProfileUrl=likeProfileUrl;
	}
	public String getLikeProfileUrl(){
		return likeProfileUrl;
	}
	public void setLeftLikeProfileUrl(String leftLikeProfileUrl){
		this.leftLikeProfileUrl=likeProfileUrl;
	}
	public String getLeftLikeProfileUrl(){
		return leftLikeProfileUrl;
	}
	public void setRightLikeProfileUrl(String rightLikeProfileUrl){
		this.rightLikeProfileUrl=rightLikeProfileUrl;
	}
	public String getRightLikeProfileUrl(){
		return rightLikeProfileUrl;
	}

}
