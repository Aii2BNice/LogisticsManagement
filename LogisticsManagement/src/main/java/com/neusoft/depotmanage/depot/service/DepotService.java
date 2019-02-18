package com.neusoft.depotmanage.depot.service;

import java.util.List;

import com.neusoft.depotmanage.depot.model.Depot;

/**
 * 库房信息管理service接口
 * @author new
 */
public interface DepotService {

	List<Depot> queryAll(Depot d);
	Depot queryById(Integer id);
	int add(Depot d);
	int update(Depot d);
	int delete(Integer id);
}
