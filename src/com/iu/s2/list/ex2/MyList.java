package com.iu.s2.list.ex2;

import java.util.ArrayList;

public class MyList implements DataIO {


	
	@Override
	/*
	 * 매개변수 num을 list의 가장 앞에 추가
	 */
	public void add(ArrayList<Integer> ar, int num) {
		// TODO Auto-generated method stub
		ar.add(0, num);
	}

	/*
	 * list의 마지막 요소를 삭제
	 */
	@Override
	public void remove(ArrayList<Integer> ar) {
		// TODO Auto-generated method stub
		ar.remove(ar.size()-1);
	}
	
}
