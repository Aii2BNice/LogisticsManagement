<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">
<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/assets/js/app.js"></script>
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
	.date{
		width: 148px;
	}
	.input{
		width: 306px;
	}
	.select{
		width: 306px;
	}
	.ui_tb_h30 {
		width: 80%;
		position: relative;
		left: 155px;
		font-size: 13px;
	}
</style>
</head>
<body>

	<div id="main">
		<!-- 右侧主界面   -->
		<div class="admin-content  admin-biaogelist" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">查询订单</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 客户服务中心 ><a href="#">订单管理</a> ><a href="#">查询订单</a></dl>
			</div>
			<h2>订单查询</h2><br /><br />
			<form action="<%=request.getContextPath()%>/queryorderfrom.action?act=query"
				method="post">
				<table class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td width="50%">商品名:</td>
						<td>
							<input class="input" type="text" name="productName" value="${productName}"/>
						</td>
					</tr>
					<tr>
						<td width="50%">客户名:</td>
						<td>
							<select class="select" name="clientId"> ${clientOption}</select>
						</td>
					</tr>
					<tr>
						<td width="50%">订单类型</td>
						<td>
							<select class="select" name="orderTypeId">
								<option value="">--请选择--</option>
								<option value="1">新订</option>
								<option value="2">退订</option>
								<option value="3">换货</option>
								<option value="4">退货</option>
							</select>
						</td>
					</tr>
					<tr>
						<td width="50%">订单日期:</td>
						<td>
							<input class="date" type="date" name="orderDateBegin"/>-
							<input class="date" type="date" name="orderDateEnd"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="查询订单" class="button-style"/><br />
						</td>
					</tr>
				</table>
			</form>
			<br /><br />
			<table id="result" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr  class="table-firstline">
					<td>订单编号</td>
					<td>商品名</td>
					<td>商品数量</td>
					<td>订单价格</td>
					<td>下单时间</td>
					<td>订单状态</td>
					<td>订单类型</td>
					<td>客户名</td>
					<td>联系方式</td>
					<td>操作</td>
				</tr>
				<c:choose>
					<c:when
						test="${empty sessionScope.orderforms || sessionScope.orderforms.size() == 0}">
						<tr>
							<td colspan="9" class="c1">暂无数据</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${sessionScope.orderforms}" var="o">
							<tr>
								<td>${o.orderId}</td>
								<td>${o.productName}</td>
								<td>${o.shopNum}</td>
								<td>${o.prderPrice}</td>
								<td>
									<fmt:formatDate value="${o.orderDate}"/>
								</td>
								<td>${o.orderStateName}</td>
								<td>${o.orderTypeName}</td>
								<td>${o.receiveName}</td>
								<td>${o.receiveTel}</td>
								<td>
									<button value="${o.orderId}" onclick="toDetaile(this)" class="am-btn am-btn-default am-btn-xs am-text-success am-round">详情</button>
								</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>
			<div class="ui_tb_h30">
				<div class="ui_flt" style="height: 30px; line-height: 30px;">
					共有 <span class="ui_txt_bold04">${orderForm.counts}</span> 条记录，当前第 <span
						class="ui_txt_bold04"> ${orderForm.pageNum }/${orderForm.pages } </span> 页
				</div>
				<div class="ui_frt">
					<!--    如果是第一页，则只显示下一页、尾页 -->
					<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
					<input type="button" value="首页" onclick="doJump(1);" class="button-style"/> 
					<input type="button" value="上一页" onclick="doJump(${orderForm.pageNum - 1});" class="button-style"/>
					<input type="button" value="下一页" onclick="doJump(${orderForm.pageNum + 1});" class="button-style"/> 
					<input type="button" value="尾页" onclick="doJump(${orderForm.pages});" class="button-style"/>
					<!--     如果是最后一页，则只显示首页、上一页 -->
					转到第<input type="text" id="jumpNumTxt" value="${orderForm.pageNum }" class="ui_input_txt01" class="button-style"/>页 
						<input type="button" class="ui_input_btn01 button-style" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);" />
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
	
	function toDetaile(obj){
		var orderId = obj.value;
		location.href = "<%=request.getContextPath() %>/todetails.action?orderId="+orderId;
	}

	var msg = "<%=request.getAttribute("msg") %>";
	if(msg!="null"){
		alert(msg);
	}
	
	function doJump(pageNum){
		var form = document.forms[0];
		form.action="<%=request.getContextPath()%>/queryorderfrom.action?act=query&pageNum="+pageNum;
		form.submit();
	}
	
</script>
</body>
</html>