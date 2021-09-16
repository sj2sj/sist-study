/**
 * 
 */

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
