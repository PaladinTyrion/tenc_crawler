package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

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

public interface VideoInfoDao {

	public int insertVideoInfo(VideoInfo videoInfo);

  	public int updateVideoInfo(VideoInfo videoInfo);

  	public VideoInfo getVideoInfoByWhere(String where);
  
  	public List<VideoInfo> getVideoInfoListByWhere(String where,int offset,int limit);
  	
  	public List<VideoInfo> getVideoInfoListByCondition(VideoInfoSearchBean condition);
  
  	public List<VideoInfo> getVideoInfoListBySql(String sql);
  
  	public int getVideoInfoCountByWhere(String where);
  	
  	public int getVideoInfoCountByExample(VideoInfo videoInfo);
  	
  	public int getVideoInfoCountByCondition(VideoInfoSearchBean condition);
  
  	public int updateVideoInfoByWhere(String where);
  
  	public int deleteVideoInfoByWhere(String where);
  	
  	public List<BatchResult> batchInsertVideoInfo(List<VideoInfo> list);
  	
  	public VideoInfo getVideoInfoByExample(VideoInfo videoInfo);
  	
  	public List<VideoInfo> getVideoInfoListByExample(VideoInfo videoInfo);
  	
  	public int deleteVideoInfoByExample(VideoInfo videoInfo);
  	
  	public int deleteVideoInfoByCondition(VideoInfoSearchBean condition);
  	
  	public List<BatchResult> batchDeleteVideoInfoByExample(List<VideoInfo> list);
  	
  	public List<VideoInfo> getVideoInfoByCondition(VideoInfoSearchBean condition);
  	
  	public int updateVideoInfo(VideoInfoSearchBean condition);
  	
  	public Map<String,Object> getVideoInfoColumnByCondition(VideoInfoSearchBean condition);
  	
  	public List<Map<String,Object>> getVideoInfoColumnListByCondition(VideoInfoSearchBean condition);
  	
  	public int updateVideoInfoByExample(VideoInfo videoInfo);
}
