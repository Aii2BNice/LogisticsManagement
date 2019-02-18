package com.neusoft.pszxgl.productclassone.service;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.test.BaseTest;


public class ProductClassOneServiceImplTest extends BaseTest{
	
	@Autowired
	ProductClassOneService service;
	
	//@Test
	public void testQueryAll() {
		List<ProductClassOne> list = service.queryAll(null);
		for (ProductClassOne p : list) {
			System.out.println(p);
		}
		assertTrue(list!=null);
	}

	//@Test
	public void testQueryById() {
		ProductClassOne pco = new ProductClassOne(2, null);
		ProductClassOne p = service.queryById(pco.getId());
		System.out.println(p);
		assertTrue(p!=null);
	}

	//@Test
	public void testAdd() {
		ProductClassOne pco = new ProductClassOne(2,"2");
		int i = service.add(pco);
		System.out.println(i);
		assertTrue(i!=0);
	}

	//@Test
	public void testUpdate() {
		ProductClassOne pco = new ProductClassOne(2,"3");
		int i = service.update(pco);
		System.out.println(i);
		assertTrue(i!=0);
	}

	//@Test
	public void testDelete() {
		ProductClassOne pco = new ProductClassOne(2,null);
		int i = service.delete(pco.getId());
		System.out.println(i);
		assertTrue(i!=0);
	}

}
