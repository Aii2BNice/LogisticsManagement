package com.neusoft.pszxgl.supplier.service;

import java.util.List;
import com.neusoft.pszxgl.supplier.model.Supplier;

/**
 * 供应商管理 Service
 */
public interface SupplierService {
	List<Supplier> queryAll(Supplier su);

	Supplier queryById(Integer id);

	int add(Supplier su);

	int update(Supplier su);

	int delete(Integer id);
	
	List<Supplier> queryAllPage(Supplier su);
	int queryCounts(Supplier su);
}
