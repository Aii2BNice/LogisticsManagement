package com.neusoft.ddzx.zzdd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.model.OrderMapper;
import com.neusoft.ddzx.zzdd.model.ZDAllocate;
import com.neusoft.ddzx.zzdd.model.ZDAllocateMapper;
@Service
public class OrderZdServiceImpl implements OrderZdService{
	@Autowired
	private OrderMapper dao;
	@Autowired
	private ZDAllocateMapper dao1;
	@Override
	public List<Order> queryByZd() {
		return dao.queryByZd();
	}
	@Override
	public int zdaddtask(Order o) {
		return dao.zdaddtask(o);
	}
	@Override
	public int addAllocate(ZDAllocate al) {
		return dao1.addAllocate(al);
	}

}
