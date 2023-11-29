<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<%@ include file="../layouts/header1.jsp"%>

<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>

<section class="totaldonate-main">
	<div class="main-container">
		<div class="inner">
			<div class="title-container">
				<div class="title">따뜻한 마음 나누기</div>
				<div class="message">현재 후원 현황을 확인하고 블라블라블라</div>
			</div>
		</div>
	</div>
</section>


<div class="container mt-5">
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card border-0"> <!-- 외부 선 제거 -->
				<div class="card-body">
				
					<canvas id="bar-chart-horizontal" width="600" height="250"></canvas>

					<h1>총 후원 금액 : ${donateTotalMoney}</h1>
					<h1>총 후원자 수 : ${donateTotalPeople}</h1>
					
		            <c:forEach var="donation" items="${donateOptionTotalList}">
						${donation.donateSelect}, ${donation.sumDonateMoney} ||
		            </c:forEach>
				
					<br>
					<hr>
				
					<button type="submit" class="btn btn-primary btn-block" onclick="location.href='donate';">후원하러 가기</button>

				</div>
			</div>
		</div>
	</div>
</div>

<script>
new Chart(document.getElementById("bar-chart-horizontal"), {
    type: 'horizontalBar',
    data: {
        labels: [
            <c:forEach var="donation" items="${donateOptionTotalList}">
                "${donation.donateSelect}", /* ,를 써야 data: [1000, 2000, 3000,] 이렇게 나옴 */
            </c:forEach>
        ],
        datasets: [
            {
				label: "총 후원 금액",
                backgroundColor: ["#87CEEB", "#FFB6C1", "#98FB98", "#FFA07A", "#800080", "#C0C0C0", "#FFD700", "#F08080"],
                data: [
                    <c:forEach var="donation" items="${donateOptionTotalList}">
                        ${donation.sumDonateMoney},
                    </c:forEach>
                ]
            }
        ]
    },
    options: {
        legend: { display: false },
        title: {
            display: true,
            text: '총 후원 금액 통계',
            fontSize: 16, // 원하는 크기로 조절
            fontColor: 'black', // 텍스트 색상 지정
            fontStyle: 'bold' // 볼드 처리
        }
    }
});
</script>

<style>
  .totaldonate-main {
    height: 360px;
    background-image: url('/resources/images/children.jpg');
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    z-index: 1;
  }
</style>


<%@ include file="../layouts/footer1.jsp"%>