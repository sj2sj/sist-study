/**
 * 
 */
 
let joinForm = document.getElementsByClassName('joinForm');
const joinBtn = document.getElementById('joinBtn');

const mpw1 = document.getElementById('mpw1');
const mpw2 = document.getElementById('mpw2');

const frm = document.getElementById('frm');

const mid = document.getElementById('mid');
const midResult = document.getElementById('midResult');

const idCheck = document.getElementById('idCheck');


//ID 중복확인
idCheck.addEventListener('click', function() {
	open('./idCheck?id='+mid.value, "", "width=500, height=150, top=200, left=300");
	
})



mpw2.addEventListener('blur', function() {
	let ceEq = checkEq(mpw1.value, mpw2.value);
	if (!ceEq) {
		console.log('다름쓰');
	}
})

mid.addEventListener('blur', function() {
	if (mid.value.trim().length < 6) {
		mid.focus();
	}
})


//회원가입 버튼 눌렀을 때.
joinBtn.addEventListener('click', function() {
	let ceResult = checkEmpty(joinForm); //입력정보 다 입력했는지 검사
	let ceEq = checkEq(mpw1.value, mpw2.value); //비밀번호 2개 같은지 검사
	let ceLen = checkLength(mid.value);
	
	if (ceResult) {
		
	} else {
		alert('필수 입력 정보를 입력하세요.');
	}
	
	
	if (ceResult && ceEq && ceLen) {
		frm.submit();
	}
})



function checkLength (check) {
	if (check.trim().length >= 6) {
		return true;
	} else {
		return false;
	}
} 



function checkEq (check1, check2) {
	return check1 == check2;
}




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