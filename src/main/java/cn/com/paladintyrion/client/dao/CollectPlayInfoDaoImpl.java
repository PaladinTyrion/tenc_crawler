package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CollectPlayInfoSearchBean;
import cn.com.paladintyrion.client.bean.CollectPlayInfo;

/**
 * <p>Title: </p>
 *
 * <p>Description:CollectPlayInfo</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="collectPlayInfoDao")
public class CollectPlayInfoDaoImpl extends SqlSessionDaoSupportExt implements CollectPlayInfoDao {
	public CollectPlayInfoDaoImpl() {
		
    }

  	public int insertCollectPlayInfo(CollectPlayInfo collectPlayInfo){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.insertCollectPlayInfo", collectPlayInfo);
  	}

  	public int updateCollectPlayInfo(CollectPlayInfo collectPlayInfo){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.updateCollectPlayInfo", collectPlayInfo);
  	}
  
  	public CollectPlayInfo getCollectPlayInfoByWhere(String where){
    	return (CollectPlayInfo) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoByWhere", where);
  	}
  
  	public List<CollectPlayInfo> getCollectPlayInfoListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoListByWhere", where);
  	}
  	
  	public List<CollectPlayInfo> getCollectPlayInfoListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<CollectPlayInfo> getCollectPlayInfoListByCondition(CollectPlayInfoSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<CollectPlayInfo> getCollectPlayInfoListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoByWhere", sql);
  	}
  
  	public int getCollectPlayInfoCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoCountByWhere", where);
  	}
  	
  	public int getCollectPlayInfoCountByExample(CollectPlayInfo collectPlayInfo){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoCountByExample", collectPlayInfo);
  	}
  	
  	public int getCollectPlayInfoCountByCondition(CollectPlayInfoSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoCountByCondition", condition);
  	}
  
  	public int updateCollectPlayInfoByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.updateCollectPlayInfoByWhere", where);
  	}
  
  	public int deleteCollectPlayInfoByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.deleteCollectPlayInfoByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertCollectPlayInfo(List<CollectPlayInfo> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.insertCollectPlayInfo", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public CollectPlayInfo getCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoByExample", collectPlayInfo);
  	}
  	
  	public List<CollectPlayInfo> getCollectPlayInfoListByExample(CollectPlayInfo collectPlayInfo){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoByExample", collectPlayInfo);
  	}
  	
  	public int deleteCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.deleteCollectPlayInfoByExample",collectPlayInfo);
  	}
  	
  	public int deleteCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.deleteCollectPlayInfoByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteCollectPlayInfoByExample(List<CollectPlayInfo> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.deleteCollectPlayInfoByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<CollectPlayInfo> getCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoByCondition", condition);
  	}
  	
  	public int updateCollectPlayInfo(CollectPlayInfoSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.updateCollectPlayInfoByCondition", condition);
  	}
  	
  	public Map<String,Object> getCollectPlayInfoColumnByCondition(CollectPlayInfoSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getCollectPlayInfoColumnListByCondition(CollectPlayInfoSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.getCollectPlayInfoColumnByCondition", condition);
  	}
  	
  	public int updateCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectPlayInfoDao.updateCollectPlayInfoByExample", collectPlayInfo);
  	}
}
