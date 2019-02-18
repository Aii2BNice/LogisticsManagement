<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	h2{
		position: relative;
		left:400px;
		top:-15px;
	}
	table{
		width: 80%;
		position: relative;
		left:70px;
		top:-30px;
	}
	table tr td{
		width:25%;
	}
	.select{
		width: 205px;
	}
</style>
<script type="text/javascript">
	$(function(){
		$("#shopNum").blur(function(){
			var $shopNum = $("#shopNum").val();
			var $amount = $("#amount").val();
			if(parseInt($shopNum) > parseInt($amount)){
				alert("换货数量必须少于订购数量");
				$("#submit").attr("disabled","disabled");
			}
			var $price = $("#price").val();
			$("#prderPrice").val($price*$shopNum);
		});
	})
</script>
</head>
<body>

	<div id="main">

		<!-- 右侧主界面   -->
		<div class="admin-content" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">换货订单</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 客户服务中心 ><a href="#">售后管理</a> ><a href="#">换货订单</a></dl>
			</div>
			<h2>添加换货单</h2><br /><br />
			<form action="<%=request.getContextPath()%>/insertorderform.action"
				method="post">
				<table class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>商品名:</td>
						<td>
							<input type="hidden" name="uname" value="${user.uname}"/>
							<input type="hidden" name="shopId" value="${orderForm.shopId}"/>
							<input type="text" name="productName" id="name" value="${orderForm.productName}"/>
						</td>
					</tr>
					<tr>
						<td>商品价格</td>
						<td>
							<input type="text" name="price" id="price" value="${price}" readonly="readonly"/>
						</td>
					</tr>
					<tr>
						<td>客户</td>
						<td>
							<input type="hidden" name="clientId" value="${orderForm.clientId}">
							<input type="text" name="cname" value="${orderForm.cname}">
						</td>
					</tr>
					<tr>
						<td>订购数量</td>
						<td>
							<input type="text" name="amount" id="amount" value="${orderForm.shopNum}" readonly="readonly"/>
						</td>
					</tr>
					<tr>
						<td>换货数量</td>
						<td>
							<input type="text" name="shopNum" id="shopNum"  required="required"/>
						</td>
					</tr>
					<tr>
						<td>订单价格</td>
						<td>
							<input type="text" name="prderPrice" id="prderPrice" readonly="readonly"/>
						</td>
					</tr>
					<tr>
						<td>订单状态</td>
						<td>
							<input type="hidden" name="orderStateId" value="${orderForm.orderStateId}">
							<input type="text" name="orderStateName" value="${orderForm.orderStateName}">
						</td>
					</tr>
					<tr>
						<td>订单类型</td>
						<td>
							<input type="hidden" name="orderTypeId" value="3">
							<input type="text" name="orderTypeName" value="换货" />
						</td>
					</tr>
					<tr>
						<td>送货地址</td>
						<td>
							<input type="text" name="deliverAddr" id="deliverAddr" value="${orderForm.deliverAddr}"/>
						</td>
					</tr>
					<tr>
						<td>备注</td>
						<td>
							<input type="text" name="remark" value="${orderForm.remark}"/>
						</td>
					</tr>
					<tr>
						<td>是否开发票</td>
						<td>
							<input type="hidden" name="invoice" value="${orderForm.invoice}" />
							<input type="text" value="否" />
						</td>
					</tr>
					<tr>
						<td>收货人</td>
						<td>
							<input type="text" name="receiveName" id="receiveName" value="${orderForm.receiveName}"/>
						</td>
					</tr>
					<tr>
						<td>联系方式</td>
						<td>
							<input type="text" name="receiveTel" id="receiveTel" value="${orderForm.receiveTel}"/>
						</td>
					</tr>
					<tr>
						<td>邮编</td>
						<td>
							<input type="text" name="receiveZipCode" id="receiveZipCode" value="${orderForm.receiveZipCode}"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" id="submit" value="换货" class="button-style"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href="<%=request.getContextPath()%>/customer/orderform/updateorderform.jsp">返回</a>
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