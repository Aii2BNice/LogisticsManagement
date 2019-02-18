<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.neusoft.depotmanage.shop.model.ShopStock,java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<title>物流配送平台-仓库管理</title>
<style type="text/css">
/*固定表的位置  */
table{
	position:relative;
	left:70px;
}
table tr td{
	height:25px;
	padding:2px;
}
.table-firstline{
	padding:5px;
	color:#00A600;
	/* background:#AAA;/*不可用？？？  */ */
	font-size:15px;
	
}
.box{
	width: 90%;
	margin-left: 40px;
	margin-top: 20px;
	position: relative;
	left: 100px;
}

</style>
<script>
	$(function(){
		if($("#shopId").val() == null || $("#shopId").val() == ''){
			$("#tab1").hide();
		}
	})
function doadd(){
		location.href = "<%=request.getContextPath()%>/jump.action";
	}
	
function doJump(pageNum){
	//alert(pageNum);
	var form = document.forms[0];
	form.action="<%=request.getContextPath()%>/queryShopStock.action?act=query&pageNum="+pageNum;
	form.submit();
}
</script>
</head>
<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on">库房查询</ul>
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="<%=request.getContextPath()%>/depotmanage/shopstock/queryshopstock.jsp">商品查询</a></dl>
    </div>
			<form action="<%=request.getContextPath()%>/queryShopStock.action?act=query&pageNum=1" method="post">
				${msg}
				<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>商品编号</td>
						<td><input type="text" id="shopId" name="shopId" value="${shopId}"></td>
					</tr>
					<tr>
						<td>仓库编号</td>
						<td><input type="text" name="depotId" value="${depotId}"></td>
					</tr>
					<tr>
						<td>上次进货日期</td>
						<td><input type="date" name="lastarrangedDate"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="查询" class="button-style"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" value="增加" onclick="doadd()" class="button-style"/></td>
					</tr>
				</table>
				<br />
				<c:if test="${queryShopStock==null || queryShopStock.size()==0}">
				没有查询结果
				</c:if>
				<c:if test="${queryShopStock!=null && queryShopStock.size()>0}">
					<table width="90%" class="am-table-bordered  am-table-radius am-table-striped am-table-hover">
						<tr class="table-firstline">
							<td>商品编号</td>
							<td>商品名称</td>
							<td>库房编号</td>
							<td>备注</td>
							<td>总库存量</td>
							<td>安全库存量</td>
							<td>缺货数量</td>
							<td>安排进货量</td>
							<td>上次进货日期</td>
							<td>退回数量</td>
							<td>可分配量</td>
							<td>已分配量</td>
							<td>库存表编号</td>
							<td>操作</td>
						</tr>
						<c:forEach items="${queryShopStock}" var="u">
							<tr>
								<td>${u.shopId}</td>
								<td>${u.shopName}</td>
								<td>${u.depotId}</td>
								<td>${u.remark}</td>
								<td>${u.amount}</td>
								<td>${u.safeAmount}</td>
								<td>${u.lackAmount}</td>
								<td>${u.arrangedAmount}</td>
								<td>${u.lastarrangedDate}</td>
								<td>${u.returndAmount}</td>
								<td>${u.allocatableAmount}</td>
								<td>${u.allocatedAmount}</td>
								<td>${u.shopStockId}</td>
								<td><a href="<%=request.getContextPath()%>/queryShopStockId.action?act=&shopId=${u.shopId}&depotId=${u.depotId}">修改</a>
							</tr>
						</c:forEach>
					</table>
					<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover" id="tab1">
						<tr class="table-firstline">
							<td>商品编号</td>
							<td>商品合计数量</td>
						</tr>
						
						<tr>
							<td>
								${queryShopStock[0].shopId}
							</td>
							<td>
								<%
								List<ShopStock> list = (List)request.getAttribute("queryShopStock");
								int amount = 0;
								for(ShopStock s: list){
									amount = amount + (int)(s.getAmount()==null?0:s.getAmount());
								}
								/* System.out.println("amount="+amount); */
								out.println(amount);
								%>
							</td>
						</tr>
					</table>
					<div class="box">
					<div class="" style="height: 30px; line-height: 30px;">
						共有
						<span class="">${shopStock.counts}</span>
						条记录，当前第
						<span class="">
							${shopStock.pageNum }/${shopStock.pages }
						</span>
						页
					</div>
					<div class="">
						<!--    如果是第一页，则只显示下一页、尾页 -->
							<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
							<input type="button" value="首页" onclick="doJump(1);" class="button-style"/>
							<input type="button" value="上一页" onclick="doJump(${shopStock.pageNum - 1});"  class="button-style"/>
							<input type="button" value="下一页" onclick="doJump(${shopStock.pageNum + 1});" class="button-style"/>
							<input type="button" value="尾页" onclick="doJump(${shopStock.pages});" class="button-style"/>
						
						
						
						<!--     如果是最后一页，则只显示首页、上一页 -->
						
						转到第<input type="text" id="jumpNumTxt" value="${shopStock.pageNum }" class="" />页
							 <input type="button" class="button-style" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);" />
						跳转到第
						<select onchange="doJump(this.value)">
							<%
								ShopStock shopstock = (ShopStock)request.getAttribute("shopStock");
								if(shopstock!=null){
									int pages = shopstock.getPages();
									int pageNum = shopstock.getPageNum();
									for(int i=0; i<pages; i++){
										out.print("<option value='"+(i+1)+"'");
										out.print( pageNum==(i+1) ? " selected " : "" );
										out.print(">"+(i+1)+"</option>");
									}
								}else{
									out.print("<option value='1'>1</option>");
								}
							%>
						</select>
						页
					</div>
				</div>
				</c:if>
			</form>
		</div>
</body>
</html>