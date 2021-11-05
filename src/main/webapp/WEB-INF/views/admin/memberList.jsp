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

	<h3> member list </h3>

	<c:forEach items="${list}" var="list">
		<div>
			<p> id: ${list.id} </p>
			<p> name: ${list.name} </p>
			<img alt="photo" src="../upload/member/${list.memberFile.fileName}">
		</div>
		<hr>
	</c:forEach>

</body>
</html>