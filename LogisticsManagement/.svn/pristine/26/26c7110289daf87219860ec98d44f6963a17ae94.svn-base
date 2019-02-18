package com.neusoft.system.power.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.system.power.model.Power;
import com.neusoft.system.power.model.PowerMapper;
/**
 * 权限Service接口实现类
 * @author DYQ
 *
 */
@Service
public class PowerServiceImpl implements PowerService {
	
	@Autowired
	private PowerMapper dao;
	
	@Override
	public List<Power> queryAll(Power power) {
		return dao.queryAll(power);
	}

	@Override
	public int insert(Power power) {
		return dao.insert(power);
	}

	@Override
	public int update(Power power) {
		return dao.update(power);
	}

	@Override
	public int delete(Integer powerid) {
		return dao.delete(powerid);
	}

}
