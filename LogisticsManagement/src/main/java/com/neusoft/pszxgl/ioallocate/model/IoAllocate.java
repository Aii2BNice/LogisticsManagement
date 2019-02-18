package com.neusoft.pszxgl.ioallocate.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.neusoft.customer.orderform.model.OrderForm;
import com.neusoft.pszxgl.product.model.Product;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwo;
import com.neusoft.pszxgl.supplier.model.Supplier;

/**
 * 进/退 货调度单信息 
 * id:调度单编号 
 * supplierId:供应商编号 
 * supplierName:供应商名称 
 * shopId:商品编号
 * shopName:商品名称 
 * shopTypeId:商品类型编号 
 * shopTypeNameOne:商品类型一级分类名称
 * shopTypeNameTwo:商品类型二级分类名称 
 * shopCount:商品数量 
 * total:商品总价
 * type:订单类型：1为购货单，0为退货单 
 * allodcateDate:订单生产日期
 */
public class IoAllocate  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private double total;
	private Integer type;
	private Integer count;
	private Integer shopid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:ss")
	private Date allocateDate;
	
	//增加分页相关的属性begin
	private int pageNum; //当前第几页数据
	private int pageCounts=5; //每页多少条记录
	private int pages; //一共有多少页
	private int counts; //一共有多少条记录
	//增加分页相关的属性end
	
	
	private OrderForm orderform;
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
	private Supplier sup;
	private Product pro;
	private ProductClassTwo pctt;
	private ProductClassOne pcoo;
	public IoAllocate() {
		super();
	}
	
	public IoAllocate(Integer id, double total, Integer type, Integer count, Integer shopid, Date allocateDate,
			int pageNum, int pageCounts, int pages, int counts, OrderForm orderform, Supplier sup, Product pro,
			ProductClassTwo pctt, ProductClassOne pcoo) {
		super();
		this.id = id;
		this.total = total;
		this.type = type;
		this.count = count;
		this.shopid = shopid;
		this.allocateDate = allocateDate;
		this.pageNum = pageNum;
		this.pageCounts = pageCounts;
		this.pages = pages;
		this.counts = counts;
		this.orderform = orderform;
		this.sup = sup;
		this.pro = pro;
		this.pctt = pctt;
		this.pcoo = pcoo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getShopid() {
		return shopid;
	}
	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getAllocateDate() {
		return allocateDate;
	}
	public void setAllocateDate(Date allocateDate) {
		this.allocateDate = allocateDate;
	}
	public OrderForm getOrderform() {
		return orderform;
	}
	public void setOrderform(OrderForm orderform) {
		this.orderform = orderform;
	}
	public Supplier getSup() {
		return sup;
	}
	public void setSup(Supplier sup) {
		this.sup = sup;
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	public ProductClassTwo getPctt() {
		return pctt;
	}
	public void setPctt(ProductClassTwo pctt) {
		this.pctt = pctt;
	}
	public ProductClassOne getPcoo() {
		return pcoo;
	}
	public void setPcoo(ProductClassOne pcoo) {
		this.pcoo = pcoo;
	}
	@Override
	public String toString() {
		return "IoAllocate [id=" + id + ", total=" + total + ", type=" + type + ", count=" + count + ", shopid="
				+ shopid + ", allocateDate=" + allocateDate + ", orderform=" + orderform + ", sup=" + sup + ", pro="
				+ pro + ", pctt=" + pctt + ", pcoo=" + pcoo + "]";
	}
	
	
	

}
