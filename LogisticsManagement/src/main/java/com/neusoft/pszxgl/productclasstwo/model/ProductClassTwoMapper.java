package com.neusoft.pszxgl.productclasstwo.model;

import java.util.List;

/**
 * 商品二级分类dao层接口
 */
public interface ProductClassTwoMapper {
	List<ProductClassTwo> queryAll(ProductClassTwo pct);

	ProductClassTwo queryById(Integer id);

	int add(ProductClassTwo pct);

	int update(ProductClassTwo pct);

	int delete(Integer id);
	
	List<ProductClassTwo> queryAllPage(ProductClassTwo pct);
	int queryCounts(ProductClassTwo pct);

}
