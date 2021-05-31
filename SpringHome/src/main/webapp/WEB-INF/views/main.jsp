<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Main</title>
<meta name='viewport' content='width=device-width, intial-scale=1'>
<link rel="stylesheet" type="text/css" media="screen"
	href='${pageContext.request.contextPath}/resources/main.css'>
</head>
<body>
	<section class="wrap">
		<a href="list">List</a> 
		<a href="insert">Insert Data</a> 
		<a href="create">Create Table</a>
	</section>
</body>
</html>
