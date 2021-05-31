<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>LIST</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type = "text/css" media="screen" 
    	href='${pageContext.request.contextPath}/resources/insert.css'>
  </head>
<body>
	<section class="wrap">
      <form action="insert_action">
        <label> NAME <input type="text" name="name" value="" /></label>
        <label> MIDDLESCORE <input type="number" name="middle" value="your middle score" /></label>
        <label> FINALSCORE <input type="number" name="final" value="your final score" /></label>        
        <input type="submit" value="INSERT" />
      </form>
</body>
</html>
