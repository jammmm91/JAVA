<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>회원리스트</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/list.css'>
  </head>
  <body>
    <section class="wrap">
        <table>
            <thead>
                <tr>
                    <th>idx</th><th>ID</th><th>NAME</th><th>BIRTHDAY</th><th>UPDATE</th>
                </tr>
            </thead>
            <tbody>
            	${list }
            </tbody>
        </table>
       	<a href="/main" style=margin-top: 50px; width: >Home</a>
    </section>
</body>
</html>