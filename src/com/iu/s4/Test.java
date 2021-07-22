package com.iu.s4;

public class Test {
	int num = 10;
	final int num2; //상수. 한 번 값이 정해지면 변경할 수 없다!!
	
	
	public Test() {
		num2 = 9;
	}
	
	public Test(int num2) {
		this.num2 = num2;
	}
}
