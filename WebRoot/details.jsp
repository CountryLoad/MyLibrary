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
	<h1>The detail of the book you wanted:</h1>
	<table border=1 style="width: 554px;">
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>AuthorID</th>
			<th>Publisher</th>
			<th>PublishDate</th>
			<th>Price/$</th>
		</tr>
		<tr>
			<td><center>
					<s:property value="book.ISBN" />
				</center></td>
			<td><center>
					<s:property value="book.Title" />
				</center></td>
			<td><center>
					<s:property value="book.AuthorID" />
				</center></td>
			<td><center>
					<s:property value="book.Publisher" />
				</center></td>
			<td><center>
					<s:property value="book.PublishDate" />
				</center></td>
			<td><center>
					<s:property value="book.Price" />
				</center></td>
		</tr>
	</table>
	<br>
	<h1>The detail of the author you wanted:</h1>
	<table border=1 style="width: 554px; ">
		<tr>
			<th>AuthorID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Country</th>
		</tr>
		<tr>
			<td><center>
					<s:property value="au.AuthorID" />
				</center></td>
			<td><center>
					<s:property value="au.Name" />
				</center></td>
			<td><center>
					<s:property value="au.Age" />
				</center></td>
			<td><center>
					<s:property value="au.Country" />
				</center></td>
		</tr>
	</table>
</body>
</html>

