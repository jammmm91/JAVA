<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>목록</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/list.css'>
</head>
<body>
    <section class="wrap">
        <table>
            <thead>
                <tr>
                    <th>IDX</th><th>NAME</th><th>AGE</th><th>SEX</th><th>UPDATE</th><th>DELETE</th>
                </tr>
            </thead>
            <tbody>
				${list }
            </tbody>
        </table>
        <br>
        <a href="/main" style="margin-top: 50px;">홈으로</a>
    </section>
    
</body>
</html>