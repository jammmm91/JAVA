<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>정보입력</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/insert.css'>
  </head>
  <body>
    <section class="wrap">
      <form action="insert_action" method="POST">
      	<input type="hidden" name="idx" />
        <label> ID<br>
          <input type="text" name="user_id" placeholder="아이디" />
        </label>
        <label> PWD<br>  
          <input type="password" name="user_pwd" placeholder="비밀번호" />
        </label>
        <label> NAME<br>  
          <input type="text" name="user_name" placeholder="이름" />
        </label>
        <label> BIRTHDAY<br>  
          <input type="date" name="user_birthday" placeholder="생일" />
        </label>
        <label> ADDRESS<br>  
          <input type="text" name="user_address" placeholder="주소" />
        </label>
        <input type="submit" value="Sign up" /></br>
        <a href = "/main">Home</a>
      </form>
    </section>
</body>
</html>
