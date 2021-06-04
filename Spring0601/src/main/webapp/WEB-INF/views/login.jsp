<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>로그인</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/insert.css'>
  </head>
  <body>
    <section class="wrap">
      <form action="login_action" method="POST">
      
        <label> ID
        <br>
          <input type="text" name="user_id" placeholder="아이디" />
        </label>
        <label> PWD
        <br>  
          <input type="password" name="user_pwd" placeholder="비밀번호" />
        </label>
        
        <input type="submit" value="enter" /></br>
        <a href = "/main">Home</a>
      </form>
    </section>
</body>
</html>
