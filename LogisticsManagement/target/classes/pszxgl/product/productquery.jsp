<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.neusoft.pszxgl.product.model.Product"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-配送中心管理-商品管理-查询</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
</head>
<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function doselectpct(index){
		var optionJson=[];
		$.ajax({
			url: "selectPct.action",
			type: "post",
			data: {"pcoid":index},
			datatype: "json",
			success:function(data){
				optionJson = data;
				console.log(JSON.stringify(data));
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
			
	function doUpdate(obj){
		var id = obj.value;
		if(window.confirm("你确定要修改"+id+"号么？")){
			location.href="<%=request.getContextPath()%>/toUpdateProduct.action?act=toUpdate&id="+id;
			return true;
		}else{
			return false;
		}
	}
	
	function doDelete(obj){
		var id = obj.value;
		if(window.confirm("你确定要删除"+id+"号么？")){
			location.href="<%=request.getContextPath()%>/deleteProduct.action?act=delete&id="+id;
			return true;
		}else{
			return false;
		}
	}
	
	function doJump(pageNum){
		//alert(pageNum);
		var form = document.forms[0];
		form.action="<%=request.getContextPath()%>/productpage.action?act=query&pageNum="+pageNum;
		form.submit();
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
      <ul class="am-icon-flag on"> 商品查询</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">商品查询</a></dl>
    </div>
	<form class="am-g" action="<%=request.getContextPath()%>/productpage.action?act=query" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr>
				<td>商品编号:</td>
				<td><input type="text" name="id" placeholder="(可选填)" /></td>
			</tr>
			<tr>
				<td>商品名称:</td>
				<td><input type="text" name="name" placeholder="(可选填)" /></td>
			</tr>
			<tr>
				<td>商品所属一级分类:</td>
				<td>
				<select id="pco" name="pco.id" onchange="doselect()" >
						<option value="">--可选择--</option>
						<c:forEach items="${sessionScope.apcolist1}" var="propco">
							<option value="${propco.id}" <c:if test="${propco.id == selectedpro.pco.id}">selected</c:if> >${propco.id}-${propco.name}</option>
						</c:forEach>
					</select></td>
			</tr>
			<tr>
				<td>商品所属二级分类:</td>
				<td>
				<select id="pct" name="pct.id">
						<option value="">--可选择--</option>
					</select></td>
			</tr>
			<tr>
				<td>商品所属供应商:</td>
				<td>
				<select id="sup" name="sup.id">
						<option value="">--可选择--</option>
						<c:forEach items="${sessionScope.asuplist1}" var="sup">
							<option value="${sup.id}">${sup.id}-${sup.name}</option>
						</c:forEach>
					</select></td>
			</tr>
			<tr>
				<td>
					<input class="button-style" type="button" value="增加" 
							onclick="javascript:location.href='<%=request.getContextPath() %>/ajaxquerypco.action?key=4'"/>
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
			<th>商品编号</th>
			<th>商品名称</th>
			<th>计量单位</th>
			<th>商品所属分类</th>
			<th>商品售价</th>
			<th>原价</th>
			<th>折扣</th>
			<th>成本价</th>
			<th>商品型号</th>
			<th>生产厂商</th>
			<th>生产日期</th>
			<th>保质期</th>
			<th>供应商</th>
			<th>可否退货</th>
			<th>可否换货</th>
			<th>操作</th>
		</tr>
		<c:choose>
			<c:when test="${empty sessionScope.prolist || sessionScope.prolist.size() == 0 }">
				<tr>
					<td colspan="16" class="c1">暂无数据</td>
				</tr>
			</c:when>
			
			<c:otherwise>
					<c:forEach items="${sessionScope.prolist}" var="pro">
						<tr>
							<td>${pro.id}</td>
							<td>${pro.name}</td>
							<td>${pro.unit}</td>
							<td>${pro.pco.name}-${pro.pct.name}</td>
							<td>${pro.price}</td>
							<td>${pro.originalPrice}</td>
							<td>${pro.discount}</td>
							<td>${pro.cost}</td>
							<td>${pro.type}</td>
							<td>${pro.producerName}</td>
							<td><fmt:formatDate value="${pro.manufactureDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
							<td>${pro.productLife}</td>
							<td>${pro.sup.name}</td>
							<td>
							<c:if test="${pro.returnable==1}">可退货</c:if>
							<c:if test="${pro.returnable==0}">不可退货</c:if>
							</td>
							<td>
							<c:if test="${pro.changeable==1}">可换货</c:if>
							<c:if test="${pro.changeable==0}">不可换货</c:if>
							</td>
							<td>
								<button class="am-btn am-btn-default am-btn-xs am-text-success am-round" value="${pro.id}" onclick="doUpdate(this)" >修改</button>
								<button class="am-btn am-btn-default am-btn-xs am-text-success am-round" value="${pro.id}" onclick="doDelete(this)" >删除</button>
							</td>
						</tr>
					</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	
			<div class="box">
			<div style="height: 30px; line-height: 30px;">
				共有
				<span>${product.counts}</span>
					条记录，当前第
				<span>
					${product.pageNum }/${product.pages }
				</span>
					页
			</div>
			<div>
			<!-- 如果是第一页，则只显示下一页、尾页 -->
			<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
				<input class="button-style" type="button" value="首页" onclick="doJump(1);" />
				<input class="button-style" type="button" value="上一页" onclick="doJump(${product.pageNum - 1});"  />
				<input class="button-style" type="button" value="下一页" onclick="doJump(${product.pageNum + 1});" />
				<input class="button-style" type="button" value="尾页" onclick="doJump(${product.pages});" />
			<!--如果是最后一页，则只显示首页、上一页 -->
				转到第<input type="text" id="jumpNumTxt" value="${product.pageNum }" class="textbox"/>页
					<input class="button-style" type="button" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);" />
				跳转到第
					<select onchange="doJump(this.value)">
					<%
					Product product = (Product)request.getAttribute("product");
						if(product!=null){
							int pages = product.getPages();
							int pageNum = product.getPageNum();
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
</div>
</body>
</html>