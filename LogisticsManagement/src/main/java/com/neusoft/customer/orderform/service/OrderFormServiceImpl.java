package com.neusoft.customer.orderform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.customer.orderform.model.OrderForm;
import com.neusoft.customer.orderform.model.OrderFormMapper;
/**
 * ����Serviceʵ����
 * @author DYQ
 *
 */
@Service
public class OrderFormServiceImpl implements OrderFormService{

	@Autowired
	private OrderFormMapper dao;
	
	@Override
	public List<OrderForm> queryAll(OrderForm orderForm) {
		return dao.queryAll(orderForm);
	}

	@Override
	public int insert(OrderForm orderForm) {
		return dao.insert(orderForm);
	}

	@Override
	public int update(OrderForm orderForm) {
		return dao.update(orderForm);
	}

	@Override
	public int delete(Integer orderId) {
		return dao.delete(orderId);
	}

	@Override
	public OrderForm queryOrderById(Integer orderId) {
		return dao.queryOrderById(orderId);
	}

	@Override
	public List<OrderForm> queryOrderPage(OrderForm orderform) {
		return dao.queryOrderPage(orderform);
	}

	@Override
	public int queryCounts(OrderForm orderform) {
		return dao.queryCounts(orderform);
	}

}
