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
</head>
<body>

	<div id="main">

		<!-- 右侧主界面   -->
		<div class="admin-content admin-biaogelist" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">查询权限</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 系统管理 ><a href="#">权限管理</a> ><a href="#">查询权限</a></dl>
			</div>
			<h2>权限信息查询</h2><br /><br />
			<form action="<%=request.getContextPath()%>/querypower.action"
				method="post">
				<table class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>权限编号:</td>
						<td><input type="text" name="powerid" value="${powerid}"/></td>
					</tr>
					<tr>
						<td>权限名称:</td>
						<td><input type="text" name="powername" value="${powername}"/></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="查询权限" class="button-style"/><br />
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<a href="<%=request.getContextPath()%>/system/power/addpower.jsp">添加权限</a>
						</td>
					</tr>
				</table>
			</form>
			<br /><br />
			<table id="result" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr class="table-firstline">
					<td>权限编号</td>
					<td>权限名称</td>
					<td>操作</td>
				</tr>
				<c:choose>
					<c:when
						test="${empty sessionScope.powers || sessionScope.powers.size() == 0}">
						<tr>
							<td colspan="3" class="c1">暂无数据</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${sessionScope.powers}" var="p">
							<tr>
								<td>${p.powerid}</td>
								<td>${p.powername}</td>
								<td>
									<button value="${p.powerid},${p.powername}" onclick="doUpdate(this)" class="am-btn am-btn-default am-btn-xs am-text-success am-round">修改</button>
									<button value="${p.powerid}" onclick="doDelete(this)" class="am-btn am-btn-default am-btn-xs am-text-success am-round">删除</button>
								</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>
		</div>
	</div>
<script type="text/javascript">
	
	function doUpdate(obj){
		var values = obj.value;
		location.href = "<%=request.getContextPath() %>/updatepower.action?act="+values;
	}

	function doDelete(obj){
		var powerid = obj.value;
		if(confirm("确定要删除权限编号为"+powerid+"的权限吗?")){
			location.href = "<%=request.getContextPath() %>/deletepower.action?powerid="+powerid;
			return true;
		}else{
			return false;
		}
	}

	var msg = "<%=request.getAttribute("msg") %>";
	if(msg!="null"){
		alert(msg);
	}
	
</script>
</body>
</html>