package com.iu.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		
		member.setAge(30);
		member.setId("abc123");
		member.setWeight(60);
		member.setHeight(150);
		
//		int age = member.getAge();
//		System.out.println(age);
		member.info();
	}

}
