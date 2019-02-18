<%@page import="com.neusoft.finance.queryallinvoice.model.Invoice"%>
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
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/button.css"/>
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








</style>
<script type="text/javascript">
function doJump(pageNum){
	//alert(pageNum);
	var form = document.forms[0];
	form.action="<%=request.getContextPath()%>/queryallpageinvoice.action?pageNum="+pageNum;
	form.submit();
}
</script>
</head>
<body>
<%
if ((String)request.getAttribute("msg") !=null) { %>
    <script>
    <%String s=(String)request.getAttribute("msg");%>
    var str="<%=s%>";
    alert(str);
    </script>
<%}%>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 发票单查询</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">发票单查询</a></dl>
      
    </div>
	
	<form class="am-g" action="<%=request.getContextPath() %>/queryallpageinvoice.action" method="post">
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover"> <!-- class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" -->
			<tr>
				<td>发票id</td>
				<td>
					<input type="text" name="id" />(可选填)
				</td>
				</tr>
			<tr>
				<td>发票金额</td>
				<td>
					<input type="text" name="price" />(可选填)
				</td>
				</tr>
			<tr>
				<td>操作
				</td>
				<td>
					<input type="submit" value="查询" class="button"/>
					<input type="button" value="导出到excel" class="button" onclick="doExport()"/>
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
				<th >发票id</th>
				<th >发票金额</th>
				<th >登记日期</th>
				<th >发票状态</th>
				<th >领用分站</th>
				<th >分站领用日期</th>
				<th >客户领用日期</th>
				<th >丢失日期</th>
				<th >任务单号</th>
				<th >丢失者姓名</th>
				<th >原发票号</th>
				<th >配送员id</th>
				<th >备注</th>
				<th width="130px">操作</th>
			</tr>
			<c:forEach items="${list}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.price}</td>	
					<td>
					<c:if test="${u.registerDate==NULL || u.registerDate==''}">
					未登记
					</c:if>
					<c:if test="${u.registerDate!=NULL || u.registerDate!=''}">
					<fmt:formatDate value="${u.registerDate}" pattern="yyyy-MM-dd"/>
					</c:if>
					</td>
					<td><c:if test="${u.invoiceStateId==0}">未登记</c:if>
					    <c:if test="${u.invoiceStateId==1}">正常</c:if>
					    <c:if test="${u.invoiceStateId==2}">分站已领用</c:if>
					    <c:if test="${u.invoiceStateId==3}">客户已应用</c:if>
					    <c:if test="${u.invoiceStateId==4}">已丢失</c:if>
					    <c:if test="${u.invoiceStateId==5}">已作废</c:if>
					</td>
					<td>
					<c:if test="${u.substationId==NULL || u.substationId==''}">
					未领用
					</c:if>
					<c:if test="${u.substationId!=NULL || u.substationId!=''}">
					${u.substationId}
					</c:if>
					</td>
					<td>
					<c:if test="${u.substationDate==NULL || u.substationDate==''}">
					未领用
					</c:if>
					<c:if test="${u.substationDate!=NULL || u.substationDate!=''}">
					<fmt:formatDate value="${u.substationDate}" pattern="yyyy-MM-dd"/>
					</c:if>
					</td>
					<td>
					<c:if test="${u.customerDate==NULL || u.customerDate==''}">
					未领用
					</c:if>
					<c:if test="${u.customerDate!=NULL || u.customerDate!=''}">
					<fmt:formatDate value="${u.customerDate}" pattern="yyyy-MM-dd"/>
					</c:if>
					</td>	
					<td>
					<c:if test="${u.lostDate==NULL || u.lostDate==''}">
					未丢失
					</c:if>
					<c:if test="${u.lostDate!=NULL || u.lostDate!=''}">
					<fmt:formatDate value="${u.lostDate}" pattern="yyyy-MM-dd"/>
					</c:if>
					</td>
					<td>
					<c:if test="${u.taskId==NULL || u.taskId==''}">
					无
					</c:if>
					<c:if test="${u.taskId!=NULL || u.taskId!=''}">
					${u.taskId}
					</c:if>
					</td>
					<td>
					<c:if test="${u.loseName==NULL || u.loseName==''}">
					未丢失
					</c:if>
					<c:if test="${u.loseName!=NULL || u.loseName!=''}">
					${u.loseName}
					</c:if>
					</td>
					<td>
					<c:if test="${u.oringalInvoiceId==NULL || u.oringalInvoiceId==''}">
					无
					</c:if>
					<c:if test="${u.oringalInvoiceId!=NULL || u.oringalInvoiceId!=''}">
					${u.oringalInvoiceId}
					</c:if>
					</td>
					<td>
					<c:if test="${u.deliverId==NULL || u.deliverId==''}">
					无
					</c:if>
					<c:if test="${u.deliverId!=NULL || u.deliverId!=''}">
					${u.deliverId}
					</c:if>
					</td>
					<td>
					<c:if test="${u.remark==NULL || u.remark==''}">
					无
					</c:if>
					<c:if test="${u.remark!=NULL || u.remark!=''}">
					${u.remark}
					</c:if>
					</td>
					<td>
					<c:if test="${u.invoiceStateId==4}">已丢失</c:if>
					<c:if test="${u.invoiceStateId!=4}">
					<a class="am-btn am-btn-default am-btn-xs am-text-success am-round" href="<%=request.getContextPath() %>/invoicedsbyid.action?id=${u.id}"><span class="am-icon-search" title="丢失">丢失</span></a>
					</c:if>
					</td>
				</tr>
			
			</c:forEach>
			
		</table>
		
				
	</c:if>
	
	<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">${invoice.counts }</span>
						条记录，当前第
						<span class="ui_txt_bold04">
							${invoice.pageNum }/${invoice.pages }
						</span>
						页
					</div>
					<div class="ui_frt">
						<!--    如果是第一页，则只显示下一页、尾页 -->
							<!-- 如果下面按钮有 class="ui_input_btn01"属性的话，则可以自动隐藏 -->
							<input type="button" class="button" value="首页" onclick="doJump(1);" />
							<input type="button" class="button" value="上一页" onclick="doJump(${invoice.pageNum - 1});"  />
							<input type="button" class="button" value="下一页" onclick="doJump(${invoice.pageNum + 1});" />
							<input type="button" class="button" value="尾页" onclick="doJump(${invoice.pages});" />
						
						
						
						<!--     如果是最后一页，则只显示首页、上一页 -->
						
						转到第<input type="text" id="jumpNumTxt" value="${invoice.pageNum }" class="ui_input_txt01" />页
							 <input type="button" class="button" value="跳转" onclick="doJump(document.getElementById('jumpNumTxt').value);" />
						跳转到第
						<select onchange="doJump(this.value)">
							<%
							Invoice invoice = (Invoice)request.getAttribute("invoice");
								if(invoice!=null){
									int pages = invoice.getPages();
									int pageNum = invoice.getPageNum();
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
	</form>
</div>
<script type="text/javascript">
function doExport(){
	var form = document.forms[0];
	form.action="<%=request.getContextPath()%>/dcexcel.action";
	form.submit();
}
</script>
</body>
</html>