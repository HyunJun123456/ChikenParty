<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Insert title here</title>
<style type="text/css">
table{
	margin-left:50px;
	margin-top:50px;
	width: 500px;
	
}
#location_list{
	 font-weight: bolder;
	 font-size: 20px;
	 position: absolute;
	 margin-top: 30px;
	 margin-left: 450px;
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
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
	<span id="location_list"style="text-align: center;">지점 재고현황</span>
 
		<table id="chainTbl" class="table table-striped">
			<thead>
				<tr>
					<th scope="col">체인점</th>
					<th scope="col">크리스피 치킨파우더</th>
					<th scope="col">뿌링클 가루</th>
					<th scope="col">왕갈비 치킨 소스</th>
					<th scope="col">찜닭양념 간장</th>
					<th scope="col">치킨트레이 포장 용기</th>
					<th scope="col">종이박스 포장용기</th>
					<th scope="col">치즈맛 감자튀김</th>
					<th scope="col">떡</th>
					<th scope="col">닭</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty product }">
						<td colspan="10">-------------재고가 없습니다.-------------</td>
					</c:when>
					<c:otherwise>
						<c:forEach items="${product }" var="dto">
							<tr>
								<td>${dto.proKey }</td>
								<td>${dto.proNm }</td>
								<td>${dto.proNm1 }</td>
								<td>${dto.proNm2 }</td>
								<td>${dto.proNm3 }</td>
								<td>${dto.proNm4 }</td>
								<td>${dto.proNm5 }</td>
								<td>${dto.proNm6 }</td>
								<td>${dto.proNm7 }</td>
								<td>${dto.proNm8 }</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
</body>
</html>