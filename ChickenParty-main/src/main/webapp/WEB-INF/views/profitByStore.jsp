<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<html>

<head>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                ['STORE', 'Profits'],
                <c:forEach items="${list}" var="dto">
                ['${dto.userId}', ${dto.profit}],
                </c:forEach>
            ]);

            var options = {
                title: 'MonthlyProfit',
                curveType: 'function',
                legend: { position: 'bottom' }
            };

            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

            chart.draw(data, options);
        }0
    </script>
    
    <style type="text/css">
    #curve_chart{
		position: absolute;
		margin-left: 400px;
		margin-top:50px;
	}
	#profit_tb{
		position: absolute;
		margin-left: 600px;
		margin-top:550px;
	}
	#location_list{
	 font-weight: bolder;
	 font-size: 20px;
	 position: absolute;
	 margin-top: 30px;
	 margin-left: 450px;
	}
    #drop_btn{
	position: absolute;
	margin-left: 530px;
    }
    
    #store_profit{
    position: absolute;
    margin-left: 630px;
    margin-top: 600px;
    }
    </style>
<meta charset="UTF-8">
<title>돈좀벌었나~?</title>
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<span id="location_list" style="text-align: center;">월별매출액</span>
</head>
<body>
	<table border="1" id="store_profit">
		<col width="1">
		<col width="50">
		<tr>
			<th>STORE</th>
			<th>PROFIT</th>
		</tr>
		
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.userId }</td>
				<td>${dto.profit }</td>
			</tr>
		</c:forEach>
	</table>
	<div class="container" id="drop_btn">
		<div class="text-center">
			<div class="dropdown" >
				<a class="btn btn-secondary dropdown-toggle" href="#" role="button"
					id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Month </a>

				<div  class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					<a class="dropdown-item" href="/profit/getMonthProfit?month=1&userId=${param.userId }">January</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=2&userId=${param.userId }">February</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=3&userId=${param.userId }">March</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=4&userId=${param.userId }">April</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=5&userId=${param.userId }">May</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=6&userId=${param.userId }">June</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=7&userId=${param.userId }">July</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=8&userId=${param.userId }">August</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=9&userId=${param.userId }">September</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=10&userId=${param.userId }">October</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=11&userId=${param.userId }">November</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=12&userId=${param.userId }">December</a>
				</div>
			</div>
		</div>
		</div>
	<div id="curve_chart" style="width: 900px; height: 500px"></div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
</body>
</html>