package com.iu.s6;

public class S6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv();
		tv.setBrand("Samsung");
		tv.setColor("Black");
		tv.setPrice(3000000);
		tv.setPoint(300);
		tv.setSize(100);
		
		Computer computer = new Computer();
		computer.setBrand("LG");
		computer.setColor("Pink");
		computer.setPrice(1700000);
		computer.setPoint(170);
		computer.setSsd(512);
		
		Aircon aircon = new Aircon();
		aircon.setBrand("Carrier");
		aircon.setColor("White");
		aircon.setPrice(2000000);
		aircon.setPoint(200);
		aircon.setArea(8);
		
		//출력 
		tv.info();
		computer.info();
		aircon.info();
		
		
		Guest dubu = new Guest();
		dubu.setMoney(5000000);
		dubu.setPoint(10);
		
		
		Product[] product = new Product[2];
		product[0] = tv;
		product[1] = computer;
		//buy
		//dubu.buy(aircon);
		dubu.buy(product);
		
		//게스트의 돈, 포인트 출력
		System.out.println("두부의 남은 돈: " + dubu.getMoney());
		System.out.println("두부의 남은 포인트: " + dubu.getPoint());
	}

}
