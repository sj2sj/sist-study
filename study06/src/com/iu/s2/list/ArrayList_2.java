package com.iu.s2.list;

import java.util.ArrayList;

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//type이 안전하지 않다.
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("1");
		
		//int를 담을 List 선언
		ArrayList<Integer> ar2 = new ArrayList<>(); //객체 생성할 때는 <> 안에 오브젝트 타입 생략 가능...
		
		//List는 ArrayList의 super class(Interface)
		//단, generic type도 일치
//		List<Integer> list = ar;
//		List<Object> list = ar;
		
		String s = ar.get(0);
	}

}
