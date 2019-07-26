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
		<script type="text/javascript" charset="UTF-8">
			// 页面载入时，把菜单列表初始化
			$(function() {
				$.post("menu", function(data) {
					var result = "";
					for (var i = 0; i < data.length; i++) {
						result += "<dl><dt>" + data[i].name + "<dt>";
						for (var j = 0; j < data[i].childMenuList.length; j++) {
							result += "<dd>" + data[i].childMenuList[j].name + "</dd>";
						}
						result += "</dl>";
					}
					$("body").html(result);
				});
			});

			// 鼠标移到dt标签上时，会把dt标签折叠
			$("dt").live("mouseover", function() {
				$(this).css("cursor", "pointer");
			});

			// 鼠标点击dt标签时，会把子菜单折叠或展开
			$("dt").live("click", function() {

				$(this).siblings().slideToggle(300);
				return false;
			});
		</script>
	</head>
	<body>
	</body>
</html>
