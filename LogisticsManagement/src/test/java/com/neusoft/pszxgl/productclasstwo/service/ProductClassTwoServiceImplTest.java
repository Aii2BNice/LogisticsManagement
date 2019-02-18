package com.neusoft.pszxgl.productclasstwo.service;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwo;
import com.neusoft.test.BaseTest;

public class ProductClassTwoServiceImplTest extends BaseTest{
	
	@Autowired
	ProductClassTwoService service;
	
	//@Test
	public void testQueryAll() {
		List<ProductClassTwo> list = service.queryAll(null);
		for (ProductClassTwo p : list) {
			System.out.println(p);
		}
		assertTrue(list!=null);
	}

	//@Test
	public void testQueryById() {
		ProductClassTwo pct = new ProductClassTwo(11, null,new ProductClassOne());
		ProductClassTwo id = service.queryById(pct.getId());
		System.out.println(id);
		assertTrue(id!=null);
	}

	//@Test
	public void testAdd() {
		ProductClassTwo pct = new ProductClassTwo(15, "15",new ProductClassOne(1,null));
		int i = service.add(pct);
		System.out.println(i);
		assertTrue(i!=0);
		
	}

	//@Test
	public void testUpdate() {
		ProductClassTwo pct = new ProductClassTwo(15, "155", new ProductClassOne(1,null));
		int i = service.update(pct);
		System.out.println(i);
		assertTrue(i!=0);
	}

	//@Test
	public void testDelete() {
		ProductClassTwo pct = new ProductClassTwo(15, "155",new ProductClassOne(1,null));
		int i = service.delete(pct.getId());
		System.out.println(i);
		assertTrue(i!=0);
	}

}
