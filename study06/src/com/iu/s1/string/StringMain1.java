package com.iu.s1.string;

import java.util.Comparator;

public class StringMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		//String 객체 생성 Test
		String t1 = "test"; //객체 생성
		String t2 = new String("test");
		
		//객체 주소가 찍혀야하는데 문자열이 찍혀서 primitive type이라고 착각할 수 있지만 reference type임!!.
		//but 자동으로 toString 메서드를 호출하기 때문에 문자열이 출력됨..
		System.out.println(t1);
		System.out.println(t2.toString());
		
		System.out.println(t1 == t2); //f (실제 주소를 비교) 
		System.out.println(t1.equals(t2)); //t
		
		
		Test test = new Test();
		System.out.println(test); //오버라이딩 했기 때문에 객체 주소가 아닌 다른 return 값이 나옴.
		
	}

}
