package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.VideoInfoSearchBean;
import cn.com.paladintyrion.client.bean.VideoInfo;

/**
 * <p>Title: </p>
 *
 * <p>Description:VideoInfo</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="videoInfoDao")
public class VideoInfoDaoImpl extends SqlSessionDaoSupportExt implements VideoInfoDao {
	public VideoInfoDaoImpl() {
		
    }

  	public int insertVideoInfo(VideoInfo videoInfo){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.VideoInfoDao.insertVideoInfo", videoInfo);
  	}

  	public int updateVideoInfo(VideoInfo videoInfo){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoInfoDao.updateVideoInfo", videoInfo);
  	}
  
  	public VideoInfo getVideoInfoByWhere(String where){
    	return (VideoInfo) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoByWhere", where);
  	}
  
  	public List<VideoInfo> getVideoInfoListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoListByWhere", where);
  	}
  	
  	public List<VideoInfo> getVideoInfoListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<VideoInfo> getVideoInfoListByCondition(VideoInfoSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<VideoInfo> getVideoInfoListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoByWhere", sql);
  	}
  
  	public int getVideoInfoCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoCountByWhere", where);
  	}
  	
  	public int getVideoInfoCountByExample(VideoInfo videoInfo){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoCountByExample", videoInfo);
  	}
  	
  	public int getVideoInfoCountByCondition(VideoInfoSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoCountByCondition", condition);
  	}
  
  	public int updateVideoInfoByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoInfoDao.updateVideoInfoByWhere", where);
  	}
  
  	public int deleteVideoInfoByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoInfoDao.deleteVideoInfoByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertVideoInfo(List<VideoInfo> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.VideoInfoDao.insertVideoInfo", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public VideoInfo getVideoInfoByExample(VideoInfo videoInfo){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoByExample", videoInfo);
  	}
  	
  	public List<VideoInfo> getVideoInfoListByExample(VideoInfo videoInfo){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoByExample", videoInfo);
  	}
  	
  	public int deleteVideoInfoByExample(VideoInfo videoInfo){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoInfoDao.deleteVideoInfoByExample",videoInfo);
  	}
  	
  	public int deleteVideoInfoByCondition(VideoInfoSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.VideoInfoDao.deleteVideoInfoByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteVideoInfoByExample(List<VideoInfo> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.VideoInfoDao.deleteVideoInfoByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<VideoInfo> getVideoInfoByCondition(VideoInfoSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoByCondition", condition);
  	}
  	
  	public int updateVideoInfo(VideoInfoSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoInfoDao.updateVideoInfoByCondition", condition);
  	}
  	
  	public Map<String,Object> getVideoInfoColumnByCondition(VideoInfoSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getVideoInfoColumnListByCondition(VideoInfoSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.VideoInfoDao.getVideoInfoColumnByCondition", condition);
  	}
  	
  	public int updateVideoInfoByExample(VideoInfo videoInfo){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.VideoInfoDao.updateVideoInfoByExample", videoInfo);
  	}
}
