package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CollectPropertySearchBean;
import cn.com.paladintyrion.client.bean.CollectProperty;

/**
 * <p>Title: </p>
 *
 * <p>Description:CollectProperty</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="collectPropertyDao")
public class CollectPropertyDaoImpl extends SqlSessionDaoSupportExt implements CollectPropertyDao {
	public CollectPropertyDaoImpl() {
		
    }

  	public int insertCollectProperty(CollectProperty collectProperty){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.CollectPropertyDao.insertCollectProperty", collectProperty);
  	}

  	public int updateCollectProperty(CollectProperty collectProperty){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPropertyDao.updateCollectProperty", collectProperty);
  	}
  
  	public CollectProperty getCollectPropertyByWhere(String where){
    	return (CollectProperty) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyByWhere", where);
  	}
  
  	public List<CollectProperty> getCollectPropertyListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyListByWhere", where);
  	}
  	
  	public List<CollectProperty> getCollectPropertyListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<CollectProperty> getCollectPropertyListByCondition(CollectPropertySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<CollectProperty> getCollectPropertyListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyByWhere", sql);
  	}
  
  	public int getCollectPropertyCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyCountByWhere", where);
  	}
  	
  	public int getCollectPropertyCountByExample(CollectProperty collectProperty){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyCountByExample", collectProperty);
  	}
  	
  	public int getCollectPropertyCountByCondition(CollectPropertySearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyCountByCondition", condition);
  	}
  
  	public int updateCollectPropertyByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPropertyDao.updateCollectPropertyByWhere", where);
  	}
  
  	public int deleteCollectPropertyByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectPropertyDao.deleteCollectPropertyByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertCollectProperty(List<CollectProperty> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.CollectPropertyDao.insertCollectProperty", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public CollectProperty getCollectPropertyByExample(CollectProperty collectProperty){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyByExample", collectProperty);
  	}
  	
  	public List<CollectProperty> getCollectPropertyListByExample(CollectProperty collectProperty){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyByExample", collectProperty);
  	}
  	
  	public int deleteCollectPropertyByExample(CollectProperty collectProperty){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectPropertyDao.deleteCollectPropertyByExample",collectProperty);
  	}
  	
  	public int deleteCollectPropertyByCondition(CollectPropertySearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectPropertyDao.deleteCollectPropertyByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteCollectPropertyByExample(List<CollectProperty> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.CollectPropertyDao.deleteCollectPropertyByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<CollectProperty> getCollectPropertyByCondition(CollectPropertySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyByCondition", condition);
  	}
  	
  	public int updateCollectProperty(CollectPropertySearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPropertyDao.updateCollectPropertyByCondition", condition);
  	}
  	
  	public Map<String,Object> getCollectPropertyColumnByCondition(CollectPropertySearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getCollectPropertyColumnListByCondition(CollectPropertySearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPropertyDao.getCollectPropertyColumnByCondition", condition);
  	}
  	
  	public int updateCollectPropertyByExample(CollectProperty collectProperty){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPropertyDao.updateCollectPropertyByExample", collectProperty);
  	}
}
