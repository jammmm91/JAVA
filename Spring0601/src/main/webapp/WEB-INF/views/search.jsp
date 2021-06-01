<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>직원검색</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/search.css'>
  </head>
  <body>
    <section class="wrap">
      <form action="search_action">
      	  <input type="hidden" name="idx" />
        <label> ENTER NAME
       	  <input type="text" name="staff_name" value="${name }" />
        </label>
          <input type="submit" value="search" />
        <a href = "/main">Home</a>
      </form>
    </section>
</body>
</html>
