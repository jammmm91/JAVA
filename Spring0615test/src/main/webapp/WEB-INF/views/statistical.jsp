<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>주민통계</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
    <section class="wrap">
        <form action="#############" method="post">
            <label> 전체입주자수
            <br> 
                <input type="text" name="totalMember" value="${totalMember }" disabled/>
            </label>
            <label> 평균나이  
            <br> 
                <input type="text" name="avgAge" value="${totalavgAge }" disabled/>
            </label>
            <label> 남녀비율
            <br> 
                <input type="text" name="ratioSex" value="${totalratioSex }" disabled/>
            </label>
            <br>
        <a href="/main" style="margin-top: 50px;">홈으로</a>
        </form>
        
    </section>
</body>
</html>