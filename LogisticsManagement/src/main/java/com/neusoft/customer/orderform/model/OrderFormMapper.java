package com.neusoft.customer.orderform.model;

import java.util.List;
/**
 * ����Mapper�ӿ�
 * @author new
 *
 */
public interface OrderFormMapper {
	
	List<OrderForm> queryAll(OrderForm orderForm);
	OrderForm queryOrderById(Integer orderId);
	int insert(OrderForm orderForm);
	int update(OrderForm orderForm);
	int delete(Integer orderId);
	List<OrderForm> queryOrderPage(OrderForm orderform);
	int queryCounts(OrderForm orderform);
}
