package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.VideoPropertySearchBean;
import cn.com.paladintyrion.client.bean.VideoProperty;

/**
 * <p>Title: </p>
 *
 * <p>Description:VideoProperty</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="videoPropertyDao")
public class VideoPropertyDaoImpl extends SqlSessionDaoSupportExt implements VideoPropertyDao {
	public VideoPropertyDaoImpl() {
		
    }

  	public int insertVideoProperty(VideoProperty videoProperty){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.VideoPropertyDao.insertVideoProperty", videoProperty);
  	}

  	public int updateVideoProperty(VideoProperty videoProperty){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyDao.updateVideoProperty", videoProperty);
  	}
  
  	public VideoProperty getVideoPropertyByWhere(String where){
    	return (VideoProperty) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyByWhere", where);
  	}
  
  	public List<VideoProperty> getVideoPropertyListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyListByWhere", where);
  	}
  	
  	public List<VideoProperty> getVideoPropertyListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<VideoProperty> getVideoPropertyListByCondition(VideoPropertySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<VideoProperty> getVideoPropertyListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyByWhere", sql);
  	}
  
  	public int getVideoPropertyCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyCountByWhere", where);
  	}
  	
  	public int getVideoPropertyCountByExample(VideoProperty videoProperty){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyCountByExample", videoProperty);
  	}
  	
  	public int getVideoPropertyCountByCondition(VideoPropertySearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyCountByCondition", condition);
  	}
  
  	public int updateVideoPropertyByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyDao.updateVideoPropertyByWhere", where);
  	}
  
  	public int deleteVideoPropertyByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoPropertyDao.deleteVideoPropertyByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertVideoProperty(List<VideoProperty> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.VideoPropertyDao.insertVideoProperty", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public VideoProperty getVideoPropertyByExample(VideoProperty videoProperty){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyByExample", videoProperty);
  	}
  	
  	public List<VideoProperty> getVideoPropertyListByExample(VideoProperty videoProperty){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyByExample", videoProperty);
  	}
  	
  	public int deleteVideoPropertyByExample(VideoProperty videoProperty){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoPropertyDao.deleteVideoPropertyByExample",videoProperty);
  	}
  	
  	public int deleteVideoPropertyByCondition(VideoPropertySearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoPropertyDao.deleteVideoPropertyByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteVideoPropertyByExample(List<VideoProperty> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.VideoPropertyDao.deleteVideoPropertyByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<VideoProperty> getVideoPropertyByCondition(VideoPropertySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyByCondition", condition);
  	}
  	
  	public int updateVideoProperty(VideoPropertySearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyDao.updateVideoPropertyByCondition", condition);
  	}
  	
  	public Map<String,Object> getVideoPropertyColumnByCondition(VideoPropertySearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getVideoPropertyColumnListByCondition(VideoPropertySearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyDao.getVideoPropertyColumnByCondition", condition);
  	}
  	
  	public int updateVideoPropertyByExample(VideoProperty videoProperty){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyDao.updateVideoPropertyByExample", videoProperty);
  	}
}
