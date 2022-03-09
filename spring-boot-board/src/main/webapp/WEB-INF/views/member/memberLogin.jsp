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

	<form action="./memberLogin" method="post">
		<div> id: <input type="text" name="id"> </div>
		<div> pw: <input type="text" name="pw"> </div>
		<button type="submit">로그인</button>
	</form>

</body>
</html>