/**
 * 
 */
 
$("#mid").blur(function() {
	let id = $("#mid").val();
	
	$.get("member/idCheckAjax?id="+id, function(result) {
		result = result.trim();
		
		let msg = "사용할 수 없는 아이디 입니다.";
		if (result == 1) {
			msg = "사용할 수 있는 아이디 입니다.";
		}
		$("#midResult").text(msg);
	});
})
 

$("#joinBtn").click(function() {
	let result = true;
	$(".joinForm").each(function(v1, v2) {
		if ($(v2).val() == "") {
			result = false;
		}
		console.log(result);
	});
	
	if (result) {
		
	} else {
		alert('입력란을 모두 작성해주세요.');
	}
});
