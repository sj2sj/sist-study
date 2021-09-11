<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"> </c:import>
</head>
<body>
	<h1> Login Page </h1>

	<c:import url="../temp/boot_nav.jsp"></c:import>
	
	<div class="container">
		<form id="frm" action="login" method="POST">
  			<div class="mb-3">
    			<label for="mid" class="form-label">아이디</label>
    			<input type="text" class="form-control joinForm" name="id" id="mid">
			</div>
  			<div class="mb-3">
    			<label for="mpw" class="form-label">비밀번호</label>
    			<input type="password" class="form-control joinForm" name="pw" id="mpw1">
  			</div>
		<button type="submit" id="btn" class="btn btn-primary"> 로그인 </button>
		</form>
	
	</div>
	

</body>
</html>