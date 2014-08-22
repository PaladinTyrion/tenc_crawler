package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.CollectPlayInfo;
import cn.com.paladintyrion.client.search.CollectPlayInfoSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface CollectPlayInfoService {

	/**
	 * 新增CollectPlayInfo记录
	 * @param CollectPlayInfo
	 */
	public void addCollectPlayInfo(CollectPlayInfo collectPlayInfo);
	
	/**
	 * 批量新增CollectPlayInfo记录
	 * @param List
	 */
	public void batchAddCollectPlayInfo(List<CollectPlayInfo> list);
	
	/**
	 * 按照实例查找CollectPlayInfo记录,主要为根据主键查找
	 * @param collectPlayInfo
	 * @return CollectPlayInfo
	 */
	public CollectPlayInfo getCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
	
	/**
	 * 修改CollectPlayInfo记录
	 * @param CollectPlayInfo
	 */
	public void modifyCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
	
	/**
	 * 根据CollectPlayInfo实例删除记录
	 * @param CollectPlayInfo
	 */
	public void removeCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
	
	/**
	 * 根据条件删除记录
	 * @param CollectPlayInfoSearchBean
	 */
	public void removeCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition);
	
	public void batchRemoveCollectPlayInfoByExample(List<CollectPlayInfo> list);
	
	public PageModel queryCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition);
	
	public PageModel queryCollectPlayInfoBySql(String sql,int offset,int limit);
	
	public List<CollectPlayInfo> queryCollectPlayInfoListByWhere(String where);
	
	public List<CollectPlayInfo> queryCollectPlayInfoListByExample(CollectPlayInfo collectPlayInfo);
	
	public List<CollectPlayInfo> getCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition);
	
	public List<CollectPlayInfo> queryCollectPlayInfoListByCondition(CollectPlayInfoSearchBean condition);
	
	public void modifyCollectPlayInfoBySql(String sql);
	
	public void modifyCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition);
	
	public void removeCollectPlayInfoBySql(String sql);
	
	public int getCollectPlayInfoCountBySql(String sql);
	
	public int getCollectPlayInfoCountByExample(CollectPlayInfo collectPlayInfo);
	
	public int getCollectPlayInfoCountByCondition(CollectPlayInfoSearchBean condition);
	
	public Map<String,Object> getCollectPlayInfoColumnByCondition(CollectPlayInfoSearchBean condition);
	
	public void updateCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo);
}
