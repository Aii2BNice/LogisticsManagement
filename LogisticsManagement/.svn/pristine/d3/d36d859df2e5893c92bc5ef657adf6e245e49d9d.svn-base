<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.neusoft.system.user.model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-系统管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png"
	href="<%=request.getContextPath()%>/assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="<%=request.getContextPath()%>/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/assets/js/app.js"></script>
<style type="text/css">
h2 {
	position: relative;
	left: 400px;
	top: -15px;
}

table {
	width: 80%;
	position: relative;
	left: 70px;
	top: -30px;
}

table tr td {
	width: 25%;
}

.ui_tb_h30 {
	width: 80%;
	position: relative;
	left: 155px;
	font-size: 13px;
}
</style>

</head>
<body>

	<div id="main">
		<!-- 右侧主界面   -->
		<div class="admin-content  admin-biaogelist" id="main-right">
			<div class="listbiaoti am-cf">
				<ul class="am-icon-flag on">查询用户
				</ul>
				<dl class="am-icon-home" style="float: right;">
					当前位置： 系统管理 >
					<a href="#">用户管理</a> >
					<a href="#">查询用户</a>
				</dl>
			</div>
			<h2>用户信息查询</h2>
			<br />
			<br />
			<form
				action="<%=request.getContextPath()%>/queryuser.action?act=query&pageNum=1"
				method="post">
				<table
					class="am-table-bordered am-table-radius am-table-striped am-table-hover">
					<tr>
						<td>用户名:</td>
						<td><input type="text" name="uname" value="${name}" /></td>
					</tr>
					<tr>
						<td>权限:</td>
						<td><select name="powerId" id="select">
								<option value="">--请选择--</option> ${powerOption}
						</select></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="查询用户" class="button-style"/><br />
						</td>
					</tr>
					<tr>
						<td colspan="2"><a
							href="<%=request.getContextPath()%>/system/user/adduser.jsp">添加用户</a>
						</td>
					</tr>
				</table>
			</form>
			<br />
			<br />
			<table id="result"
				class="am-table-bordered am-table-radius am-table-striped am-table-hover">
				<tr class="table-firstline">
					<td>用户名</td>
					<td>密码</td>
					<td>权限</td>
					<td>操作</td>
				</tr>
				<c:choose>
					<c:when
						test="${empty sessionScope.users || sessionScope.users.size() == 0}">
						<tr>
							<td colspan="4" class="c1">暂无数据</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${sessionScope.users}" var="u">
							<tr>
								<td>${u.uname}</td>
								<td>${u.pass}</td>
								<td>${u.powerName}</td>
								<td>
									<button value="${u.uname},${u.pass},${u.powerId}" onclick="doUpdate(this)" class="am-btn am-btn-default am-btn-xs am-text-success am-round">修改</button>
									<button value="${u.uname}" onclick="doDelete(this)" class="am-btn am-btn-default am-btn-xs am-text-success am-round">删除</button>
								</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>
			<div class="ui_tb_h30">
				<div class="ui_flt" style="height: 30px; line-height: 30px;">
					共有 <span class="ui_txt_bold04">${user.counts}</span> 条记录，当前第 <span
						class="ui_txt_bold04"> ${user.pageNum }/${user.pages } </span> 页
				</div>
				<div class="ui_frt">
					<!--    如果是第一页，则只显示下一页、尾页 -->
					<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
					<input type="button" value="首页" onclick="doJump(1);" class="button-style"/> 
					<input type="button" value="上一页" onclick="doJump(${user.pageNum - 1});" class="button-style"/>
					<input type="button" value="下一页" onclick="doJump(${user.pageNum + 1});" class="button-style"/> 
					<input type="button" value="尾页" onclick="doJump(${user.pages});" class="button-style"/>
					<!--     如果是最后一页，则只显示首页、上一页 -->

					转到第<input type="text" id="jumpNumTxt" value="${user.pageNum }"
						class="ui_input_txt01" />页 
						<input type="button" class="ui_input_btn01 button-style" value="跳转"
						onclick="doJump(document.getElementById('jumpNumTxt').value);" />
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	
	//修改
	function doUpdate(obj){
		var values = obj.value;
		location.href = "<%=request.getContextPath()%>/updateuser.action?act="+values;
	}
	//删除
	function doDelete(obj){
		var uname = obj.value;
		if(confirm("确定要删除用户 "+uname+" 吗?")){
			location.href = "<%=request.getContextPath()%>/deleteuser.action?act="+uname;
			return true;
		}else{
			return false;
		}
	}
	//分页查询
	function doJump(pageNum){
		//alert(pageNum);
		var form = document.forms[0];
		form.action="<%=request.getContextPath()%>/queryuser.action?act=query&pageNum="+pageNum;
		form.submit();
	}

	var msg = "<%=request.getAttribute("msg")%>";
	if(msg!="null"){
		alert(msg);
	}
	
</script>
</body>
</html>