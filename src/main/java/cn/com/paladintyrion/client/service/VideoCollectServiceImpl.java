package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.VideoCollect;
import cn.com.paladintyrion.client.dao.VideoCollectDao;
import cn.com.paladintyrion.client.search.VideoCollectSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="videoCollectService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class VideoCollectServiceImpl implements VideoCollectService{

	@Autowired
	@Setter
	private VideoCollectDao videoCollectDao;
		
	public void addVideoCollect(VideoCollect videoCollect){
		videoCollectDao.insertVideoCollect(videoCollect);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddVideoCollect(List<VideoCollect> list){
		videoCollectDao.batchInsertVideoCollect(list);
	}
	
	public VideoCollect getVideoCollectByExample(VideoCollect videoCollect){
		return videoCollectDao.getVideoCollectByExample(videoCollect);
	}
	
	public void modifyVideoCollectByExample(VideoCollect videoCollect){
		videoCollectDao.updateVideoCollectByExample(videoCollect);
	}
	
	public void removeVideoCollectByExample(VideoCollect videoCollect){
		videoCollectDao.deleteVideoCollectByExample(videoCollect);
	}
	
	public void removeVideoCollectByCondition(VideoCollectSearchBean condition){
		videoCollectDao.deleteVideoCollectByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveVideoCollectByExample(List<VideoCollect> list){
		videoCollectDao.batchDeleteVideoCollectByExample(list);
	}
	
	public PageModel queryVideoCollectBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(videoCollectDao.getVideoCollectCountByWhere(where));
		pm.setData(videoCollectDao.getVideoCollectListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryVideoCollectByCondition(VideoCollectSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(videoCollectDao.getVideoCollectCountByCondition(condition));
		pm.setData(videoCollectDao.getVideoCollectListByCondition(condition));
		return pm;
	}
	
	public List<VideoCollect> queryVideoCollectListByWhere(String where){
		return videoCollectDao.getVideoCollectListBySql(where);
	}
	
	public List<VideoCollect> queryVideoCollectListByExample(VideoCollect videoCollect){
		return videoCollectDao.getVideoCollectListByExample(videoCollect);
	}
	
	public List<VideoCollect> getVideoCollectByCondition(VideoCollectSearchBean condition){
		return videoCollectDao.getVideoCollectByCondition(condition);
	}
	
	public List<VideoCollect> queryVideoCollectListByCondition(VideoCollectSearchBean condition){
		return videoCollectDao.getVideoCollectListByCondition(condition);
	}
	
	public void modifyVideoCollectBySql(String sql){
		videoCollectDao.updateVideoCollectByWhere(sql);
	}
	
	public void modifyVideoCollectByCondition(VideoCollectSearchBean condition){
		videoCollectDao.updateVideoCollect(condition);
	}
	
	public void removeVideoCollectBySql(String sql){
		videoCollectDao.deleteVideoCollectByWhere(sql);
	}
	
	public int getVideoCollectCountBySql(String sql){
		return videoCollectDao.getVideoCollectCountByWhere(sql);
	}
	
	public int getVideoCollectCountByExample(VideoCollect videoCollect){
		return videoCollectDao.getVideoCollectCountByExample(videoCollect);
	}
	
	public int getVideoCollectCountByCondition(VideoCollectSearchBean condition){
		return videoCollectDao.getVideoCollectCountByCondition(condition);
	}
	
	public Map<String,Object> getVideoCollectColumnByCondition(VideoCollectSearchBean condition){
		return videoCollectDao.getVideoCollectColumnByCondition(condition);
	}
	
	public void updateVideoCollectByExample(VideoCollect videoCollect){
		videoCollectDao.updateVideoCollectByExample(videoCollect);
	}
}
