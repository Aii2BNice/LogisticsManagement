<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送平台-调度中心</title>
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
				<span style="margin-left: 5px;">财务管理</span>
			</div>
			<div class="sideMenu am-icon-dashboard"
				style="color: #aeb2b7; margin: 10px 0 0 0;">欢迎系统管理员：${username}</div>
			<div class="sideMenu">
				<h3>
					<em></em><a>查询发票</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/queryallpageinvoice.action" target="right2"">查询全部发票单</a></li>
				</ul>
				<h3>
					<em></em><a href="#">生成发票</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/finance/invoicesc/invoicesc.jsp" target="right2"">选择发票金额</a></li>
				</ul>
				<h3>
					<em></em><a href="#">登记发票</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/invoicecxdj.action" target="right2"">可登记发票查询</a></li>
				</ul>
				<h3>
					<em></em><a href="#">分站领用发票</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/invoicecxsubby.action" target="right2"">查看分站可领用发票</a></li>
				</ul>
				<%-- <h3>
					<em></em><a href="#">客户领用发票</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath()%>/invoicecxkehu.action" target="right2"">查看客户可领用发票</a></li>
				</ul> --%>
				<h3>
					<em></em><a href="#">系统设置</a>
				</h3>
				<ul>
					<li><a href="<%=request.getContextPath() %>/login.jsp" target="_top">退出系统</a></li>
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
					returnDefault : true
				//鼠标从.sideMen移走后返回默认状态（默认false）
				});
			</script>
		</div>
	</div>
</body>
</html>