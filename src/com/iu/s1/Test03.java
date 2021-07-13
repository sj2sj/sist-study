package com.iu.s1;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test3 Start ====");
		
		//쇼핑몰의 총주문금액 입력...
		//주문금액이 30,000원 이하면 배송비 3,000원이 추가 / 30,000원 이상이면 배송비 무료
		
		//총 주문 금액을 출력!
		
		int price = 0;	//주문 금액 
		int amount = 0; 	//총 금액
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 금액: ");
		price = sc.nextInt();
		
		if (price >= 30000) { //30,000 이상이면 
			amount = price;
		} else { //아니면 
			amount = price + 3000; //배송비 추가 
		}
		
		System.out.println("총 주문금액: " + amount);
		
		
		System.out.println("==== Test3 Finish ====");
	}

}
