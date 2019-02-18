package com.neusoft.pszxgl.productclassone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclassone.model.ProductClassOneMapper;

/**
 * 商品一级分类管理 Service实现类
 */
@Service
public class ProductClassOneServiceImpl implements ProductClassOneService{
	
	@Autowired
	private ProductClassOneMapper dao;
	
	/**
	 * 查询全部数据功能
	 */
	@Override
	public List<ProductClassOne> queryAll(ProductClassOne pco) {
		return dao.queryAll(pco);
	}
	
	
	/**
	 * 通过ID查询功能
	 */
	@Override
	public ProductClassOne queryById(Integer id) {
		return dao.queryById(id);
	}
	
	
	/**
	 * 增加数据功能
	 */
	@Override
	public int add(ProductClassOne pco) {
		return dao.add(pco);
	}
	
	
	/**
	 * 修改数据功能
	 */
	@Override
	public int update(ProductClassOne pco) {
		return dao.update(pco);
	}
	
	
	/**
	 * 删除数据功能
	 */
	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}


	@Override
	public int queryCounts(ProductClassOne pco) {
		return dao.queryCounts(pco);
	}


	@Override
	public List<ProductClassOne> queryAllPage(ProductClassOne pco) {
		return dao.queryAllPage(pco);
	}

}
