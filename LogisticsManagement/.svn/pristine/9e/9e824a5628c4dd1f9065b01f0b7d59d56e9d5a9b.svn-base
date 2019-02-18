package com.neusoft.fzgl.taskform.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.fzgl.taskform.model.TaskForm;
import com.neusoft.test.BaseTest;

public class TaskFormServiceImplTest extends BaseTest{
	
	@Autowired
	TaskFormService service;

	@Test
	public void testQueryAll() {
		TaskForm tf=new TaskForm(
	/*id, orderId, taskStartDate,taskEndDate, taskTypeId, taskStateId, substationId, shopId, shopNum, operator, operationTime, stateName, typeName*/
	null,null,null,null,null,null,null,null,null,null,null,null,null);
		List<TaskForm> tf2=service.queryAll(tf);
		for(TaskForm tf3:tf2){
			System.out.println(tf3);
		}
		assertTrue(tf2!=null);
	}

//	@Test
//	public void testQueryById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}

}
