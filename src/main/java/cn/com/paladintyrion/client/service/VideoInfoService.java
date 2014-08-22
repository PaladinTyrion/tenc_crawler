package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.VideoInfo;
import cn.com.paladintyrion.client.search.VideoInfoSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface VideoInfoService {

	/**
	 * 新增VideoInfo记录
	 * @param VideoInfo
	 */
	public void addVideoInfo(VideoInfo videoInfo);
	
	/**
	 * 批量新增VideoInfo记录
	 * @param List
	 */
	public void batchAddVideoInfo(List<VideoInfo> list);
	
	/**
	 * 按照实例查找VideoInfo记录,主要为根据主键查找
	 * @param videoInfo
	 * @return VideoInfo
	 */
	public VideoInfo getVideoInfoByExample(VideoInfo videoInfo);
	
	/**
	 * 修改VideoInfo记录
	 * @param VideoInfo
	 */
	public void modifyVideoInfoByExample(VideoInfo videoInfo);
	
	/**
	 * 根据VideoInfo实例删除记录
	 * @param VideoInfo
	 */
	public void removeVideoInfoByExample(VideoInfo videoInfo);
	
	/**
	 * 根据条件删除记录
	 * @param VideoInfoSearchBean
	 */
	public void removeVideoInfoByCondition(VideoInfoSearchBean condition);
	
	public void batchRemoveVideoInfoByExample(List<VideoInfo> list);
	
	public PageModel queryVideoInfoByCondition(VideoInfoSearchBean condition);
	
	public PageModel queryVideoInfoBySql(String sql,int offset,int limit);
	
	public List<VideoInfo> queryVideoInfoListByWhere(String where);
	
	public List<VideoInfo> queryVideoInfoListByExample(VideoInfo videoInfo);
	
	public List<VideoInfo> getVideoInfoByCondition(VideoInfoSearchBean condition);
	
	public List<VideoInfo> queryVideoInfoListByCondition(VideoInfoSearchBean condition);
	
	public void modifyVideoInfoBySql(String sql);
	
	public void modifyVideoInfoByCondition(VideoInfoSearchBean condition);
	
	public void removeVideoInfoBySql(String sql);
	
	public int getVideoInfoCountBySql(String sql);
	
	public int getVideoInfoCountByExample(VideoInfo videoInfo);
	
	public int getVideoInfoCountByCondition(VideoInfoSearchBean condition);
	
	public Map<String,Object> getVideoInfoColumnByCondition(VideoInfoSearchBean condition);
	
	public void updateVideoInfoByExample(VideoInfo videoInfo);
}
