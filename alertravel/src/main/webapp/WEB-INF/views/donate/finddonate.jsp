<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<%@ include file="../layouts/header1.jsp"%>

<section class="donate-main">
	<div class="main-container">
		<div class="inner">
			<div class="title-container">
				<div class="title">내 후원 목록 검색하기</div>
				<div class="message">당신의 후원이 더 아름다운 오늘을 만들었습니다.</div>
			</div>
		</div>
	</div>
</section>

<div class="container mt-5">
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card border-0"> <!-- 외부 선 제거 -->
				<div class="card-body">
					<h5 class="card-title">후원자 정보</h5>
					<form action="${pageContext.request.contextPath}/donate/finddonate" method="post">
				
						<br>
						<br>
				
						<div class="form-group" id="nameInput">
							<label for="donateName">성명</label>
							<input type="text" name="donateName" class="form-control" placeholder="성명을 입력하세요" required />
						</div>
						
						<br>
						
						<div class="form-group" id="phoneInput">
							<label for="donatePhoneNumber">휴대폰 번호</label>
							<input type="text" name="donatePhoneNumber" class="form-control" placeholder="휴대폰 번호를 입력하세요 ('-' 제외)" required />
						</div>
						
						<br>
						
						<div class="form-group" id="birthdayInput">
							<label for="donateBirthday">생년월일</label>
							<input type="text" name="donateBirthday" class="form-control" placeholder="생년월일 6자리를 입력하세요" required />
						</div>
						
						<br>
						
						<button type="submit" class="btn btn-primary btn-block">검색하기</button>
					</form>
					
					
					<!-- 여기에 결과를 표시할 부분 추가 -->
					<c:if test="${not empty donateMyList}">
                    	<div class="mt-3">
                        	<h5>검색 결과</h5>
							<c:forEach var="donate" items="${donateMyList}">
                            	<p>
                                    Donate Number: ${donate.donateNumber}<br>
                                    Donate Date: ${donate.donateDate}<br>
                                    Donate Payment: ${donate.donatePayment}<br>
                                    Donate Name: ${donate.donateName}<br>
                                    Donate Birthday: ${donate.donateBirthday}<br>
                                    Donate Phone Number: ${donate.donatePhoneNumber}<br>
                                    <!-- 여기에 필요한 속성들 추가 -->
                                </p>
                            </c:forEach>
                        </div>
                    </c:if>
					
					
				</div>
			</div>
		</div>
	</div>
</div>


<style>
.donate-main {
	height: 360px;
	background-image: url('/resources/images/donateheart.jpg');
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	z-index: 1;
}
</style>







<%@ include file="../layouts/footer1.jsp"%>