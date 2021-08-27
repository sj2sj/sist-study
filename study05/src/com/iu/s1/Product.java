package com.iu.s1;

public abstract class Product {
	
	private String brand;
	private String cpu;
	private int ram;
	private int price;
	
	//추상 메서드 
	public abstract void info();

	//일반 메서드
	public void info2() {
		
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
