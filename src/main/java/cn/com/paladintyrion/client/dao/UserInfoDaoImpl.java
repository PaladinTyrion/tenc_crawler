package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

@Component(value="userInfoDao")
public class UserInfoDaoImpl extends SqlSessionDaoSupportExt implements UserInfoDao {
	public UserInfoDaoImpl() {
		
    }

  	public int insertUserInfo(UserInfo userInfo){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.UserInfoDao.insertUserInfo", userInfo);
  	}

  	public int updateUserInfo(UserInfo userInfo){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.UserInfoDao.updateUserInfo", userInfo);
  	}
  
  	public UserInfo getUserInfoByWhere(String where){
    	return (UserInfo) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoByWhere", where);
  	}
  
  	public List<UserInfo> getUserInfoListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoListByWhere", where);
  	}
  	
  	public List<UserInfo> getUserInfoListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<UserInfo> getUserInfoListByCondition(UserInfoSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<UserInfo> getUserInfoListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoByWhere", sql);
  	}
  
  	public int getUserInfoCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoCountByWhere", where);
  	}
  	
  	public int getUserInfoCountByExample(UserInfo userInfo){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoCountByExample", userInfo);
  	}
  	
  	public int getUserInfoCountByCondition(UserInfoSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoCountByCondition", condition);
  	}
  
  	public int updateUserInfoByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.UserInfoDao.updateUserInfoByWhere", where);
  	}
  
  	public int deleteUserInfoByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.UserInfoDao.deleteUserInfoByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertUserInfo(List<UserInfo> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.UserInfoDao.insertUserInfo", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public UserInfo getUserInfoByExample(UserInfo userInfo){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoByExample", userInfo);
  	}
  	
  	public List<UserInfo> getUserInfoListByExample(UserInfo userInfo){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoByExample", userInfo);
  	}
  	
  	public int deleteUserInfoByExample(UserInfo userInfo){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.UserInfoDao.deleteUserInfoByExample",userInfo);
  	}
  	
  	public int deleteUserInfoByCondition(UserInfoSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.UserInfoDao.deleteUserInfoByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteUserInfoByExample(List<UserInfo> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.UserInfoDao.deleteUserInfoByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<UserInfo> getUserInfoByCondition(UserInfoSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoByCondition", condition);
  	}
  	
  	public int updateUserInfo(UserInfoSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.UserInfoDao.updateUserInfoByCondition", condition);
  	}
  	
  	public Map<String,Object> getUserInfoColumnByCondition(UserInfoSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getUserInfoColumnListByCondition(UserInfoSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.UserInfoDao.getUserInfoColumnByCondition", condition);
  	}
  	
  	public int updateUserInfoByExample(UserInfo userInfo){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.UserInfoDao.updateUserInfoByExample", userInfo);
  	}
}
