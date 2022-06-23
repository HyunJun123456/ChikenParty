
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
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
<body>
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<span id="location_list" style="text-align: center;">체인점별 리스트</span>
<table id="chainTbl" border="1" class="table table-bordered table-hover">
	<tr>
		<th>STORENAME</th>
		<th>ADDR</th>
		<th>TEL</th>
	</tr>

		<tr>
			<td>${list.userNm}</td>
			<td>${list.userAddr}</td>
			<td>${list.userTel}</td>
		</tr>
		

</table> 
</body>
</html>