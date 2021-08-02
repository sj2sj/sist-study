package com.iu.s6.thread;

public class Test3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i);
		}
	}
	
}
