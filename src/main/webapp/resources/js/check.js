/**
 * 
 */

const checkAll = document.getElementById('checkAll'); 
let ch1 = document.getElementsByClassName('ch1');
let reqCheck = document.getElementsByClassName('reqCheck');

const btn = document.getElementById('btn');

/* join button click event */
btn.addEventListener('click', function() {
	let result = true;
	for (let rc of reqCheck) {
		if (!rc.checked) {
			result = false;
			break;
		}
	}
	if (result) {
		location.href = './join';
	} else {
		alert('필수 약관에 동의해야 합니다.');
	}
})

/* checkAll button click event */
checkAll.addEventListener('click', function() {
	if (checkAll.checked) {
		for (let ch of ch1) {
			ch.checked = true;
		}
	} else {
		for (let ch of ch1) {
			ch.checked = false;
		}
	}
})

/* checkbox 요소가 모두 체크 되었을 때 checkAll 박스에 체크,
	하나라도 체크되지 않았을 때 checkAll 박스 체크 해제 */
for (let ch of ch1) {
	ch.addEventListener('click', function() {
		let result = true;
		for (let ch of ch1) {
			if (!ch.checked) {
				result = false;
				break;
			}
		}
		checkAll.checked = result;
	})
}


