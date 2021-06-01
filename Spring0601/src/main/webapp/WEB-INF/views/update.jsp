<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>성적수정페이지</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/insert.css'>
  </head>
  <body>
    <section class="wrap">
      <form action="update_action">
      	<input type="hidden" name="idx" value="${idx }"/>
        <label> ID
          <input type="text" name="user_id" value="${user_id }" />
        </label>
        <label> PASSWORD
          <input type="text" name="user_pwd" value="${user_pwd }" />
        </label>
        <label> NAME
          <input type="text" name="user_name" value="${user_name }" />
        </label>
        <label> BIRTHDAY
          <input type="text" name="user_birthday" value="${user_birthday }" />
        </label>
        <label> ADDRESS :
          <input type="text" name="user_address" value="${user_address }" />
        </label>
        <input type="submit" value="수정완료" />
        <a href = "/main">Home</a>
      </form>
    </section>
</body>
</html>
