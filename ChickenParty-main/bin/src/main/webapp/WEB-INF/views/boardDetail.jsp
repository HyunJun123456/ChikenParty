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
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style type="text/css">
#main_div {
	margin-left: 400px;
	margin-top: 20px;
	position: absolute;
}
table{
	margin-left:50px;
	margin-top:50px;
	width: 700px;
}
#location_list{
	 font-weight: bolder;
	 font-size: 20px;
	 position: absolute;
	 margin-top: 30px;
	 margin-left: 450px;
}
</style>
<script type="text/javascript">
var userId="${param.userId}";
$(function(){
	if(userId=="admin"){
		$(".hide_btn").show();
	}
});
</script>
</head>
<body>
	<%@ include file="./template/header.jsp"%>
	 <%@ include file="./template/navbar.jsp"%>
<span id="location_list" style="text-align: center;">공지사항 글쓰기</span>
	<div id="main_div">
		<table border="1"
			class="table table-condensed table-bordered table-hover">
			
			<tr>
				<th>글번호</th>
				<td>${boardDto.boardSeq }
			</tr>
			<tr>
				<th>공지사항제목</th>
				<td>${boardDto.boardTitle }
			</tr>
			<tr>
				<th>공지사항내용</th>
				<td><textarea rows="10" cols="120" readonly="readonly">${boardDto.boardContent }</textarea>
			</tr>
			<tr>
				<th>MYDATE</th>
				<td>${boardDto.boardDate }
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input style="display:none;" type="button" class="hide_btn" value="수정" onclick="location.href='updateBoardForm?boardSeq=${boardDto.boardSeq}&userId=${param.userId }'">
				<input style="display:none;" type="button" class="hide_btn" value="삭제" onclick="location.href='deleteBoard?boardSeq=${boardDto.boardSeq}&userId=${param.userId }'">
				<input type="button" value="목록" onclick="location.href='/board/boardList?userId=${param.userId}'">
				</td>
			</tr>
		</table>

	</div>
</body>
</html>