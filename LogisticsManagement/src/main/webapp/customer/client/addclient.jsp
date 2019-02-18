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
</style>
<script type="text/javascript">
	$(function(){
		$("#span").css("color","red");
		$("#cname").blur(function(){
			$.ajax({
				type:'post',
				url:'${pageContext.request.contextPath}/verifictionclient.action',
				contentType:'application/json;charset=utf-8',
				data:JSON.stringify(getJsonData()),
				success:function(message){
					$("#span").empty();
					$("#span").html(message.message);
				}
			});
		});
		function getJsonData(){
			var json = {"cname":$("#cname").val()}
			return json;
		}
		
	})
</script>
</head>
<body>

	<div id="main">

		<!-- 右侧主界面   -->
		<div class="admin-content" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">新增客户</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 客户服务中心 ><a href="#">客户管理</a> ><a href="#">新增客户</a></dl>
			</div>
			<h2>添加客户</h2><br /><br />
			<form action="<%=request.getContextPath()%>/insertclient.action"
				method="post">
				<table class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>客户名:</td>
						<td>
							<input type="text" name="cname" id="cname" required="required"/><span id="span"></span>
						</td>
					</tr>
					<tr>
						<td>身份证号:</td>
						<td>
							<input type="text" name="cardId" required="required"/>
						</td>
					</tr>
					<tr>
						<td>地区:</td>
						<td>
							<input type="text" name="area" required="required"/>
						</td>
					</tr>
					<tr>
						<td>电话:</td>
						<td>
							<input type="text" name="tel" required="required"/>
						</td>
					</tr>
					<tr>
						<td>地址:</td>
						<td>
							<input type="text" name="address" required="required"/>
						</td>
					</tr>
					<tr>
						<td>邮编:</td>
						<td>
							<input type="text" name="ZipCode" required="required"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="添加" class="button-style"/>
							<input type="reset" value="清除" class="button-style"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href="<%=request.getContextPath()%>/customer/client/queryclient.jsp">返回</a>
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