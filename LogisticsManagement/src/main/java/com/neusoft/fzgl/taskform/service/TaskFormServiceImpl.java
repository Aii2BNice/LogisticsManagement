package com.neusoft.fzgl.taskform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.fzgl.taskform.model.TaskForm;
import com.neusoft.fzgl.taskform.model.TaskFormMapper;
/**
 * 任务单Service实现类
 * @author new
 *
 */
@Service
public class TaskFormServiceImpl implements TaskFormService{

	@Autowired
	private TaskFormMapper dao;
	
	@Override
	public List<TaskForm> queryAll(TaskForm tf) {
		
		return dao.queryAll(tf);
	}

	@Override
	public TaskForm queryById(Integer id) {
		
		return dao.queryById(id);
	}

	@Override
	public TaskForm update(TaskForm tf) {
		
		return dao.update(tf);
	}

	@Override
	public int queryCounts(TaskForm tf) {
		return dao.queryCounts(tf);
	}

}
