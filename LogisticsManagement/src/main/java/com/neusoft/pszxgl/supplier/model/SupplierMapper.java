package com.neusoft.pszxgl.supplier.model;

import java.util.List;

/**
 * 供应商dao层接口
 */
public interface SupplierMapper {
	List<Supplier> queryAll(Supplier su);

	Supplier queryById(Integer id);

	int add(Supplier su);

	int update(Supplier su);

	int delete(Integer id);
	
	List<Supplier> queryAllPage(Supplier su);
	int queryCounts(Supplier su);
}
