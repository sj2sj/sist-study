<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	.replyRegDate {
		display: inline-block;
		float: right;
	}
	
	.page-link {
		cursor: pointer;
	}
</style>

</head>

<c:import url="../temp/boot_head.jsp"></c:import>
<body>

	<c:import url="../temp/boot_nav.jsp"></c:import>
	
	
	
	<div class="container">
	
		<h2> ${board} Select Page </h2>
		
		<h4 id="num"> ${dto.num} </h4>
		<h4> ${dto.title} </h4>
		<div>
			${dto.contents}
		</div>
		
		<h4> ${dto.writer} </h4>
		<h4> ${dto.regDate} </h4>
		
		<c:forEach items="${dto.files}" var="list">
			<div>
				<a href="./down?fileName=${list.fileName}">${list.oriName}</a>
			</div>
		</c:forEach>
		
		
		<!-- 댓글쓰 -->
		
		<hr>
			<div>
				<label for="writer" class="form-label">WRITER</label>
				<input id="writer" class="form-control" value="${member.id}" type="text" name="writer" readonly="readonly" required>
			
				<label for="contents" class="form-label">Content</label>
				<textarea class="form-control"  id="contents" name="contents" required></textarea>
				
				<input type="submit" id="comment" class="btn btn-primary" value="write">
			</div>
		
		
		<hr>
		<!-- //댓글영역 -->
		
		
		<c:if test="${not empty member and member.id eq dto.writer}">
			<a href="./delete?num=${dto.num}" class="btn btn-danger"> delete </a>
			<a href="./update?num=${dto.num}" class="btn btn-primary"> Update </a>
		</c:if>
		
		<c:if test="${board eq 'qna'}">
			<a href="./reply?num=${dto.num}" class="btn btn-primary"> Reply </a>
		</c:if>
		
		
		<div id="commentList" data-board-num=${dto.num}>
			
	
		</div>
		
		
	
	</div>

	<script type="text/javascript" src="../resources/js/select.js"></script>
	

</body>
</html>