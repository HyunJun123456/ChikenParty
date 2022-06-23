<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                ['월', '매출액'],
                <c:forEach items="${list}" var="dto">
                ['${dto.month}', ${dto.profit}],
                </c:forEach>
            ]);

            var options = {
                curveType: 'function',
                legend: { position: 'bottom' }
            };

            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

            chart.draw(data, options);
        }
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
</style>
    <meta charset="UTF-8">
    <title>돈좀벌었나~?</title>
</head>
<body>
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<span id="location_list" style="text-align: center;">월매출</span>
<div id="curve_chart" style="width: 900px; height: 500px"></div>
<table border="1" id="profit_tb">
    <col width="1">
    <col width="50">
    <tr>
        <th>MONTH</th>
        <th>PROFIT</th>
    </tr>
        <c:forEach items="${list}" var="dto">
            <tr>
                <td>${dto.month }</td>
                <td>${dto.profit }</td>
            </tr>
        </c:forEach>
</table>

</body>
</html>