<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<style>
img {
	width: 70%;
	height: 100%;
	position: absolute;
	margin-top: -50px;
	margin-left: -10px;
	position: absolute
}

#idBtn {
	position: absolute;
	margin-left: 1500px;
	margin-top: 300px;
}

#pwBtn {
	position: absolute;
	margin-left: 1500px;
	margin-top: 330px;
}

#loginBtn {
	position: absolute;
	margin-left: 1700px;
	margin-top: 275px;
	height: 90px;
	background-color: #0054FF;
	color: white;
	border-style: none;
	border-radius: 3px;
	padding: 7px;
}

p {
	font-weight: bolder;
	font-size: 30px;
	position: absolute;
	margin-top: 250px;
	margin-left: 1500px;
}
</style>
<body>
	<h2>${errorMsg }</h2>
	<img alt="치킨사진"
		src="https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202112/27/a99042fd-9510-42e9-97d6-6ae45ad666fc.jpg">
	<p>로그인</p>
	<form action="login" method="post">
		<input id="idBtn" type="text" name="userId" placeholder="User ID">
		<br> <input id="pwBtn" type="password" name="userPw"
			placeholder="User PW"> <input id="loginBtn" type="submit"
			value="로그인">
	</form>

</body>
</html>