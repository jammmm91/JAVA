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
        <form action="insertApt_action" method="post">
            <label> 아파트이름
            <br> 
                <input type="text" name="aptName" placeholder="이름을 입력하세요" />
            </label>
                      
            <input type="submit" value="저장" />
            <br>
        <a href="/main" style="margin-top: 50px;">홈으로</a>
        </form>
        
    </section>
</body>
</html>