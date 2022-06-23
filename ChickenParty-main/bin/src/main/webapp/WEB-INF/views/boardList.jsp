<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style type="text/css">

#main_div{
	margin-left: 400px;
	margin-top: 20px;
	position: absolute;
	
}
table{
	margin-left:50px;
	margin-top:50px;
	width: 500px;
	
}
tr{
	width: 150px;
}
#titleTd{
	width: 500px;
}
#location_list{
	 font-weight: bolder;
	 font-size: 20px;
	 position: absolute;
	 margin-top: 30px;
	 margin-left: 450px;
}
</style>
<script>
	var userId="${param.userId}";
	$(function(){
		if(userId=="admin"){
			$("#writeBtn").show();
		}
	});
</script>
</head>
<body>
 <%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<span id="location_list" style="text-align: center;">공지사항</span>
<div id="main_div">
	<table border="1" class="table table-condensed table-bordered table-hover">
		<tr>	
			<th>MYNO</th>
			<th>MYTITLE</th>
			<th>MYDATE</th>
		</tr>
		<c:choose>
			<c:when test="${empty boardDto }">
				<tr>
					<td >----작성된글이 존재하지 않습니다----</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${boardDto }" var="boardDto">
					<tr>
						<td>${boardDto.boardSeq }</td>
						<td id="titleTd"><a href="boardDetail?boardSeq=${boardDto.boardSeq}&userId=${param.userId}">${boardDto.boardTitle }</a></td>
						<td>${boardDto.boardDate }</td>
					</tr>				
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
				<td colspan="3" align="right">
					<input type="button" id="writeBtn" style="display:none;" value="글작성" onclick="location.href='insertBoardForm?userId=${param.userId}'">
				</td>
			</tr>
	</table>
	</div>
</body>
</html>