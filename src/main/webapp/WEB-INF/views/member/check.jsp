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
	
		<h1> Check Page </h1>
			
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value="" id="checkAll">
			<label class="form-check-label" for="checkAll">
			check all
			</label>
		</div>

		<div class="form-check">
			<input class="form-check-input ch1 reqCheck" type="checkbox" value="1" id="check1">
			<label class="form-check-label" for="check1">
			약관1
			</label>
		</div>
		
		<div class="form-check">
			<input class="form-check-input ch1 reqCheck" type="checkbox" value="2" id="check2">
			<label class="form-check-label" for="check2">
			약관2
			</label>
		</div>
		
		<div class="form-check">
			<input class="form-check-input ch1 reqCheck" type="checkbox" value="3" id="check3">
			<label class="form-check-label" for="check3">
			약관3
			</label>
		</div>
		
		<div class="form-check">
			<input class="form-check-input ch1" type="checkbox" value="" id="check4">
			<label class="form-check-label" for="check4">
			약관4 (선택)
			</label>
		</div>
		
		<button id="btn" class="btn btn-primary"> JOIN </button>
	</div>
	
	
	
	<script type="text/javascript" src="../resources/js/check.js"></script>
	
</body>
</html>