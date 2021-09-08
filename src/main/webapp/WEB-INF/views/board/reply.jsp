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

	<c:import url="../temp/boot_nav.jsp"></c:import>

	<div class="container">
		<h2> ${board} reply page </h2>
		
		<form action="./reply/" method="POST">
			<input type="hidden" name="num" value="${param.num}">
			
			<label for="title" class="form-label">TITLE</label>
			<input class="form-control" type="text" name="title" required>
			
			<label for="writer" class="form-label">WRITER</label>
			<input class="form-control" type="text" name="writer" required>
			
			<label for="contents" class="form-label">Content</label>
			<textarea class="form-control" rows="15" cols="" name="contents" required></textarea>
			
			<input type="submit" class="btn btn-primary" value="REPLY">
		</form>

	</div>
</body>
</html>

