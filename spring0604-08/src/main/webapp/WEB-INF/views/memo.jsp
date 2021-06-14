<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>메모작성</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/memo.css'>
</head>
<body>
    <section class="wrap">
    <h1>MEMO</h1>
        <form action="memo_action" method="post">
            <label> ID <br> 
                <input type="text" name="id"  value="${original_id }" disabled/>
            </label>
            <label> TITLE <br> 
                <input type="text" name="title" placeholder="제목을 입력하세요" />
            </label>
            <label> MEMO <br>  
                <textarea type="text" name="content" cols='50' rows='10' placeholder="메모를 입력하세요"></textarea>
            </label>
            <input type="submit" value="Insert" />
            <br>
        <a href="/login" style="margin-top: 50px;">홈으로</a>
        </form>
        
    </section>
</body>
</html>