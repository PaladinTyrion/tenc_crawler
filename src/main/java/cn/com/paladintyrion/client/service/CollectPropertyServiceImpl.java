package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.CollectProperty;
import cn.com.paladintyrion.client.dao.CollectPropertyDao;
import cn.com.paladintyrion.client.search.CollectPropertySearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="collectPropertyService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CollectPropertyServiceImpl implements CollectPropertyService{

	@Autowired
	@Setter
	private CollectPropertyDao collectPropertyDao;
		
	public void addCollectProperty(CollectProperty collectProperty){
		collectPropertyDao.insertCollectProperty(collectProperty);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddCollectProperty(List<CollectProperty> list){
		collectPropertyDao.batchInsertCollectProperty(list);
	}
	
	public CollectProperty getCollectPropertyByExample(CollectProperty collectProperty){
		return collectPropertyDao.getCollectPropertyByExample(collectProperty);
	}
	
	public void modifyCollectPropertyByExample(CollectProperty collectProperty){
		collectPropertyDao.updateCollectPropertyByExample(collectProperty);
	}
	
	public void removeCollectPropertyByExample(CollectProperty collectProperty){
		collectPropertyDao.deleteCollectPropertyByExample(collectProperty);
	}
	
	public void removeCollectPropertyByCondition(CollectPropertySearchBean condition){
		collectPropertyDao.deleteCollectPropertyByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveCollectPropertyByExample(List<CollectProperty> list){
		collectPropertyDao.batchDeleteCollectPropertyByExample(list);
	}
	
	public PageModel queryCollectPropertyBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(collectPropertyDao.getCollectPropertyCountByWhere(where));
		pm.setData(collectPropertyDao.getCollectPropertyListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryCollectPropertyByCondition(CollectPropertySearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(collectPropertyDao.getCollectPropertyCountByCondition(condition));
		pm.setData(collectPropertyDao.getCollectPropertyListByCondition(condition));
		return pm;
	}
	
	public List<CollectProperty> queryCollectPropertyListByWhere(String where){
		return collectPropertyDao.getCollectPropertyListBySql(where);
	}
	
	public List<CollectProperty> queryCollectPropertyListByExample(CollectProperty collectProperty){
		return collectPropertyDao.getCollectPropertyListByExample(collectProperty);
	}
	
	public List<CollectProperty> getCollectPropertyByCondition(CollectPropertySearchBean condition){
		return collectPropertyDao.getCollectPropertyByCondition(condition);
	}
	
	public List<CollectProperty> queryCollectPropertyListByCondition(CollectPropertySearchBean condition){
		return collectPropertyDao.getCollectPropertyListByCondition(condition);
	}
	
	public void modifyCollectPropertyBySql(String sql){
		collectPropertyDao.updateCollectPropertyByWhere(sql);
	}
	
	public void modifyCollectPropertyByCondition(CollectPropertySearchBean condition){
		collectPropertyDao.updateCollectProperty(condition);
	}
	
	public void removeCollectPropertyBySql(String sql){
		collectPropertyDao.deleteCollectPropertyByWhere(sql);
	}
	
	public int getCollectPropertyCountBySql(String sql){
		return collectPropertyDao.getCollectPropertyCountByWhere(sql);
	}
	
	public int getCollectPropertyCountByExample(CollectProperty collectProperty){
		return collectPropertyDao.getCollectPropertyCountByExample(collectProperty);
	}
	
	public int getCollectPropertyCountByCondition(CollectPropertySearchBean condition){
		return collectPropertyDao.getCollectPropertyCountByCondition(condition);
	}
	
	public Map<String,Object> getCollectPropertyColumnByCondition(CollectPropertySearchBean condition){
		return collectPropertyDao.getCollectPropertyColumnByCondition(condition);
	}
	
	public void updateCollectPropertyByExample(CollectProperty collectProperty){
		collectPropertyDao.updateCollectPropertyByExample(collectProperty);
	}
}
