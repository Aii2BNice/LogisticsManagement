<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">

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
      <ul class="am-icon-flag on"> 查询分站可领用发票</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">分站可领用发票查询</a></dl>
      
    </div>
	<form class="am-g" action="<%=request.getContextPath()%>/updatekehu.action" method="post">
		
		
	
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<c:forEach items="${list}" var="u">
			<tr >
				<td >发票id</td>
				<td ><input type="text" name="id" value="${u.id}" readonly="readonly"/></td>
				
			</tr>
			
				<tr>
					<td>客户领用日期</td>
					<td><input type="date" name="customerDate"/></td>	
				</tr>
				<tr>
					<td>任务单号</td>
					<td><input type="text" name="taskId"/></td>	
				</tr>
				<tr>
					<td>配送员id</td>
					<td><input type="text" name="deliverId"/></td>	
				</tr>
				<tr>
					<td>备注</td>
					<td><input type="text" name="remark"/></td>	
				</tr>
				<tr>
					<td>操作</td>
					<td><input type="submit" value="领用"/></td>
				</tr>
			
			</c:forEach>
		</table>
	
	</form>
</div>
</body>
</html>