package com.iu.s3;

public class Test1 {

	
	//멤버 볌수
	int num;
	int num2;
	
	public void info() {
		//메서드 내에서 다른 메서드 호출 가능?? yes
		int age; //지역 변수 
		System.out.println("Info Method 실행");
		System.out.println(this.num);
		
		this.info2();
	}
	
	
	public void info2() {
		System.out.println(num * num2);
		System.out.println("this: " + this);
	}
	
	
	public void info3(int num) {
		//매개변수의 변수명과 멤버변수의 변수명이 같으면 멤버변수 앞에 꼭 this를 꼭 써줘야함 
		System.out.println(this.num-num);
	}
}
