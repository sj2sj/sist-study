<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootStrapCDN.jsp"></c:import>
</head>
<body>

	<div class="container mt-3">
	
		
		<h2> ${board} insert page </h2>
		
		
		<form:form modelAttribute="boardVO" enctype="multipart/form-data">
			<div class="form-floating mb-3 mt-3">
				<form:input id="title" path="title" cssClass="form-control"/>
				<label for="title" class="form-label">title</label>
				<form:errors path="title"></form:errors>
			</div>
			<div class="mb-3 mt-3">
				<label for="writer" class="form-label">writer:</label>
				<form:input id="writer" path="writer" cssClass="form-control"/>
				<form:errors path="writer"></form:errors>
			</div>
			<div class="mb-3 mt-3">
				<label for="contents" class="form-label">contents:</label> 
				<form:textarea id="contents" path="contents" cssClass="form-control" rows="5"/>
			</div>
			<div class="mb-3 mt-3">
				<input type="file" name="files">
				<input type="file" name="files">			
			</div>
			<div>
				<button type="submit">write</button>
			</div>
		</form:form>
	
	</div>
	


</body>
</html>