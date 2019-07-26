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
		<title>index</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script src="js/jquery-1.7.2.js" type="text/javascript" charset="UTF-8"></script>
		<script type="text/javascript" charset="UTF-8">
			var usernameFlag = false;
			var passwordFlag = false;
			var passwordCheckFlag = false;
			var username = "";
			var password = "";
			var passwordCheck = "";

			// 正则判断
			function matchPattern(str, pattern) {
				var re, isMatch;
				re = new RegExp(pattern);
				isMatch = str.match(re);
				return isMatch;
			}

			$(function() {
				// 失焦,开始验证
				$("#username").blur(function() {
					username = $(this).val();
					// 验证是否框框为空,如果是,则在框框后面的<span>中把innerTEXT改成"*必须填写！"
					if (username == "") {
						$(this).next().css("color", "red");
						$(this).next().html("* 必须填写！");
						usernameFlag = false;
					} else {
						$(this).next().css("color", "green");
						$(this).next().html("* 填写正确！");
						usernameFlag = true;
					}
				});
				$("#password").blur(function() {
					password = $(this).val();
					// 验证是否框框为空,如果是,则在框框后面的<span>中把innerTEXT改成"*必须填写！"
					if (password == "") {
						$(this).next().css("color", "red");
						$(this).next().html("* 必须填写！");
						passwordFlag = false;
					} else if (!matchPattern(password, /^(\w){6,12}$/)) {
						// 验证是否密码符合6~12位字母数字下划线
						$(this).next().css("color", "red");
						$(this).next().html("* 密码格式不匹配！");
						passwordFlag = false;
					} else {
						$(this).next().css("color", "green");
						$(this).next().html("* 填写正确！");
						passwordFlag = true;
					}

				});
				$("#passwordCheck").blur(function() {
					passwordCheck = $(this).val();
					// 验证是否框框为空,如果是,则在框框后面的<span>中把innerTEXT改成"*必须填写！"
					if (passwordCheck == "") {
						$(this).next().css("color", "red");
						$(this).next().html("* 必须填写！");
						passwordCheckFlag = false;
					} else if (passwordCheck != password) {
						$(this).next().css("color", "red");
						$(this).next().html("* 两次密码必须一致！");
						passwordCheckFlag = false;
					} else {
						$(this).next().css("color", "green");
						$(this).next().html("* 填写正确！");
						passwordCheckFlag = true;
					}
				});
				// 点击"提交"按钮,开始验证
				$(":submit").click(function() {
					if (usernameFlag == false || passwordFlag == false || passwordCheckFlag == false || $(":file").val() == "") {
						alert("请添加完整信息");
						return false;
					}
				});

			});
		</script>
	</head>

	<body>
		<form action="register" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>&emsp;用户名：</td>
					<td><input type="text" id="username" name="username" value="" />&nbsp;<span>*</span></td>
				</tr>
				<tr>
					<td>&emsp;&emsp;密码：</td>
					<td><input type="text" id="password" name="password" value="" />&nbsp;<span>*</span></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="text" id="passwordCheck" name="passwordCheck" value="" />&nbsp;<span>*</span></td>
				</tr>
				<tr>
					<td>&emsp;&emsp;头像：</td>
					<td><input type="file" name="file" /></td>
				</tr>
				<tr>
					<td colspan="2" height="50px" align="center"><input type="submit" value="提交" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>
