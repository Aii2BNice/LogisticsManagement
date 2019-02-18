<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-系统管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png"
	href="<%=request.getContextPath()%>/assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="<%=request.getContextPath()%>/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/assets/js/app.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<style type="text/css">
h2 {
	position: relative;
	left: 400px;
	top: -15px;
}

table {
	width: 80%;
	position: relative;
	left: 70px;
	top: -30px;
}

table tr td {
	width: 50%;
}
#tab1 tr td{
	width: auto;
}
#select{
	width: 200px;
}
</style>
<script type="text/javascript">
	$(function(){
		if($("#select").val()==0){
			$("#toUnsubscribe").css("display","none");
		}
		$("#select").change(function(){
			if($("#select").val()==0){
				$("#toUnsubscribe").css("display","none");
				$("#toRetuen").css("display","none");
				$("#toExchange").css("display","none");
			}
			if($("#select").val()==2 || $("#select").val()==0){
				$("#toUnsubscribe").css("display","inline");
				$("#toRetuen").css("display","none");
				$("#toExchange").css("display","none");
			}
			if($("#select").val()==3){
				$("#toExchange").css("display","inline");
				$("#toUnsubscribe").css("display","none");
				$("#toRetuen").css("display","none");
			}
			if($("#select").val()==4){
				$("#toRetuen").css("display","inline");
				$("#toUnsubscribe").css("display","none");
				$("#toExchange").css("display","none");
			}
		});	
		$("#toExchange").click(function(){
			var $orderId = $("#orderId").text();
			location.href = "<%=request.getContextPath() %>/toExchange.action?orderId="+$orderId;
		});
		$("#toRetuen").click(function(){
			var $orderId = $("#orderId").text();
			location.href = "<%=request.getContextPath() %>/toReturn.action?orderId="+$orderId;
		});
	})
</script>
</head>
<body>

	<div id="main">
		<!-- 右侧主界面   -->
		<div class="admin-content" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">售后管理</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 客户服务中心 ><a href="#">订单管理</a> ><a href="#">售后管理</a></dl>
			</div>
			<h2>售后管理</h2>
			<br />
			<br />
			<table id="tab1" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr>
					<td>订单编号</td>
					<td>商品名</td>
					<td>商品数量</td>
					<td>订单价格</td>
					<td>订单状态</td>
					<td>订单类型</td>
					<td>客户名</td>
					<td>联系方式</td>
				</tr>
				<tr>
					<td id="orderId">${orders.orderId}</td>
					<td>${orders.productName}</td>
					<td>${orders.shopNum}</td>
					<td>${orders.prderPrice}</td>
					<td>${orders.orderStateName}</td>
					<td>${orders.orderTypeName}</td>
					<td>${orders.cname}</td>
					<td>${orders.receiveTel}</td>
				</tr>
			</table>
			<br />
			<br />
			<form action="<%=request.getContextPath()%>/updateorderfrom.action" method="post">
				<table id="result"
					class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>订单类型</td>
						<td>
							<input type="hidden" name="orderId" value="${orders.orderId}"/>
							<input type="hidden" name="uname" value="${username}"/>
							<input type="hidden" name="shopId" value="${orders.shopId}"/>
							<select id="select" name="orderTypeId">
								<option value="0">--请选择--</option>
								<option value="2">退订</option>
								<option value="3">换货</option>
								<option value="4">退货</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input id="toUnsubscribe" type="submit" value="退订订单" class="button-style"/>
							<input id="toExchange" type="button" value="生成换货单" style="display: none;" class="button-style"/>
							<input id="toRetuen" type="button" value="生成退货单" style="display: none;" class="button-style"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href="<%=request.getContextPath()%>/customer/orderform/queryorder.jsp">返回</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
<script type="text/javascript">
	var msg = "<%=request.getAttribute("msg") %>";
	if(msg!="null"){
		alert(msg);
	}
</script>
</body>
</html>