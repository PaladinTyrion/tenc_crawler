package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CollectPropertySearchBean;
import cn.com.paladintyrion.client.bean.CollectProperty;
/**
 * <p>Title: </p>
 *
 * <p>Description:CollectProperty</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

public interface CollectPropertyDao {

	public int insertCollectProperty(CollectProperty collectProperty);

  	public int updateCollectProperty(CollectProperty collectProperty);

  	public CollectProperty getCollectPropertyByWhere(String where);
  
  	public List<CollectProperty> getCollectPropertyListByWhere(String where,int offset,int limit);
  	
  	public List<CollectProperty> getCollectPropertyListByCondition(CollectPropertySearchBean condition);
  
  	public List<CollectProperty> getCollectPropertyListBySql(String sql);
  
  	public int getCollectPropertyCountByWhere(String where);
  	
  	public int getCollectPropertyCountByExample(CollectProperty collectProperty);
  	
  	public int getCollectPropertyCountByCondition(CollectPropertySearchBean condition);
  
  	public int updateCollectPropertyByWhere(String where);
  
  	public int deleteCollectPropertyByWhere(String where);
  	
  	public List<BatchResult> batchInsertCollectProperty(List<CollectProperty> list);
  	
  	public CollectProperty getCollectPropertyByExample(CollectProperty collectProperty);
  	
  	public List<CollectProperty> getCollectPropertyListByExample(CollectProperty collectProperty);
  	
  	public int deleteCollectPropertyByExample(CollectProperty collectProperty);
  	
  	public int deleteCollectPropertyByCondition(CollectPropertySearchBean condition);
  	
  	public List<BatchResult> batchDeleteCollectPropertyByExample(List<CollectProperty> list);
  	
  	public List<CollectProperty> getCollectPropertyByCondition(CollectPropertySearchBean condition);
  	
  	public int updateCollectProperty(CollectPropertySearchBean condition);
  	
  	public Map<String,Object> getCollectPropertyColumnByCondition(CollectPropertySearchBean condition);
  	
  	public List<Map<String,Object>> getCollectPropertyColumnListByCondition(CollectPropertySearchBean condition);
  	
  	public int updateCollectPropertyByExample(CollectProperty collectProperty);
}
