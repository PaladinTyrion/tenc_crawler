package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.CollectProperty;
import cn.com.paladintyrion.client.search.CollectPropertySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface CollectPropertyService {

	/**
	 * 新增CollectProperty记录
	 * @param CollectProperty
	 */
	public void addCollectProperty(CollectProperty collectProperty);
	
	/**
	 * 批量新增CollectProperty记录
	 * @param List
	 */
	public void batchAddCollectProperty(List<CollectProperty> list);
	
	/**
	 * 按照实例查找CollectProperty记录,主要为根据主键查找
	 * @param collectProperty
	 * @return CollectProperty
	 */
	public CollectProperty getCollectPropertyByExample(CollectProperty collectProperty);
	
	/**
	 * 修改CollectProperty记录
	 * @param CollectProperty
	 */
	public void modifyCollectPropertyByExample(CollectProperty collectProperty);
	
	/**
	 * 根据CollectProperty实例删除记录
	 * @param CollectProperty
	 */
	public void removeCollectPropertyByExample(CollectProperty collectProperty);
	
	/**
	 * 根据条件删除记录
	 * @param CollectPropertySearchBean
	 */
	public void removeCollectPropertyByCondition(CollectPropertySearchBean condition);
	
	public void batchRemoveCollectPropertyByExample(List<CollectProperty> list);
	
	public PageModel queryCollectPropertyByCondition(CollectPropertySearchBean condition);
	
	public PageModel queryCollectPropertyBySql(String sql,int offset,int limit);
	
	public List<CollectProperty> queryCollectPropertyListByWhere(String where);
	
	public List<CollectProperty> queryCollectPropertyListByExample(CollectProperty collectProperty);
	
	public List<CollectProperty> getCollectPropertyByCondition(CollectPropertySearchBean condition);
	
	public List<CollectProperty> queryCollectPropertyListByCondition(CollectPropertySearchBean condition);
	
	public void modifyCollectPropertyBySql(String sql);
	
	public void modifyCollectPropertyByCondition(CollectPropertySearchBean condition);
	
	public void removeCollectPropertyBySql(String sql);
	
	public int getCollectPropertyCountBySql(String sql);
	
	public int getCollectPropertyCountByExample(CollectProperty collectProperty);
	
	public int getCollectPropertyCountByCondition(CollectPropertySearchBean condition);
	
	public Map<String,Object> getCollectPropertyColumnByCondition(CollectPropertySearchBean condition);
	
	public void updateCollectPropertyByExample(CollectProperty collectProperty);
}
