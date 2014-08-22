package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.bean.Comment;
import cn.com.paladintyrion.client.search.CommentSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

public interface CommentService {

	/**
	 * 新增Comment记录
	 * @param Comment
	 */
	public void addComment(Comment comment);
	
	/**
	 * 批量新增Comment记录
	 * @param List
	 */
	public void batchAddComment(List<Comment> list);
	
	/**
	 * 按照实例查找Comment记录,主要为根据主键查找
	 * @param comment
	 * @return Comment
	 */
	public Comment getCommentByExample(Comment comment);
	
	/**
	 * 修改Comment记录
	 * @param Comment
	 */
	public void modifyCommentByExample(Comment comment);
	
	/**
	 * 根据Comment实例删除记录
	 * @param Comment
	 */
	public void removeCommentByExample(Comment comment);
	
	/**
	 * 根据条件删除记录
	 * @param CommentSearchBean
	 */
	public void removeCommentByCondition(CommentSearchBean condition);
	
	public void batchRemoveCommentByExample(List<Comment> list);
	
	public PageModel queryCommentByCondition(CommentSearchBean condition);
	
	public PageModel queryCommentBySql(String sql,int offset,int limit);
	
	public List<Comment> queryCommentListByWhere(String where);
	
	public List<Comment> queryCommentListByExample(Comment comment);
	
	public List<Comment> getCommentByCondition(CommentSearchBean condition);
	
	public List<Comment> queryCommentListByCondition(CommentSearchBean condition);
	
	public void modifyCommentBySql(String sql);
	
	public void modifyCommentByCondition(CommentSearchBean condition);
	
	public void removeCommentBySql(String sql);
	
	public int getCommentCountBySql(String sql);
	
	public int getCommentCountByExample(Comment comment);
	
	public int getCommentCountByCondition(CommentSearchBean condition);
	
	public Map<String,Object> getCommentColumnByCondition(CommentSearchBean condition);
	
	public void updateCommentByExample(Comment comment);
}
