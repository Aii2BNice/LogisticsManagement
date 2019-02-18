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
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
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
	width: 25%;
}

.select {
	width: 205px;
}
#clientId,#span{
	position: relative;
	left: 40px;
}
</style>
<script type="text/javascript">
	$(function(){
		$("#clientId").change(function(){
			$.ajax({
				type:'post',
				url:'${pageContext.request.contextPath}/clientMessage.action',
				contentType:'application/json;charset=utf-8',
				data:JSON.stringify(getJsonData()),
				success:function(message){
					$("#deliverAddr").val(message.address);
					$("#receiveName").val(message.cname);
					$("#receiveTel").val(message.tel);
					$("#receiveZipCode").val(message.zipCode);
				}
			});
		});
		$("#shopNum").blur(function(){
			if($("#shopNum").val()!="" && $("#shopNum").val()!=0 && $("#shopNum").val()!=null){
				if(parseInt($("#shopNum").val())>parseInt($("#amount").val())){
					alert("库存不足,将生成缺货单!");
					$("#orderStateId").val("1");
				}else{
					$("#orderStateId").val("2");
				}
				var $price = $("#price").val()*$("#shopNum").val();
				$("#prderPrice").val($price);
				$("#orderTypeId").val("1");
			}else{
				alert("购买数量不能为空");
			}
		});
		function getJsonData(){
			var json = {"clientId":$("#clientId").val()}
			return json;
		}

		var $select = $("#clientId").val();
		if($select==0){
			$("#span").empty();
			$("#span").css("color","red");
			$("#span").html("请选择客户");
			$("#submit").attr("disabled","disabled");
		}
		$("#clientId").change(function(){
			$("#span").html("");
			$("#submit").removeAttr("disabled");
			$("#clientId").css("left","0px");
		})
	})
</script>
</head>
<body>

	<div id="main">

		<!-- 右侧主界面   -->
		<div class="admin-content" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">新增订单</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 首页 ><a href="#">订单管理</a> ><a href="#">新增订单</a></dl>
			</div>
			<h2>添加订单</h2>
			<br />
			<br />
			<form action="<%=request.getContextPath()%>/insertorderform.action"
				method="post">
				<table
					class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>商品名:</td>
						<td>
							<input type="hidden" name="uname" value="${user.uname}" />
							<input type="hidden" name="shopId" value="${shopId}" /> 
							<input type="text" name="productName" id="name" value="${productName}" />
						</td>
					</tr>
					<tr>
						<td>商品价格</td>
						<td>
							<input type="text" name="price" id="price" value="${price}" />
						</td>
					</tr>
					<tr>
						<td>客户</td>
						<td>
							<select id="clientId" name="clientId" class="select">${clientOption}</select><span id="span"></span>
						</td>
					</tr>
					<tr>
						<td>库存数量</td>
						<td>
							<input type="text" name="amount" id="amount" value="${sumamount}" readonly="readonly" />
						</td>
					</tr>
					<tr>
						<td>订购数量</td>
						<td>
							<input type="number" name="shopNum" id="shopNum" required="required"/>
						</td>
					</tr>
					<tr>
						<td>订单价格</td>
						<td>
							<input type="text" name="prderPrice" id="prderPrice" required="required"/> 
							<input type="hidden" name="orderStateId" id="orderStateId" /> 
							<input type="hidden" name="orderTypeId" id="orderTypeId" />
						</td>
					</tr>
					<tr>
						<td>送货地址</td>
						<td><input type="text" name="deliverAddr" id="deliverAddr" />
						</td>
					</tr>
					<tr>
						<td>备注</td>
						<td><input type="text" name="remark" /></td>
					</tr>
					<tr>
						<td>是否开发票</td>
						<td><select name="invoice" class="select">
								<option value="0">是</option>
								<option value="1">否</option>
						</select></td>
					</tr>
					<tr>
						<td>投递分站</td>
						<td>
							<select name="substationId" class="select">
								<option value="">--请选择--</option>
								<option value="1">大连</option>
								<option value="2">长春</option>
								<option value="3">沈阳</option>
								<option value="4">北京</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>收货人</td>
						<td><input type="text" name="receiveName" id="receiveName" />
						</td>
					</tr>
					<tr>
						<td>联系方式</td>
						<td><input type="text" name="receiveTel" id="receiveTel" /></td>
					</tr>
					<tr>
						<td>邮编</td>
						<td><input type="text" name="receiveZipCode"
							id="receiveZipCode" /></td>
					</tr>
					<tr>
						<td colspan="2">
							<input id="submit" type="submit" value="添加" class="button-style"/> 
							<input type="reset" value="清除" class="button-style"/>
						</td>
					</tr>
					<tr>
						<td colspan="2"><a
							href="<%=request.getContextPath()%>/customer/product/queryproduct.jsp">返回</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
	var msg = "<%=request.getAttribute("msg")%>";
		if (msg != "null") {
			alert(msg);
		}
	</script>
</body>
</html>