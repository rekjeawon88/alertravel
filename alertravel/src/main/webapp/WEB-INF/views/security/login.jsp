<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="../layouts/header1.jsp"%>

<style>
.btn-kakao {
	background-color: #FEE502;
}
</style>

<section class="login-main">
  <div class="main-container">
    <div class="inner">
      <div class="title-container">
        <div class="title">로그인</div>
        <div class="message">
        여행자들과 소통하세요.
        </div>
      </div>
    </div>
  </div>
</section>

<div style="width: 500px" class="mx-auto login-container">
	<h2 class="my-5 login-main-title">
	여행 가는 중입니다
		<img src="../resources/images/airplane_dotted.png" class="login-airplane-image"/>
	</h2>

	<c:if test="${param.error == 'true'}">
		<div class="error">아이디 또는 비밀번호가 일치하지 않습니다.</div>
	</c:if>
	<c:if test="${param.error == 'login_required'}">
		<div class="error">로그인이 필요한 페이지입니다.</div>
	</c:if>

	<br>

	<form action="/security/login" method='POST'>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<div class="form-group">
			<label for="username"><i class="fas fa-user"></i> 아이디</label> <input
				type="text" name="username" id="username" class="form-control" />
		</div>
		<div class="form-group">
			<label for="password"><i class="fas fa-key"></i> 비밀번호</i></label> <input
				type="password" name="password" id="password" class="form-control" />
		</div>
		<div class="form-group" style="margin-left: 20px">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox" name="remember-me" /> 로그인
				상태 유지
			</label>
		</div>

		<button type="button" class="btn btn-kakao btn-block"
			onClick="location.href='https://kauth.kakao.com/oauth/authorize?client_id=d1d68ccbc76688be2f03c65d1ea07a31&redirect_uri=http://localhost:8080/security/kakao&response_type=code'">
			<i class="fa-solid fa-comment" style="color: #423630"></i> 카카오 로그인
		</button>

		<button type="submit" class="btn btn-info btn-block">
			<i class="fa-solid fa-right-to-bracket"></i> 로그인
		</button>

		<button type="button" class="btn btn-info btn-block" onclick="location.href='/security/signup';">
			<i class="fas fa-user-plus"></i> 회원가입
		</button>
	</form>
</div>


<%@ include file="../layouts/footer1.jsp"%>

<style>
  .login-main {
    height: 360px;
    background-image: url('/resources/images/login-image.jpg');
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    z-index: 1;
  }
</style>