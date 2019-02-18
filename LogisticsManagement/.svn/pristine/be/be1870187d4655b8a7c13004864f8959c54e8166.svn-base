package com.neusoft.ddzx.sgdd.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.ddzx.sgdd.model.Allocate;
import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.model.Task;
import com.neusoft.test.BaseTest;

public class ManualDiaoDuServiceImplTest extends BaseTest{
	@Autowired
	private ManualDiaoDuService service;
	//@Test
	public void testQueryByStateId() {
		
		
		}

	@Test
	public void testUpdate() {
	    int i=service.update(1);
	    System.out.println(i);
	}

	//@Test
	public void testAddAllocate() {
		int i=service.add(new Allocate(1,147,1,1,1,new Date(),new Date(),1,1));
		System.out.println(i);
	}

	//@Test
	public void testAddTask() {
		int i=service.add(new Task(1,1001,2001,1,1,new Date(),1,1,"mmm",new Date()));
	}

}
