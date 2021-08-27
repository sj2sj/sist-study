package com.iu.s2.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Member type을 모으려고 하는 list 선언
		ArrayList<Member> ar = new ArrayList<Member>();
		
		Member member = new Member();
		
		member.setId("iu");
		member.setPw("pw");
		
		ar.add(member);
		
		ar.add(new Member()); //index: 1

		ar.get(1).setId("id");
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getId());
			System.out.println(ar.get(i).getPw());
		}
		
	}

}
