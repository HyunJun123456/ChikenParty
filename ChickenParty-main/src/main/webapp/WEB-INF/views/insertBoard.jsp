<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">
#main_div {
	margin-left: 400px;
	margin-top: 200px;
}

textarea {
	border-style: none;
}
#chainTbl{
	position: absolute;
	margin-left: 450px;
	margin-top: 80px;
	width: 1300px;
}
</style>
</head>
<body>
	<%@ include file="./template/header.jsp"%>
	 <%@ include file="./template/navbar.jsp"%>

	<form action="insertBoard" method="post">
		<input type="hidden" name=userId value="${param.userId}">
		<table border="1" id="chainTbl"
			class="table table-bordered table-hover">
			<tr>
				<th>공지사항 제목</th>
				<td><input type="text" name="boardTitle"></td>
			</tr>
			<tr>
				<th>공지사항 내용</th>
				<td><textarea rows="10" cols="60" name="boardContent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="취소" onclick="location.href='boardList?userId=${param.userId}'">
					<input type="submit" value="등록">
				</td>
			</tr>
		</table>
</form>
</body>
</html>