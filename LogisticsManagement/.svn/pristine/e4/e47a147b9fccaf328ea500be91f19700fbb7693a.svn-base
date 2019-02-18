package com.neusoft.pszxgl.supplier.service;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.pszxgl.supplier.model.Supplier;
import com.neusoft.test.BaseTest;

public class SupplierServiceImplTest extends BaseTest{
	
	@Autowired
	SupplierService service;
	
	//@Test
	public void testQueryAll() {
		List<Supplier> list = service.queryAll(null);
		for (Supplier s : list) {
			System.out.println(s);
		}
		assertTrue(list!=null);
	}

	//@Test
	public void testQueryById() {
		Supplier su = new Supplier(1001, null, null, null, null, null, null, null, null, null, null);
		Supplier id = service.queryById(su.getId());
		System.out.println(id);
		assertTrue(id!=null);
	}

	//@Test
	public void testAdd() {
		Supplier su = new Supplier(15, "15", "15", "15", "15", "15", "15", "15", 116052, "15", "15");
		int i = service.add(su);
		System.out.println(i);
		assertTrue(i!=0);
	}

	//@Test
	public void testUpdate() {
		Supplier su = new Supplier(15, "155", "15", "15", "15", "15", "15", "15", 116052, "15", "15");
		int i = service.update(su);
		System.out.println(i);
		assertTrue(i!=0);
	}

	//@Test
	public void testDelete() {
		Supplier su = new Supplier(15, "155", "15", "15", "15", "15", "15", "15", 116052, "15", "15");
		int i = service.delete(su.getId());
		System.out.println(i);
		assertTrue(i!=0);
	}

}
