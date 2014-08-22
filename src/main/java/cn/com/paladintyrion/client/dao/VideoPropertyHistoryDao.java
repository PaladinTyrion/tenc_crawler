package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

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

public interface VideoPropertyHistoryDao {

	public int insertVideoPropertyHistory(VideoPropertyHistory videoPropertyHistory);

  	public int updateVideoPropertyHistory(VideoPropertyHistory videoPropertyHistory);

  	public VideoPropertyHistory getVideoPropertyHistoryByWhere(String where);
  
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByWhere(String where,int offset,int limit);
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByCondition(VideoPropertyHistorySearchBean condition);
  
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListBySql(String sql);
  
  	public int getVideoPropertyHistoryCountByWhere(String where);
  	
  	public int getVideoPropertyHistoryCountByExample(VideoPropertyHistory videoPropertyHistory);
  	
  	public int getVideoPropertyHistoryCountByCondition(VideoPropertyHistorySearchBean condition);
  
  	public int updateVideoPropertyHistoryByWhere(String where);
  
  	public int deleteVideoPropertyHistoryByWhere(String where);
  	
  	public List<BatchResult> batchInsertVideoPropertyHistory(List<VideoPropertyHistory> list);
  	
  	public VideoPropertyHistory getVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryListByExample(VideoPropertyHistory videoPropertyHistory);
  	
  	public int deleteVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
  	
  	public int deleteVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition);
  	
  	public List<BatchResult> batchDeleteVideoPropertyHistoryByExample(List<VideoPropertyHistory> list);
  	
  	public List<VideoPropertyHistory> getVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition);
  	
  	public int updateVideoPropertyHistory(VideoPropertyHistorySearchBean condition);
  	
  	public Map<String,Object> getVideoPropertyHistoryColumnByCondition(VideoPropertyHistorySearchBean condition);
  	
  	public List<Map<String,Object>> getVideoPropertyHistoryColumnListByCondition(VideoPropertyHistorySearchBean condition);
  	
  	public int updateVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
}
