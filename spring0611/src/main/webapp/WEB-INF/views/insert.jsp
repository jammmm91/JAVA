<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- 상단taglib 부분 spring 이미지 사용시 필요 -->
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Main</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/insert.css">

</head>

<body>
	<div class="top">
		<div class="wrapper">
			<ul class="top_menu">
				<li class="login"><a href="signup"><p>회원가입</p></a></li>
				<li class="login"><a href="login"><p>로그인</p></a></li>
				<li class="login"><a href="myList"><p>나의메모</p></a></li>
			</ul>
		</div>
	</div>
	<header>
		<div class="header-wrap">
			<a href="/memoprogram2">MemoKit</a>
		</div>
	</header>
	<nav>
		<ul>
			<li>
				<div class="menu">
					<a href="insert">OPEN MEMO NEW</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="allList">OPEN LIST</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="create">CREATE TABLE</a>
				</div>
			</li>

		</ul>
	</nav>
	<div class="main_bottom">
		<header>
			<div>
				<h1>new content Here</h1>
			</div>
		</header>
		<section class="data_insert">
			<form action="insert_action" method="POST">
				<table width="100%">
					<tr>
						<td>제목</td>
						<td><input type="text" name="title" placeholder="제목을 입력하세요"></td>
					</tr>

					<tr height="1" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr>

					<tr>
						<td>작성자</td>
						<td><input type="text" name="id" value="${id }" readonly></td>
					</tr>

					<tr height="2" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr>
					<tr>
						<td>내용</td>
						<td id="bottom"><textarea name="contents" cols="50" rows="10"
								placeholder="내용을 입력하세요"></textarea></td>
					</tr>

					<tr height="1" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr>
					<input type="hidden" name="id" value="${pwd }">
				</table>
				<input type="submit" value="글쓰기" class="submit_btn">
			</form>
		</section>
	</div>
</body>

</html>
