package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.VideoInfo;
import cn.com.paladintyrion.client.dao.VideoInfoDao;
import cn.com.paladintyrion.client.search.VideoInfoSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="videoInfoService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class VideoInfoServiceImpl implements VideoInfoService{

	@Autowired
	@Setter
	private VideoInfoDao videoInfoDao;
		
	public void addVideoInfo(VideoInfo videoInfo){
		videoInfoDao.insertVideoInfo(videoInfo);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddVideoInfo(List<VideoInfo> list){
		videoInfoDao.batchInsertVideoInfo(list);
	}
	
	public VideoInfo getVideoInfoByExample(VideoInfo videoInfo){
		return videoInfoDao.getVideoInfoByExample(videoInfo);
	}
	
	public void modifyVideoInfoByExample(VideoInfo videoInfo){
		videoInfoDao.updateVideoInfoByExample(videoInfo);
	}
	
	public void removeVideoInfoByExample(VideoInfo videoInfo){
		videoInfoDao.deleteVideoInfoByExample(videoInfo);
	}
	
	public void removeVideoInfoByCondition(VideoInfoSearchBean condition){
		videoInfoDao.deleteVideoInfoByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveVideoInfoByExample(List<VideoInfo> list){
		videoInfoDao.batchDeleteVideoInfoByExample(list);
	}
	
	public PageModel queryVideoInfoBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(videoInfoDao.getVideoInfoCountByWhere(where));
		pm.setData(videoInfoDao.getVideoInfoListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryVideoInfoByCondition(VideoInfoSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(videoInfoDao.getVideoInfoCountByCondition(condition));
		pm.setData(videoInfoDao.getVideoInfoListByCondition(condition));
		return pm;
	}
	
	public List<VideoInfo> queryVideoInfoListByWhere(String where){
		return videoInfoDao.getVideoInfoListBySql(where);
	}
	
	public List<VideoInfo> queryVideoInfoListByExample(VideoInfo videoInfo){
		return videoInfoDao.getVideoInfoListByExample(videoInfo);
	}
	
	public List<VideoInfo> getVideoInfoByCondition(VideoInfoSearchBean condition){
		return videoInfoDao.getVideoInfoByCondition(condition);
	}
	
	public List<VideoInfo> queryVideoInfoListByCondition(VideoInfoSearchBean condition){
		return videoInfoDao.getVideoInfoListByCondition(condition);
	}
	
	public void modifyVideoInfoBySql(String sql){
		videoInfoDao.updateVideoInfoByWhere(sql);
	}
	
	public void modifyVideoInfoByCondition(VideoInfoSearchBean condition){
		videoInfoDao.updateVideoInfo(condition);
	}
	
	public void removeVideoInfoBySql(String sql){
		videoInfoDao.deleteVideoInfoByWhere(sql);
	}
	
	public int getVideoInfoCountBySql(String sql){
		return videoInfoDao.getVideoInfoCountByWhere(sql);
	}
	
	public int getVideoInfoCountByExample(VideoInfo videoInfo){
		return videoInfoDao.getVideoInfoCountByExample(videoInfo);
	}
	
	public int getVideoInfoCountByCondition(VideoInfoSearchBean condition){
		return videoInfoDao.getVideoInfoCountByCondition(condition);
	}
	
	public Map<String,Object> getVideoInfoColumnByCondition(VideoInfoSearchBean condition){
		return videoInfoDao.getVideoInfoColumnByCondition(condition);
	}
	
	public void updateVideoInfoByExample(VideoInfo videoInfo){
		videoInfoDao.updateVideoInfoByExample(videoInfo);
	}
}
