package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CollectPlayInfoSearchBean;
import cn.com.paladintyrion.client.bean.CollectPlayInfo;
/**
 * <p>Title: </p>
 *
 * <p>Description:CollectPlayInfo</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

public interface CollectPlayInfoDao {

	public int insertCollectPlayInfo(CollectPlayInfo collectPlayInfo);

  	public int updateCollectPlayInfo(CollectPlayInfo collectPlayInfo);

  	public CollectPlayInfo getCollectPlayInfoByWhere(String where);
  
  	public List<CollectPlayInfo> getCollectPlayInfoListByWhere(String where,int offset,int limit);
  	
  	public List<CollectPlayInfo> getCollectPlayInfoListByCondition(CollectPlayInfoSearchBean condition);
  
  	public List<CollectPlayInfo> getCollectPlayInfoListBySql(String sql);
  
  	public int getCollectPlayInfoCountByWhere(String where);
  	
  	public int getCollectPlayInfoCountByExample(CollectPlayInfo collectPlayInfo);
  	
  	public int getCollectPlayInfoCountByCondition(CollectPlayInfoSearchBean condition);
  
  	public int updateCollectPlayInfoByWhere(String where);
  
  	public int deleteCollectPlayInfoByWhere(String where);
  	
  	public List<BatchResult> batchInsertCollectPlayInfo(List<CollectPlayInfo> list);
  	
  	public CollectPlayInfo getCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
  	
  	public List<CollectPlayInfo> getCollectPlayInfoListByExample(CollectPlayInfo collectPlayInfo);
  	
  	public int deleteCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
  	
  	public int deleteCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition);
  	
  	public List<BatchResult> batchDeleteCollectPlayInfoByExample(List<CollectPlayInfo> list);
  	
  	public List<CollectPlayInfo> getCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition);
  	
  	public int updateCollectPlayInfo(CollectPlayInfoSearchBean condition);
  	
  	public Map<String,Object> getCollectPlayInfoColumnByCondition(CollectPlayInfoSearchBean condition);
  	
  	public List<Map<String,Object>> getCollectPlayInfoColumnListByCondition(CollectPlayInfoSearchBean condition);
  	
  	public int updateCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
}
