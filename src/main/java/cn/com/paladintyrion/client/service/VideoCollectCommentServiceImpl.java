package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.VideoCollectComment;
import cn.com.paladintyrion.client.dao.VideoCollectCommentDao;
import cn.com.paladintyrion.client.search.VideoCollectCommentSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="videoCollectCommentService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class VideoCollectCommentServiceImpl implements VideoCollectCommentService{

	@Autowired
	@Setter
	private VideoCollectCommentDao videoCollectCommentDao;
		
	public void addVideoCollectComment(VideoCollectComment videoCollectComment){
		videoCollectCommentDao.insertVideoCollectComment(videoCollectComment);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddVideoCollectComment(List<VideoCollectComment> list){
		videoCollectCommentDao.batchInsertVideoCollectComment(list);
	}
	
	public VideoCollectComment getVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
		return videoCollectCommentDao.getVideoCollectCommentByExample(videoCollectComment);
	}
	
	public void modifyVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
		videoCollectCommentDao.updateVideoCollectCommentByExample(videoCollectComment);
	}
	
	public void removeVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
		videoCollectCommentDao.deleteVideoCollectCommentByExample(videoCollectComment);
	}
	
	public void removeVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition){
		videoCollectCommentDao.deleteVideoCollectCommentByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveVideoCollectCommentByExample(List<VideoCollectComment> list){
		videoCollectCommentDao.batchDeleteVideoCollectCommentByExample(list);
	}
	
	public PageModel queryVideoCollectCommentBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(videoCollectCommentDao.getVideoCollectCommentCountByWhere(where));
		pm.setData(videoCollectCommentDao.getVideoCollectCommentListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(videoCollectCommentDao.getVideoCollectCommentCountByCondition(condition));
		pm.setData(videoCollectCommentDao.getVideoCollectCommentListByCondition(condition));
		return pm;
	}
	
	public List<VideoCollectComment> queryVideoCollectCommentListByWhere(String where){
		return videoCollectCommentDao.getVideoCollectCommentListBySql(where);
	}
	
	public List<VideoCollectComment> queryVideoCollectCommentListByExample(VideoCollectComment videoCollectComment){
		return videoCollectCommentDao.getVideoCollectCommentListByExample(videoCollectComment);
	}
	
	public List<VideoCollectComment> getVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition){
		return videoCollectCommentDao.getVideoCollectCommentByCondition(condition);
	}
	
	public List<VideoCollectComment> queryVideoCollectCommentListByCondition(VideoCollectCommentSearchBean condition){
		return videoCollectCommentDao.getVideoCollectCommentListByCondition(condition);
	}
	
	public void modifyVideoCollectCommentBySql(String sql){
		videoCollectCommentDao.updateVideoCollectCommentByWhere(sql);
	}
	
	public void modifyVideoCollectCommentByCondition(VideoCollectCommentSearchBean condition){
		videoCollectCommentDao.updateVideoCollectComment(condition);
	}
	
	public void removeVideoCollectCommentBySql(String sql){
		videoCollectCommentDao.deleteVideoCollectCommentByWhere(sql);
	}
	
	public int getVideoCollectCommentCountBySql(String sql){
		return videoCollectCommentDao.getVideoCollectCommentCountByWhere(sql);
	}
	
	public int getVideoCollectCommentCountByExample(VideoCollectComment videoCollectComment){
		return videoCollectCommentDao.getVideoCollectCommentCountByExample(videoCollectComment);
	}
	
	public int getVideoCollectCommentCountByCondition(VideoCollectCommentSearchBean condition){
		return videoCollectCommentDao.getVideoCollectCommentCountByCondition(condition);
	}
	
	public Map<String,Object> getVideoCollectCommentColumnByCondition(VideoCollectCommentSearchBean condition){
		return videoCollectCommentDao.getVideoCollectCommentColumnByCondition(condition);
	}
	
	public void updateVideoCollectCommentByExample(VideoCollectComment videoCollectComment){
		videoCollectCommentDao.updateVideoCollectCommentByExample(videoCollectComment);
	}
}
