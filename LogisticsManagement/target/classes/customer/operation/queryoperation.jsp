<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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

.input {
	width: 310px;
}

.date {
	width: 148px;
}
#sumprice{
	color:#0078D7;
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
		<div class="admin-content" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">操作量查询</ul>
				<dl class="am-icon-home" style="float: right;">当前位置： 客户服务中心 ><a href="#">操作量管理</a> ><a href="#">操作量查询</a></dl>
			</div>
			<h2>操作量查询</h2>
			<br />
			<br />
			<form action="<%=request.getContextPath()%>/queryOperPage.action?act=query"
				method="post">
				<table
					class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td width="50%">操作类型</td>
						<td><select name="orderTypeId" class="input">
								<option value="">--请选择--</option>
								<option value="1">新订</option>
								<option value="2">退订</option>
								<option value="3">换货</option>
								<option value="4">退货</option>
						</select></td>
					</tr>
					<tr>
						<td>操作时间:</td>
						<td>
						<input class="date" type="date" name="journalBegin" value="${journal.journalBegin}"/>
						- 
						<input class="date" type="date" name="journalEnd" value="${journal.journalEnd}"/> 
						<input type="hidden" name="userName" value="${user.uname}" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="查询" class="button-style"/><br />
						</td>
					</tr>
				</table>
			</form>
			<br />
			<br />
			<table id="result"
				class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr class="table-firstline">
					<td>操作人</td>
					<td>订单编号</td>
					<td>操作</td>
					<td>操作时间</td>
				</tr>
				<c:choose>
					<c:when
						test="${empty operations || operations.size() == 0}">
						<tr>
							<td colspan="5" class="c1">暂无数据</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${operations}" var="o">
							<tr>
								<td>${o.userName}</td>
								<td>${o.orderId}</td>
								<td>${o.operation}</td>
								<td><fmt:formatDate value="${o.journaldate}" /></td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
				<tr>
					<td colspan="5" class="c1" id="sumprice">总金额:${price}</td>
				</tr>
			</table>
			<div class="ui_tb_h30">
				<div class="ui_flt" style="height: 30px; line-height: 30px;">
					共有 <span class="ui_txt_bold04">${journal.counts}</span> 条记录，当前第 <span
						class="ui_txt_bold04"> ${journal.pageNum }/${journal.pages } </span> 页
				</div>
				<div class="ui_frt">
					<!--    如果是第一页，则只显示下一页、尾页 -->
					<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
					<input type="button" value="首页" onclick="doJump(1);"class="button-style" /> 
					<input type="button" value="上一页" onclick="doJump(${journal.pageNum - 1});" class="button-style"/>
					<input type="button" value="下一页" onclick="doJump(${journal.pageNum + 1});" class="button-style"/> 
					<input type="button" value="尾页" onclick="doJump(${journal.pages});" class="button-style"/>
					<!--     如果是最后一页，则只显示首页、上一页 -->
					转到第<input type="text" id="jumpNumTxt" value="${journal.pageNum }" class="ui_input_txt01" />页 
						<input type="button" class="ui_input_btn01 button-style" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);"/>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
	function doJump(pageNum){
		var form = document.forms[0];
		form.action="<%=request.getContextPath()%>/queryOperPage.action?act=query&pageNum="+pageNum;
		form.submit();
	}
</script>
</body>
</html>