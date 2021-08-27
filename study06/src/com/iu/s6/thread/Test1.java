package com.iu.s6.thread;

public class Test1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//동시에 진행할 코드 작성
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i);
		}
	}
	
}
