package com.iu.s6;

public class Guest {

	private int money;
	private int point;
	
	//매개변수는 1개만 선언 가능 
	public void buy(Product product) {
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
	}
	
	//여러개 사면?
	public void buy(Product[] product) {
		for (int i = 0; i < product.length; i++) {
			this.buy(product[i]);
		}
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
