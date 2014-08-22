package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.CollectPlayInfo;
import cn.com.paladintyrion.client.dao.CollectPlayInfoDao;
import cn.com.paladintyrion.client.search.CollectPlayInfoSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="collectPlayInfoService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CollectPlayInfoServiceImpl implements CollectPlayInfoService{

	@Autowired
	@Setter
	private CollectPlayInfoDao collectPlayInfoDao;
		
	public void addCollectPlayInfo(CollectPlayInfo collectPlayInfo){
		collectPlayInfoDao.insertCollectPlayInfo(collectPlayInfo);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddCollectPlayInfo(List<CollectPlayInfo> list){
		collectPlayInfoDao.batchInsertCollectPlayInfo(list);
	}
	
	public CollectPlayInfo getCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
		return collectPlayInfoDao.getCollectPlayInfoByExample(collectPlayInfo);
	}
	
	public void modifyCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
		collectPlayInfoDao.updateCollectPlayInfoByExample(collectPlayInfo);
	}
	
	public void removeCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
		collectPlayInfoDao.deleteCollectPlayInfoByExample(collectPlayInfo);
	}
	
	public void removeCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition){
		collectPlayInfoDao.deleteCollectPlayInfoByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveCollectPlayInfoByExample(List<CollectPlayInfo> list){
		collectPlayInfoDao.batchDeleteCollectPlayInfoByExample(list);
	}
	
	public PageModel queryCollectPlayInfoBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(collectPlayInfoDao.getCollectPlayInfoCountByWhere(where));
		pm.setData(collectPlayInfoDao.getCollectPlayInfoListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(collectPlayInfoDao.getCollectPlayInfoCountByCondition(condition));
		pm.setData(collectPlayInfoDao.getCollectPlayInfoListByCondition(condition));
		return pm;
	}
	
	public List<CollectPlayInfo> queryCollectPlayInfoListByWhere(String where){
		return collectPlayInfoDao.getCollectPlayInfoListBySql(where);
	}
	
	public List<CollectPlayInfo> queryCollectPlayInfoListByExample(CollectPlayInfo collectPlayInfo){
		return collectPlayInfoDao.getCollectPlayInfoListByExample(collectPlayInfo);
	}
	
	public List<CollectPlayInfo> getCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition){
		return collectPlayInfoDao.getCollectPlayInfoByCondition(condition);
	}
	
	public List<CollectPlayInfo> queryCollectPlayInfoListByCondition(CollectPlayInfoSearchBean condition){
		return collectPlayInfoDao.getCollectPlayInfoListByCondition(condition);
	}
	
	public void modifyCollectPlayInfoBySql(String sql){
		collectPlayInfoDao.updateCollectPlayInfoByWhere(sql);
	}
	
	public void modifyCollectPlayInfoByCondition(CollectPlayInfoSearchBean condition){
		collectPlayInfoDao.updateCollectPlayInfo(condition);
	}
	
	public void removeCollectPlayInfoBySql(String sql){
		collectPlayInfoDao.deleteCollectPlayInfoByWhere(sql);
	}
	
	public int getCollectPlayInfoCountBySql(String sql){
		return collectPlayInfoDao.getCollectPlayInfoCountByWhere(sql);
	}
	
	public int getCollectPlayInfoCountByExample(CollectPlayInfo collectPlayInfo){
		return collectPlayInfoDao.getCollectPlayInfoCountByExample(collectPlayInfo);
	}
	
	public int getCollectPlayInfoCountByCondition(CollectPlayInfoSearchBean condition){
		return collectPlayInfoDao.getCollectPlayInfoCountByCondition(condition);
	}
	
	public Map<String,Object> getCollectPlayInfoColumnByCondition(CollectPlayInfoSearchBean condition){
		return collectPlayInfoDao.getCollectPlayInfoColumnByCondition(condition);
	}
	
	public void updateCollectPlayInfoByExample(CollectPlayInfo collectPlayInfo){
		collectPlayInfoDao.updateCollectPlayInfoByExample(collectPlayInfo);
	}
}
