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

	<h2> ${board} insert page </h2>
	
	<form action="./update" method="post">
		<input type="hidden" name="num" value="${vo.num}">
		<div> 제목: <input type="text" name="title" value="${vo.title }"> </div>
		<div> 작성자: <input type="text" name="writer" value="${vo.writer}"> </div>
		<div> 내용: <textarea name="contents" > ${vo.contents} </textarea> </div>
		<button type="submit">update</button>
	</form>

</body>
</html>