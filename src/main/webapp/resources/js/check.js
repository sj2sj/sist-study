/**
 * 
 */


$("#checkAll").click(function() {
	$('.ch1').prop("checked", $(this).prop("checked"));
});


$(".ch1").click(function() {
	let result = true;
	$(".ch1").each(function(v1, v2) {
		// console.log(v2.checked);
		// console.log($(v2).prop('checked'));
		
		if (!$(v2).prop('checked')) {
			result = false;
			//console.log(v1, $(v2).prop('checked'));
		}
	});
	
	$("#checkAll").prop('checked', result);
});



$("#btn").click(function() {
	if ($("#checkAll").prop('checked')) {
		location.href = 'join';
	} else {
		alert('약관동의 필수');
	}
})

