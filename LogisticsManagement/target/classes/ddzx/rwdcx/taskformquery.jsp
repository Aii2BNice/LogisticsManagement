<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
      <ul class="am-icon-flag on"> 任务单查询</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">任务单查询</a></dl>
      
    </div>
	
	<form class="am-g" action="<%=request.getContextPath() %>/rwdcc.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>任务单号</td>
				<td>
					<input type="text" name="id" />
				</td>
				
			</tr>
			<tr>
				<td>任务状态</td>
				<td>
					<select name="taskStateId">
					<option value="" <c:if test="${msg==null }">selected</c:if>>-未选择-</option>
					<option value="1" <c:if test="${msg==1 }">selected</c:if>>已调度</option>
					<option value="2" <c:if test="${msg==2 }">selected</c:if>>任务可分配</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>任务类型</td>
				<td>
					<select name="taskTypeId">
					<option value="" <c:if test="${msg==null }">selected</c:if>>-未选择-</option>
					<option value="1" <c:if test="${msg1==1 }">selected</c:if>>正常订单</option>
					<option value="2" <c:if test="${msg1==2 }">selected</c:if>>修改后订单</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>订单号</td>
				<td>
					<input type="text" name="orderId" />
				</td>
			</tr>
			<tr>
				<td>操作
				</td>
				<td>
					<input type="submit" value="查询" class="button"/>
				</td>
			</tr>
		</table>
		
	<br>
	<c:if test="${list==null || list.size()==0}">
			没有查询结果
	</c:if>
	<c:if test="${list!=null && list.size()>0}">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr class="table-firstline">
				<th >任务单号</th>
				<th >任务状态编号</th>
				<th >任务类型编号</th>
				<th >订单号</th>
				<th >处理分站</th>
				<th >生成日期</th>
				<th >商品编号</th>
				<th >订单数量</th>
				<th >操作人员</th>
				<th >操作时间</th>
				
			</tr>
			<c:forEach items="${list}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.taskStateId}</td>	
					<td>${u.taskTypeId}</td>
					<td>${u.orderId}</td>
					<td>${u.substationId}</td>
					<td><fmt:formatDate value="${u.taskDate}" pattern="yyyy-MM-dd"/></td>
					<td>${u.shopId}</td>
					<td>${u.shopNum}</td>
					<td>${u.operator}</td>
					<td><fmt:formatDate value="${u.operationTime}" pattern="yyyy-MM-dd"/></td>
					
				</tr>
			
			</c:forEach>
		</table>
	</c:if>
	<%-- <c:if test="${task==null }">
			没有查询结果
	</c:if>
	<c:if test="${task!=null }">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			
			   <tr>
			   <td>任务单号</td>
			   <td>${task.id}</td>
			   </tr>
			   <tr>
			   <td>任务状态编号</td>
			   <td>${task.taskStateId}</td>
			   </tr>
			   <tr>
			   <td>任务类型编号</td>
			   <td>${task.taskTypeId}</td>
			   </tr>
			   <tr>
			   <td>订单号</td>
			   <td>${task.orderId}</td>
			   </tr>
			   <tr>
			   <td>处理分站</td>
			   <td>${task.substationId}</td>
			   </tr>
			   <tr>
			   <td>生成日期</td>
			   <td>
			   <fmt:formatDate value="${task.taskDate}" pattern="yyyy-MM-dd"/>
			   </td>
			   </tr>
			   <tr>
			   <td>商品编号</td>
			   <td>${task.shopId}</td>
			   </tr>
			   <tr>
			   <td>订单数量</td>
			   <td>${task.shopNum}</td>
			   </tr>
			   <tr>
			   <td>操作人员</td>
			   <td>${task.operator}</td>
			   </tr>
			   <tr>
			   <td>操作时间</td>
			   <td>
			   <fmt:formatDate value="${task.operationTime}" pattern="yyyy-MM-dd"/>
			   </td>
			   </tr>
		</table>
	</c:if> --%>
	</form>
</div>
</body>
</html>