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
          <input type="text" name="student_name" value="${student_name }" />
        </label>
        <label> 중간고사점수입력 :
          <input type="number" name="middlescore" value="${middleScore }" />
        </label>
        <label> 기말고사점수입력 :
          <input type="number" name="finalscore" value="${finalScore }" />
        </label>
        <input type="submit" value="입력완료" />
      </form>
    </section>
</body>
</html>
