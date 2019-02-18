<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.neusoft.pszxgl.productclassone.model.ProductClassOne"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-配送中心管理-商品一级分类管理-查询</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">


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

</head>

<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 商品一级分类查询</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">商品一级分类查询</a></dl>
    </div>

	<form class="am-g" action="<%=request.getContextPath()%>/propage.action?act=query" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr>
				<td>商品一级分类编号:</td>
				<td><input type="text" name="id" placeholder="(可选填)" /></td>
			</tr>
			<tr>
				<td>商品一级分类名称:</td>
				<td><input type="text" name="name" placeholder="(可选填)" /></td>
			</tr>
			<tr>
				<td>
					<input class="button-style" type="button" value="增加" 
							onclick="javascript:location.href='<%=request.getContextPath()%>/pszxgl/productclassone/productclassoneadd.jsp'"/>
				</td>
				<td>
					<input class="button-style" type="reset" value="重置" />
					<input class="button-style" type="submit" value="查询" />
				</td>
			</tr>
		</table>
	</form>
	<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
		<tr>
			<td colspan="3" >
				<c:if test="${msg!=null}">
					<span style="color: red" >${msg}</span>
				</c:if>
			</td>
		</tr>
	</table>
	
	<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
		<tr class="table-firstline">
			<th>商品一级分类编号</th>
			<th>商品一级分类名称</th>
			<th>操作</th>
		</tr>
		<c:choose>
			<c:when test="${empty sessionScope.pcolist || sessionScope.pcolist.size() == 0 }">
				<tr>
					<td colspan="3" class="c1">暂无数据</td>
				</tr>
			</c:when>
			
			<c:otherwise>
					<c:forEach items="${sessionScope.pcolist}" var="pco">
						<tr>
							<td>${pco.id}</td>
							<td>${pco.name}</td>
							<td>
								<button class="am-btn am-btn-default am-btn-xs am-text-success am-round" value="${pco.id}" onclick="doUpdate(this)" >修改</button>
								<button class="am-btn am-btn-default am-btn-xs am-text-success am-round" value="${pco.id}" onclick="doDelete(this)" >删除</button>
							</td>
						</tr>
					</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
		<div class="box">
			<div style="height: 30px; line-height: 30px;">
				共有
				<span>${productClassOne.counts}</span>
					条记录，当前第
				<span>
					${productClassOne.pageNum }/${productClassOne.pages }
				</span>
					页
			</div>
			<div>
			<!-- 如果是第一页，则只显示下一页、尾页 -->
			<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
				<input class="button-style" type="button" value="首页" onclick="doJump(1);" />
				<input class="button-style" type="button" value="上一页" onclick="doJump(${productClassOne.pageNum - 1});"  />
				<input class="button-style" type="button" value="下一页" onclick="doJump(${productClassOne.pageNum + 1});" />
				<input class="button-style" type="button" value="尾页" onclick="doJump(${productClassOne.pages});" />
			<!--如果是最后一页，则只显示首页、上一页 -->
				转到第<input type="text" id="jumpNumTxt" value="${productClassOne.pageNum }" class="textbox"/>页
					<input class="button-style" type="button" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);" />
				跳转到第
					<select onchange="doJump(this.value)">
					<%
					ProductClassOne productClassOne = (ProductClassOne)request.getAttribute("productClassOne");
						if(productClassOne!=null){
							int pages = productClassOne.getPages();
							int pageNum = productClassOne.getPageNum();
							for(int i=0; i<pages; i++){
								out.print("<option value='"+(i+1)+"'");
								out.print( pageNum==(i+1) ? " selected " : "" );
								out.print(">"+(i+1)+"</option>");
								}
							}else{
								out.print("<option value='1'>1</option>");
								}
							%>
					</select>
						页
			</div>
		</div>
</div>
</body>

<script type="text/javascript">
	function doUpdate(obj){
		var id = obj.value;
		if(window.confirm("你确定要修改"+id+"号么？")){
			location.href="<%=request.getContextPath()%>/toUpdatePCO.action?act=toUpdate&id="+id;
			return true;
		}else{
			return false;
		}
	}
	
	
	
	function doDelete(obj){
		var id = obj.value;
		if(window.confirm("你确定要删除"+id+"号么？")){
			location.href="<%=request.getContextPath()%>/deletePCO.action?act=delete&id="+id;
			return true;
		}else{
			return false;
		}
	}
	
	function doJump(pageNum){
		//alert(pageNum);
		var form = document.forms[0];
		form.action="<%=request.getContextPath()%>/propage.action?act=query&pageNum="+pageNum;
		form.submit();
	}
</script>

</html>