/**
 * 
 */
 
 const file = '<div class="mb-3" id="f">'+
   				'<label for="photo" class="form-label">photo</label>'+
   				'<input type="file" class="form-control joinForm" name="photo" id="photo">'+
			'</div>'
 
 $("#add").click(function() {
	$("#addResult").append(file);
	//$("#f").attr('display', 'block');
})