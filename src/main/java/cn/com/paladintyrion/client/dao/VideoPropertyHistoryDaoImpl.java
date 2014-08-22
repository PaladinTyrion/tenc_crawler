package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.VideoPropertyHistorySearchBean;
import cn.com.paladintyrion.client.bean.VideoPropertyHistory;

/**
 * <p>Title: </p>
 *
 * <p>Description:VideoPropertyHistory</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="videoPropertyHistoryDao")
public class VideoPropertyHistoryDaoImpl extends SqlSessionDaoSupportExt implements VideoPropertyHistoryDao {
	public VideoPropertyHistoryDaoImpl() {
		
    }

  	public int insertVideoPropertyHistory(VideoPropertyHistory videoPropertyHistory){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.insertVideoPropertyHistory", videoPropertyHistory);
  	}

  	public int updateVideoPropertyHistory(VideoPropertyHistory videoPropertyHistory){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.updateVideoPropertyHistory", videoPropertyHistory);
  	}
  
  	public VideoPropertyHistory getVideoPropertyHistoryByWhere(String where){
    	return (VideoPropertyHistory) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryByWhere", where);
  	}
  
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryListByWhere", where);
  	}
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByCondition(VideoPropertyHistorySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryByWhere", sql);
  	}
  
  	public int getVideoPropertyHistoryCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryCountByWhere", where);
  	}
  	
  	public int getVideoPropertyHistoryCountByExample(VideoPropertyHistory videoPropertyHistory){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryCountByExample", videoPropertyHistory);
  	}
  	
  	public int getVideoPropertyHistoryCountByCondition(VideoPropertyHistorySearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryCountByCondition", condition);
  	}
  
  	public int updateVideoPropertyHistoryByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.updateVideoPropertyHistoryByWhere", where);
  	}
  
  	public int deleteVideoPropertyHistoryByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.deleteVideoPropertyHistoryByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertVideoPropertyHistory(List<VideoPropertyHistory> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.insertVideoPropertyHistory", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public VideoPropertyHistory getVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryByExample", videoPropertyHistory);
  	}
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByExample(VideoPropertyHistory videoPropertyHistory){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryByExample", videoPropertyHistory);
  	}
  	
  	public int deleteVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.deleteVideoPropertyHistoryByExample",videoPropertyHistory);
  	}
  	
  	public int deleteVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.deleteVideoPropertyHistoryByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteVideoPropertyHistoryByExample(List<VideoPropertyHistory> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.deleteVideoPropertyHistoryByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryByCondition", condition);
  	}
  	
  	public int updateVideoPropertyHistory(VideoPropertyHistorySearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.updateVideoPropertyHistoryByCondition", condition);
  	}
  	
  	public Map<String,Object> getVideoPropertyHistoryColumnByCondition(VideoPropertyHistorySearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getVideoPropertyHistoryColumnListByCondition(VideoPropertyHistorySearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.getVideoPropertyHistoryColumnByCondition", condition);
  	}
  	
  	public int updateVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao.updateVideoPropertyHistoryByExample", videoPropertyHistory);
  	}
}
