<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> id check </title>
<c:import url="../temp/boot_head.jsp"> </c:import>
</head>
<body>
	
	<div class="container">
		<h2> 아이디 중복확인 </h2>
		<div> 
			<span> ${param.id} 는 </span> 
			<c:if test="${empty dto}"> 사용 가능한 아이디 입니다. </c:if>
			<c:if test="${not empty dto}"> 사용 불가능한 아이디 입니다. </c:if>
		 </div>
	
		<form id="frm" action="idCheck" method="get">
  			<div class="mb-3">
    			<input type="text" name="id" class="form-control joinForm col-1" value="${param.id}" id="mid">
    			<button type="submit" id="idCheck" class="btn btn-secondary"> id중복확인 </button>
    			
    			<c:if test="${empty dto}">
    				<button type="button" id="useId"> 사용 </button>
    			</c:if>
			</div>
		</form>	
		
	</div>

<script type="text/javascript">
	
	let useId = document.getElementById('useId');
	useId.addEventListener('click', function() {
		let mid = document.getElementById('mid').value;
		opener.document.getElementById('mid').value = mid;
		close();
	})
	
</script>


</body>
</html>