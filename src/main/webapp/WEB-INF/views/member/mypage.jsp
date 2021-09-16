<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"> </c:import>
<body>

	<c:import url="../temp/boot_nav.jsp"></c:import>
	
	<div class="container"> 
		<h1> mypage </h1>
		<h2> id: ${member.id}</h2>
		<h2> name: ${member.name}</h2>
		<h2> email: ${member.email}</h2>
		<h2> phone: ${member.phone}</h2>
		
		<div>
			<img src="../resources/upload/member/${file.fileName}" alt="img">
		</div>
		
		<a href="./update" class="btn btn-primary" type="button"> 정보 수정 </a>
		<a href="./delete" class="btn btn-danger" type="button"> 회원 탈퇴 </a>
	</div>
	

</body>
</html>