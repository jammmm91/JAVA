<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Main</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/main.css'>
</head>
<body  bgcolor = #black   >
<br>
    <center>
    <h1>HELLO!</h1>
    <h2>WELCOME TO JAVA WORLD</h2>
  </center>

    <section class="wrap">
        <a href="login">로그인</a>
        <a href="memolist">메모</a>
        <a href="list">회원목록</a>
        <a href="insert">신규회원 등록</a>
        <a href="select">검색</a>
        <a href="update">수정</a>
        <a href="logout">로그아웃</a>
        <a href="create">테이블생성</a>
    </section>
 
</body>
</html>