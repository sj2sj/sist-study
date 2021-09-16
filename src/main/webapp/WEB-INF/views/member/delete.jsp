<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	
	<div class="container">
		
		<c:import url="../temp/boot_nav.jsp"></c:import>
	
		<h1> delete Page </h1>
		<h3> 비밀번호를 입력하시면 회원탈퇴 됩니다. </h3>
		<form id="frm" action="delete" method="POST" accept-charset="utf-8">
  			<div class="mb-3">
    			<label for="mid" class="form-label">아이디</label>
    			<input type="text" class="form-control updateForm" value="${member.id}" name="id" id="mid" readonly="readonly">
			</div>
  			<div class="mb-3">
    			<label for="mpw" class="form-label">비밀번호</label>
    			<input type="password" class="form-control updateForm" name="pw" id="mpw1">
  			</div>
  			
  			<button class="button btn btn-danger" id="deleteBtn"> 탈퇴 </button>
		</form>
	</div>
	
	<script type="text/javascript">
		const deleteBtn = document.getElementById('deleteBtn');
		const frm = document.getElementById('frm');
		
		deleteBtn.addEventListenr('click', function() {
			frm.submit();
		})
	</script>
</body>
</html>