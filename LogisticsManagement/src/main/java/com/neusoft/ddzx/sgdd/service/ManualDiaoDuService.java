package com.neusoft.ddzx.sgdd.service;

import java.util.List;

import com.neusoft.ddzx.sgdd.model.Allocate;
import com.neusoft.ddzx.sgdd.model.Depot1;
import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.model.Task;

/**
 * 手工调度 service接口
 * @author new
 *
 */
public interface ManualDiaoDuService {
	//根据订单状态查询订单
	public List<Order> queryByStateId(Order o);
	//修改订单状态为已配送
	public int update(Integer stateId);
	//增加调拨单
	public int add(Allocate a);
	//增加任务单
	public int add(Task t);
	//根据订单号查询订单
	public Order queryByOrderId(Integer orderId);
	//查询库房
	public List<Depot1> queryDepot();
	//根据订单id查询任务单id 
	public int queryTaskByOrderId(Integer orderId);
	//根据订单id更改任务单状态为任务可分配
	public int updateTaskState(Integer orderId);
}
