package com.iu.s2.list.ex1;

public class MemberView {

	
	/*
	 * myPage 선택시 실행
	 * id, pw, age 출력
	 * 단, 메서드의 head는 변경 X
	 * 멤버변수 선언 X
	 * */
	public void view() {
		MemberDTO dto = MemberSession.SESSION.get("member");
		System.out.println("ID: " + dto.getId());
		System.out.println("PW: " + dto.getPw());
		System.out.println("Age: " + dto.getAge());
	}
}
