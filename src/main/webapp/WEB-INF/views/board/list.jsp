<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<h1> ${board} List Page </h1>
	
	<!---------------------------- 검색 form -------------------------->
	<form id="searchForm" action="./list">
		<input type="hidden" name="pn" value="1" id="pn">
		<select name="kind" id="kind">
			<option class="s" value="title">title</option>
			<option class="s" value="contents">contents</option>
			<option class="s" value="writer">writer</option>
		</select>
		<input type="text" name="search" id="search">
		
		<!-- 
		<select name="perPage">
			<option value="5">5개씩 보기</option>
			<option value="10">10개씩 보기</option>
			<option value="20">20개씩 보기</option>
		</select>
		 -->
		 
		<button id="searchBtn" type="button">search</button>
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
	
	<button class="p" data-list-pn="${pager.startNum-1}" type="button">pre</button>

	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		<span class="p" data-list-pn="${i}">${i}</span>
	</c:forEach>
	
	<c:if test="${!pager.lastCheck }">
		<button class="p" data-list-pn="${pager.lastNum+1}" type="button">next</button>
	</c:if>
	
	<div>
		<a href="./insert">write</a>
	</div>

<script type="text/javascript" src="../js/list.js"></script>

<script type="text/javascript">
	let kind = '${pager.kind}';
	let search = '${pager.search}';
	let pn = ${pager.pn};
	
	$(".s").each(function() {
		if ($(this).val() == kind) {
			$(this).prop('selected', true);
		}
	})
	
	$("#search").val(search);
	/*$("#kind").val(kind).prop('selected', true);*/
	
	$('.p').click(function() {
		const n = $(this).attr('data-list-pn');
		$("#pn").val(n);
		$("#search").val(search);
		$("#kind").val(kind);
		$("#searchForm").submit();
	})
</script>

</body>
</html>