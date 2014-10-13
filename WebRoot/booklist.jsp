<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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

<title>List of Books</title>

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
	<h1>图书管理系统.</h1>
	<br>
	<h1>The list of books you wanted:</h1>
	Author :
	<%=request.getParameter("Name")%><br>
	<br> Books :
	<br>
	<table border=1 width="300" height="50" cellspacing="1">
		<tr>
			<th>Title</th>
			<th>Delete</th>
		</tr>

		<s:iterator id="book" value="booklist">
			<tr>
				<td><center>
						<s:url id="detailURL" action="details">
							<s:param name="Title" value="#book.Title" />
						</s:url>
						<s:a href="%{detailURL}">
							<s:property value="#book.Title" />
						</s:a>
					</center></td>
				<td><center>
						<s:url id="deleteURL" action="del">
							<s:param name="Title" value="#book.Title" />
						</s:url>
						<s:a href="%{deleteURL}">
							<input type=submit name=subm value="删除">
						</s:a>
					</center></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>

