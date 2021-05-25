<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form style="width: 100%; padding: 20px; action="insert_action">
		<input type="text" name="name" placeholder="이름입력"	style="width: 90%; margin: 10px;" />
		<input type="text" name="middle" placeholder="중간고사 성적" style="width: 90%; margin: 10px;" />
		<input type="text" name="final" placeholder="기말고사 성적" style="width: 90%; margin: 10px;" />
		<input type="submit" value="입력완료" />
	</form>
</body>
</html>
