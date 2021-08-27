package com.iu.s1;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==== Test8 Start ====");
		

		int price = 0; //물건 합계
		int money = 0; //손님이 낸 돈
		int don = 0;	//거스름돈
		

		//물건 값의 합계보다 손님이 낸 돈이 더 많다는 가정!!
		/* 1) 물건 합계, 손님이 낸 돈, 거스름 돈을 출력해라. */
		price = 13220;
		money = 100000;
		don = money - price;
		
		System.out.println("물건의 합계: " + price + "원");
		System.out.println("손님이 낸 돈: " + money + "원");
		System.out.println("거스름돈: " + don + "원");
		
		//거스름돈
		int man = 0; 	//만원 짜리 담을 변수
		int cheon = 0; 	//천원
		int back = 0;	//백원
		int sip = 0;	//십
		
		/* 2) 거스름돈을 어떻게 줘야하는지 출력해랏! */
		man = don / 10000;
		cheon = don % 10000 / 1000;
		back = don % 1000 / 100;
		sip = don % 100 / 10;
		
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 : " + cheon + "장");
		System.out.println("백원 : " + back + "개");
		System.out.println("십원 : " + sip + "개");
	}

}
