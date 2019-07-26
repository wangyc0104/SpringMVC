<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script src="js/jquery-1.7.2.js" charset="UTF-8" type="text/javascript"></script>
	</head>
	<body>
		<form action="login" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username" value="" /></td>
				</tr>
				<tr>
					<td>密&emsp;码：</td>
					<td><input type="text" name="password" value="" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>
