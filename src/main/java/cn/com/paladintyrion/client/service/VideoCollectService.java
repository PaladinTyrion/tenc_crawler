package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.VideoCollect;
import cn.com.paladintyrion.client.search.VideoCollectSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface VideoCollectService {

	/**
	 * 新增VideoCollect记录
	 * @param VideoCollect
	 */
	public void addVideoCollect(VideoCollect videoCollect);
	
	/**
	 * 批量新增VideoCollect记录
	 * @param List
	 */
	public void batchAddVideoCollect(List<VideoCollect> list);
	
	/**
	 * 按照实例查找VideoCollect记录,主要为根据主键查找
	 * @param videoCollect
	 * @return VideoCollect
	 */
	public VideoCollect getVideoCollectByExample(VideoCollect videoCollect);
	
	/**
	 * 修改VideoCollect记录
	 * @param VideoCollect
	 */
	public void modifyVideoCollectByExample(VideoCollect videoCollect);
	
	/**
	 * 根据VideoCollect实例删除记录
	 * @param VideoCollect
	 */
	public void removeVideoCollectByExample(VideoCollect videoCollect);
	
	/**
	 * 根据条件删除记录
	 * @param VideoCollectSearchBean
	 */
	public void removeVideoCollectByCondition(VideoCollectSearchBean condition);
	
	public void batchRemoveVideoCollectByExample(List<VideoCollect> list);
	
	public PageModel queryVideoCollectByCondition(VideoCollectSearchBean condition);
	
	public PageModel queryVideoCollectBySql(String sql,int offset,int limit);
	
	public List<VideoCollect> queryVideoCollectListByWhere(String where);
	
	public List<VideoCollect> queryVideoCollectListByExample(VideoCollect videoCollect);
	
	public List<VideoCollect> getVideoCollectByCondition(VideoCollectSearchBean condition);
	
	public List<VideoCollect> queryVideoCollectListByCondition(VideoCollectSearchBean condition);
	
	public void modifyVideoCollectBySql(String sql);
	
	public void modifyVideoCollectByCondition(VideoCollectSearchBean condition);
	
	public void removeVideoCollectBySql(String sql);
	
	public int getVideoCollectCountBySql(String sql);
	
	public int getVideoCollectCountByExample(VideoCollect videoCollect);
	
	public int getVideoCollectCountByCondition(VideoCollectSearchBean condition);
	
	public Map<String,Object> getVideoCollectColumnByCondition(VideoCollectSearchBean condition);
	
	public void updateVideoCollectByExample(VideoCollect videoCollect);
}
