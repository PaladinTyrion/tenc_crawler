package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.UserInfo;
import cn.com.paladintyrion.client.search.UserInfoSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface UserInfoService {

	/**
	 * 新增UserInfo记录
	 * @param UserInfo
	 */
	public void addUserInfo(UserInfo userInfo);
	
	/**
	 * 批量新增UserInfo记录
	 * @param List
	 */
	public void batchAddUserInfo(List<UserInfo> list);
	
	/**
	 * 按照实例查找UserInfo记录,主要为根据主键查找
	 * @param userInfo
	 * @return UserInfo
	 */
	public UserInfo getUserInfoByExample(UserInfo userInfo);
	
	/**
	 * 修改UserInfo记录
	 * @param UserInfo
	 */
	public void modifyUserInfoByExample(UserInfo userInfo);
	
	/**
	 * 根据UserInfo实例删除记录
	 * @param UserInfo
	 */
	public void removeUserInfoByExample(UserInfo userInfo);
	
	/**
	 * 根据条件删除记录
	 * @param UserInfoSearchBean
	 */
	public void removeUserInfoByCondition(UserInfoSearchBean condition);
	
	public void batchRemoveUserInfoByExample(List<UserInfo> list);
	
	public PageModel queryUserInfoByCondition(UserInfoSearchBean condition);
	
	public PageModel queryUserInfoBySql(String sql,int offset,int limit);
	
	public List<UserInfo> queryUserInfoListByWhere(String where);
	
	public List<UserInfo> queryUserInfoListByExample(UserInfo userInfo);
	
	public List<UserInfo> getUserInfoByCondition(UserInfoSearchBean condition);
	
	public List<UserInfo> queryUserInfoListByCondition(UserInfoSearchBean condition);
	
	public void modifyUserInfoBySql(String sql);
	
	public void modifyUserInfoByCondition(UserInfoSearchBean condition);
	
	public void removeUserInfoBySql(String sql);
	
	public int getUserInfoCountBySql(String sql);
	
	public int getUserInfoCountByExample(UserInfo userInfo);
	
	public int getUserInfoCountByCondition(UserInfoSearchBean condition);
	
	public Map<String,Object> getUserInfoColumnByCondition(UserInfoSearchBean condition);
	
	public void updateUserInfoByExample(UserInfo userInfo);
}
