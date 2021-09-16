<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<c:import url="../temp/boot_head.jsp"></c:import>
<body>

	<c:import url="../temp/boot_nav.jsp"></c:import>
	
	
	
	<div class="container">
	
		<h2> ${board} Select Page </h2>
		
		<h4> ${dto.num} </h4>
		<h4> ${dto.title} </h4>
		<h4> ${dto.contents} </h4>
		<h4> ${dto.writer} </h4>
		<h4> ${dto.regDate} </h4>
		
		<c:forEach items="${fileList}" var="list">
			<div>
				<img alt="" src="../resources/upload/${board}/${list.fileName}">
			</div>
		</c:forEach>
		
		
		<c:if test="${not empty member and member.id eq dto.writer}">
			<a href="./delete?num=${dto.num}" class="btn btn-danger"> delete </a>
			<a href="./update?num=${dto.num}" class="btn btn-primary"> Update </a>
		</c:if>
		
		<c:if test="${board eq 'qna'}">
			<a href="./reply?num=${dto.num}" class="btn btn-primary"> Reply </a>
		</c:if>
		
	
	</div>

</body>
</html>