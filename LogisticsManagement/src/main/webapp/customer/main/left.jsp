<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>
<body>
	<div id="main">

		<!-- 左侧导航栏  -->
		<div class="main-left">
			<div
				style="font-size: 20px; color: white; border-bottom: 1px solid cyan;">
				<span style="margin-left: 5px;">客户服务中心</span>
			</div>
			<div class="sideMenu am-icon-dashboard"
				style="color: #aeb2b7; margin: 10px 0 0 0;">欢迎客服人员：${user.uname}</div>
			<div class="sideMenu">
				<h3>
					<em></em><a href="javascript:;">商品浏览</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/toQueryProduct.action" target="right">商品列表</a></li>
				</ul>
				<h3>
					<em></em><a href="javascript:;">订单管理</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/toqueryorder.action" target="right">订单管理</a></li>
				</ul>
				<h3>
					<em></em><a href="javascript:;">客户管理</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/customer/client/queryclient.jsp" target="right">客户管理</a></li>
				</ul>
				<h3>
					<em></em><a href="javascript:;">操作量管理</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/customer/operation/queryoperation.jsp" target="right">操作量查询</a></li>
				</ul>
				<h3>
					<em></em><a href="javascript:;">系统设置</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/logout.action" target="_top">退出系统</a></li>
				</ul>
			</div>
			<!-- sideMenu End -->

			<script type="text/javascript">
				jQuery(".sideMenu").slide({
					titCell : "h3", //鼠标触发对象
					targetCell : "ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
					effect : "slideDown", //targetCell下拉效果
					delayTime : 300, //效果时间
					triggerTime : 150, //鼠标延迟触发时间（默认150）
					defaultPlay : true, //默认是否执行效果（默认true）
				});
			</script>
		</div>
	</div>
</body>
</html>