package com.iu.s1.string;

public class StringMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String name = new String("hello World");
		String name = "hello World";
		
		System.out.println(name.charAt(1));
		
		name = "991021-1234567";
		char gender = name.charAt(7);

		if (gender == '1' || gender == '3') {
			System.out.println("남자 ");
		} else {
			System.out.println("여자 ");
		}
	}

}
