<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	background:#AAA;/*不可用？？？  */
	font-size:15px;
	
}

</style>
</head>
<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on">增加分站仓库</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 >
      		<a href="<%=request.getContextPath()%>/depotmanage/depot/querydepot.jsp">库房查询</a> >
      		<a href="<%=request.getContextPath()%>/depotmanage/depot/adddepot.jsp">增加库房</a></dl>
      
    </div>
<form  action="<%=request.getContextPath()%>/add.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr>
				<td>库房编号</td>
				<td><input type="text" name="depotId"></td>
			</tr>
			<tr>
				<td>库房名称</td>
				<td><input type="text" name="depotName"></td>
			</tr>
			<tr>
				<td>库房地址</td>
				<td><input type="text" name="depotAddress"></td>
			</tr>
			<tr>
				<td>库房级别</td>
				<td><input type="text" name="depotLevel"></td>
			</tr>
			<tr>
				<td>库管员</td>
				<td><input type="text" name="adminId"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="增加库房" class="button-style"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>