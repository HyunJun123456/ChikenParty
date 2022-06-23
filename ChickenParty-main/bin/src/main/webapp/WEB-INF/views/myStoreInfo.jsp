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
<style>

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
	width: 1000px;
}

#nameTh{
	width:150px;
}
#addrTh{
	width: 100px;
}
#telTh{
	width: 100px;
}
</style>
</head>
<body>
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<span id="location_list" style="text-align: center;">체인점</span>
<table id="chainTbl" border="1" class="table table-bordered table-hover">
	<tr>
		<th id="nameTh">가게명</th>
		<th id="addrTh">주소</th>
		<th id="telTh">전화번호</th>
	</tr>
<c:forEach items="${list }" var="dto">
		<tr>
			<td>${dto.userNm}</td>
			<td>${dto.userAddr}</td>
			<td>${dto.userTel}</td>
			
		</tr>
</c:forEach>

</table>
</body>
</html>