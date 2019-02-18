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
	table{
	width:500px;
	position:relative;
	left:160px;
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
			<ul class="am-icon-flag on">配送员
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 >
				<a href="<%=request.getContextPath()%>/fzgl/taskoperation/taskallocation.jsp">任务分配</a>>
				<a href="#">配送员</a>
			</dl>
		</div>
		<form class="am-g" id="formT" method="post">
		<table id="tb" width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr class="table-firstline">
				<th></th>
				<th>id</th>
				<th>姓名</th>
				<th>状态</th>
			</tr>
			
			<c:forEach items="${deliverP}" var="u">
				<tr>
					<td><input type="radio" name="deliver"></td>
					<td>${u.deliverId}</td>
					<td>${u.deliverName}</td>
					<c:if test="${u.deliverState==0}">
					<td style="color:green">可分配</td> 
					</c:if>
					<c:if test="${u.deliverState==1}">
					<td style="color:red">配送中..</td>
					</c:if>
					<!--隐藏的任务单号  -->
					<td>${taskformId}</td>
				</tr>
			
			</c:forEach>
			<tr>
				<td colspan="4">
					<input class="button-style" type="button" value="任务分配"/>
				</td>
			</tr>
		</table>
		</div>
	</div>
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<script>
$(function(){
	/*把状态为'配送中..'的单选按钮隐藏  */
	$("#tb tr").each(function(){
	var t= $(this).children("td:eq(3)").text()
	var f="配送中..";		
		if(t==f){
			$(this).children("td:first").children("input").hide()
		}
	/*将最后一列的任务单号隐藏，用last会把按钮一起隐藏  */
	$(this).children("td:eq(4)").hide()
	
	})
	//点击button获取被选中单选按钮的这一行的值，传给Controller
	$(":button").click(function(){
		
		var deliverId=$(":radio[name='deliver']:checked").parent().parent().children("td:eq(1)").text();
		var deliverName=$(":radio[name='deliver']:checked").parent().parent().children("td:eq(2)").text();
		var taskFormState=$(":radio[name='deliver']:checked").parent().parent().children("td:eq(3)").text();
		var taskFormId=$(":radio[name='deliver']:checked").parent().parent().children("td:eq(4)").text();
		
		var value=deliverId+","+deliverName+","+taskFormState+","+taskFormId;
		location.href="<%=request.getContextPath()%>/addUpdate.action?value="+value;
		
	})
	
	
})
</script>
</body>
</html>