package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.CollectAddress;
import cn.com.paladintyrion.client.search.CollectAddressSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface CollectAddressService {

	/**
	 * 新增CollectAddress记录
	 * @param CollectAddress
	 */
	public void addCollectAddress(CollectAddress collectAddress);
	
	/**
	 * 批量新增CollectAddress记录
	 * @param List
	 */
	public void batchAddCollectAddress(List<CollectAddress> list);
	
	/**
	 * 按照实例查找CollectAddress记录,主要为根据主键查找
	 * @param collectAddress
	 * @return CollectAddress
	 */
	public CollectAddress getCollectAddressByExample(CollectAddress collectAddress);
	
	/**
	 * 修改CollectAddress记录
	 * @param CollectAddress
	 */
	public void modifyCollectAddressByExample(CollectAddress collectAddress);
	
	/**
	 * 根据CollectAddress实例删除记录
	 * @param CollectAddress
	 */
	public void removeCollectAddressByExample(CollectAddress collectAddress);
	
	/**
	 * 根据条件删除记录
	 * @param CollectAddressSearchBean
	 */
	public void removeCollectAddressByCondition(CollectAddressSearchBean condition);
	
	public void batchRemoveCollectAddressByExample(List<CollectAddress> list);
	
	public PageModel queryCollectAddressByCondition(CollectAddressSearchBean condition);
	
	public PageModel queryCollectAddressBySql(String sql,int offset,int limit);
	
	public List<CollectAddress> queryCollectAddressListByWhere(String where);
	
	public List<CollectAddress> queryCollectAddressListByExample(CollectAddress collectAddress);
	
	public List<CollectAddress> getCollectAddressByCondition(CollectAddressSearchBean condition);
	
	public List<CollectAddress> queryCollectAddressListByCondition(CollectAddressSearchBean condition);
	
	public void modifyCollectAddressBySql(String sql);
	
	public void modifyCollectAddressByCondition(CollectAddressSearchBean condition);
	
	public void removeCollectAddressBySql(String sql);
	
	public int getCollectAddressCountBySql(String sql);
	
	public int getCollectAddressCountByExample(CollectAddress collectAddress);
	
	public int getCollectAddressCountByCondition(CollectAddressSearchBean condition);
	
	public Map<String,Object> getCollectAddressColumnByCondition(CollectAddressSearchBean condition);
	
	public void updateCollectAddressByExample(CollectAddress collectAddress);
}
