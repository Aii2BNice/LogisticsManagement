<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">
<title>物流配送平台-仓库管理</title>
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
	/* background:#AAA;/*不可用？？？  */ */
	font-size:15px;
	
}

</style>
<script>
		function doadd(){
			location.href = "<%=request.getContextPath()%>/depotmanage/depot/adddepot.jsp";
	}
</script>
</head>
<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on">库房查询</ul>
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="<%=request.getContextPath()%>/depotmanage/depot/querydepot.jsp">库房查询</a></dl>
    </div>
			<form action="<%=request.getContextPath()%>/querydepot.action" method="post">
				${msg}
				<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover" >
					<tr>
						<td>库房编号</td>
						<td><input type="text" name="depotId"
							value="${depot.depotId }"></td>
					</tr>
					<tr>
						<td>库房名称</td>
						<td><input type="text" name="depotName"
							value="${depot.depotName }"></td>
					</tr>
					<tr>
						<td>库房级别</td>
						<td><input type="text" name="depotLevel"
							value="${depot.depotLevel }"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="查询" class="button-style"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" value="增加" onclick="doadd()" class="button-style"/></td>
					</tr>
				</table>
				<br />
				<c:if test="${list==null || list.size()==0}">
			没有查询结果
		</c:if>
				<c:if test="${list!=null && list.size()>0}">
					<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
						<tr class="table-firstline">
							<td>库房编号</td>
							<td>库房名称</td>
							<td>库房地址</td>
							<td>库房级别</td>
							<td>库管员</td>
							<td>操作</td>
						</tr>
						<c:forEach items="${list }" var="u">
							<tr>
								<td>${u.depotId}</td>
								<td>${u.depotName}</td>
								<td>${u.depotAddress}</td>
								<td>${u.depotLevel}</td>
								<td>${u.adminId}</td>
								<td><a href="<%=request.getContextPath()%>/queryById.action?depotId=${u.depotId}">修改</a>
									<a href="<%=request.getContextPath()%>/delete.action?depotId=${u.depotId}" onclick="return confirm('确认删除？')">删除</a></td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
			</form>
		</div>
</body>
</html>