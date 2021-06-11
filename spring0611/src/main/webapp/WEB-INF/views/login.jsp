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
	href="${pageContext.request.contextPath}/resources/login.css">

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
				<h1>login</h1>
			</div>
		</header>
		<section class="login_wrap">
			<form action="login_action" method="GET">
				<div>
					<label> 아이디  </label> <input type="text" name="id" id="id"
						placeholder="아이디를 입력하세요" /><br>
					<br>
				</div>
				<div>
					<label> 비밀번호  </label> <input type="password" name="pwd" id="pwd"
						placeholder="비밀번호를 입력하세요" /> 
						
						<input type="submit" value="입력 완료" />
				</div>
			</form>
		</section>
	</div>
</body>

</html>
