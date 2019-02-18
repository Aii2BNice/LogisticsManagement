<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流配送管理系统</title>
</head>

	<frameset rows="51,*,58" frameborder="no" border="1px">
		<frame src="<%=request.getContextPath() %>/fzgl/main/top.jsp">
		<frameset cols="330,*">
			<frame src="<%=request.getContextPath() %>/fzgl/main/left.jsp" scrolling="no">
			<frame name="right" src="<%=request.getContextPath() %>/system/main/right.jsp" scrolling="no">
		</frameset>
		<frame src="<%=request.getContextPath() %>/fzgl/main/bottom.jsp">
	</frameset>

</html>