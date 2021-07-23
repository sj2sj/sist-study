package com.iu.s6;

public class Aircon extends Product {

	private int area; //면적

	public void info() {
		super.info(); //부모 메서드 info를 호출
		System.out.println("area: " + this.area);
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
