<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>성적입력</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/insert.css'>
  </head>
  <body>
    <section class="wrap">
      <form action="insert_action">
      	<input type="hidden" name="idx" />
        <label> 이름입력 :
          <input type="text" name="student_name" value="" />
        </label>
        <label> 중간고사점수입력 :
          <input type="number" name="middlescore" value="중간점수" />
        </label>
        <label> 기말고사점수입력 :
          <input type="number" name="finalscore" value="기말점수" />
        </label>
        <input type="submit" value="입력완료" />
      </form>
      <a href = "/jaemin">홈으로</a>
    </section>
</body>
</html>
