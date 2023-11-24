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
				
					<canvas id="bar-chart" width="300" height="230"></canvas>
					<canvas id="bar-chart-horizontal" width="600" height="250"></canvas>

				
				
				
				
					<button type="submit" class="btn btn-block" onclick="location.href='donate';">후원하러 가기</button>
				</div>
			</div>
		</div>
	</div>
</div>




<script>
new Chart(document.getElementById("bar-chart"), {
    type: 'bar',
    data: {
        labels: ["최빈국 희망학교 설립", "최빈국 희망학교 설립", "자연 재해민 구호", "전쟁 피난민 구호",
	  		"국경없는의사회 지원", "테러 피해자 구호", "사막 지역에 나무 심기", "재능기부 봉사활동 지원"],
  datasets: [
    {
      label: "총 후원 금액",
      backgroundColor: ["#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2"],
      data: [1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888]
        }
      ]
    },
    options: {
      legend: { display: false },
      title: {
        display: true,
        text: '최빈국 결식 아동 식량 지원'
      }
    }
});
</script>
<script>
new Chart(document.getElementById("bar-chart-horizontal"), {
    type: 'horizontalBar',
    data: {
      labels: ["최빈국 희망학교 설립", "최빈국 희망학교 설립", "자연 재해민 구호", "전쟁 피난민 구호",
    	  		"국경없는의사회 지원", "테러 피해자 구호", "사막 지역에 나무 심기", "재능기부 봉사활동 지원"],
      datasets: [
        {
          label: "총 후원 금액",
          backgroundColor: ["#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2", "#8e5ea2"],
          data: [1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888]
        }
      ]
    },
    options: {
      legend: { display: false },
      title: {
        display: true,
        text: '총 후원 금액'
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