<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> member join page </h2>

	<form action="./memberJoin" method="post" enctype="multipart/form-data">
		<div> id: <input type="text" name="id"> </div>
		<div> pw: <input type="text" name="pw"> </div>
		<div> name: <input type="text" name="name"> </div>
		<div> email: <input type="text" name="email"> </div>
		<div> <input type="file" name="mfFile"> </div>
		
		<button type="submit">회원가입</button>
	</form>

</body>
</html>