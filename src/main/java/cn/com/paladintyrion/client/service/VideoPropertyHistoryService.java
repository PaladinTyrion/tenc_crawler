package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.VideoPropertyHistory;
import cn.com.paladintyrion.client.search.VideoPropertyHistorySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface VideoPropertyHistoryService {

	/**
	 * 新增VideoPropertyHistory记录
	 * @param VideoPropertyHistory
	 */
	public void addVideoPropertyHistory(VideoPropertyHistory videoPropertyHistory);
	
	/**
	 * 批量新增VideoPropertyHistory记录
	 * @param List
	 */
	public void batchAddVideoPropertyHistory(List<VideoPropertyHistory> list);
	
	/**
	 * 按照实例查找VideoPropertyHistory记录,主要为根据主键查找
	 * @param videoPropertyHistory
	 * @return VideoPropertyHistory
	 */
	public VideoPropertyHistory getVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
	
	/**
	 * 修改VideoPropertyHistory记录
	 * @param VideoPropertyHistory
	 */
	public void modifyVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
	
	/**
	 * 根据VideoPropertyHistory实例删除记录
	 * @param VideoPropertyHistory
	 */
	public void removeVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
	
	/**
	 * 根据条件删除记录
	 * @param VideoPropertyHistorySearchBean
	 */
	public void removeVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition);
	
	public void batchRemoveVideoPropertyHistoryByExample(List<VideoPropertyHistory> list);
	
	public PageModel queryVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition);
	
	public PageModel queryVideoPropertyHistoryBySql(String sql,int offset,int limit);
	
	public List<VideoPropertyHistory> queryVideoPropertyHistoryListByWhere(String where);
	
	public List<VideoPropertyHistory> queryVideoPropertyHistoryListByExample(VideoPropertyHistory videoPropertyHistory);
	
	public List<VideoPropertyHistory> getVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition);
	
	public List<VideoPropertyHistory> queryVideoPropertyHistoryListByCondition(VideoPropertyHistorySearchBean condition);
	
	public void modifyVideoPropertyHistoryBySql(String sql);
	
	public void modifyVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition);
	
	public void removeVideoPropertyHistoryBySql(String sql);
	
	public int getVideoPropertyHistoryCountBySql(String sql);
	
	public int getVideoPropertyHistoryCountByExample(VideoPropertyHistory videoPropertyHistory);
	
	public int getVideoPropertyHistoryCountByCondition(VideoPropertyHistorySearchBean condition);
	
	public Map<String,Object> getVideoPropertyHistoryColumnByCondition(VideoPropertyHistorySearchBean condition);
	
	public void updateVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory);
}
