package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.VideoCollectComment;
import cn.com.paladintyrion.client.search.VideoCollectCommentSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface VideoCollectCommentService {

	/**
	 * 新增VideoCollectComment记录
	 * @param VideoCollectComment
	 */
	public void addVideoCollectComment(VideoCollectComment videoCollectComment);
	
	/**
	 * 批量新增VideoCollectComment记录
	 * @param List
	 */
	public void batchAddVideoCollectComment(List<VideoCollectComment> list);
	
	/**
	 * 按照实例查找VideoCollectComment记录,主要为根据主键查找
	 * @param videoCollectComment
	 * @return VideoCollectComment
	 */
	public VideoCollectComment getVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
	
	/**
	 * 修改VideoCollectComment记录
	 * @param VideoCollectComment
	 */
	public void modifyVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
	
	/**
	 * 根据VideoCollectComment实例删除记录
	 * @param VideoCollectComment
	 */
	public void removeVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
	
	/**
	 * 根据条件删除记录
	 * @param VideoCollectCommentSearchBean
	 */
	public void removeVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition);
	
	public void batchRemoveVideoCollectCommentByExample(List<VideoCollectComment> list);
	
	public PageModel queryVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition);
	
	public PageModel queryVideoCollectCommentBySql(String sql,int offset,int limit);
	
	public List<VideoCollectComment> queryVideoCollectCommentListByWhere(String where);
	
	public List<VideoCollectComment> queryVideoCollectCommentListByExample(VideoCollectComment videoCollectComment);
	
	public List<VideoCollectComment> getVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition);
	
	public List<VideoCollectComment> queryVideoCollectCommentListByCondition(VideoCollectCommentSearchBean condition);
	
	public void modifyVideoCollectCommentBySql(String sql);
	
	public void modifyVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition);
	
	public void removeVideoCollectCommentBySql(String sql);
	
	public int getVideoCollectCommentCountBySql(String sql);
	
	public int getVideoCollectCommentCountByExample(VideoCollectComment videoCollectComment);
	
	public int getVideoCollectCommentCountByCondition(VideoCollectCommentSearchBean condition);
	
	public Map<String,Object> getVideoCollectCommentColumnByCondition(VideoCollectCommentSearchBean condition);
	
	public void updateVideoCollectCommentByExample(VideoCollectComment videoCollectComment);
}
