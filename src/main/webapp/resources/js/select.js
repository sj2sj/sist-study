/**
 * 
 */
 
getCommentList(1);

let content = '';

//댓글 업데이트!
$("#commentList").on('click', '.updateBtn', function() {
	let contents = $(this).prev().val();
	let commentNum = $(this).parent().attr('data-comment-num');

	let selector = $(this);


	$.ajax({
		type: "POST"
		, url: "./setCommentUpdate"
		, data: {
			commentNum : commentNum
			, contents : contents
		}
		, success: function(result) {
			if (result.trim() > 0) {
				alert('update success!');
				//getCommentList(1); //요렇게 쓰면 수정 다 하고 나서... 불편
				console.log(selector);
				selector.parent().children('div').text(contents);
				selector.parent().children('div').css('display', 'block');
				selector.parent().children('textarea').remove();
				selector.parent().children('button').remove();

			} else {
				alert('update fail... ㅠㅠ')
			}
		}
		, error: function() {
			alert('update fail...');
		}
	})
})


//업데이트 취소
$("#commentList").on("click", ".cancelBtn", function() {
	console.log(content);
	$(this).parent().children('div').css('display', 'block');
	$(this).parent().children('textarea').remove();
	$(this).parent().children('button').remove();
})


//수정 폼 나오게
$("#commentList").on("click", ".update", function() {
	let num = $(this).attr("data-comment-num");
	content= $("#content"+num).text().trim();
	$("#content"+num).children().css('display', 'none');
	let ta = '<textarea class="form-control" cols=""  name="contents" id="contents" rows="6">';
	ta = ta+content.trim() +'</textarea>';
	ta = ta + '<button type="button" id="" class="updateBtn btn btn-primary">update</button>';
	ta = ta + '<button type="button" id="" class="cancelBtn btn btn-primary">cancel</button>';
	 $("#content"+num).append(ta);

});


//삭제
$("#commentList").on('click', '.delete', function() {
	let commentNum = $(this).attr('data-comment-num');
	console.log(commentNum);
	
	$.ajax({
		type: "GET"
		, url: "./setCommentDelete"
		, data: {
			commentNum : commentNum
		}
		, success: function(result) {
			result = result.trim();
			console.log(result);
			
			getCommentList(1);
		}
	})
});


//페이지 번호 누를 때 이벤트
$("#commentList").on('click', '.page-link', function() {
	let pn = $(this).attr('data-comment-pn');
	
	getCommentList(pn);
})


//댓글 불러오기 
function getCommentList(pn) {
	
	$.ajax({
		type: "GET"
		, url: "./getCommentList"
		, data: {
			num : $("#commentList").attr('data-board-num')
			, pn : pn
		}
		, success: function(result) {
			result = result.trim();
			$("#commentList").html(result);
		}
		, error: function(xhr, status, error) {
			console.log(error);
		}
	})

}
 
 
 //댓글 입력
 $("#comment").click(function () {
	let writer = $("#writer").val();
	let contents = $("#contents").val();
	let num = $("#num").text().trim();
	
	$.post('./comment', {
		num : num
		, writer : writer
		, contents : contents
	}, function(result) {
		console.log(result.trim());
		
		$("#contents").val('');
		
		getCommentList();
	})
})

