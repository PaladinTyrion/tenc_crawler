package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.VideoCollectHistory;
import cn.com.paladintyrion.client.search.VideoCollectHistorySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface VideoCollectHistoryService {

	/**
	 * 新增VideoCollectHistory记录
	 * @param VideoCollectHistory
	 */
	public void addVideoCollectHistory(VideoCollectHistory videoCollectHistory);
	
	/**
	 * 批量新增VideoCollectHistory记录
	 * @param List
	 */
	public void batchAddVideoCollectHistory(List<VideoCollectHistory> list);
	
	/**
	 * 按照实例查找VideoCollectHistory记录,主要为根据主键查找
	 * @param videoCollectHistory
	 * @return VideoCollectHistory
	 */
	public VideoCollectHistory getVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
	
	/**
	 * 修改VideoCollectHistory记录
	 * @param VideoCollectHistory
	 */
	public void modifyVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
	
	/**
	 * 根据VideoCollectHistory实例删除记录
	 * @param VideoCollectHistory
	 */
	public void removeVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
	
	/**
	 * 根据条件删除记录
	 * @param VideoCollectHistorySearchBean
	 */
	public void removeVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition);
	
	public void batchRemoveVideoCollectHistoryByExample(List<VideoCollectHistory> list);
	
	public PageModel queryVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition);
	
	public PageModel queryVideoCollectHistoryBySql(String sql,int offset,int limit);
	
	public List<VideoCollectHistory> queryVideoCollectHistoryListByWhere(String where);
	
	public List<VideoCollectHistory> queryVideoCollectHistoryListByExample(VideoCollectHistory videoCollectHistory);
	
	public List<VideoCollectHistory> getVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition);
	
	public List<VideoCollectHistory> queryVideoCollectHistoryListByCondition(VideoCollectHistorySearchBean condition);
	
	public void modifyVideoCollectHistoryBySql(String sql);
	
	public void modifyVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition);
	
	public void removeVideoCollectHistoryBySql(String sql);
	
	public int getVideoCollectHistoryCountBySql(String sql);
	
	public int getVideoCollectHistoryCountByExample(VideoCollectHistory videoCollectHistory);
	
	public int getVideoCollectHistoryCountByCondition(VideoCollectHistorySearchBean condition);
	
	public Map<String,Object> getVideoCollectHistoryColumnByCondition(VideoCollectHistorySearchBean condition);
	
	public void updateVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory);
}
