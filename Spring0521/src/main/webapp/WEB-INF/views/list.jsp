<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>성적리스트</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/list.css'>
  </head>
  <body>
    <section class="wrap">
        <table>
            <thead>
                <tr>
                    <th>idx</th><th>이름</th><th>중간점수</th><th>기말점수</th><th>생성일</th>
                </tr>
            </thead>
            <tbody>
            	${list }
            </tbody>
        </table>
       	<a href="/jaemin" style="margin-top: 50px;">홈으로</a>
    </section>
</body>
</html>