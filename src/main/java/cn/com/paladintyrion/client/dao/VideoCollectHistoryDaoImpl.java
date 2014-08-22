package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.VideoCollectHistorySearchBean;
import cn.com.paladintyrion.client.bean.VideoCollectHistory;

/**
 * <p>Title: </p>
 *
 * <p>Description:VideoCollectHistory</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="videoCollectHistoryDao")
public class VideoCollectHistoryDaoImpl extends SqlSessionDaoSupportExt implements VideoCollectHistoryDao {
	public VideoCollectHistoryDaoImpl() {
		
    }

  	public int insertVideoCollectHistory(VideoCollectHistory videoCollectHistory){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.insertVideoCollectHistory", videoCollectHistory);
  	}

  	public int updateVideoCollectHistory(VideoCollectHistory videoCollectHistory){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.updateVideoCollectHistory", videoCollectHistory);
  	}
  
  	public VideoCollectHistory getVideoCollectHistoryByWhere(String where){
    	return (VideoCollectHistory) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryByWhere", where);
  	}
  
  	public List<VideoCollectHistory> getVideoCollectHistoryListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryListByWhere", where);
  	}
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryListByCondition(VideoCollectHistorySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<VideoCollectHistory> getVideoCollectHistoryListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryByWhere", sql);
  	}
  
  	public int getVideoCollectHistoryCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryCountByWhere", where);
  	}
  	
  	public int getVideoCollectHistoryCountByExample(VideoCollectHistory videoCollectHistory){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryCountByExample", videoCollectHistory);
  	}
  	
  	public int getVideoCollectHistoryCountByCondition(VideoCollectHistorySearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryCountByCondition", condition);
  	}
  
  	public int updateVideoCollectHistoryByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.updateVideoCollectHistoryByWhere", where);
  	}
  
  	public int deleteVideoCollectHistoryByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.deleteVideoCollectHistoryByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertVideoCollectHistory(List<VideoCollectHistory> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.insertVideoCollectHistory", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public VideoCollectHistory getVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryByExample", videoCollectHistory);
  	}
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryListByExample(VideoCollectHistory videoCollectHistory){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryByExample", videoCollectHistory);
  	}
  	
  	public int deleteVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.deleteVideoCollectHistoryByExample",videoCollectHistory);
  	}
  	
  	public int deleteVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.deleteVideoCollectHistoryByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteVideoCollectHistoryByExample(List<VideoCollectHistory> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.deleteVideoCollectHistoryByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryByCondition", condition);
  	}
  	
  	public int updateVideoCollectHistory(VideoCollectHistorySearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.updateVideoCollectHistoryByCondition", condition);
  	}
  	
  	public Map<String,Object> getVideoCollectHistoryColumnByCondition(VideoCollectHistorySearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getVideoCollectHistoryColumnListByCondition(VideoCollectHistorySearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.getVideoCollectHistoryColumnByCondition", condition);
  	}
  	
  	public int updateVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectHistoryDao.updateVideoCollectHistoryByExample", videoCollectHistory);
  	}
}
