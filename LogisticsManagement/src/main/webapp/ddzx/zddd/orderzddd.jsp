<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.js"></script>
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

</style>
</head>
<body>
<script type="text/javascript">
window.onload=function(){
	ajax();
}
function ajax(){
	$.ajax({
	    type: "post",
	    async: false,
	    url: "${pageContext.request.contextPath}/ajaxorderzddd.action",
	     //发送到服务器的参数
	    datatype: "JSON",
	     success: function (data) {
	    	 
	    	 //alert(JSON.stringify(data));
	    	 var item;
	    	 if(data.length>0){
	    		 $.each(data,function(i,result){ 
		    		 var id=result.orderId
		    		 var url="<%=request.getContextPath() %>/zdadd.action?id="+id;
		    		 //alert(url);
		         item = "<tr><td>"+result.orderId+"</td><td>"
		         +result.shopId+"</td><td>"+result.clientId
		         +"</td><td>"+result.shopNum+"</td><td>"
		         +result.prderPrice+"</td><td><a class='am-btn am-btn-default am-btn-xs am-text-success am-round' href='"+url+"'><span class='am-icon-search'>自动调度</span></a></td></tr>";  
		    	 $("#tab").append(item); })
	    	 }
	    	 if(data.length==0){
	    		 item = "暂无自动调度订单";
	    		 $("#tab").hide();
	    		 $(".am-g").append(item);
	    	 }
	    	 
	    },
	    error: function (errorMsg) {
	        alert("error!");
	    }
	});

}
<%
if ((String)request.getAttribute("msg") !=null) { 
   
    String s=(String)request.getAttribute("msg");%>
    var str="<%=s%>";
    alert(str);
    
<%}%>
</script>
<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 可自动调度订单查询</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">任务单查询</a></dl>
      
    </div>
	
	<form class="am-g" action="" method="post">
		
	
	
	
		<table width="90%" class="am-table-bordered am-table-radius am-table-striped am-table-hover" id="tab">
			<tr class="table-firstline">
				<th >订单id</th>
				<th >商品id</th>
				<th >客户id</th>
				<th >订购数量</th>
				<th >订单金额</th>
				<th width="130px">操作</th>
			</tr>
			
			
			
		</table>
	
	</form>
</div>
</body>
</html>