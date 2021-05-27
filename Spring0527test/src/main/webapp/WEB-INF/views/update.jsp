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
        <label> 이름입력 :
          <input type="text" name="staff_name" value="${staff_name }" />
        </label>
        <label> 성별입력 :
          <input type="text" name="staff_sex" value="${staff_sex }" />
        </label>
        <label> 주소입력 :
          <input type="text" name="staff_address" value="${staff_address }" />
        </label>
        <label> 소속부서입력 :
          <input type="text" name="staff_department" value="${staff_department }" />
        </label>
        <input type="submit" value="수정완료" />
        <a href = "/main">Home</a>
      </form>
    </section>
</body>
</html>
