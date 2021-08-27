package com.iu.s5;

public class S5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character = new Character();
		Sword sword = new Sword();
		character.weapon = sword;
		character.weapon.attack();
		
		//사냥 성공했더니 몬스터가 Gun을 떨굼.
		Gun gun = new Gun();
		character.weapon = gun;
		character.weapon.attack();
	}

}
