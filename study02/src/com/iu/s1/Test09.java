package com.iu.s1;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test9 Start ====");

		
		boolean check = true;
		
		check = !check;
		
		if(!check) {
			System.out.println("TEST!");
		}
		
		
		int age = 30;
		
		//삼항연산자 --> 조건식?true일 때 실행:false일 때 실행 
		String result = age > 19 ? "성년":"미성년";
		System.out.println(result);
		
		System.out.println(1+'1'+"1");
		
		System.out.println("==== Test9 Finish ====");
	}

}
