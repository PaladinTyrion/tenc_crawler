package cn.com.paladintyrion.client.dao;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupportExt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import cn.com.paladintyrion.client.search.CollectAddressSearchBean;
import cn.com.paladintyrion.client.bean.CollectAddress;

/**
 * <p>Title: </p>
 *
 * <p>Description:CollectAddress</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Author: Guodang Zuo</p>
 *
 * @author AutoCreate
 * @version 1.0
 */

@Component(value="collectAddressDao")
public class CollectAddressDaoImpl extends SqlSessionDaoSupportExt implements CollectAddressDao {
	public CollectAddressDaoImpl() {
		
    }

  	public int insertCollectAddress(CollectAddress collectAddress){
    	return getSqlSession().insert("cn.com.paladintyrion.client.dao.CollectAddressDao.insertCollectAddress", collectAddress);
  	}

  	public int updateCollectAddress(CollectAddress collectAddress){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectAddressDao.updateCollectAddress", collectAddress);
  	}
  
  	public CollectAddress getCollectAddressByWhere(String where){
    	return (CollectAddress) getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressByWhere", where);
  	}
  
  	public List<CollectAddress> getCollectAddressListByWhere(String where){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressListByWhere", where);
  	}
  	
  	public List<CollectAddress> getCollectAddressListByWhere(String where,int offset,int limit){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressListByWhere", where,new RowBounds(offset, limit));
  	}
  	
  	public List<CollectAddress> getCollectAddressListByCondition(CollectAddressSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressListByCondition", condition,new RowBounds(condition.getStart(), condition.getCount()));
  	}
  
  	public List<CollectAddress> getCollectAddressListBySql(String sql){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressByWhere", sql);
  	}
  
  	public int getCollectAddressCountByWhere(String where){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressCountByWhere", where);
  	}
  	
  	public int getCollectAddressCountByExample(CollectAddress collectAddress){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressCountByExample", collectAddress);
  	}
  	
  	public int getCollectAddressCountByCondition(CollectAddressSearchBean condition){
    	return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressCountByCondition", condition);
  	}
  
  	public int updateCollectAddressByWhere(String where){
    	return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectAddressDao.updateCollectAddressByWhere", where);
  	}
  
  	public int deleteCollectAddressByWhere(String where){
   		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectAddressDao.deleteCollectAddressByWhere",where);
  	}
  	
  	public List<BatchResult> batchInsertCollectAddress(List<CollectAddress> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.insert("cn.com.paladintyrion.client.dao.CollectAddressDao.insertCollectAddress", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public CollectAddress getCollectAddressByExample(CollectAddress collectAddress){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressByExample", collectAddress);
  	}
  	
  	public List<CollectAddress> getCollectAddressListByExample(CollectAddress collectAddress){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressByExample", collectAddress);
  	}
  	
  	public int deleteCollectAddressByExample(CollectAddress collectAddress){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectAddressDao.deleteCollectAddressByExample",collectAddress);
  	}
  	
  	public int deleteCollectAddressByCondition(CollectAddressSearchBean condition){
  		return getSqlSession().delete("cn.com.paladintyrion.client.dao.CollectAddressDao.deleteCollectAddressByCondition",condition);
  	}
  	
  	public List<BatchResult> batchDeleteCollectAddressByExample(List<CollectAddress> list){
  		List<BatchResult> results=new ArrayList<BatchResult>();
  		SqlSession sqlSession=getBatchSqlSession();
  		for (int i=1;i<=list.size();i++) {
			sqlSession.delete("cn.com.paladintyrion.client.dao.CollectAddressDao.deleteCollectAddressByExample", list.get(i-1));
			if(i%1000==0)
				results.addAll(sqlSession.flushStatements());
		}
		results.addAll(sqlSession.flushStatements());
		return results;
  	}
  	
  	public List<CollectAddress> getCollectAddressByCondition(CollectAddressSearchBean condition){
    	return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressByCondition", condition);
  	}
  	
  	public int updateCollectAddress(CollectAddressSearchBean condition){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectAddressDao.updateCollectAddressByCondition", condition);
  	}
  	
  	public Map<String,Object> getCollectAddressColumnByCondition(CollectAddressSearchBean condition){
  		return getSqlSession().selectOne("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressColumnByCondition", condition);
  	}
  	
  	public List<Map<String,Object>> getCollectAddressColumnListByCondition(CollectAddressSearchBean condition){
  		return getSqlSession().selectList("cn.com.paladintyrion.client.dao.CollectAddressDao.getCollectAddressColumnByCondition", condition);
  	}
  	
  	public int updateCollectAddressByExample(CollectAddress collectAddress){
  		return getSqlSession().update("cn.com.paladintyrion.client.dao.CollectAddressDao.updateCollectAddressByExample", collectAddress);
  	}
}
