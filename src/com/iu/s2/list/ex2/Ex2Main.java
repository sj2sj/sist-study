package com.iu.s2.list.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList myList = new MyList();
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		
		myList.add(ar, 3);
		myList.remove(ar);
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
