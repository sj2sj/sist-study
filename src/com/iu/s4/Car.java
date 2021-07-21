package com.iu.s4;

public class Car {

	String company;	//회사
	String brand;	//브랜드
	String color;	//색상
	int price;		//가격
	int	gitong;		//엔진
	
	//생성자 만들기!
	//객체가 생성될 때 딱 한 번 실행됨!!
	//생성자를 하나 이상이라도 만들었다면 디폴트 생성자도 생성해줘야함

	public Car() {
		//this("Black"); //자기자신의 또 다른 생성자 호출할 때 사용!!!
		this("Black", 60000000);
	}
	
	public Car(String color) {
		this.company = "volvo";
		this.brand = "xc40";
		this.color = color;
		this.price = 50000000;
		this.gitong = 4;
	}
	
	public Car(String color, int price) {
		this.company = "volvo";
		this.brand = "xc40";
		this.color = color;
		this.price = price;
		this.gitong = 4;
	}
	
	public void info() {
		System.out.println("Company: " + this.company);
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Price: " + this.price);
		System.out.println("Gitong: " + this.gitong);
	}
	
}
