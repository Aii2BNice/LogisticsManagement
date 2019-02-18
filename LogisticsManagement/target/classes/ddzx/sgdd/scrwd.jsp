<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/button.css"/>
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
</head>
<body>

<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 生成任务单</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">任务单查询</a></dl>
      
    </div>
	
	<form class="am-g" action="<%=request.getContextPath() %>/sctask.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>任务单号</td>
				<td>
					已自动生成
				</td>
				
			</tr>
			<tr>
				<td>任务状态</td>
				<td>已调度</td>
			</tr>
			<tr>
				<td>任务类型</td>
				<td>
					<select name="taskTypeId">
					<option value="1" >正常订单</option>
					<option value="2" >修改后订单</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>订单号</td>
				<td>
					<input type="text" value="${o.orderId }" name="orderId"/>
				</td>
			</tr>
			<tr>
				<td>处理分站</td>
				<td>
					<c:if test="${o.substationId==null }">
				<select name="substationId">
				<c:forEach items="${depot }" var="d">
					<option value="${d.depotId }">${d.depotName }</option>
				</c:forEach>
				</select>
				</c:if>
				<c:if test="${o.substationId!=null }">
				<input type="text" value="${o.substationId }" name="substationId"/>
				</c:if>
				</td>
			</tr>
			<tr>
				<td>生成日期</td>
				<td>
					<input type="date" value="" name="taskDate" required="required"/>
				</td>
			</tr>
			<tr>
				<td>商品编号</td>
				<td>
					<input type="text" value="${o.shopId}" name="shopId"/>
				</td>
			</tr>
			<tr>
				<td>订单数量</td>
				<td>
					<input type="text" value="${o.shopNum}" name="shopNum"/>
				</td>
			</tr>
			<tr>
				<td>操作人员</td>
				<td>
					<input type="text" value="" name="operator" required="required"/>
				</td>
			</tr>
			<tr>
				<td>操作时间</td>
				<td>
					<input type="date" value="" name="operationTime" required="required"/>
				</td>
			</tr>
			<tr>
			<td>操作</td>
			<td><input type="submit" value="生成" class="button"/></td>
			</tr>
		</table>
	
	<br>
	
	
	</form>
</div>
</body>
</html>