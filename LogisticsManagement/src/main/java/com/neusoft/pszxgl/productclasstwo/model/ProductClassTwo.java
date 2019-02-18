package com.neusoft.pszxgl.productclasstwo.model;

import java.io.Serializable;

import com.neusoft.pszxgl.productclassone.model.ProductClassOne;

/**
 * 商品二级分类信息 
 * id:商品二级分类编号 
 * name:商品二级分类名称 
 * pco:商品一级分类对象
 */
public class ProductClassTwo implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	//增加分页相关的属性begin
	private int pageNum; //当前第几页数据
	private int pageCounts=5; //每页多少条记录
	private int pages; //一共有多少页
	private int counts; //一共有多少条记录
	//增加分页相关的属性end
	
	/*商品一级分类*/
	private ProductClassOne pco;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageCounts() {
		return pageCounts;
	}

	public void setPageCounts(int pageCounts) {
		this.pageCounts = pageCounts;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public ProductClassTwo() {
		super();
	}

	public ProductClassTwo(Integer id, String name, ProductClassOne pco) {
		super();
		this.id = id;
		this.name = name;
		this.pco = pco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductClassOne getPco() {
		return pco;
	}

	public void setPco(ProductClassOne pco) {
		this.pco = pco;
	}

	@Override
	public String toString() {
		return "ProductClassTwo [id=" + id + ", name=" + name + ", pco=" + pco + "]";
	}
	
	

}
