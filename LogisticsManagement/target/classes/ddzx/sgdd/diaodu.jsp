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
      <ul class="am-icon-flag on"> 调度</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">任务单查询</a></dl>
      
    </div>
	
	
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				
				<td>生成任务单</td>
				<td>生成调拨单</td>
				<td>调度</td>
			</tr>
			<tr>
				
				<td>
					<button class="button" onclick="javascript:window.location.href='<%=request.getContextPath()%>/roderformquerybyorderid3.action?orderId=${o.orderId }'">生成</button>
				</td>
				<td>
					<button class="button" onclick="javascript:window.location.href='<%=request.getContextPath()%>/roderformquerybyorderid4.action?orderId=${o.orderId }'">生成</button>
				</td>
				<td>
				<button class="button" onclick="javascript:window.location.href='<%=request.getContextPath()%>/diaodutj.action?orderId=${o.orderId }'">调度</button>
				</td>
			</tr>
			<tr>
				
				<td>
					<c:if test="${scrwd==null }">
			<span style="color:green;">未生成</span>
	</c:if>
	<c:if test="${scrwd!=null}">
	<span style="color:red;">${scrwd }</span>
	</c:if>
				</td>
				<td>
					<c:if test="${scdbd==null }">
			<span style="color:green;">未生成</span>
	</c:if>
	<c:if test="${scdbd!=null}">
	<span style="color:red;">${scdbd }</span>
	</c:if>
				</td>
				<td>
				<c:if test="${dddsc==null }">
			<span style="color:green;">未提交</span>
	</c:if>
	<c:if test="${dddsc!=null}">
	<span style="color:red;">${dddsc }</span>
	
	</c:if>
				</td>
			</tr>
		</table>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		(请按照生成任务单，生成调拨单，调度的顺序执行操作！)
	

	
</div>
</body>
</html>