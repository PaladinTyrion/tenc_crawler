package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.VideoPropertyHistory;
import cn.com.paladintyrion.client.dao.VideoPropertyHistoryDao;
import cn.com.paladintyrion.client.search.VideoPropertyHistorySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="videoPropertyHistoryService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class VideoPropertyHistoryServiceImpl implements VideoPropertyHistoryService{

	@Autowired
	@Setter
	private VideoPropertyHistoryDao videoPropertyHistoryDao;
		
	public void addVideoPropertyHistory(VideoPropertyHistory videoPropertyHistory){
		videoPropertyHistoryDao.insertVideoPropertyHistory(videoPropertyHistory);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddVideoPropertyHistory(List<VideoPropertyHistory> list){
		videoPropertyHistoryDao.batchInsertVideoPropertyHistory(list);
	}
	
	public VideoPropertyHistory getVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
		return videoPropertyHistoryDao.getVideoPropertyHistoryByExample(videoPropertyHistory);
	}
	
	public void modifyVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
		videoPropertyHistoryDao.updateVideoPropertyHistoryByExample(videoPropertyHistory);
	}
	
	public void removeVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
		videoPropertyHistoryDao.deleteVideoPropertyHistoryByExample(videoPropertyHistory);
	}
	
	public void removeVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition){
		videoPropertyHistoryDao.deleteVideoPropertyHistoryByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveVideoPropertyHistoryByExample(List<VideoPropertyHistory> list){
		videoPropertyHistoryDao.batchDeleteVideoPropertyHistoryByExample(list);
	}
	
	public PageModel queryVideoPropertyHistoryBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(videoPropertyHistoryDao.getVideoPropertyHistoryCountByWhere(where));
		pm.setData(videoPropertyHistoryDao.getVideoPropertyHistoryListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(videoPropertyHistoryDao.getVideoPropertyHistoryCountByCondition(condition));
		pm.setData(videoPropertyHistoryDao.getVideoPropertyHistoryListByCondition(condition));
		return pm;
	}
	
	public List<VideoPropertyHistory> queryVideoPropertyHistoryListByWhere(String where){
		return videoPropertyHistoryDao.getVideoPropertyHistoryListBySql(where);
	}
	
	public List<VideoPropertyHistory> queryVideoPropertyHistoryListByExample(VideoPropertyHistory videoPropertyHistory){
		return videoPropertyHistoryDao.getVideoPropertyHistoryListByExample(videoPropertyHistory);
	}
	
	public List<VideoPropertyHistory> getVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition){
		return videoPropertyHistoryDao.getVideoPropertyHistoryByCondition(condition);
	}
	
	public List<VideoPropertyHistory> queryVideoPropertyHistoryListByCondition(VideoPropertyHistorySearchBean condition){
		return videoPropertyHistoryDao.getVideoPropertyHistoryListByCondition(condition);
	}
	
	public void modifyVideoPropertyHistoryBySql(String sql){
		videoPropertyHistoryDao.updateVideoPropertyHistoryByWhere(sql);
	}
	
	public void modifyVideoPropertyHistoryByCondition(VideoPropertyHistorySearchBean condition){
		videoPropertyHistoryDao.updateVideoPropertyHistory(condition);
	}
	
	public void removeVideoPropertyHistoryBySql(String sql){
		videoPropertyHistoryDao.deleteVideoPropertyHistoryByWhere(sql);
	}
	
	public int getVideoPropertyHistoryCountBySql(String sql){
		return videoPropertyHistoryDao.getVideoPropertyHistoryCountByWhere(sql);
	}
	
	public int getVideoPropertyHistoryCountByExample(VideoPropertyHistory videoPropertyHistory){
		return videoPropertyHistoryDao.getVideoPropertyHistoryCountByExample(videoPropertyHistory);
	}
	
	public int getVideoPropertyHistoryCountByCondition(VideoPropertyHistorySearchBean condition){
		return videoPropertyHistoryDao.getVideoPropertyHistoryCountByCondition(condition);
	}
	
	public Map<String,Object> getVideoPropertyHistoryColumnByCondition(VideoPropertyHistorySearchBean condition){
		return videoPropertyHistoryDao.getVideoPropertyHistoryColumnByCondition(condition);
	}
	
	public void updateVideoPropertyHistoryByExample(VideoPropertyHistory videoPropertyHistory){
		videoPropertyHistoryDao.updateVideoPropertyHistoryByExample(videoPropertyHistory);
	}
}
