package cn.com.paladintyrion.client.service;

import java.util.List;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.paladintyrion.client.bean.CollectAddress;
import cn.com.paladintyrion.client.dao.CollectAddressDao;
import cn.com.paladintyrion.client.search.CollectAddressSearchBean;
import cn.com.paladintyrion.common.util.PageModel;

@Component(value="collectAddressService")
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CollectAddressServiceImpl implements CollectAddressService{

	@Autowired
	@Setter
	private CollectAddressDao collectAddressDao;
		
	public void addCollectAddress(CollectAddress collectAddress){
		collectAddressDao.insertCollectAddress(collectAddress);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchAddCollectAddress(List<CollectAddress> list){
		collectAddressDao.batchInsertCollectAddress(list);
	}
	
	public CollectAddress getCollectAddressByExample(CollectAddress collectAddress){
		return collectAddressDao.getCollectAddressByExample(collectAddress);
	}
	
	public void modifyCollectAddressByExample(CollectAddress collectAddress){
		collectAddressDao.updateCollectAddressByExample(collectAddress);
	}
	
	public void removeCollectAddressByExample(CollectAddress collectAddress){
		collectAddressDao.deleteCollectAddressByExample(collectAddress);
	}
	
	public void removeCollectAddressByCondition(CollectAddressSearchBean condition){
		collectAddressDao.deleteCollectAddressByCondition(condition);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void batchRemoveCollectAddressByExample(List<CollectAddress> list){
		collectAddressDao.batchDeleteCollectAddressByExample(list);
	}
	
	public PageModel queryCollectAddressBySql(String where,int offset,int limit){
		//condition.buildSql();//只用orderSql
		PageModel pm=new PageModel();
		pm.setOffset(offset);
		pm.setPageSize(limit);
		pm.setCount(collectAddressDao.getCollectAddressCountByWhere(where));
		pm.setData(collectAddressDao.getCollectAddressListByWhere(where,offset,limit));
		return pm;
	}
	
	public PageModel queryCollectAddressByCondition(CollectAddressSearchBean condition){
		PageModel pm=new PageModel();
		pm.setOffset(condition.getStart());
		pm.setPageSize(condition.getCount());
		pm.setCount(collectAddressDao.getCollectAddressCountByCondition(condition));
		pm.setData(collectAddressDao.getCollectAddressListByCondition(condition));
		return pm;
	}
	
	public List<CollectAddress> queryCollectAddressListByWhere(String where){
		return collectAddressDao.getCollectAddressListBySql(where);
	}
	
	public List<CollectAddress> queryCollectAddressListByExample(CollectAddress collectAddress){
		return collectAddressDao.getCollectAddressListByExample(collectAddress);
	}
	
	public List<CollectAddress> getCollectAddressByCondition(CollectAddressSearchBean condition){
		return collectAddressDao.getCollectAddressByCondition(condition);
	}
	
	public List<CollectAddress> queryCollectAddressListByCondition(CollectAddressSearchBean condition){
		return collectAddressDao.getCollectAddressListByCondition(condition);
	}
	
	public void modifyCollectAddressBySql(String sql){
		collectAddressDao.updateCollectAddressByWhere(sql);
	}
	
	public void modifyCollectAddressByCondition(CollectAddressSearchBean condition){
		collectAddressDao.updateCollectAddress(condition);
	}
	
	public void removeCollectAddressBySql(String sql){
		collectAddressDao.deleteCollectAddressByWhere(sql);
	}
	
	public int getCollectAddressCountBySql(String sql){
		return collectAddressDao.getCollectAddressCountByWhere(sql);
	}
	
	public int getCollectAddressCountByExample(CollectAddress collectAddress){
		return collectAddressDao.getCollectAddressCountByExample(collectAddress);
	}
	
	public int getCollectAddressCountByCondition(CollectAddressSearchBean condition){
		return collectAddressDao.getCollectAddressCountByCondition(condition);
	}
	
	public Map<String,Object> getCollectAddressColumnByCondition(CollectAddressSearchBean condition){
		return collectAddressDao.getCollectAddressColumnByCondition(condition);
	}
	
	public void updateCollectAddressByExample(CollectAddress collectAddress){
		collectAddressDao.updateCollectAddressByExample(collectAddress);
	}
}
