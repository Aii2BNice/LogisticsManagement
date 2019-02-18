<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-配送中心管理-供应商信息管理-增加</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
</head>
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
.box{
	width: 90%;
	margin-left:40px;
	margin-top: 20px;
	position: relative;
	left: 100px;
}
.textbox{
	width: 30px;
	
}
</style>
<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 供应商增加</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">供应商增加</a></dl>
    </div>

	<form class="am-g" action="<%=request.getContextPath()%>/addSupplier.action?act=add" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<!-- <tr>
				<td>供应商编号:</td>
				<td><input type="text" name="id" /></td>
			</tr> -->
			<tr>
				<td>供应商名称:</td>
				<td><input type="text" name="name" required="required" /></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input type="text" name="address" required="required" /></td>
			</tr>
			<tr>
				<td>联系人:</td>
				<td><input type="text" name="contactName" required="required" /></td>
			</tr>
			<tr>
				<td>联系电话:</td>
				<td><input type="text" name="contactPhone" required="required" /></td>
			</tr>
			<tr>
				<td>开户银行:</td>
				<td><input type="text" name="openingBank"  required="required"/></td>
			</tr>
			<tr>
				<td>银行账号 :</td>
				<td><input type="text" name="accountNumber" required="required" /></td>
			</tr>
			<tr>
				<td>传真:</td>
				<td><input type="text" name="fax" required="required" /></td>
			</tr>
			<tr>
				<td>邮编 :</td>
				<td><input type="text" name="postcode"  required="required"/></td>
			</tr>
			<tr>
				<td>法人:</td>
				<td><input type="text" name="artificalPerson"  required="required"/></td>
			</tr>
			<tr>
				<td>备注:</td>
				<td><textarea rows="2" cols="20" name="remark"></textarea></td>
			</tr>
			<tr>
				<td>
					<input class="button-style" type="reset" value="重置" />
				</td>
				<td>
					<input class="button-style" type="button" onclick="doQuery()" value="返回" />
					<input class="button-style" type="submit" value="增加" />
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
<script type="text/javascript">
function doQuery(){
		location.href="<%=request.getContextPath() %>/pszxgl/supplier/supplierquery.jsp";
}

</script>
</html>