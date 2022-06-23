<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	var userId="${param.userId}";
	$(function(){
		if(userId!="admin"){
			$("#menu5").show();
		}
	});
	var userId="${param.userId}";
	$(function(){
		if(userId=="admin"){
			$("#menu6").show();
			$("#menu2").hide();
		}
	});
	var userId="${param.userId}";
	$(function(){
		if(userId=="admin"){
			$("#menu7").show();
		}
	});
	var userId="${param.userId}";
	$(function(){
		if(userId=="admin"){
			$("#menu8").show();
		}
	});
</script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">

#menu1{
	margin-top: 150px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu2{
	margin-top: 200px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu3{
	margin-top: 100px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}#menu5{
	margin-top: 250px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu6{
	margin-top: 200px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu7{
	margin-top: 250px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu8{
	margin-top: 300px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}

</style>
</head>
<body>
		<button name="menu_btn" id="menu3" onclick="location.href='/board/boardList?userId=${param.userId}&userNm=${param.userNm}'">공지사항</button>
		<button name="menu_btn" id="menu1" onclick="location.href='/welcomechain?userId=${param.userId}&userNm=${param.userNm}'">가게정보확인</button>
		<button name="menu_btn" id="menu2" onclick="location.href='/product/userlist?userId=${param.userId}&userNm=${param.userNm}'">재고목록확인</button>
		<button style="display:none;" name="menu_btn" id="menu7" onclick="location.href='/product/adminlist?userId=${param.userId}&userNm=${param.userNm}'">지점별재고확인</button>
		<button style="display:none;" name="menu_btn" id="menu8" onclick="location.href='/order/orderinfo?userId=${param.userId}&userNm=${param.userNm}'">주문목록확인</button>
		<!-- <button name="menu_btn" id="menu4" onclick="location.href='../storeList.jsp'">매출확인</button> -->
		<button style="display:none;" name="profit_user_btn" id="menu5" onclick="location.href='/profit/getMonthlyProfit?userId=${param.userId}&userNm=${param.userNm}'">월별매출액</button>
		<button style="display:none;" name="profit_admin_btn" id="menu6" onclick="location.href='/profit/getProfitByStore?userId=${param.userId}&userNm=${param.userNm}'">지점월별매출액</button>
</body>
</html>