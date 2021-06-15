<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>데이터 입력</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' type='text/css' media='screen'
	href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
	<section class="wrap">
		<h1>SIGN UP</h1>
        <form action="update_action" method="POST">
            <label>
                <input type="hidden" name="idx" value="${original_idx }"/>
            </label>
            <label> 이름<br> 
                <input type="text" name="name" value="${original_name }"/>
            </label>
            <label> 나이<br> 
                <input type="text" name="age"  value="${original_age }"/>
            </label>
            <label> 성별<br> 
                <input type="text" name="sex" value="${original_sex }"/>
            </label>
           
            <input type="submit" value="수정완료" />
            <br>
        <a href="/main" style="margin-top: 50px;">홈으로</a>
        </form>
	</section>
</body>
</html>