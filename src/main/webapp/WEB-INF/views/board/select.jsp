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

	<h3> ${board } select page </h3>

	<h3> title: ${vo.title} </h3>
	<h3> writer: ${vo.writer} </h3>
	<h3> contents: ${vo.contents} </h3>
	
	<c:forEach items="${vo.fileList}" var="file">
		<a href="../upload/notice/${file.fileName}">${file.oriName}</a>
	</c:forEach>

	<div> <a href="./delete?num=${vo.num}">delete</a> </div>
	<div> <a href="./update?num=${vo.num}">update</a> </div>
	<div> <a href="./list">list</a> </div>
</body>
</html>