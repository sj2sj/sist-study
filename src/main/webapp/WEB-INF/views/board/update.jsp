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
		<h2> ${board} update page </h2>
		
		<form action="./update/" method="POST" enctype="multipart/form-data">
		
			<label for="title" class="form-label">TITLE</label>
			<input class="form-control" value="${dto.title}" type="text" name="title" required>
			
			<label for="writer" class="form-label">WRITER</label>
			<input class="form-control" value="${member.id}" type="text" name="writer" readonly="readonly" required>
			
			<label for="contents" class="form-label">Content</label>
			<textarea class="form-control"  id="contents" name="contents" required>${dto.contents}</textarea>
			
			
			<div>
				<c:forEach items="${dto.files}" var="f">
					<div>
						${f.oriName} <span class="fileDelete" data-files-num="${f.fileNum}" data-files-name="${f.fileName}"> X </span>
					</div>
				</c:forEach>
			</div>
			
			<hr> <hr>
			
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
			
			<input type="submit" class="btn btn-primary" value="update">
		</form>

	</div>
	
	<script type="text/javascript" src="../resources/js/boardFile.js"></script>
	
	<script type="text/javascript">
		 setCount('${dto.files.size()}');
	
		
		$(".fileDelete").click(function() {
			let fileNum = $(this).attr('data-files-num');
			let fileName = $(this).attr('data-files-name');
			
			let selector = $(this);

			$.ajax({
				type: "POST"
				, url: "./fileDelete"
				, data: {
					fileNum : fileNum
					, fileName : fileName
				}
				, success: function(result) {
					if (result.trim() > 0) {
						selector.parent().remove();
						count--;
					}
					
				}
			})
		})
	
		$(document).ready(function() {
		  $('#contents').summernote();
		});
	</script>
</body>
</html>

