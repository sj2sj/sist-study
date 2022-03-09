<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<%@page import="java.util.*"%>
<%
 
    request.setCharacterEncoding("UTF-8");
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"> </c:import>
<body>

	<c:import url="../temp/boot_nav.jsp"></c:import>

	<div class="container">
		<form id="frm" action="update" method="POST" accept-charset="utf-8">
  			<div class="mb-3">
    			<label for="mid" class="form-label">아이디</label>
    			<input type="text" class="form-control updateForm" value="${member.id}" name="id" id="mid" readonly="readonly">
			</div>
  			<div class="mb-3">
    			<label for="mpw" class="form-label">비밀번호</label>
    			<input type="password" class="form-control updateForm" name="pw" id="mpw1">
  			</div>
  			<div class="mb-3">
    			<label for="mpw2" class="form-label">비밀번호 확인</label>
    			<input type="password" class="form-control updateForm" id="mpw2">
  			</div>
  			<div class="mb-3">
    			<label for="mname" class="form-label">이름</label>
    			<input type="text" class="form-control updateForm" value="${member.name}" name="name" id="mname">
			</div>
  			<div class="mb-3">
    			<label for="mphone" class="form-label">휴대폰번호</label>
    			<input type="tell" class="form-control updateForm" value="${member.phone}" name="phone" id="mphone">
			</div>
			<div class="mb-3">
    			<label for="memail" class="form-label">이메일</label>
    			<input type="email" class="form-control updateForm" value="${member.email}" name="email" id="memail">
			</div>
		<button type="button" id="updateBtn" class="btn btn-primary"> 수정 </button>
		</form>
	
		<script type="text/javascript" src="../resources/js/update.js"></script>
	</div>

</body>
</html>