package com.iu.s4;

public class Test {
	
	
	
	int num;
	int num2 = 2;
	int num3;
	int num4;
	int num5;
	
	{
		//초기화 블럭
		System.out.println("초기화 블럭 ");
		this.num4 = 4;
	}
	
	public Test() {
		System.out.println("생성자");
		this.num3 = 10;
		this.num2 = 22;
		this.num4 = 44;
//		this.num5 = 55;
	}
	
	public void setNum5() {
		this.num5 = 5;
	}
	
}
