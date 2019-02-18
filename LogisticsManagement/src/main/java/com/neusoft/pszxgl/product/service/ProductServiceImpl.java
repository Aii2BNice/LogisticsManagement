package com.neusoft.pszxgl.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.pszxgl.product.model.Product;
import com.neusoft.pszxgl.product.model.ProductMapper;

/**
 * 商品管理 Service实现类
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapper dao;
	
	
	/**
	 * 查询全部数据功能
	 */
	@Override
	public List<Product> queryAll(Product pro) {
		return dao.queryAll(pro);
	}
	
	
	/**
	 * 通过ID查询功能
	 */
	@Override
	public Product queryById(Integer id) {
		return dao.queryById(id);
	}
	
	
	/**
	 * 增加数据功能
	 */
	@Override
	public int add(Product pro) {
		return dao.add(pro);
	}
	
	
	/**
	 * 修改数据功能
	 */
	@Override
	public int update(Product pro) {
		return dao.update(pro);
	}
	
	
	/**
	 * 删除数据功能
	 */
	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}

	/**
	 * 客服查询商品及库存
	 */
	@Override
	public List<Product> queryAllProduct(Product pro) {
		return dao.queryAllProduct(pro);
	}


	@Override
	public List<Product> queryAllPage(Product pco) {
		return dao.queryAllPage(pco);
	}


	@Override
	public int queryCounts(Product pco) {
		return dao.queryCounts(pco);
	}

}
