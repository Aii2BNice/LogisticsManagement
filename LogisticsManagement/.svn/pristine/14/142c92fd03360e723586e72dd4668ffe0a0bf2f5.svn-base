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
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 领用发票</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">领用发票</a></dl>
      
    </div>
	<form class="am-g" action="<%=request.getContextPath()%>/updatekehu.action" method="post">
		
		
	
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<c:forEach items="${invoicecxkehubyid}" var="u">
			<tr >
				<td >发票id</td>
				<td ><input class="ip" type="text" name="id" value="${u.id}" readonly="readonly"/></td>
				
			</tr>
			
				<tr>
					<td>客户领用日期</td>
					<td><input class="ip" type="date" name="customerDate" required="required"/></td>	
				</tr>
				<tr>
					<td>配送员</td>
					<td>
					<select id="deliverId" class="ip" name="deliverId">
						<option value="00">--请选择</option>
						<option value="40">40--曹操</option>
						<option value="42">42--曹丕</option>
						<option value="44">44--曹植</option>
						<option value="46">46--曹睿</option>
						<option value="48">48--曹彰</option>
						<option value="50">50--曹洪</option>
						<option value="52">52--司马懿</option>
						<option value="54">54--司马昭</option>
						<option value="56">56--荀彧</option>
						<option value="58">58--邓艾</option>
						<option value="60">60--郭嘉</option>
						<option value="62">62--夏侯惇</option>
						<option value="64">64--夏侯渊</option>
						<option value="66">66--杨修</option>
						<option value="68">68--张辽</option>
						<option value="70">70--徐晃</option>
					</select>
					<!-- <input type="text" name="deliverId"/> -->
					</td>	
				</tr>
				<tr>
					<td>任务单号</td>
					<td><input id="taskId" class="ip" type="text" name="taskId" required="required"/></td>	
				</tr>
				
				<tr>
					<td>备注</td>
					<td><input class="ip" type="text" name="remark"/></td>	
				</tr>
				<tr>
					<td>操作</td>
					<td><input class="button-style" type="submit" value="领用"/></td>
				</tr>
			
			</c:forEach>
		</table>
	</form>
</div>
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

	<%-- function selectDeliver(){
		var	deliverId=document.getElementById("deliverId").value;
		location.href="<%=request.getContextPath()%>/invoiceCXTaskId.action?deliverId="+deliverId;
	} --%>

$(function(){
	$("#deliverId").change(function(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/invoiceCXTaskId.action',
			contentType:'application/json;charset=utf-8',
			data:/* {"deliverId":$("#deliverId").val()}, */JSON.stringify(jsonData()),
			success:function(taskId){
				$("#taskId").val(taskId);
			}
		})
	})
	
	 function jsonData(){
		var json = {"deliverId":$("#deliverId").val()}
		return json;
	}
})
	
</script>
</body>
</html>