package com.iu.s2;

import java.util.Random;

public class MethodMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method2 m2 = new Method2();
		
		m2.t1();
		
		String name = m2.t2();
		
		System.out.println(name);
		
		int sum = m2.t3(3, 2);
		
		System.out.println(sum);
		
		int[] numArr = m2.t4();
		System.out.println(numArr);
		
		Random random = new Random();
		int r = random.nextInt();
		System.out.println(r);
	}

}
