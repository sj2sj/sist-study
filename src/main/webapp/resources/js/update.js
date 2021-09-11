/**
 * 
 */
let updateForm = document.getElementsByClassName('updateForm');
 
const mpw1 = document.getElementById('mpw1');
const mpw2 = document.getElementById('mpw2');

const updateBtn = document.getElementById('updateBtn');

const frm = document.getElementById('frm');

mpw2.addEventListener('blur', function() {
	let ceEq = checkEq(mpw1.value, mpw2.value);
	if (!ceEq) {
		console.log('다름쓰');
	}
})


/* 수정 버튼 클릭하면 체크해야할거 다 통과했는지 검사 */
updateBtn.addEventListener('click', function() {
	let ceResult = checkEmpty(updateForm); //입력정보 다 입력했는지 검사
	let ceEq = checkEq(mpw1.value, mpw2.value); //비밀번호 2개 같은지 검사
	
	if (ceResult) {
		
	} else {
		alert('필수 입력 정보를 입력하세요.');
	}
	
	
	if (ceResult && ceEq) {
		frm.submit();
	}
})


/* 매개변수로 받은 2개의 값이 같은지 확인 */
function checkEq (check1, check2) {
	return check1 == check2;
}



/* 빈 요소 있는지 검사 */
function checkEmpty(checks) {
	let result = true;	
	for (let r of checks) {
		if (!r.value.trim()) {
			result = false;
			break;
		}
	}
	
	return result;
}