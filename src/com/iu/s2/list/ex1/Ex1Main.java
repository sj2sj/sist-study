package com.iu.s2.list.ex1;

import java.util.ArrayList;

import com.iu.s2.list.Member;

public class Ex1Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object
		//1. 클래스명
		//2. 객체
		//Reference type - Class
		
//		int num = 10;
//		Member member = new Member();
//		Object obj = new Object();
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> ar = dao.memberInit();
		
		dao.memberAdd(ar);
		boolean result = dao.memberDelete(ar);
		
		if (result) {
			System.out.println("삭제에 성공했습니다. ");
		} else {
			System.out.println("삭제에 실패했습니다. ");
		}
		
		MemberDTO dto = dao.memberLogin(ar);
		if (dto != null) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패");
		}
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("id: "+ar.get(i).getId());
			System.out.println("pw: "+ar.get(i).getPw());
			System.out.println("age: "+ar.get(i).getAge());
		}
		
		
	}

}
