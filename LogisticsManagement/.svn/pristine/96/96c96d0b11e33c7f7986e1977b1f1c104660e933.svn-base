package com.neusoft.ddzx.rwdcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ddzx.rwdcc.model.Task1;
import com.neusoft.ddzx.rwdcc.model.TaskMapper1;
/**
 * 根据id查询任务单 service
 * @author new
 *
 */
@Service
public class TaskServiceImpl implements TaskService{
	@Autowired
	private TaskMapper1 dao;
	@Override
	public List<Task1> queryByAll(Task1 t) {
		return dao.queryByAll(t);
	}
	@Override
	public Task1 queryByOrderId(Integer orderId) {
		return dao.queryByOrderId(orderId);
	}

}
