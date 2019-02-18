<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.neusoft.fzgl.taskform.model.TaskForm"%>
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
.ip{
	width:200px;
}

.box{
	width: 90%;
	margin-left:40px;
	margin-top: 20px;
	position: relative;
	left: 100px;
}

</style>
</head>
<body>

<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 任务单查询</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">任务单查询</a></dl>
      
    </div>
	
	<form class="am-g" action="<%=request.getContextPath()%>/taskformquery.action?act=querytf" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>开始日期</td>
				<td>
					<input class="ip" type="date" name="taskStartDate" />
				</td>
				
			</tr>
			<tr>
				<td>结束日期</td>
				<td>
					<input class="ip" type="date" name="taskEndDate" />
				</td>
			</tr>
			<tr>
				<td>任务单号</td>
				<td>
					<input class="ip" type="text" name="id"/>
				</td>
			</tr>
			<tr>
				<td>任务类型</td>
				<td>
					<input class="ip" type="text" name="typeName"/>
				</td>
			</tr>
			<tr>
				<td>任务状态</td>
				<td>
					<input class="ip" type="text" name="stateName"/>
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
				<th class="table-id">任务单号</th>
				<th class="table-type">任务类型</th>
				<th class="table-state">任务状态</th>
				<th width="130px">操作</th>
			</tr>
			<c:forEach items="${list }" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.typeName}</td>
					<td>${u.stateName}</td>
					<td><a class="am-btn am-btn-default am-btn-xs am-text-success am-round" href="<%=request.getContextPath()%>/taskformqueryById.action?id=${u.id}"><span class="am-icon-search" title="查看订单详情">详情</span></a></td>
				</tr>
			
			</c:forEach>
		</table>
	</c:if>
	</form>
	<!--分页查询  -->
	<div class="box">
			<div style="height: 30px; line-height: 30px;">
				共有
				<span>${taskForm.counts}</span>
					条记录，当前第
				<span>
					${taskForm.pageNum}/${taskForm.pages}
				</span>
					页
			</div>
			<div>
			<!-- 如果是第一页，则只显示下一页、尾页 -->
			<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
				<input class="button-style" type="button" value="首页" onclick="doJump(1);" />
				<input class="button-style" type="button" value="上一页" onclick="doJump(${taskForm.pageNum - 1});"  />
				<input class="button-style" type="button" value="下一页" onclick="doJump(${taskForm.pageNum + 1});" />
				<input class="button-style" type="button" value="尾页" onclick="doJump(${taskForm.pages});" />
			<!--如果是最后一页，则只显示首页、上一页 -->
				转到第<input type="text" id="jumpNumTxt" value="${taskForm.pageNum }" class="textbox"/>页
					<input class="button-style" type="button" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);" />
				跳转到第
					<select onchange="doJump(this.value)">
					<%
					TaskForm taskform = (TaskForm)request.getAttribute("taskForm");
						if(taskform!=null){
							int pages = taskform.getPages();
							int pageNum = taskform.getPageNum();
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
<script type="text/javascript">
function doJump(pageNum){
	var form = document.forms[0];
	form.action="<%=request.getContextPath()%>/taskformquery.action?act=querytf&pageNum="+pageNum;
	form.submit();
}
</script>
</body>
</html>