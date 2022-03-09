<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- include summernote css/js -->

<c:import url="../temp/boot_head.jsp"></c:import>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>

	<c:import url="../temp/boot_nav.jsp"></c:import>

	<div class="container">
		<h2> ${board} insert page </h2>
		
		<form action="./insert/" method="POST" enctype="multipart/form-data">
		
			<label for="title" class="form-label">TITLE</label>
			<input class="form-control" type="text" name="title" required>
			
			<label for="writer" class="form-label">WRITER</label>
			<input class="form-control" value="${member.id}" type="text" name="writer" readonly="readonly" required>
			
			<label for="contents" class="form-label">Content</label>
			<textarea class="form-control"  id="contents" name="contents" required></textarea>
			
			<div class="mb-5">
				<button type="button" id="add" class="btn btn-info"> file add </button>	
				<button type="button" class="del"> file delete </button>
			</div>
			<div id="addResult">
			<!-- <div class="mb-3 f">
   				<label for="photo" class="form-label">photo</label>
   				<input type="file" class="form-control joinForm" name="photo" id="photo">
			</div> -->
		</div>
			
			<input type="submit" class="btn btn-primary" value="write">
		</form>

	</div>
	
	<script type="text/javascript" src="../resources/js/boardFile.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function() {
		  $('#contents').summernote();
		});
	</script>
</body>
</html>

