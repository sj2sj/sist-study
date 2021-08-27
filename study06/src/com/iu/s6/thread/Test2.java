package com.iu.s6.thread;

public class Test2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
		}
	}
}
