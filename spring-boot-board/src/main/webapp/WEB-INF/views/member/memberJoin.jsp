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
	
		<h2> member join page </h2>
	
		<form:form modelAttribute="memberVO" enctype="multipart/form-data">
			<div class="form-floating mb-3 mt-3">
				<form:input id="id" path="id" cssClass="form-control"/>
				<label for="id" class="form-label">id</label>
				<form:errors path="id"></form:errors>
				<form:errors path="idCheck"></form:errors>
			</div>
			<div class="form-floating mb-3 mt-3">
				<form:password id="pw" path="pw" cssClass="form-control"/>
				<label for="pw" class="form-label">password</label>
				<form:errors path="pw"></form:errors>
			</div>
			<div class="form-floating mb-3 mt-3">
				<form:password id="pwCheck" path="pwCheck" cssClass="form-control"/>
				<label for="pwCheck" class="form-label">password check</label>
				<form:errors path="pwCheck"></form:errors>
			</div>
			<div class="form-floating mb-3 mt-3">
				<form:input id="name" path="name" cssClass="form-control"/>
				<label for="name" class="form-label">name</label>
				<form:errors path="name"></form:errors>
			</div>
			<div class="form-floating mb-3 mt-3">
				<form:input id="email" path="email" cssClass="form-control"/>
				<label for="email" class="form-label">email</label>
				<form:errors path="email"></form:errors>
			</div>

			<div class="form-floating mb-3 mt-3">
				<form:input id="age" path="age" cssClass="form-control"/>
				<label for="age" class="form-label">age</label>
				<form:errors path="age"></form:errors>
			</div>
			<div class="form-floating mb-3 mt-3">
				<form:input id="birth" path="birth" cssClass="form-control"/>
				<label for="birth" class="form-label">birth</label>
				<form:errors path="birth"></form:errors>
			</div>
			
			<div> <input type="file" name="mfFile"> </div>
			
			<button type="submit">회원가입</button>
			
		</form:form>

	</div>

</body>
</html>