package com.neusoft.ddzx.sgdd.model;

/**
 * @author new
 *��������mapper�ӿ�
 */
public interface TaskMapper {
	public int add(Task t);
	public int queryTaskByOrderId(Integer orderId);
	public int updateTaskState(Integer orderId);
}