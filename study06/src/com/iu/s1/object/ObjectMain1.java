package com.iu.s1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성
		Object obj = new Object();
		System.out.println(obj);
		
		//멤버변수, 멤버메서드 호출
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
		Object obj2 = new Object();
		
		System.out.println(obj.equals(obj2));
		
		
		
		Test test = new Test();
		Test test2 = new Test();

		
		System.out.println(test == test2); //F
		System.out.println(test.num1 == test2.num1); //T
		System.out.println(test.equals(test2)); //T
		//Test Class는 상속받고 있는 클래스가 없지만, 사실은 extends Object 라는 코드가 생략되어 있는 것.
		//따라서 Object 클래스의 메서드를 사용할 수 있음.
//		test.hashCode(); 
		
//		Object object = test;
	}

}
