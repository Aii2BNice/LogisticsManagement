<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
<style type="text/css">
table {
	border-collapse: collapse;
	position: relative;
	left: 140px;
}

caption {
	font-size: 26px;
}
#positionDiv{
	width:700px;
	height:350px;
	position:relative;
}
#num{
		position: absolute;
		right: 0px;
		top:20px;
	}
</style>
</head>
<body>
	<div class="admin-biaogelist">
		<div class="listbiaoti am-cf">
			<ul class="am-icon-flag on">打印商品签收单
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 >
				<a href="<%=request.getContextPath()%>/fzgl/taskoperation/deliverform.jsp">商品签收单</a>>
				<a href="#">打印</a>
			</dl>
		</div>
		<div class="am-g">
			<div>
				<input class="button-style" type="button" onclick="windowprint()" value="打印" />
			</div>
			<!--startprint-->
			
			<div id="positionDiv">
			<div id="num">NO.${df.deliverFormId}</div>
			<table width="580" height="250" border="2" class=" am-table-radius">
				<caption>签收单</caption>
				<tbody>
					<tr>
						<td>供应商:</td>
						<td colspan="3">${df.producerName}</td>
						<td>配送员:</td>
						<td>${df.deliverName}</td>
						<td>联系电话:</td>
						<td>1888888888</td>
					</tr>
					<tr>
						<td>物流商:</td>
						<td colspan="3">辽宁飞毛腿物流有限公司</td>
						<td>收货方:</td>
						<td></td>
						<td>收货方联系人:</td>
						<td></td>
					</tr>
					<tr>
						<td>商品名:</td>
						<td>${df.shopName}</td>
						<td>数量:</td>
						<td>${df.shopNum}</td>
						<td>单价:</td>
						<td>${df.shopPrice}</td>
						<td>金额:</td>
						<td>${df.shopNum*df.shopPrice}</td>
					</tr>
					<tr>
						<td colspan="8" rowspan="4" valign="top" align="left">客户反馈:</td>
					</tr>
				</tbody>
				<tfoot align="right">
					<tr>
						<td colspan="8">签收人:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>
				</tfoot>
			</table>
			</div>
			<!--endprint-->
		</div>
	</div>
	<script type="text/javascript">
	//打印
		function windowprint() {

			bdhtml = window.document.body.innerHTML;
			sprnstr = "<!--startprint-->"; //开始打印标识字符串有17个字符
			eprnstr = "<!--endprint-->"; //结束打印标识字符串
			prnhtml = bdhtml.substr(bdhtml.indexOf(sprnstr) + 17); //从开始打印标识之后的内容
			prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr)); //截取开始标识和结束标识之间的内容
			window.document.body.innerHTML = prnhtml; //把需要打印的指定内容赋给body.innerHTML
			window.print(); //调用浏览器的打印功能打印指定区域
			window.document.body.innerHTML = bdhtml; // 最后还原页面

		}
	</script>
</body>
</html>