package com.neusoft.ddzx.sgdd.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neusoft.ddzx.sgdd.model.Allocate;
import com.neusoft.ddzx.sgdd.model.AllocateMapper;
import com.neusoft.ddzx.sgdd.model.Depot1;
import com.neusoft.ddzx.sgdd.model.DepotMapper1;
import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.model.OrderMapper;
import com.neusoft.ddzx.sgdd.model.Task;
import com.neusoft.ddzx.sgdd.model.TaskMapper;

/**
 * 手工调度 service
 * @author new
 *
 */
@Service
public class ManualDiaoDuServiceImpl implements ManualDiaoDuService{
	@Autowired
	private OrderMapper dao1;
	@Autowired
	private AllocateMapper dao2;
	@Autowired 
	private TaskMapper dao3;
	@Autowired
	private DepotMapper1 dao4;
	//根据订单状态查询订单
	@Override
	public List<Order> queryByStateId(Order o) {
		return dao1.queryByStateId(o);
	}
	//修改订单状态为已配送
	@Override
	public int update(Integer stateId) {
		return dao1.update(stateId);
	}
	//增加调拨单
	@Override
	public int add(Allocate a) {
		return dao2.add(a);
	}
	//增加任务单
	@Override
	public int add(Task t) {
		return dao3.add(t);
	}
	//根据订单号查询订单
	@Override
	public Order queryByOrderId(Integer orderId) {
		return dao1.queryByOrderId(orderId);
	}
	@Override
	public List<Depot1> queryDepot() {
		return dao4.queryDepot();
	}
	@Override
	public int queryTaskByOrderId(Integer orderId) {
		return dao3.queryTaskByOrderId(orderId);
	}
	@Override
	public int updateTaskState(Integer orderId) {
		return dao3.updateTaskState(orderId);
	}

}
