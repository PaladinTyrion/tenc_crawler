package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.VideoProperty;
import cn.com.paladintyrion.client.dao.VideoPropertyDao;
import cn.com.paladintyrion.client.search.VideoPropertySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="videoPropertyService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class VideoPropertyServiceImpl implements VideoPropertyService{

	@Autowired
	@Setter
	private VideoPropertyDao videoPropertyDao;
		
	public void addVideoProperty(VideoProperty videoProperty){
		videoPropertyDao.insertVideoProperty(videoProperty);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddVideoProperty(List<VideoProperty> list){
		videoPropertyDao.batchInsertVideoProperty(list);
	}
	
	public VideoProperty getVideoPropertyByExample(VideoProperty videoProperty){
		return videoPropertyDao.getVideoPropertyByExample(videoProperty);
	}
	
	public void modifyVideoPropertyByExample(VideoProperty videoProperty){
		videoPropertyDao.updateVideoPropertyByExample(videoProperty);
	}
	
	public void removeVideoPropertyByExample(VideoProperty videoProperty){
		videoPropertyDao.deleteVideoPropertyByExample(videoProperty);
	}
	
	public void removeVideoPropertyByCondition(VideoPropertySearchBean condition){
		videoPropertyDao.deleteVideoPropertyByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveVideoPropertyByExample(List<VideoProperty> list){
		videoPropertyDao.batchDeleteVideoPropertyByExample(list);
	}
	
	public PageModel queryVideoPropertyBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(videoPropertyDao.getVideoPropertyCountByWhere(where));
		pm.setData(videoPropertyDao.getVideoPropertyListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryVideoPropertyByCondition(VideoPropertySearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(videoPropertyDao.getVideoPropertyCountByCondition(condition));
		pm.setData(videoPropertyDao.getVideoPropertyListByCondition(condition));
		return pm;
	}
	
	public List<VideoProperty> queryVideoPropertyListByWhere(String where){
		return videoPropertyDao.getVideoPropertyListBySql(where);
	}
	
	public List<VideoProperty> queryVideoPropertyListByExample(VideoProperty videoProperty){
		return videoPropertyDao.getVideoPropertyListByExample(videoProperty);
	}
	
	public List<VideoProperty> getVideoPropertyByCondition(VideoPropertySearchBean condition){
		return videoPropertyDao.getVideoPropertyByCondition(condition);
	}
	
	public List<VideoProperty> queryVideoPropertyListByCondition(VideoPropertySearchBean condition){
		return videoPropertyDao.getVideoPropertyListByCondition(condition);
	}
	
	public void modifyVideoPropertyBySql(String sql){
		videoPropertyDao.updateVideoPropertyByWhere(sql);
	}
	
	public void modifyVideoPropertyByCondition(VideoPropertySearchBean condition){
		videoPropertyDao.updateVideoProperty(condition);
	}
	
	public void removeVideoPropertyBySql(String sql){
		videoPropertyDao.deleteVideoPropertyByWhere(sql);
	}
	
	public int getVideoPropertyCountBySql(String sql){
		return videoPropertyDao.getVideoPropertyCountByWhere(sql);
	}
	
	public int getVideoPropertyCountByExample(VideoProperty videoProperty){
		return videoPropertyDao.getVideoPropertyCountByExample(videoProperty);
	}
	
	public int getVideoPropertyCountByCondition(VideoPropertySearchBean condition){
		return videoPropertyDao.getVideoPropertyCountByCondition(condition);
	}
	
	public Map<String,Object> getVideoPropertyColumnByCondition(VideoPropertySearchBean condition){
		return videoPropertyDao.getVideoPropertyColumnByCondition(condition);
	}
	
	public void updateVideoPropertyByExample(VideoProperty videoProperty){
		videoPropertyDao.updateVideoPropertyByExample(videoProperty);
	}
}
