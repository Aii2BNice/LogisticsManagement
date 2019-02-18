<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
<style type="text/css">
/*固定表的位置  */
table {
	position: relative;
	left: 70px;
}

table tr td {
	height: 25px;
	padding: 2px;
}

.table-firstline {
	padding: 5px;
	color: #00A600;
	background: #AAA; /*不可用？？？  */
	font-size: 15px;
}
.ip{
	width:200px
}
</style>
</head>
<body>
	<div class="admin-biaogelist">
		<div class="listbiaoti am-cf">
			<ul class="am-icon-flag on">缴款查询
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 >
				<a href="#">缴款查询</a>
			</dl>

		</div>

		<form class="am-g"
			action="<%=request.getContextPath()%>/queryPayment.action"
			method="post">
			<table width="90%"
				class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr>
					<td>开始日期</td>
					<td><input class="ip" type="date" name="taskStartDate" /></td>
					<td>结束日期</td>
					<td><input class="ip" type="date" name="taskEndDate" /></td>
				</tr>
				<tr>
					<td>配送签收单号</td>
					<td><input class="ip" type="text" name="deliverFormId" /></td>
					<td>商品名</td>
					<td><input class="ip" type="text" name="shopName" /></td>
				</tr>
				<tr>
					<td colspan="4"><input class="button-style" type="submit" value="查询" /></td>
				</tr>
			</table>

			<br>
			<c:if test="${list==null || list.size()==0}">
			没有查询结果
	</c:if>
			<c:if test="${list!=null && list.size()>0}">
				<table width="90%"
					class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr class="table-firstline">
						<th>商品配送单号</th>
						<th>商品名</th>
						<th>商品数量</th>
						<th>商品单价</th>
						<th>收款金额</th>
					</tr>
					<c:forEach items="${list}" var="u">
						<tr>
							<td>${u.deliverFormId}</td>
							<td>${u.shopName}</td>
							<td>${u.shopNum}</td>
							<td>${u.shopPrice}</td>
							<td>${u.shopPrice*u.shopNum}</td>
						</tr>

					</c:forEach>
				</table>
			</c:if>



		</form>
	</div>

</body>
</html>