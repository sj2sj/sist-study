package com.iu.s2;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest2 Start ====");
		
		/* 증감연산자 */
		////////////////////
		int num = 0;
		
		num++;
		System.out.println(num); //1
		
		++num;
		System.out.println(num); //2
		
		//선행 연산자 
		int check1 = ++num;
		System.out.println("num: " + num); //3
		System.out.println("check1: " + check1); //3
		
		//후행 연산자 (대입 연산자보다 우선순위가 낮음)
		check1 = num++;
		System.out.println("num: " + num); //4
		System.out.println("check1: " + check1); //3
		
		
		System.out.println(++num); //5
		System.out.println(num++); //5
		System.out.println(num); //6
		
		System.out.println("==== ForTest2 Finish ====");
	}

}
