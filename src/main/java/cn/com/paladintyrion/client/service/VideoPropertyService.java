package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.VideoProperty;
import cn.com.paladintyrion.client.search.VideoPropertySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface VideoPropertyService {

	/**
	 * 新增VideoProperty记录
	 * @param VideoProperty
	 */
	public void addVideoProperty(VideoProperty videoProperty);
	
	/**
	 * 批量新增VideoProperty记录
	 * @param List
	 */
	public void batchAddVideoProperty(List<VideoProperty> list);
	
	/**
	 * 按照实例查找VideoProperty记录,主要为根据主键查找
	 * @param videoProperty
	 * @return VideoProperty
	 */
	public VideoProperty getVideoPropertyByExample(VideoProperty videoProperty);
	
	/**
	 * 修改VideoProperty记录
	 * @param VideoProperty
	 */
	public void modifyVideoPropertyByExample(VideoProperty videoProperty);
	
	/**
	 * 根据VideoProperty实例删除记录
	 * @param VideoProperty
	 */
	public void removeVideoPropertyByExample(VideoProperty videoProperty);
	
	/**
	 * 根据条件删除记录
	 * @param VideoPropertySearchBean
	 */
	public void removeVideoPropertyByCondition(VideoPropertySearchBean condition);
	
	public void batchRemoveVideoPropertyByExample(List<VideoProperty> list);
	
	public PageModel queryVideoPropertyByCondition(VideoPropertySearchBean condition);
	
	public PageModel queryVideoPropertyBySql(String sql,int offset,int limit);
	
	public List<VideoProperty> queryVideoPropertyListByWhere(String where);
	
	public List<VideoProperty> queryVideoPropertyListByExample(VideoProperty videoProperty);
	
	public List<VideoProperty> getVideoPropertyByCondition(VideoPropertySearchBean condition);
	
	public List<VideoProperty> queryVideoPropertyListByCondition(VideoPropertySearchBean condition);
	
	public void modifyVideoPropertyBySql(String sql);
	
	public void modifyVideoPropertyByCondition(VideoPropertySearchBean condition);
	
	public void removeVideoPropertyBySql(String sql);
	
	public int getVideoPropertyCountBySql(String sql);
	
	public int getVideoPropertyCountByExample(VideoProperty videoProperty);
	
	public int getVideoPropertyCountByCondition(VideoPropertySearchBean condition);
	
	public Map<String,Object> getVideoPropertyColumnByCondition(VideoPropertySearchBean condition);
	
	public void updateVideoPropertyByExample(VideoProperty videoProperty);
}
