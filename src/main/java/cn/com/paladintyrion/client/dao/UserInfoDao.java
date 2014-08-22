package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.UserInfoSearchBean;
import cn.com.paladintyrion.client.bean.UserInfo;
/**
 * <p>Title: </p>
 *
 * <p>Description:UserInfo</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

public interface UserInfoDao {

	public int insertUserInfo(UserInfo userInfo);

  	public int updateUserInfo(UserInfo userInfo);

  	public UserInfo getUserInfoByWhere(String where);
  
  	public List<UserInfo> getUserInfoListByWhere(String where,int offset,int limit);
  	
  	public List<UserInfo> getUserInfoListByCondition(UserInfoSearchBean condition);
  
  	public List<UserInfo> getUserInfoListBySql(String sql);
  
  	public int getUserInfoCountByWhere(String where);
  	
  	public int getUserInfoCountByExample(UserInfo userInfo);
  	
  	public int getUserInfoCountByCondition(UserInfoSearchBean condition);
  
  	public int updateUserInfoByWhere(String where);
  
  	public int deleteUserInfoByWhere(String where);
  	
  	public List<BatchResult> batchInsertUserInfo(List<UserInfo> list);
  	
  	public UserInfo getUserInfoByExample(UserInfo userInfo);
  	
  	public List<UserInfo> getUserInfoListByExample(UserInfo userInfo);
  	
  	public int deleteUserInfoByExample(UserInfo userInfo);
  	
  	public int deleteUserInfoByCondition(UserInfoSearchBean condition);
  	
  	public List<BatchResult> batchDeleteUserInfoByExample(List<UserInfo> list);
  	
  	public List<UserInfo> getUserInfoByCondition(UserInfoSearchBean condition);
  	
  	public int updateUserInfo(UserInfoSearchBean condition);
  	
  	public Map<String,Object> getUserInfoColumnByCondition(UserInfoSearchBean condition);
  	
  	public List<Map<String,Object>> getUserInfoColumnListByCondition(UserInfoSearchBean condition);
  	
  	public int updateUserInfoByExample(UserInfo userInfo);
}
