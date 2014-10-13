<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My DBMS of Book</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<h1>欢迎!张祖亮的图书管理系统.</h1>
	<br>

	<h1>Look for Books by Author's Name</h1>
	<form action="books.action">
		<table>
			<tr>
				<td>Author's Name :</td>
				<td><input type=text name=Name></td>
				<td><input type=submit name=subm value="Search"></td>
			</tr>
		</table>
		<!-- 参数名和action中属性名一样 -->
	</form>
	<br>	<br>	<br>	<br>	<br>	<br>
	注：本系统目前只有两个作者：Dante Alighieri 和 John Milton ，复制名字查询。
</body>
</html>

