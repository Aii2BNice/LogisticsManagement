<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
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
<script type="text/javascript">
		$(function(){
			var $select = $("#aaa").val();
			if($select==0){
				$("#submit").attr("disabled","disabled");
			}
			$("#aaa").click(function(){
				var $select = $("#aaa").val();
				if($select==0){
					$("#submit").attr("disabled","disabled");
				}else{
					$("#submit").removeAttr("disabled");
				}
			})
		})
</script>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 发票单生成</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">发票单生成</a></dl>
      
    </div>
	
	<form class="am-g" action="<%=request.getContextPath() %>/invoicesc.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>选择发票金额</td>
				<td>
					<select name="price" id="aaa">
					<option value="0" selected="selected">请选择</option>
					<option value="50">50元</option>
					<option value="100">100元</option>
					<option value="200">200元</option>
					<option value="500">500元</option>
					<option value="1000">1000元</option>
					</select>
				</td>
				</tr>
			<tr>
			<tr>
				<td>操作
				</td>
				<td>
					<input type="submit" value="生成" class="button" id="submit"/>
				</td>
			</tr>
		</table>
		${msg }
		
	</form>
</div>
</body>
</html>