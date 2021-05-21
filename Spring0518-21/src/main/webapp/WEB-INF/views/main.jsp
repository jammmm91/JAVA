<%-- <%@로 시작하는 것 = jsp문법 이라고 한다 --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>  
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Main</title>
    <meta name='viewport' content='width=device-width, intial-scale=1'>
    <link rel="stylesheet" type = "text/css" media="screen" 
   	 href='${pageContext.request.contextPath}/resources/main.css'>
  </head>
  <body>
    <section class="wrap">
	    <a href="list">목록보기</a>
	    <a href="insert">데이터 입력</a>
	    <a href="create">테이블 생성</a>
  </section>

  </body>
</html>