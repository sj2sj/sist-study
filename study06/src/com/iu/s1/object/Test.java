package com.iu.s1.object;

public class Test {
	int num1 = 1;
	int num2 = 2;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 20210723 숙제.
		// 멤버변수끼리 서로 같은지 비교하는 메서드로 만들기.
		
		Test test = (Test)obj;
		
		if (this.num1 == test.num1 && this.num2 == test.num2) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
