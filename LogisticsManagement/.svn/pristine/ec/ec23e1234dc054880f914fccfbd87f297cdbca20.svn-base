package com.neusoft.depotmanage.depot.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.depotmanage.depot.model.Depot;
import com.neusoft.test.BaseTest;

public class DepotServiceImplTest extends BaseTest{

	@Autowired
	private DepotService service;
	
	@Test
	public void testQueryAll() {
		Depot d = new Depot();
		List<Depot> list = service.queryAll(d);
		for(Depot i: list){
			System.out.println(i);
		}
		assertTrue(list!=null);
	}

//	@Test
//	public void testQueryById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAdd() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}

}
