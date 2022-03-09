/**
 * boardFile.js
 * 최대 5개까지만 추가 가능하게
 */
let file = '<div class="input-group mb-3 f" id="del">'+
   				'<input type="file" class="form-control" name="files" id="photo">'+
   				'<button class="btn btn-outline-secondary del" type="button">X</button>'+
				'</div>';

 let count = 0;
 
 function setCount(c) {
	count = c;
}

function updateCount() {
	count--;
}
 
 
 $("#add").click(function() {
	/* 
	idx++;
 	let file = '<div class="input-group mb-3 f" id="del'+idx+'">'+
   				'<input type="file" class="form-control" name="photo" id="photo">'+
   				'<button data-btn-id='+idx+' class="btn btn-outline-secondary del" type="button">X</button>'+
				'</div>';
	*/
	
	if (count < 5) {
		$("#addResult").append(file);
		count++;
	} else {
		alert('파일첨부는 최대 5개까지만 가능합니다.');
	}
	
})



$("#addResult").on('click', '.del', function() {
	//console.log(this);
	//let num = $(this).attr('data-btn-id');

	//$('#del'+num).remove();
	count--;
	$(this).parent().remove();
})