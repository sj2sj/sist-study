package com.iu.s4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
//		car.company = "volvo";
//		car.brand = "xc40";
//		car.color = "white";
//		car.price = 50000000;
//		car.gitong = 4;
		
		Car car2 = new Car("Red");
		
		Car car3 = new Car("Pink", 70000000);
		
		Scanner sc = new Scanner(System.in);
		
		car.info();
		car2.info();
		car3.info();
	}

}
