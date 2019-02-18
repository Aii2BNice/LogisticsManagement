<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0">
<title>物流配送平台-个人管理</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/selfpage.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/res/layui/css/layui.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/res/static/css/index.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
<script>
	$(function() {
		$("#upload").click(function() {
			$("#file_upload").trigger("click");
		});
		$("#file_upload").change(function() {
			$("#form1").submit();
		});
		$("#pass_1").click(function() {
			$("#pass_1").hide();
			$("#pass_2").show();
			$("#pass_2").val($("#pass_3").val());
			$("#pass_2").focus();
		});
		$("#pass_2").blur(function() {
			$("#pass_1").show();
			$("#pass_2").hide();
			$.ajax({
				type:'post',
				url:'${pageContext.request.contextPath}/alteruser.action',
				contentType:'application/json;charset=utf-8',
				data:JSON.stringify(getJsonData()),
				success:function(user){
					$("#pass_1").empty();
					$("#pass_1").html("*****");
					alert("修改成功");
				}
			});
			function getJsonData(){
				var json = {
					"uname":$("#uname").text(),
					"pass":$("#pass_2").val()
				}
				return json;
			}
		});
	})
</script>
</head>
<body>
	<div id="main">
		<div id="header">
			<div id="headerimg">
				<a href="#" id="upload"><img id="img" src="/upload/${sessionScope.user.url}" width="100" title="点击更换头像"/></a>
				<form id="form1" action="<%=request.getContextPath()%>/alteruserimg.action" 
					  method="post" enctype="multipart/form-data">
					<input type="hidden" value="${user.uname}" name="uname" />
					<input type="file" id="file_upload" name="heardImg" style="display: none;" />
				</form>
			</div>
			<div id="username">
				用户名:<a href="#" id="uname">${sessionScope.user.uname}</a><br />
				密&nbsp;&nbsp;&nbsp;码:<a href="#" id="pass_1" title="点击更改密码">*****<input id="pass_3" type="hidden" value="${sessionScope.user.pass}"/></a><input id="pass_2" type="text" name="pass" style="display: none; width: 60px;" />
			</div>
		</div>
		<br />
		<hr />
		<div class="main-case">
			<div class="layui-container">
				<div class="layui-row">
					<div class="layui-inline content">
						<div class="layui-inline case-img">
							<img src="<%=request.getContextPath()%>/res/static/img/case1.jpg">
						</div>
					</div>
					<div class="layui-inline content even center">
						<div class="layui-inline case-img">
							<img src="<%=request.getContextPath()%>/res/static/img/case2.jpg">
						</div> 
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var msg = "<%=request.getAttribute("msg") %>";
		if(msg!="null"){
			alert(msg);
		}
	</script>
</body>
</html>