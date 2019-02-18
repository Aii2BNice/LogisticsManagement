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
.ip{
	width:200px
}

</style>
</head>
<body>
<%
if ((String)request.getAttribute("msg") !=null) { %>
    <script>
    <%String s=(String)request.getAttribute("msg");%>
    var str="<%=s%>";
    alert(str);
    </script>
<%}%>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 客户领用发票</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">客户领用发票</a></dl>
      
    </div>
	<form class="am-g" action="<%=request.getContextPath()%>/invoicecxkehu.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>发票id</td>
				<td>
					<input class="ip" type="text" name="id" />(可选填)
				</td>
				</tr>
			<tr>
				<td>发票金额</td>
				<td>
					<input class="ip" type="text" name="price" />(可选填)
				</td>
			</tr>
				<tr>
				<td>登记日期</td>
				<td>
					<input class="ip" type="date" name="registerDate" />(可选填)
				</td>
				</tr>
			<tr>
				<td>领用分站</td>
				<td>
					<input class="ip" type="text" name="substationId" />(可选填)
				</td>
			</tr>
			<tr>
				<td>分站领用日期</td>
				<td>
					<input class="ip" type="date" name="substationDate" />(可选填)
				</td>
			</tr>
			<tr>
				<td>操作
				</td>
				<td>
					<input class="button-style" type="submit" value="查询"/>
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
				<th >发票id</th>
				<th >发票金额</th>
				<th >登记日期</th>
				<th >领用分站</th>
				<th >分站领用日期</th>
				<th width="130px">操作</th>
			</tr>
			<c:forEach items="${list}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.price}</td>	
					<td><fmt:formatDate value="${u.registerDate}" pattern="yyyy-MM-dd"/></td>
					<td>${u.substationId}</td>
					<td><fmt:formatDate value="${u.substationDate}" pattern="yyyy-MM-dd"/></td>
					<td><a class="am-btn am-btn-default am-btn-xs am-text-success am-round" href="<%=request.getContextPath() %>/invoicecxkehubyid.action?id=${u.id}"><span class="am-icon-search" title="客户领用">客户领用</span></a></td>
				</tr>
			
			</c:forEach>
		</table>
	</c:if>
	</form>
</div>
</body>
</html>