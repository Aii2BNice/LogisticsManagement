package com.neusoft.ddzx.sgdd.model;

import java.util.List;

/**
 * @author new
 *订单mapper接口
 */
public interface OrderMapper {
	//根据订单状态查询订单
	public List<Order> queryByStateId(Order o);
	//修改订单状态为已配送
	public int update(Integer stateid);
	//根据订单号查询订单
	public Order queryByOrderId(Integer orderId);
	//查询可自动调度订单
	public List<Order> queryByZd();
	//自动生成任务单
	public int zdaddtask(Order o);
}
