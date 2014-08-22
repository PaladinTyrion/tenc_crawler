package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

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

public interface VideoPropertyDao {

	public int insertVideoProperty(VideoProperty videoProperty);

  	public int updateVideoProperty(VideoProperty videoProperty);

  	public VideoProperty getVideoPropertyByWhere(String where);
  
  	public List<VideoProperty> getVideoPropertyListByWhere(String where,int offset,int limit);
  	
  	public List<VideoProperty> getVideoPropertyListByCondition(VideoPropertySearchBean condition);
  
  	public List<VideoProperty> getVideoPropertyListBySql(String sql);
  
  	public int getVideoPropertyCountByWhere(String where);
  	
  	public int getVideoPropertyCountByExample(VideoProperty videoProperty);
  	
  	public int getVideoPropertyCountByCondition(VideoPropertySearchBean condition);
  
  	public int updateVideoPropertyByWhere(String where);
  
  	public int deleteVideoPropertyByWhere(String where);
  	
  	public List<BatchResult> batchInsertVideoProperty(List<VideoProperty> list);
  	
  	public VideoProperty getVideoPropertyByExample(VideoProperty videoProperty);
  	
  	public List<VideoProperty> getVideoPropertyListByExample(VideoProperty videoProperty);
  	
  	public int deleteVideoPropertyByExample(VideoProperty videoProperty);
  	
  	public int deleteVideoPropertyByCondition(VideoPropertySearchBean condition);
  	
  	public List<BatchResult> batchDeleteVideoPropertyByExample(List<VideoProperty> list);
  	
  	public List<VideoProperty> getVideoPropertyByCondition(VideoPropertySearchBean condition);
  	
  	public int updateVideoProperty(VideoPropertySearchBean condition);
  	
  	public Map<String,Object> getVideoPropertyColumnByCondition(VideoPropertySearchBean condition);
  	
  	public List<Map<String,Object>> getVideoPropertyColumnListByCondition(VideoPropertySearchBean condition);
  	
  	public int updateVideoPropertyByExample(VideoProperty videoProperty);
}
