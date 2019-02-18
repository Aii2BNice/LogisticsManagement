package com.neusoft.ddzx.sgdd.service;

import java.util.List;

import com.neusoft.ddzx.sgdd.model.Allocate;
import com.neusoft.ddzx.sgdd.model.Depot1;
import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.model.Task;

/**
 * �ֹ����� service�ӿ�
 * @author new
 *
 */
public interface ManualDiaoDuService {
	//���ݶ���״̬��ѯ����
	public List<Order> queryByStateId(Order o);
	//�޸Ķ���״̬Ϊ������
	public int update(Integer stateId);
	//���ӵ�����
	public int add(Allocate a);
	//��������
	public int add(Task t);
	//���ݶ����Ų�ѯ����
	public Order queryByOrderId(Integer orderId);
	//��ѯ�ⷿ
	public List<Depot1> queryDepot();
	//���ݶ���id��ѯ����id 
	public int queryTaskByOrderId(Integer orderId);
	//���ݶ���id��������״̬Ϊ����ɷ���
	public int updateTaskState(Integer orderId);
}