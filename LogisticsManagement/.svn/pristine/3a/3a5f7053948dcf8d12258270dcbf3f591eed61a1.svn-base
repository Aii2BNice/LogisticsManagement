package com.neusoft.pszxgl.productclasstwo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwo;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwoMapper;

/**
 * 商品二级分类管理 Service实现类
 */
@Service
public class ProductClassTwoServiceImpl implements ProductClassTwoService{
	
	@Autowired
	private ProductClassTwoMapper dao;
	
	/**
	 * 查询全部数据功能
	 */
	@Override
	public List<ProductClassTwo> queryAll(ProductClassTwo pct) {
		return dao.queryAll(pct);
	}
	
	
	/**
	 * 通过ID查询功能
	 */
	@Override
	public ProductClassTwo queryById(Integer id) {
		return dao.queryById(id);
	}
	
	
	/**
	 * 增加数据功能
	 */
	@Override
	public int add(ProductClassTwo pct) {
		return dao.add(pct);
	}
	
	
	/**
	 * 修改数据功能
	 */
	@Override
	public int update(ProductClassTwo pct) {
		return dao.update(pct);
	}
	
	
	/**
	 * 删除数据功能
	 */
	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}


	@Override
	public List<ProductClassTwo> queryAllPage(ProductClassTwo pct) {
		return dao.queryAllPage(pct);
	}


	@Override
	public int queryCounts(ProductClassTwo pct) {
		return dao.queryCounts(pct);
	}

}
