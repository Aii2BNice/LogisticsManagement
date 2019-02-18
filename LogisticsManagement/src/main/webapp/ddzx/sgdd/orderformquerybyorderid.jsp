<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/admin.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/button.css"/>
<title>Insert title here</title>
<style type="text/css">
/*固定表的位置  */
table {
	position: relative;
	left: 70px;
}

table tr td {
	height: 25px;
	padding: 2px;
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
	<%session.removeAttribute("dddsc");
	  session.removeAttribute("scrwd");
	  session.removeAttribute("scdbd");
	%>
	<div class="admin-biaogelist">
		<div class="listbiaoti am-cf">
			<ul class="am-icon-flag on">订单查询
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置： 首页 >
				<a href="#">任务单查询</a>
			</dl>

		</div>

		<%-- <form class="am-g" action="<%=request.getContextPath() %>/.action" method="post"> --%>
		<table width="90%"
			class="am-table-bordered am-table-radius am-table-striped am-table-hover" id="b">
			<tr>
				<td>订单id</td>
				<td>${o.orderId }</td>
			</tr>
			<tr>
				<td>商品id</td>
				<td>${o.shopId }</td>
			</tr>
			<tr>
				<td>客户id</td>
				<td>${o.clientId }</td>
			</tr>
				<tr>
				<td >订购数量</td>
				<td>${o.shopNum }</td>
			</tr>
				<tr>
				<td >订单金额</td>
				<td>${o.prderPrice }</td>
			</tr>
				<tr>
				<td >订单状态编号</td>
				<td>${o.orderStateId }</td>
			</tr>
			</tr>
				<tr>
				<td >订单类型编号</td>
				<td>${o.orderTypeId }</td>
			</tr>
			</tr>
				<tr>
				<td >录入时间</td>
				<td>
				<fmt:formatDate value="${o.orderDate }" pattern="yyyy-MM-dd"/>
				</td>
			</tr>
			</tr>
				<tr>
				<td >送货日期</td>
				<td>
				<fmt:formatDate value="${o.deliverDate }" pattern="yyyy-MM-dd"/>
				</td>
			</tr>
			</tr>
				<tr>
				<td >送货地址</td>
				<td>${o.deliverAddr }</td>
			</tr>
			</tr>
				<tr>
				<td >备注</td>
				<td>${o.remark }</td>
			</tr>
			</tr>
				<tr>
				<td >是否发票(1是,0否)</td>
				<td>${o.invoice }</td>
			</tr>
			</tr>
				<tr>
				<td >投递分站id</td>
				<td>${o.substationId }</td>
			</tr>
			</tr>
				<tr>
				<td >操作员id</td>
				<td>${o.operationId }</td>
			</tr>
			<tr>
				<td >收件人</td>
				<td>${o.receiveName }</td>
			</tr>
			<tr>
				<td >收件人电话</td>
				<td>${o.receiveTel }</td>
			</tr>
			<tr>
				<td >收件人邮编</td>
				<td>${o.receiveZipcode }</td>
			</tr>
			<tr>
				<td >操作</td>
				<td><c:if test="${o.orderStateId==2 }">
				    <c:if test="${o.orderTypeId==1 || o.orderTypeId==3  }"><button class="button" onclick="javascript:window.location.href='<%=request.getContextPath()%>/orderformquerybyorderid2.action?orderId=${o.orderId }'">调度</button></c:if>
					<c:if test="${o.orderTypeId==2 }">退订中</c:if>
					<c:if test="${o.orderTypeId==4 }">退货中</c:if>
				</c:if>
				<c:if test="${o.orderStateId==1 }">
				缺货
				</c:if>
				<c:if test="${o.orderStateId==3 }">
				已调度
				</c:if>
				<c:if test="${o.orderStateId==4 }">
				中心库房出库
				</c:if>
				<c:if test="${o.orderStateId==5 }">
				分站库房到货
				</c:if>
				<c:if test="${o.orderStateId==6 }">
				任务已分配
				</c:if>
				<c:if test="${o.orderStateId==7 }">
				已领货
				</c:if>
				<c:if test="${o.orderStateId==8 }">
				已完成
				</c:if>
				<c:if test="${o.orderStateId==7 }">
				失败
				</c:if>
				</td>
			</tr>
			
		</table>
		<!-- </form>  -->
		<a href="" id="a">导出表单</a>
		<a href="javascript:void(0);" onclick="doPrint()">打印</a>
	</div>
		
<script>
        // 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
        var html = "<html><head><meta charset='utf-8' /></head><body>" + document.getElementsByTagName("table")[0].outerHTML + "</body></html>";
        // 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
        var blob = new Blob([html], { type: "application/vnd.ms-excel" });
        var a = document.getElementById("a");
        // 利用URL.createObjectURL()方法为a元素生成blob URL
        a.href = URL.createObjectURL(blob);
        // 设置文件名
        a.download = "订单表.xls";
        
        function doPrint(){
            
            //根据div标签ID拿到div中的局部内容
            bdhtml=window.document.body.innerHTML; 
            var jubuData = document.getElementById("b").outerHTML;
            //把获取的 局部div内容赋给body标签, 相当于重置了 body里的内容
            window.document.body.innerHTML= jubuData; 
            //调用打印功能
            window.print();
            window.document.body.innerHTML=bdhtml;//重新给页面内容赋值；
            return false;
        }
    </script>
	
</body>
</html>