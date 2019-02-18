package com.neusoft.pszxgl.productclassone.model;

import java.util.List;

/**
 * 商品一级分类dao层接口
 */
public interface ProductClassOneMapper {
	List<ProductClassOne> queryAll(ProductClassOne pco);

	ProductClassOne queryById(Integer id);

	int add(ProductClassOne pco);

	int update(ProductClassOne pco);

	int delete(Integer id);
	
	List<ProductClassOne> queryAllPage(ProductClassOne pco);
	int queryCounts(ProductClassOne pco);
}
