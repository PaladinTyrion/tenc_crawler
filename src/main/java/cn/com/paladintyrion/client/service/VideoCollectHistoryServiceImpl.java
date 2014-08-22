package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.VideoCollectHistory;
import cn.com.paladintyrion.client.dao.VideoCollectHistoryDao;
import cn.com.paladintyrion.client.search.VideoCollectHistorySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="videoCollectHistoryService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class VideoCollectHistoryServiceImpl implements VideoCollectHistoryService{

	@Autowired
	@Setter
	private VideoCollectHistoryDao videoCollectHistoryDao;
		
	public void addVideoCollectHistory(VideoCollectHistory videoCollectHistory){
		videoCollectHistoryDao.insertVideoCollectHistory(videoCollectHistory);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddVideoCollectHistory(List<VideoCollectHistory> list){
		videoCollectHistoryDao.batchInsertVideoCollectHistory(list);
	}
	
	public VideoCollectHistory getVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
		return videoCollectHistoryDao.getVideoCollectHistoryByExample(videoCollectHistory);
	}
	
	public void modifyVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
		videoCollectHistoryDao.updateVideoCollectHistoryByExample(videoCollectHistory);
	}
	
	public void removeVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
		videoCollectHistoryDao.deleteVideoCollectHistoryByExample(videoCollectHistory);
	}
	
	public void removeVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition){
		videoCollectHistoryDao.deleteVideoCollectHistoryByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveVideoCollectHistoryByExample(List<VideoCollectHistory> list){
		videoCollectHistoryDao.batchDeleteVideoCollectHistoryByExample(list);
	}
	
	public PageModel queryVideoCollectHistoryBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(videoCollectHistoryDao.getVideoCollectHistoryCountByWhere(where));
		pm.setData(videoCollectHistoryDao.getVideoCollectHistoryListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(videoCollectHistoryDao.getVideoCollectHistoryCountByCondition(condition));
		pm.setData(videoCollectHistoryDao.getVideoCollectHistoryListByCondition(condition));
		return pm;
	}
	
	public List<VideoCollectHistory> queryVideoCollectHistoryListByWhere(String where){
		return videoCollectHistoryDao.getVideoCollectHistoryListBySql(where);
	}
	
	public List<VideoCollectHistory> queryVideoCollectHistoryListByExample(VideoCollectHistory videoCollectHistory){
		return videoCollectHistoryDao.getVideoCollectHistoryListByExample(videoCollectHistory);
	}
	
	public List<VideoCollectHistory> getVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition){
		return videoCollectHistoryDao.getVideoCollectHistoryByCondition(condition);
	}
	
	public List<VideoCollectHistory> queryVideoCollectHistoryListByCondition(VideoCollectHistorySearchBean condition){
		return videoCollectHistoryDao.getVideoCollectHistoryListByCondition(condition);
	}
	
	public void modifyVideoCollectHistoryBySql(String sql){
		videoCollectHistoryDao.updateVideoCollectHistoryByWhere(sql);
	}
	
	public void modifyVideoCollectHistoryByCondition(VideoCollectHistorySearchBean condition){
		videoCollectHistoryDao.updateVideoCollectHistory(condition);
	}
	
	public void removeVideoCollectHistoryBySql(String sql){
		videoCollectHistoryDao.deleteVideoCollectHistoryByWhere(sql);
	}
	
	public int getVideoCollectHistoryCountBySql(String sql){
		return videoCollectHistoryDao.getVideoCollectHistoryCountByWhere(sql);
	}
	
	public int getVideoCollectHistoryCountByExample(VideoCollectHistory videoCollectHistory){
		return videoCollectHistoryDao.getVideoCollectHistoryCountByExample(videoCollectHistory);
	}
	
	public int getVideoCollectHistoryCountByCondition(VideoCollectHistorySearchBean condition){
		return videoCollectHistoryDao.getVideoCollectHistoryCountByCondition(condition);
	}
	
	public Map<String,Object> getVideoCollectHistoryColumnByCondition(VideoCollectHistorySearchBean condition){
		return videoCollectHistoryDao.getVideoCollectHistoryColumnByCondition(condition);
	}
	
	public void updateVideoCollectHistoryByExample(VideoCollectHistory videoCollectHistory){
		videoCollectHistoryDao.updateVideoCollectHistoryByExample(videoCollectHistory);
	}
}
