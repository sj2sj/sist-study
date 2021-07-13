package com.iu.s1;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test14 Start ====");
		
		int avg = 60;
		
		switch (avg / 10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		
		System.out.println("==== Test14 Finish ====");
	}

}
