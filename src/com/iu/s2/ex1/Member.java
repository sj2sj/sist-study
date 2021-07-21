package com.iu.s2.ex1;

public class Member {

	private String id;
	private int age;
	private int weight;
	private int height;
	

	
	
	//외부 데이터를 멤버 변수에 대입
	//데이터를 입력하는 메서드: set멤버변수명 (setter)
	public void setAge(int age) {
		if (age > 0 && age < 150) {
			this.age = age;
		} else {
			this.age = 20;
		}
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	//멤버변수를 외부로 보낼 때
	//데이터를 출력하는 메서드: get멤버변수명 (getter)
	public int getAge() {
		return this.age;
	}
	
	public String getId() {
		return this.id;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	
	public void info() {
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);
	}
	
}
