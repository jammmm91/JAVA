<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>회원 가입</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
    <section class="wrap">
    <h1>SIGN UP</h1>
        <form action="insert_action" method="post">
            <label> 이름
            <br> 
                <input type="text" name="name" placeholder="이름을 입력하세요" />
            </label>
            <label> 나이  
            <br> 
                <input type="text" name="age" placeholder="나이를 입력하세요" />
            </label>
            <label> 성별
            <br> 
                <input type="text" name="sex" placeholder="성별을 입력하세요" />
            </label>
           
            <input type="submit" value="저장" />
            <br>
        <a href="/main" style="margin-top: 50px;">홈으로</a>
        </form>
        
    </section>
</body>
</html>