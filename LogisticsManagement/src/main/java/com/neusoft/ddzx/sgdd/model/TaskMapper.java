package com.neusoft.ddzx.sgdd.model;

/**
 * @author new
 *增加任务单mapper接口
 */
public interface TaskMapper {
	public int add(Task t);
	public int queryTaskByOrderId(Integer orderId);
	public int updateTaskState(Integer orderId);
}
