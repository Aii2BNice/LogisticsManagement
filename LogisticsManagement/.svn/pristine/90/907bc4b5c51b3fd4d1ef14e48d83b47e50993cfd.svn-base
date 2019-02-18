<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/admin.css">
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
.table-firstline {
	padding: 5px;
	color: #00A600;
	background: #AAA; /*不可用？？？  */
	font-size: 15px;
}
</style>
</head>
<body>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on">回执录入</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">回执录入</a></dl>
      
    </div>
    
     <form class="am-g" action="<%=request.getContextPath()%>/queryReturnReceipt.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			
			<tr>
				<td>签收单号</td>
				<td>
					<input type="text" name="deliverFormId"/>
				</td>
			</tr>
			<tr>
				<td>配送员名</td>
				<td>
					<input type="text" name="deliverName"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input class="button-style" type="submit" value="查询"/>
					
				</td>
			</tr>
		</table>
		
		<br>
	<c:if test="${list==null || list.size()==0}">
			没有查询结果
	</c:if>
	<c:if test="${list!=null && list.size()>0}">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover">
			<tr class="table-firstline">
				<th></th>
				<th>商品签收单号</th>
				<th>配送员</th>
				<th>任务类型</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="u">
				<tr>
					<td>
					<input type="radio" name="receipt" /></td>
					<td>
					${u.deliverFormId}
					<input type="hidden" name="deliverFormId" value="${u.deliverFormId}"/>
					</td>
					<td>${u.deliverName}</td>
					<td>${u.typeName}</td>
					<td><select>
					<option value="0">--</option>
					<option value="5">完成</option>
					<option value="6">部分完成</option>
					<option value="7">失败</option>
					</select></td>
				</tr>
				
			
			</c:forEach>
			<tr>
				<td  colspan="5">
					<input class="button-style" type="button" value="确定"/>
				</td>
			</tr>
		</table>
		
	</c:if>
	</form>
</div>
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	//获取选中按钮的这一行配送签收单号和任务状态号（任务状态号为下拉列表的value值），传给Controller
	$(function(){
		$(":button").click(function(){
			var deliverFormId=$(":radio[name='receipt']:checked").parent().parent().find("input").eq(1).val();
			var taskStateId=$(":radio[name='receipt']:checked").parent().parent().find("select").val();
			if(deliverFormId!=null&&taskStateId!=0){
				location.href="<%=request.getContextPath()%>/updateTaskState.action?deliverFormId="+deliverFormId+"&taskStateId="+taskStateId;	
			}
		})
	})
</script>

</body>
</html>