package com.neusoft.fzgl.deliver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.fzgl.deliver.model.TaskFormB;
import com.neusoft.fzgl.deliver.model.Deliver;
import com.neusoft.fzgl.deliver.model.DeliverMapper;
import com.neusoft.fzgl.taskform.model.TaskForm;
import com.neusoft.fzgl.taskform.model.TaskFormMapper;
/**
 * 任务单Service实现类
 * @author new
 *
 */
@Service
public class DeliverServiceImpl implements DeliverService{

	@Autowired
	private DeliverMapper dao;
	
	@Override
	public List<TaskFormB> queryKFP(TaskFormB tf) {
		return dao.queryKFP(tf);
	}

	@Override
	public int update(TaskFormB tf) {
		return 0;
	}

	@Override
	public List<Deliver> deliverQuery(Deliver d) {
		return dao.deliverQuery(d);
	}

	

}
