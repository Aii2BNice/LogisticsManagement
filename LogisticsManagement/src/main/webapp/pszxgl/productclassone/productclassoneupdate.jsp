<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-配送中心管理-商品一级分类管理-修改</title>

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
      <ul class="am-icon-flag on"> 商品一级分类修改</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">商品一级分类修改</a></dl>
    </div>
		<form class="am-g" action="<%=request.getContextPath()%>/updatePCO.action?act=update" method="post">
			<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr>
					<td>商品一级分类编号：</td>
					<td>
						${proC.id}<input type="text" style="display:none;" name="id" value="${proC.id}"/>
					</td>
				</tr>
				<tr>
					<td>商品一级分类名称：</td>
					<td>
						<input type="text" name="name" required="required" value="${proC.name}"/>
					</td>
				</tr>
				<tr>
					<td>
						<input class="button-style" type="reset" value="重置" />
					</td>
					<td>
						<input class="button-style" type="button" onclick="doQuery()" value="返回" />
						<input class="button-style" type="submit" value="修改" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
</body>

<script type="text/javascript">
function doQuery(){
		location.href="<%=request.getContextPath()%>/pszxgl/productclassone/productclassonequery.jsp";
}

</script>
</html>