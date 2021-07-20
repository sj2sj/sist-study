package com.iu.s2.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Ex1 Start ====");
		
		Phone phone = new Phone();
		phone.mnfct = "apple";
		phone.brand = "iPhone12 mini";
		phone.color = "purple";
		phone.size = 5;
		phone.price = 970000;
		
		Phone phone2 = new Phone();
		phone2.mnfct = "SAMSUNG";
		phone2.brand = "Galaxy 20";
		phone2.color = "Pink";
		phone2.size = 15;
		phone2.price = 2000000;
		
		PhoneView view = new PhoneView();
		view.view(phone);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		Phone[] phoneArr = new Phone[num];
		for (int i = 0; i < phoneArr.length; i++) {
			phoneArr[i] = new Phone();
		}
		phoneArr[0] = phone;
		phoneArr[1] = phone2;
		view.priceSum(phoneArr);
		
		
		System.out.println("==== Ex1 Finish ====");
	}

}
