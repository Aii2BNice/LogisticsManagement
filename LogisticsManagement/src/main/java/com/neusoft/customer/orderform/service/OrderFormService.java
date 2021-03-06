package com.neusoft.customer.orderform.service;

import java.util.List;

import com.neusoft.customer.orderform.model.OrderForm;
/**
 * ����Service
 * @author DYQ
 *
 */
public interface OrderFormService {

	List<OrderForm> queryAll(OrderForm orderForm);
	OrderForm queryOrderById(Integer orderId);
	int insert(OrderForm orderForm);
	int update(OrderForm orderForm);
	int delete(Integer orderId);
	List<OrderForm> queryOrderPage(OrderForm orderform);
	int queryCounts(OrderForm orderform);
}
