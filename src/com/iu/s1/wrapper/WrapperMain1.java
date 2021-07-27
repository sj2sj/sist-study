package com.iu.s1.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String s = "10";
		System.out.println(10+s); //1010
		
		Integer i = new Integer(s); //가운데줄 그인 이유: Deprecated.. 미래에 없어지거나 수정될 수 있기 때문
		int num = i.intValue();
		System.out.println(10+num); //20
		
		s = "100";
		num = Integer.parseInt(s);
		System.out.println(num+100);
		
		
		int n1 = 10;
		Integer n2 = Integer.valueOf(n1); //Boxing
		Double d = Double.valueOf(3.1); //Boxing
		
		n1 = n2.intValue(); //unBoxing;
		
		
		n2 = n1; //primitive type을 reference type으로 자동으로 넣는것 AutoBoxing
		
	}

}
