package com.iu.s2.ex1;

public class PhoneView {

	public void view(Phone phone) {
		System.out.println("제조사: "+phone.mnfct);
		System.out.println("브랜드: "+phone.brand);
		System.out.println("색상: "+phone.color);
		System.out.println("크기: "+phone.size);
		System.out.println("가격: "+phone.price);
	}
	
	//사고싶은 핸드폰의 합계를 구함 (매개변수 1개만 써서)
	public void priceSum(Phone phone[]) {
		int total = 0;
		for (int i = 0; i < phone.length; i++) {
			total += phone[i].price;
		}
		System.out.println("총액: "+total);
	}
	
}
