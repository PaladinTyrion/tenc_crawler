package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.Comment;
import cn.com.paladintyrion.client.dao.CommentDao;
import cn.com.paladintyrion.client.search.CommentSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="commentService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CommentServiceImpl implements CommentService{

	@Autowired
	@Setter
	private CommentDao commentDao;
		
	public void addComment(Comment comment){
		commentDao.insertComment(comment);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddComment(List<Comment> list){
		commentDao.batchInsertComment(list);
	}
	
	public Comment getCommentByExample(Comment comment){
		return commentDao.getCommentByExample(comment);
	}
	
	public void modifyCommentByExample(Comment comment){
		commentDao.updateCommentByExample(comment);
	}
	
	public void removeCommentByExample(Comment comment){
		commentDao.deleteCommentByExample(comment);
	}
	
	public void removeCommentByCondition(CommentSearchBean condition){
		commentDao.deleteCommentByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveCommentByExample(List<Comment> list){
		commentDao.batchDeleteCommentByExample(list);
	}
	
	public PageModel queryCommentBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(commentDao.getCommentCountByWhere(where));
		pm.setData(commentDao.getCommentListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryCommentByCondition(CommentSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(commentDao.getCommentCountByCondition(condition));
		pm.setData(commentDao.getCommentListByCondition(condition));
		return pm;
	}
	
	public List<Comment> queryCommentListByWhere(String where){
		return commentDao.getCommentListBySql(where);
	}
	
	public List<Comment> queryCommentListByExample(Comment comment){
		return commentDao.getCommentListByExample(comment);
	}
	
	public List<Comment> getCommentByCondition(CommentSearchBean condition){
		return commentDao.getCommentByCondition(condition);
	}
	
	public List<Comment> queryCommentListByCondition(CommentSearchBean condition){
		return commentDao.getCommentListByCondition(condition);
	}
	
	public void modifyCommentBySql(String sql){
		commentDao.updateCommentByWhere(sql);
	}
	
	public void modifyCommentByCondition(CommentSearchBean condition){
		commentDao.updateComment(condition);
	}
	
	public void removeCommentBySql(String sql){
		commentDao.deleteCommentByWhere(sql);
	}
	
	public int getCommentCountBySql(String sql){
		return commentDao.getCommentCountByWhere(sql);
	}
	
	public int getCommentCountByExample(Comment comment){
		return commentDao.getCommentCountByExample(comment);
	}
	
	public int getCommentCountByCondition(CommentSearchBean condition){
		return commentDao.getCommentCountByCondition(condition);
	}
	
	public Map<String,Object> getCommentColumnByCondition(CommentSearchBean condition){
		return commentDao.getCommentColumnByCondition(condition);
	}
	
	public void updateCommentByExample(Comment comment){
		commentDao.updateCommentByExample(comment);
	}
}
