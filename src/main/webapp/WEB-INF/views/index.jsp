<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/test.css">
</head>
<body>

	<h1> index page </h1>
	<spring:message code="hello.hi" text="default Message"></spring:message>
	<spring:message code="hello" var="m" text="default Message"></spring:message>
	<c:choose>
		<c:when test="${not empty member}">
			<h3> ${member.id} 님 </h3>
			<h3> <spring:message code="member.info" arguments="${member.id},${member.email}" argumentSeparator=","></spring:message> </h3>
			<a href="./member/memberLogout"> 로그아웃 </a>
		</c:when>
		<c:otherwise>
			<a href="./member/memberLogin">로그인</a>
			<a href="./member/memberJoin">회원가입</a>
		</c:otherwise>
	</c:choose>
	
	<h2>${m}</h2>
	
	<div>
		<img alt="댕대이" src="./images/IMG4225.JPG">
	</div>

	<a href="./notice/list"> notice List </a>
	<a href="./qna/list"> qna List </a>

</body>
</html>