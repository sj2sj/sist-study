package com.iu.s2.list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		
		String[] str = new String[2];
		
		//같은 데이터타입을 모음 
		String s = "First";
		Object e = s;
		
		ar.add("First");
		str[0] = "First";
		
		System.out.println(ar.size());
		System.out.println(str.length);
		
		ar.add("Second");
		str[1] = "Second";
		
		ar.add("Third");
		
		Object obj = 5;
		ar.add(5);
		
		ar.add('a');
		ar.add(true);
		
		System.out.println("========================");
		
		ar.add(1, "add");
		ar.set(0, 1);
		ar.remove(0);
		ar.clear();
		
		System.out.println("size: " + ar.size());
		System.out.println(ar.isEmpty());
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("========================");
		ar.add("first");
		ar.add(2);
		ar.add(3.3333);
		ar.add('4');
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		String s0 = (String)ar.get(0);
		int s1 = (Integer)ar.get(1);
	}

}
