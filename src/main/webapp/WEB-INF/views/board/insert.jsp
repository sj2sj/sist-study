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
	
	<form action="./insert" method="post" enctype="multipart/form-data">
		<div> 제목: <input type="text" name="title"> </div>
		<div> 작성자: <input type="text" name="writer"> </div>
		<div> 내용: <textarea name="contents"> </textarea> </div>
		<button type="submit">write</button>
		
		<input type="file" name="files"> 
		<input type="file" name="files"> 
	</form>

</body>
</html>