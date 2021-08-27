package com.iu.s6;

public class Computer extends Product {

	private int ssd;
	
	public void info() {
		super.info(); //부모 메서드 info를 호출
		System.out.println("ssd: " + this.ssd);
	}


	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
}
	
	
