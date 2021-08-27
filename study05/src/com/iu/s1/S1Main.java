package com.iu.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tablet tablet = new Tablet();
		
		computer.setBrand("iMac");
		phone.setBrand("Apple");
		tablet.setBrand("Samsung");
		
		System.out.println(computer.getBrand());
	}

}
