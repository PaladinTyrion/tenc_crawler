package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.VideoCollectSearchBean;
import cn.com.paladintyrion.client.bean.VideoCollect;

/**
 * <p>Title: </p>
 *
 * <p>Description:VideoCollect</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="videoCollectDao")
public class VideoCollectDaoImpl extends SqlSessionDaoSupportExt implements VideoCollectDao {
	public VideoCollectDaoImpl() {
		
    }

  	public int insertVideoCollect(VideoCollect videoCollect){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.VideoCollectDao.insertVideoCollect", videoCollect);
  	}

  	public int updateVideoCollect(VideoCollect videoCollect){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectDao.updateVideoCollect", videoCollect);
  	}
  
  	public VideoCollect getVideoCollectByWhere(String where){
    	return (VideoCollect) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectByWhere", where);
  	}
  
  	public List<VideoCollect> getVideoCollectListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectListByWhere", where);
  	}
  	
  	public List<VideoCollect> getVideoCollectListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<VideoCollect> getVideoCollectListByCondition(VideoCollectSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<VideoCollect> getVideoCollectListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectByWhere", sql);
  	}
  
  	public int getVideoCollectCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectCountByWhere", where);
  	}
  	
  	public int getVideoCollectCountByExample(VideoCollect videoCollect){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectCountByExample", videoCollect);
  	}
  	
  	public int getVideoCollectCountByCondition(VideoCollectSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectCountByCondition", condition);
  	}
  
  	public int updateVideoCollectByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectDao.updateVideoCollectByWhere", where);
  	}
  
  	public int deleteVideoCollectByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectDao.deleteVideoCollectByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertVideoCollect(List<VideoCollect> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.VideoCollectDao.insertVideoCollect", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public VideoCollect getVideoCollectByExample(VideoCollect videoCollect){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectByExample", videoCollect);
  	}
  	
  	public List<VideoCollect> getVideoCollectListByExample(VideoCollect videoCollect){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectByExample", videoCollect);
  	}
  	
  	public int deleteVideoCollectByExample(VideoCollect videoCollect){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectDao.deleteVideoCollectByExample",videoCollect);
  	}
  	
  	public int deleteVideoCollectByCondition(VideoCollectSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectDao.deleteVideoCollectByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteVideoCollectByExample(List<VideoCollect> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.VideoCollectDao.deleteVideoCollectByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<VideoCollect> getVideoCollectByCondition(VideoCollectSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectByCondition", condition);
  	}
  	
  	public int updateVideoCollect(VideoCollectSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectDao.updateVideoCollectByCondition", condition);
  	}
  	
  	public Map<String,Object> getVideoCollectColumnByCondition(VideoCollectSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getVideoCollectColumnListByCondition(VideoCollectSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectDao.getVideoCollectColumnByCondition", condition);
  	}
  	
  	public int updateVideoCollectByExample(VideoCollect videoCollect){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectDao.updateVideoCollectByExample", videoCollect);
  	}
}
