<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">
<title>Insert title here</title>
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
	background:#AAA;/*不可用？？？  */
	font-size:15px;
	
}

</style>
<script>
	function decide(){
		var shop = document.getElementById("shopId");		
		//alert("txt=" + shop.options[shop.selectedIndex].text);
		document.getElementById("shopName").value = shop.options[shop.selectedIndex].text;
	}
</script>
</head>
<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on">增加库存商品</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 >
      		<a href="<%=request.getContextPath()%>/depotmanage/depot/querydepot.jsp">库房查询</a> >
      		<a href="<%=request.getContextPath()%>/depotmanage/depot/adddepot.jsp">增加库房</a></dl>
      
    </div>
<form action="<%=request.getContextPath()%>/addShopStock.action" method="post">
	<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
		<tr>
			<td>商品编号<span style="color: red">*必填</span></td>
			<td><select name="shopId" id="shopId" onchange="decide()">
				<option>---请选择---</option>
				<c:forEach items="${qwer}" var="list">
				<option value="${list.id}">${list.id}--${list.name}</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>商品名称</td>
			<td><input type="text" id="shopName" name="shopName" ></td>
		</tr>
		<tr>
			<td>库房编号<span style="color: red">*必填</span></td>
			<td><select name="depotId" id="depotId" value="${list.depotId}">
				<option>---请选择---</option>
				<c:forEach items="${rewq}" var="list">
				<option value="${list.depotId}">${list.depotId}</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>备注</td>
			<td><input type="text" name="remark"></td>
		</tr>
		<tr>
			<td>总库存量</td>
			<td><input type="text" name="amount"></td>
		</tr>
		<tr>
			<td>安全库存量</td>
			<td><input type="text" name="safeAmount"></td>
		</tr>
		<tr>
			<td>缺货数量</td>
			<td><input type="text" name="lackAmount"></td>
		</tr>
		<tr>
			<td>安排进货量</td>
			<td><input type="text" name="arrangedAmount"></td>
		</tr>
		<tr>
			<td>上次进货日期</td>
			<td><input type="date" name="lastarrangedDate"></td>
		</tr>
		<tr>
			<td>退回数量</td>
			<td><input type="text" name="returndAmount"></td>
		</tr>
		<tr>
			<td>可分配量</td>
			<td><input type="text" name="allocatableAmount"></td>
		</tr>
		<tr>
			<td>已分配量</td>
			<td><input type="text" name="allocatedAmount"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="增加 " class="button-style"/></td>
		</tr>
	</table>
</form>
</body>
</html>