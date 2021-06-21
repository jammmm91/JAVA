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
    <h2>입주자 관리 프로그램</h2>
  </center>

    <section class="wrap">
        <a href="insert">입주자정보입력</a>
        <a href="list">입주자목록</a>
        <a href="statistical">입주자통계</a>
        <a href="insertApt">아파트생성</a>
        <a href="update">수정</a>
        <a href="create">테이블생성</a>
    </section>
 
</body>
</html>