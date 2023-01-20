<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core</title>
</head>
<body>

	<h2>JSTL 코어 라이브러리</h2>
	
	<h3>1. JSTL Core 변수</h3>
	
	<c:set var="num1">36</c:set>
	<c:set var="num2">3</c:set>
	
	<b>첫번째 숫자 : ${num1 }</b> <br>
	<b>두번째 숫자 : ${num2 }</b>
	
	<h3>2. JSTL Core 연산</h3>
	
	<b>더하기 : <c:out value="${num1 + num2 }" /></b> <br>
	<b>빼기 : <c:out value="${num1 - num2 }" /></b> <br>
	<b>곱하기 : <c:out value="${num1 * num2 }" /></b> <br>
	<b>나누기 : <c:out value="${num1 / num2 }" /></b> <br>
	
	<h3>3. JSTL Core out</h3>
	
	<c:out value="<title>core out</title>" />
	
	<%-- double average = (num1 + num2) / 2 --%>
	<c:set var="average" value="${average = (num1 + num2) / 2 }" />
	
	<c:if test="${average >= 10 }">
		<h1>${average }</h1>
	</c:if>
	
	<c:if test="${average < 10 }">
		<h3>${average }</h3>
	</c:if>
	
	<h3>4. JSTL Core if</h3>
	
	<c:if test="${num1 * num2 > 100 }">
		<c:out value="<script>alert('너무 큰 수 입니다.')</script>" escapeXml="false" />
	</c:if>

</body>
</html>