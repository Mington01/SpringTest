<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 정보 페이지</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<link href="/jstl/weather/style.css" rel="stylesheet type-"text/css">
</head>
<body>
	<div id="wrap">
		<section class="contents d-flex">
			<nav class="main-menu bg-primary align-items-left">
				<div class="col-2 justify-content-center">
					<img width="25" src="https://www.kma.go.kr/kma/resources/images/sub/sig2.png">
				</div>
				<h4 class="text-white col-7">기상청</h4>
				<ul class="nav flex-column">
					<li class="nav-item"><a href="#" class="nav-link text-white">날씨</a></li>
					<li class="nav-item"><a href="#" class="nav-link text-white">날씨입력</a></li>
					<li class="nav-item"><a href="#" class="nav-link text-white">테마날씨</a></li>
					<li class="nav-item"><a href="#" class="nav-link text-white">관측 기후</a></li>

				</ul>
			</nav>
			<article class="main-contents">
				<h2>과거 날씨</h2>
				
				<table class="table text-center">
				
					<thead>
						<tr>
							<th>날짜</th>
							<th>날씨</th>
							<th>기온</th>
							<th>강수량</th>
							<th>미세먼지</th>
							<th>풍속</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>2013년 1월 25일</td>
							<td><img src="http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg"></td>
							<td>-16C</td>
							<td><12.3mm/td>
							<td>보통</td>
							<td>1.0km/h</td>
							
						</tr>
					</tbody>
					
				</table>
				
			</article>
		</section>
		
		<footer class="d-flex">
			<div class="logo bg-info mt-3 ml-4">
				<img alt="기상청" width="100" src="https://www.kma.go.kr/kma/resources/images/sub/sig2.png">
			</div>
			<div class="copyright">
				<small class="text-secondary small">(07062) 서울시 동작구 여의대방로16길 61
				Copyright@2020 KMA. All Rights RESERVED.</small>
			</div>
		</footer>
	</div>

</body>
</html>