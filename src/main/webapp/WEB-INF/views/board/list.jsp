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
	
	

	<div class="container-fulid">
		<h1> ${board} Board List Page </h1>
		<table class="table">
			<tr>
				<th> 번호 </th>
				<th> 제목 </th>
				<th> 작성자 </th>
				<th> 작성일 </th>
				<th> 조회수 </th>
			</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td> ${list.num} </td>
				<td> <a href="./select?num=${list.num}"> ${list.title} </a> </td>
				<td> ${list.writer} </td>
				<td> ${list.regDate} </td>
				<td> ${list.hits} </td>
			</tr> 
		</c:forEach>
	
		
		</table>
		
<nav aria-label="Page navigation example">
	<ul class="pagination justify-content-center">
	<li class="page-item">
      <a class="page-link" href="./list?pn=1">&laquo;</a>
    </li>
	<li class="page-item">
      <a class="page-link" href="./list?pn=${pager.startNum-1}">&lt</a>
    </li>
    
    	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
    		<li class="page-item"> 
    			<a class="page-link" href="./list?pn=${n}"> ${n} </a> 
    		</li>
		</c:forEach>
    <li class="page-item">
      	<a class="page-link" href="./list?pn=${pager.lastNum+1}">&gt</a>
    </li>
    <li class="page-item">
    	<a class="page-link" href="./list?pn=${pager.totalPage}"> &raquo; </a>
    </li>
  </ul>
</nav>
		
	</div>
</body>
</html>