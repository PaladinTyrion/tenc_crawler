package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.UserInfo;
import cn.com.paladintyrion.client.dao.UserInfoDao;
import cn.com.paladintyrion.client.search.UserInfoSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="userInfoService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	@Setter
	private UserInfoDao userInfoDao;
		
	public void addUserInfo(UserInfo userInfo){
		userInfoDao.insertUserInfo(userInfo);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddUserInfo(List<UserInfo> list){
		userInfoDao.batchInsertUserInfo(list);
	}
	
	public UserInfo getUserInfoByExample(UserInfo userInfo){
		return userInfoDao.getUserInfoByExample(userInfo);
	}
	
	public void modifyUserInfoByExample(UserInfo userInfo){
		userInfoDao.updateUserInfoByExample(userInfo);
	}
	
	public void removeUserInfoByExample(UserInfo userInfo){
		userInfoDao.deleteUserInfoByExample(userInfo);
	}
	
	public void removeUserInfoByCondition(UserInfoSearchBean condition){
		userInfoDao.deleteUserInfoByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveUserInfoByExample(List<UserInfo> list){
		userInfoDao.batchDeleteUserInfoByExample(list);
	}
	
	public PageModel queryUserInfoBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(userInfoDao.getUserInfoCountByWhere(where));
		pm.setData(userInfoDao.getUserInfoListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryUserInfoByCondition(UserInfoSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(userInfoDao.getUserInfoCountByCondition(condition));
		pm.setData(userInfoDao.getUserInfoListByCondition(condition));
		return pm;
	}
	
	public List<UserInfo> queryUserInfoListByWhere(String where){
		return userInfoDao.getUserInfoListBySql(where);
	}
	
	public List<UserInfo> queryUserInfoListByExample(UserInfo userInfo){
		return userInfoDao.getUserInfoListByExample(userInfo);
	}
	
	public List<UserInfo> getUserInfoByCondition(UserInfoSearchBean condition){
		return userInfoDao.getUserInfoByCondition(condition);
	}
	
	public List<UserInfo> queryUserInfoListByCondition(UserInfoSearchBean condition){
		return userInfoDao.getUserInfoListByCondition(condition);
	}
	
	public void modifyUserInfoBySql(String sql){
		userInfoDao.updateUserInfoByWhere(sql);
	}
	
	public void modifyUserInfoByCondition(UserInfoSearchBean condition){
		userInfoDao.updateUserInfo(condition);
	}
	
	public void removeUserInfoBySql(String sql){
		userInfoDao.deleteUserInfoByWhere(sql);
	}
	
	public int getUserInfoCountBySql(String sql){
		return userInfoDao.getUserInfoCountByWhere(sql);
	}
	
	public int getUserInfoCountByExample(UserInfo userInfo){
		return userInfoDao.getUserInfoCountByExample(userInfo);
	}
	
	public int getUserInfoCountByCondition(UserInfoSearchBean condition){
		return userInfoDao.getUserInfoCountByCondition(condition);
	}
	
	public Map<String,Object> getUserInfoColumnByCondition(UserInfoSearchBean condition){
		return userInfoDao.getUserInfoColumnByCondition(condition);
	}
	
	public void updateUserInfoByExample(UserInfo userInfo){
		userInfoDao.updateUserInfoByExample(userInfo);
	}
}
