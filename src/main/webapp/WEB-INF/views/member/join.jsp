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

	<c:import url="../temp/boot_nav.jsp"></c:import>
	
	<div class="container">
		<form>
  			<div class="mb-3">
    			<label for="mid" class="form-label">아이디</label>
    			<input type="text" class="form-control" id="mid">
			</div>
  			<div class="mb-3">
    			<label for="mpw" class="form-label">비밀번호</label>
    			<input type="password" class="form-control" id="mpw">
  			</div>
  			<div class="mb-3">
    			<label for="mpw2" class="form-label">비밀번호 확인</label>
    			<input type="password" class="form-control" id="mpw2">
  			</div>
  			<div class="mb-3">
    			<label for="mphone" class="form-label">휴대폰번호</label>
    			<input type="text" class="form-control" id="mphone">
			</div>
			<div class="mb-3">
    			<label for="memail" class="form-label">이메일</label>
    			<input type="email" class="form-control" id="memail">
			</div>
		<button type="submit" class="btn btn-primary"> 회원가입 </button>
		</form>
	
	</div>

</body>
</html>