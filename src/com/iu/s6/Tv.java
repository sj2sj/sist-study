package com.iu.s6;

public class Tv extends Product {

	public Tv() {
		//생성자에 super()가 생략되어있음.
	}
	
	private int size;
	
	public void info() {
		super.info(); //부모 메서드 info를 호출
		System.out.println("Size: " + this.size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
