package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

@Component(value="commentDao")
public class CommentDaoImpl extends SqlSessionDaoSupportExt implements CommentDao {
	public CommentDaoImpl() {
		
    }

  	public int insertComment(Comment comment){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.CommentDao.insertComment", comment);
  	}

  	public int updateComment(Comment comment){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CommentDao.updateComment", comment);
  	}
  
  	public Comment getCommentByWhere(String where){
    	return (Comment) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CommentDao.getCommentByWhere", where);
  	}
  
  	public List<Comment> getCommentListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentListByWhere", where);
  	}
  	
  	public List<Comment> getCommentListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<Comment> getCommentListByCondition(CommentSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<Comment> getCommentListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentByWhere", sql);
  	}
  
  	public int getCommentCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CommentDao.getCommentCountByWhere", where);
  	}
  	
  	public int getCommentCountByExample(Comment comment){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CommentDao.getCommentCountByExample", comment);
  	}
  	
  	public int getCommentCountByCondition(CommentSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CommentDao.getCommentCountByCondition", condition);
  	}
  
  	public int updateCommentByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CommentDao.updateCommentByWhere", where);
  	}
  
  	public int deleteCommentByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CommentDao.deleteCommentByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertComment(List<Comment> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.CommentDao.insertComment", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public Comment getCommentByExample(Comment comment){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CommentDao.getCommentByExample", comment);
  	}
  	
  	public List<Comment> getCommentListByExample(Comment comment){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentByExample", comment);
  	}
  	
  	public int deleteCommentByExample(Comment comment){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CommentDao.deleteCommentByExample",comment);
  	}
  	
  	public int deleteCommentByCondition(CommentSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CommentDao.deleteCommentByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteCommentByExample(List<Comment> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.CommentDao.deleteCommentByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<Comment> getCommentByCondition(CommentSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentByCondition", condition);
  	}
  	
  	public int updateComment(CommentSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CommentDao.updateCommentByCondition", condition);
  	}
  	
  	public Map<String,Object> getCommentColumnByCondition(CommentSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CommentDao.getCommentColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getCommentColumnListByCondition(CommentSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CommentDao.getCommentColumnByCondition", condition);
  	}
  	
  	public int updateCommentByExample(Comment comment){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CommentDao.updateCommentByExample", comment);
  	}
}
