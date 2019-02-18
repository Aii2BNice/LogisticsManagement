package com.neusoft.pszxgl.product.service;

import static org.junit.Assert.assertTrue;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.neusoft.pszxgl.product.model.Product;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwo;
import com.neusoft.pszxgl.supplier.model.Supplier;
import com.neusoft.test.BaseTest;

public class ProductServiceImplTest extends BaseTest{
	
	@Autowired
	ProductService sevice;
	
	//@Test
//	public void testQueryAll() {
//		List<Product> list = sevice.queryAll(null);
//		for (Product p : list) {
//			System.out.println(p);
//		}
//		assertTrue(list!=null);
//	}
//
//	//@Test
//	public void testQueryById() {
//		Product pro ;= new Product(1111, null, null, null, 0, 0, 0, null, null, null, null, null, null, new ProductClassOne(), new ProductClassTwo(), new Supplier());
//		Product id = sevice.queryById(pro.getId());
//		System.out.println(id);
//		assertTrue(id!=null);
//	}
//
//	//@Test
//	public void testAdd() {
//		//Product pro = new Product(1111,"1","1",1,1,1,1,"1","1",new Date(),"1",1,1,new ProductClassOne(), new ProductClassTwo(12,null,new ProductClassOne()), new Supplier(1001,null,null,null,null,null,null,null,1,null,null));
//		int i = sevice.add(pro);
//		System.out.println(i);
//		assertTrue(i!=0);
//	}
//
//	//@Test
//	public void testUpdate() {
//		//Product pro = new Product(1111,"123","1",1,1,1,1,"1","1",new Date(),"1",1,1,new ProductClassOne(), new ProductClassTwo(12,null,new ProductClassOne()), new Supplier(1001,null,null,null,null,null,null,null,1,null,null));
//		int i = sevice.update(pro);
//		System.out.println(i);
//		assertTrue(i!=0);
//	}
//
//	//@Test
//	public void testDelete() {
//		//Product pro = new Product(1111, null, null, null, 0, 0, 0, null, null, null, null, null, null, new ProductClassOne(), new ProductClassTwo(), new Supplier());
//		int i = sevice.delete(pro.getId());
//		System.out.println(i);
//		assertTrue(i!=0);
//	}

}
