<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-配送中心管理-商品管理-增加</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
</head>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#discount").blur(function(){
		if($("#discount").val()!="" && $("#discount").val()!=0 && $("#discount").val()!=null){
			var $price = $("#originalPrice").val()*$("#discount").val();
			$("#price").val($price);
		}
	})
})
	
function doselectpct(index){
	var optionJson=[];
	$.ajax({
		url: "selectPct.action",
		type: "post",
		data: {"pcoid":index},
		datatype: "json",
		success:function(data){
			optionJson = data;
			var a=data.length;
			var selectObj=document.getElementById("pct");
			selectObj.options.length=1;
			for(var i=0;i<data.length;i++){
				selectObj.add(new Option(optionJson[i].id+"-"+optionJson[i].name,optionJson[i].id));
			}
		}
	})
}

function doselect(){
	var index=$('#pco option:selected').val();
	doselectpct(index);
}
</script>

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
      <ul class="am-icon-flag on"> 商品增加</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">商品增加</a></dl>
    </div>
<div class="admin-content" id="main-right">

	<form class="am-g" action="<%=request.getContextPath()%>/addProduct.action?act=add" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<!-- <tr>
				<td>商品编号:</td>
				<td><input type="text" name="id" /></td>
			</tr> -->
			<tr>
				<td>商品名称:</td>
				<td><input type="text" name="name" required="required"/></td>
			</tr>
			<tr>
				<td>计量单位:</td>
				<td><input type="text" name="unit" required="required"/></td>
			</tr>
			<tr>
				<td>商品所属分类:</td>
				<td><select id="pco" name="pco.id" onchange="doselect()" >
						<option value="">--可选择--</option>
						<c:forEach items="${sessionScope.apcolist2}" var="pco">
							<option value="${pco.id}">${pco.id}-${pco.name}</option>
						</c:forEach>
					</select>
					<select id="pct" name="pct.id">
						<option value="">--可选择--</option>
					</select></td>
			</tr>
			<tr>
				<td>商品售价:</td>
				<td><input type="text" name="price" id="price" required="required"/></td>
			</tr>
			<tr>
				<td>原价:</td>
				<td><input type="text" name="originalPrice" id="originalPrice" required="required"/></td>
			</tr>
			<tr>
				<td>折扣:</td>
				<td><input type="text" name="discount" id="discount" required="required"/></td>
			</tr>
			<tr>
				<td>成本价:</td>
				<td><input type="text" name="cost" required="required"/></td>
			</tr>
			<tr>
				<td>商品型号:</td>
				<td><input type="text" name="type" required="required"/></td>
			</tr>
			<tr>
				<td>生产厂商:</td>
				<td><input type="text" name="producerName" required="required"/></td>
			</tr>
			<tr>
				<td>生产日期:</td>
				<td><input type="Date" name="manufactureDate" /></td>
			</tr>
			<tr>
				<td>保质期:</td>
				<td><input type="text" name="productLife" required="required"/></td>
			</tr>
			<tr>
				<td>供应商:</td>
				<td><select id="sup" name="sup.id">
						<option value="">--可选择--</option>
						<c:forEach items="${sessionScope.asuplist2}" var="sup">
							<option value="${sup.id}">${sup.id}-${sup.name}</option>
						</c:forEach>
					</select></td>
			</tr>
			<tr>
				<td>可否退货:</td>
				<td><select name="changeable">
					<option value="0" selected="selected">可以</option>
					<option value="1" >不可以</option>
				</select></td>
			</tr>
			<tr>
				<td>可否换货:</td>
				<td><select name="returnable">
					<option value="1" selected="selected">可以</option>
					<option value="0" >不可以</option>
				</select></td>
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
</div>
</body>
<script type="text/javascript">
function doQuery(){
		location.href="<%=request.getContextPath()%>/pszxgl/product/productquery.jsp";
}

</script>
</html>