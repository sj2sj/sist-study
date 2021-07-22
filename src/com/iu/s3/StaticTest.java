package com.iu.s3;

public class StaticTest {

	
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//클래스변수는 객체 생성 안하고 사용 가능  
	//클래스변수는 프로그램 시작과 동시에 생성되어 있음
	//인스턴스변수는 new로 생성됨
	public static int num = 10; 
	public int num2 = 20;
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수]) {}
	public static void staticMethod() {
		System.out.println("Static Method");
		System.out.println(StaticTest.num);
		
//		
//		System.out.println(this.num2);
//		this.instanceMethod();
	}
	
	public void instanceMethod() {
		System.out.println("Instance Method");
		System.out.println(StaticTest.num);
		System.out.println(this.num2);
		
		//this() - 생성자 호출
		//참조변수명.메서드명();
		StaticTest.staticMethod();
	}
}
