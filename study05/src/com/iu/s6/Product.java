package com.iu.s6;

public class Product {

	private String brand;
	private int price;
	private int point;
	private String color;
	
	public Product(String brand) {
		this.brand = brand;
	}
	
	public Product() {
		
	}

	
	public void info() {
		System.out.println("==============");
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Price: " + this.price);
		System.out.println("Point: " + this.point);
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
