package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

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

public interface VideoCollectCommentDao {

	public int insertVideoCollectComment(VideoCollectComment videoCollectComment);

  	public int updateVideoCollectComment(VideoCollectComment videoCollectComment);

  	public VideoCollectComment getVideoCollectCommentByWhere(String where);
  
  	public List<VideoCollectComment> getVideoCollectCommentListByWhere(String where,int offset,int limit);
  	
  	public List<VideoCollectComment> getVideoCollectCommentListByCondition(VideoCollectCommentSearchBean condition);
  
  	public List<VideoCollectComment> getVideoCollectCommentListBySql(String sql);
  
  	public int getVideoCollectCommentCountByWhere(String where);
  	
  	public int getVideoCollectCommentCountByExample(VideoCollectComment videoCollectComment);
  	
  	public int getVideoCollectCommentCountByCondition(VideoCollectCommentSearchBean condition);
  
  	public int updateVideoCollectCommentByWhere(String where);
  
  	public int deleteVideoCollectCommentByWhere(String where);
  	
  	public List<BatchResult> batchInsertVideoCollectComment(List<VideoCollectComment> list);
  	
  	public VideoCollectComment getVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
  	
  	public List<VideoCollectComment> getVideoCollectCommentListByExample(VideoCollectComment videoCollectComment);
  	
  	public int deleteVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
  	
  	public int deleteVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition);
  	
  	public List<BatchResult> batchDeleteVideoCollectCommentByExample(List<VideoCollectComment> list);
  	
  	public List<VideoCollectComment> getVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition);
  	
  	public int updateVideoCollectComment(VideoCollectCommentSearchBean condition);
  	
  	public Map<String,Object> getVideoCollectCommentColumnByCondition(VideoCollectCommentSearchBean condition);
  	
  	public List<Map<String,Object>> getVideoCollectCommentColumnListByCondition(VideoCollectCommentSearchBean condition);
  	
  	public int updateVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
}
