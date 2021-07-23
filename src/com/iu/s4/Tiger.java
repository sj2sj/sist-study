package com.iu.s4;

public class Tiger extends Animal {
	
	private String weapon;

	
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("어흥!");
	}
	
	public void wash() {
		System.out.println("온천욕을 즐기는 호랑쓰..");
	}
	
	
}
