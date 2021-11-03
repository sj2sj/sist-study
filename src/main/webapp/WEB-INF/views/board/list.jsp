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
	<h1> ${board} List Page </h1>
	
	<!---------------------------- 검색 form -------------------------->
	<form action="./list">
		<select name="kind">
			<option value="title">title</option>
			<option value="contents">contents</option>
			<option value="writer">writer</option>
		</select>
		<input type="text" name="search">
		
		<select name="perPage">
			<option value="5">5개씩 보기</option>
			<option value="10">10개씩 보기</option>
			<option value="20">20개씩 보기</option>
		</select>
		
		<button type="submit">search</button>
	</form>
	<!---------------------------- 검색 form 끝 -------------------------->
	<table>
		<tr> 
			<th> num </th>
			<th> title </th>
			<th> writer </th>
			<th> regDate </th>
			<th> hit </th>
		</tr>
	<c:forEach items="${boardList}" var="list">
		<tr>
			<td> ${list.num} </td>
			<td><a href="./select?num=${list.num}"> ${list.title} </a></td>
			<td> ${list.writer} </td>
			<td> ${list.regDate} </td>
			<td> ${list.hit} </td>
		</tr>
	</c:forEach>

	</table>
	
	<a href="./insert">write</a>

</body>
</html>