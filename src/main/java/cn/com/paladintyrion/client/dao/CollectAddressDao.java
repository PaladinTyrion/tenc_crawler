package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CollectAddressSearchBean;
import cn.com.paladintyrion.client.bean.CollectAddress;
/**
 * <p>Title: </p>
 *
 * <p>Description:CollectAddress</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

public interface CollectAddressDao {

	public int insertCollectAddress(CollectAddress collectAddress);

  	public int updateCollectAddress(CollectAddress collectAddress);

  	public CollectAddress getCollectAddressByWhere(String where);
  
  	public List<CollectAddress> getCollectAddressListByWhere(String where,int offset,int limit);
  	
  	public List<CollectAddress> getCollectAddressListByCondition(CollectAddressSearchBean condition);
  
  	public List<CollectAddress> getCollectAddressListBySql(String sql);
  
  	public int getCollectAddressCountByWhere(String where);
  	
  	public int getCollectAddressCountByExample(CollectAddress collectAddress);
  	
  	public int getCollectAddressCountByCondition(CollectAddressSearchBean condition);
  
  	public int updateCollectAddressByWhere(String where);
  
  	public int deleteCollectAddressByWhere(String where);
  	
  	public List<BatchResult> batchInsertCollectAddress(List<CollectAddress> list);
  	
  	public CollectAddress getCollectAddressByExample(CollectAddress collectAddress);
  	
  	public List<CollectAddress> getCollectAddressListByExample(CollectAddress collectAddress);
  	
  	public int deleteCollectAddressByExample(CollectAddress collectAddress);
  	
  	public int deleteCollectAddressByCondition(CollectAddressSearchBean condition);
  	
  	public List<BatchResult> batchDeleteCollectAddressByExample(List<CollectAddress> list);
  	
  	public List<CollectAddress> getCollectAddressByCondition(CollectAddressSearchBean condition);
  	
  	public int updateCollectAddress(CollectAddressSearchBean condition);
  	
  	public Map<String,Object> getCollectAddressColumnByCondition(CollectAddressSearchBean condition);
  	
  	public List<Map<String,Object>> getCollectAddressColumnListByCondition(CollectAddressSearchBean condition);
  	
  	public int updateCollectAddressByExample(CollectAddress collectAddress);
}
