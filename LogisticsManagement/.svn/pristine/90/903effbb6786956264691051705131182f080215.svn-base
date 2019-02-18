package com.neusoft.pszxgl.supplier.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.pszxgl.supplier.model.Supplier;
import com.neusoft.pszxgl.supplier.model.SupplierMapper;


/**
 * 供应商管理 Service实现类
 */
@Service
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	private SupplierMapper dao;
	
	
	/**
	 * 查询全部数据功能
	 */
	@Override
	public List<Supplier> queryAll(Supplier su) {
		return dao.queryAll(su);
	}
	
	
	/**
	 * 通过ID查询功能
	 */
	@Override
	public Supplier queryById(Integer id) {
		return dao.queryById(id);
	}
	
	
	/**
	 * 增加数据功能
	 */
	@Override
	public int add(Supplier su) {
		return dao.add(su);
	}
	
	
	/**
	 * 修改数据功能
	 */
	@Override
	public int update(Supplier su) {
		return dao.update(su);
	}
	
	
	/**
	 * 删除数据功能
	 */
	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}


	@Override
	public List<Supplier> queryAllPage(Supplier su) {
		return dao.queryAllPage(su);
	}


	@Override
	public int queryCounts(Supplier su) {
		return dao.queryCounts(su);
	}

}
