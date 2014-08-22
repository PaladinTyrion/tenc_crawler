package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

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

public interface VideoCollectHistoryDao {

	public int insertVideoCollectHistory(VideoCollectHistory videoCollectHistory);

  	public int updateVideoCollectHistory(VideoCollectHistory videoCollectHistory);

  	public VideoCollectHistory getVideoCollectHistoryByWhere(String where);
  
  	public List<VideoCollectHistory> getVideoCollectHistoryListByWhere(String where,int offset,int limit);
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryListByCondition(VideoCollectHistorySearchBean condition);
  
  	public List<VideoCollectHistory> getVideoCollectHistoryListBySql(String sql);
  
  	public int getVideoCollectHistoryCountByWhere(String where);
  	
  	public int getVideoCollectHistoryCountByExample(VideoCollectHistory videoCollectHistory);
  	
  	public int getVideoCollectHistoryCountByCondition(VideoCollectHistorySearchBean condition);
  
  	public int updateVideoCollectHistoryByWhere(String where);
  
  	public int deleteVideoCollectHistoryByWhere(String where);
  	
  	public List<BatchResult> batchInsertVideoCollectHistory(List<VideoCollectHistory> list);
  	
  	public VideoCollectHistory getVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryListByExample(VideoCollectHistory videoCollectHistory);
  	
  	public int deleteVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
  	
  	public int deleteVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition);
  	
  	public List<BatchResult> batchDeleteVideoCollectHistoryByExample(List<VideoCollectHistory> list);
  	
  	public List<VideoCollectHistory> getVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition);
  	
  	public int updateVideoCollectHistory(VideoCollectHistorySearchBean condition);
  	
  	public Map<String,Object> getVideoCollectHistoryColumnByCondition(VideoCollectHistorySearchBean condition);
  	
  	public List<Map<String,Object>> getVideoCollectHistoryColumnListByCondition(VideoCollectHistorySearchBean condition);
  	
  	public int updateVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
}
