package com.neusoft.depotmanage.depot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.depotmanage.depot.model.Depot;
import com.neusoft.depotmanage.depot.model.DepotMapper;

/**
 * 库房信息管理service实现类
 * @author new
 *
 */
@Service
public class DepotServiceImpl implements DepotService{

	@Autowired
	private DepotMapper dao;
	
	@Override
	public List<Depot> queryAll(Depot d) {
		return dao.queryAll(d);
	}

	@Override
	public Depot queryById(Integer id) {
		return dao.queryById(id);
	}

	@Override
	public int add(Depot d) {
		return dao.add(d);
	}

	@Override
	public int update(Depot d) {
		return dao.update(d);
	}

	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}

	
}
