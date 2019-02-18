package com.neusoft.pszxgl.product.model;

import java.util.List;

/**
 * 商品dao层接口
 */
public interface ProductMapper {
	List<Product> queryAll(Product pro);
	
	List<Product> queryAllProduct(Product pro);
	
	Product queryById(Integer id);

	int add(Product pro);

	int update(Product pro);

	int delete(Integer id);
	
	List<Product> queryAllPage(Product pco);
	int queryCounts(Product pco);
}
