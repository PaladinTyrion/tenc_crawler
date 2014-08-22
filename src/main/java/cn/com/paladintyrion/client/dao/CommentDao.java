package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;

import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CommentSearchBean;
import cn.com.paladintyrion.client.bean.Comment;
/**
 * <p>Title: </p>
 *
 * <p>Description:Comment</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

public interface CommentDao {

	public int insertComment(Comment comment);

  	public int updateComment(Comment comment);

  	public Comment getCommentByWhere(String where);
  
  	public List<Comment> getCommentListByWhere(String where,int offset,int limit);
  	
  	public List<Comment> getCommentListByCondition(CommentSearchBean condition);
  
  	public List<Comment> getCommentListBySql(String sql);
  
  	public int getCommentCountByWhere(String where);
  	
  	public int getCommentCountByExample(Comment comment);
  	
  	public int getCommentCountByCondition(CommentSearchBean condition);
  
  	public int updateCommentByWhere(String where);
  
  	public int deleteCommentByWhere(String where);
  	
  	public List<BatchResult> batchInsertComment(List<Comment> list);
  	
  	public Comment getCommentByExample(Comment comment);
  	
  	public List<Comment> getCommentListByExample(Comment comment);
  	
  	public int deleteCommentByExample(Comment comment);
  	
  	public int deleteCommentByCondition(CommentSearchBean condition);
  	
  	public List<BatchResult> batchDeleteCommentByExample(List<Comment> list);
  	
  	public List<Comment> getCommentByCondition(CommentSearchBean condition);
  	
  	public int updateComment(CommentSearchBean condition);
  	
  	public Map<String,Object> getCommentColumnByCondition(CommentSearchBean condition);
  	
  	public List<Map<String,Object>> getCommentColumnListByCondition(CommentSearchBean condition);
  	
  	public int updateCommentByExample(Comment comment);
}
