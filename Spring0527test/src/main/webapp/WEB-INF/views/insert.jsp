<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>직원정보입력</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/insert.css'>
  </head>
  <body>
    <section class="wrap">
      <form action="insert_action">
      	<input type="hidden" name="idx" />
        <label> 이름입력  
          <input type="text" name="staff_name" value="" />
        </label>
        <label> 성별입력  
          <input type="text" name="staff_sex" value="" />
        </label>
        <label> 주소입력  
          <input type="text" name="staff_address" value="" />
        </label>
        <label> 부서입력  
          <input type="text" name="staff_department" value="" />
        </label>
        <input type="submit" value="Input" /></br>
        <a href = "/main">Home</a>
      </form>
    </section>
</body>
</html>
