<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>main</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script src="js/jquery-1.7.2.js" type="text/javascript" charset="UTF-8"></script>
		<script type="text/javascript" charset="UTF-8">
			$(function() {
				$("a").click(function() {
					// 让当前下载数+1
					var $td = $(this).parent().prev();
					$td.html(parseInt($td.html()) + 1);
				});
			});
		</script>

	</head>

	<body>
		<h3>下载页面</h3>
		<hr>
		<table border="1px" style="border-collapse: collapse">
			<thead>
				<tr>
					<td>资料名称</td>
					<td>下载次数</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${fileList}" var="file">
					<tr>
						<td>${file.fileName}</td>
						<td>${file.downloadCounts}</td>
						<td><a href="downloadFile?id=${file.id}&fileName=${file.fileName}">下载</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>
