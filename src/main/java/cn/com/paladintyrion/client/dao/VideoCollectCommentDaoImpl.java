package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.VideoCollectCommentSearchBean;
import cn.com.paladintyrion.client.bean.VideoCollectComment;

/**
 * <p>Title: </p>
 *
 * <p>Description:VideoCollectComment</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="videoCollectCommentDao")
public class VideoCollectCommentDaoImpl extends SqlSessionDaoSupportExt implements VideoCollectCommentDao {
	public VideoCollectCommentDaoImpl() {
		
    }

  	public int insertVideoCollectComment(VideoCollectComment videoCollectComment){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.insertVideoCollectComment", videoCollectComment);
  	}

  	public int updateVideoCollectComment(VideoCollectComment videoCollectComment){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.updateVideoCollectComment", videoCollectComment);
  	}
  
  	public VideoCollectComment getVideoCollectCommentByWhere(String where){
    	return (VideoCollectComment) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentByWhere", where);
  	}
  
  	public List<VideoCollectComment> getVideoCollectCommentListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentListByWhere", where);
  	}
  	
  	public List<VideoCollectComment> getVideoCollectCommentListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<VideoCollectComment> getVideoCollectCommentListByCondition(VideoCollectCommentSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<VideoCollectComment> getVideoCollectCommentListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentByWhere", sql);
  	}
  
  	public int getVideoCollectCommentCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentCountByWhere", where);
  	}
  	
  	public int getVideoCollectCommentCountByExample(VideoCollectComment videoCollectComment){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentCountByExample", videoCollectComment);
  	}
  	
  	public int getVideoCollectCommentCountByCondition(VideoCollectCommentSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentCountByCondition", condition);
  	}
  
  	public int updateVideoCollectCommentByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.updateVideoCollectCommentByWhere", where);
  	}
  
  	public int deleteVideoCollectCommentByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.deleteVideoCollectCommentByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertVideoCollectComment(List<VideoCollectComment> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.insertVideoCollectComment", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public VideoCollectComment getVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentByExample", videoCollectComment);
  	}
  	
  	public List<VideoCollectComment> getVideoCollectCommentListByExample(VideoCollectComment videoCollectComment){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentByExample", videoCollectComment);
  	}
  	
  	public int deleteVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.deleteVideoCollectCommentByExample",videoCollectComment);
  	}
  	
  	public int deleteVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.deleteVideoCollectCommentByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteVideoCollectCommentByExample(List<VideoCollectComment> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.deleteVideoCollectCommentByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<VideoCollectComment> getVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentByCondition", condition);
  	}
  	
  	public int updateVideoCollectComment(VideoCollectCommentSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.updateVideoCollectCommentByCondition", condition);
  	}
  	
  	public Map<String,Object> getVideoCollectCommentColumnByCondition(VideoCollectCommentSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getVideoCollectCommentColumnListByCondition(VideoCollectCommentSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.getVideoCollectCommentColumnByCondition", condition);
  	}
  	
  	public int updateVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoCollectCommentDao.updateVideoCollectCommentByExample", videoCollectComment);
  	}
}
