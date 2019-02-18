<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
<title>detail</title>
<style type="text/css">
table{
	position:relative;
	left:70px;
}
table tr td{
	height:25px;
	padding:2px;
}
</style>
</head>

<body>
	<div class="admin-biaogelist">
		<div class="listbiaoti am-cf">
			<ul class="am-icon-flag on">任务单详情
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 ><a href="<%=request.getContextPath()%>/fzgl/taskform/taskformquery.jsp">任务单管理</a>>
				<a href="#">任务单详情</a>
			</dl>

		</div>
		<div class="am-g">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>任务单号</td>
				<td>
					${tf.id}
				</td>
				
			</tr>
			<tr>
				<td>订单号</td>
				<td>
					${tf.orderId}
				</td>
			</tr>
			<tr>
				<td>处理分站</td>
				<td>
					${tf.substationId}
				</td>
			</tr>
			<tr>
				<td>生成日期</td>
				<td>
				<fmt:formatDate value="${tf.taskStartDate}"/>	
				</td>
			</tr>
			<tr>
				<td>商品编号</td>
				<td>
					${tf.shopId}
				</td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td>
					${tf.shopNum}
				</td>
			</tr>
			<tr>
				<td>操作人员</td>
				<td>
					${tf.operator}
				</td>
			</tr>
			<tr>
				<td>操作时间</td>
				<td>
				<fmt:formatDate value="${tf.operationTime}"/>	
				</td>
			</tr>
			<tr>
				<td>任务类型编号</td>
				<td>
					${tf.taskTypeId}
				</td>
			</tr>
			<tr>
				<td>任务类型</td>
				<td>
					${tf.typeName}
				</td>
			</tr>
			<tr>
				<td>任务状态编号</td>
				<td>
					${tf.taskStateId}
				</td>
			</tr>
			<tr>
				<td>任务状态</td>
				<td>
					${tf.stateName}
				</td>
			</tr>
		</table>
		</div>
	</div>

</body>
</html>