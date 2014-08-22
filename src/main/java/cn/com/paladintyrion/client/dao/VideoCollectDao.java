package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

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

public interface VideoCollectDao {

	public int insertVideoCollect(VideoCollect videoCollect);

  	public int updateVideoCollect(VideoCollect videoCollect);

  	public VideoCollect getVideoCollectByWhere(String where);
  
  	public List<VideoCollect> getVideoCollectListByWhere(String where,int offset,int limit);
  	
  	public List<VideoCollect> getVideoCollectListByCondition(VideoCollectSearchBean condition);
  
  	public List<VideoCollect> getVideoCollectListBySql(String sql);
  
  	public int getVideoCollectCountByWhere(String where);
  	
  	public int getVideoCollectCountByExample(VideoCollect videoCollect);
  	
  	public int getVideoCollectCountByCondition(VideoCollectSearchBean condition);
  
  	public int updateVideoCollectByWhere(String where);
  
  	public int deleteVideoCollectByWhere(String where);
  	
  	public List<BatchResult> batchInsertVideoCollect(List<VideoCollect> list);
  	
  	public VideoCollect getVideoCollectByExample(VideoCollect videoCollect);
  	
  	public List<VideoCollect> getVideoCollectListByExample(VideoCollect videoCollect);
  	
  	public int deleteVideoCollectByExample(VideoCollect videoCollect);
  	
  	public int deleteVideoCollectByCondition(VideoCollectSearchBean condition);
  	
  	public List<BatchResult> batchDeleteVideoCollectByExample(List<VideoCollect> list);
  	
  	public List<VideoCollect> getVideoCollectByCondition(VideoCollectSearchBean condition);
  	
  	public int updateVideoCollect(VideoCollectSearchBean condition);
  	
  	public Map<String,Object> getVideoCollectColumnByCondition(VideoCollectSearchBean condition);
  	
  	public List<Map<String,Object>> getVideoCollectColumnListByCondition(VideoCollectSearchBean condition);
  	
  	public int updateVideoCollectByExample(VideoCollect videoCollect);
}
