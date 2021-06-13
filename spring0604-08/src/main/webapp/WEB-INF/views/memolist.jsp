<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>메모작성</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/memolist.css'>
</head>
<body>
    <section class="wrap">
        <table>
            <thead>
                <tr>
                    <th>IDX</th><th>TITLE</th><th>CONTENT</th><th>CREATED TIME</th><th>UPDATED TIME</th><th>UPDATE</th><th>DELETE</th>
                </tr>
            </thead>
            <tbody>
				${memolist }
            </tbody>
        </table>
        <a href="/login/memo" style="margin-top: 50px;">신규작성</a>
        <br>
        <a href="/login" style="margin-top: 50px;">홈으로</a>
    </section>
</body>
</html>