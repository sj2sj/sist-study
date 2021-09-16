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
	
	<!-- Serach Form -->
	<form action="./list" method="GET">
		<div class="input-group mb-3">
			<select name="kind" class="form-select form-select-sm">
				<option value="num"> num </option>
				<option value="title"> title </option>
				<option value="content"> content </option>
				<option value="writer"> writer </option>
			</select>
			
			<input type="text" name="search" class="form-control">
			<button type="submit" class="btn btn-outline-secondary"> search </button>
		
		</div>
	</form>
	
	<!-- Serach Form end -->

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
				<td> <a href="./select?num=${list.num}">
					<c:catch> 
						 <!-- 답글 들여쓰기 -->
						 <c:forEach begin="1" end="${list.depth}">
						 	--
						 </c:forEach>
					 </c:catch>
					 ${list.title} 
				</a> </td>
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
		    			<a class="page-link" href="./list?pn=${n}&kind=${pager.kind}&search=${pager.search}"> ${n} </a> 
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
		
		 <c:if test="${not empty member}">
			<a href="./insert" class="btn btn-danger"> ADD </a> 
		</c:if>
	</div>
</body>
</html>