<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script type="text/javascript">
	function doCheck(obj){
	    var str=obj.toString();
	    var str1=str.substr(-1);
	    alert(str1); 
		 alert("确定要删除吗"); 
		 location.href="<%=request.getContextPath()%>/updateqh.action?orderId=1";
	     return true;
	}
	
</script>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 缺货订单</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">缺货订单查询</a></dl>
      
    </div>
	
	<form class="am-g" action="<%=request.getContextPath() %>/orderformquerybystateid.action" method="post">
		
	
	<c:if test="${list==null || list.size()==0}">
			没有查询结果
	</c:if>
	<c:if test="${list!=null && list.size()>0}">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr class="table-firstline">
				<th >订单id</th>
				<th >商品id</th>
				<th >订购数量</th>
				<th width="130px">操作</th>
			</tr>
			<c:forEach items="${list}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.shopid}</td>	
					<td>${u.count}</td>
					<td><a class="am-btn am-btn-default am-btn-xs am-text-success am-round"  href="<%=request.getContextPath()%>/updateqh.action?orderId=${u.id}" onclick="return confirm('确定要更改吗？')" ><span>已到货</span></a></td>
				</tr>
			
			</c:forEach>
		</table>
	</c:if>
	</form>
</div>
</body>
</html>