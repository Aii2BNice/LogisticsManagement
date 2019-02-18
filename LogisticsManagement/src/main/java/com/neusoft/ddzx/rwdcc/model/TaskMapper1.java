package com.neusoft.ddzx.rwdcc.model;

import java.util.List;

/**
 * 根据id查询任务单 mapper接口
 * @author new
 *
 */
public interface TaskMapper1 {
	public List<Task1> queryByAll(Task1 t);
	public Task1 queryByOrderId(Integer orderId);
}
