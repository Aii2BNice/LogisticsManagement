package com.neusoft.pszxgl.productclassone.model;

import java.io.Serializable;

/**
 * 商品一级分类信息
 * id:商品一级分类编号
 * name:商品一级分类名称
 */
public class ProductClassOne implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	//增加分页相关的属性begin
	private int pageNum; //当前第几页数据
	private int pageCounts=5; //每页多少条记录
	private int pages; //一共有多少页
	private int counts; //一共有多少条记录
	//增加分页相关的属性end

	public ProductClassOne() {
		super();
	}

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

	public ProductClassOne(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "ProductClassOne [id=" + id + ", name=" + name + "]";
	}

}
