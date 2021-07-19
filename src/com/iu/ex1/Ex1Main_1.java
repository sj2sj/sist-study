package com.iu.ex1;

public class Ex1Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Ex1 Start ====");
		
		
		//캐릭터 생성 
		//이름, 레벨, 체력, 마나, 골드를 입력하고 각각 출력 
		Character chr1 = new Character(); //캐릭터 생성 
		chr1.name = "나만없어고양이";
		chr1.level = 1;
		chr1.hp = 500;
		chr1.mp = 500;
		System.out.println(chr1.weapon);
		//chr1이 가지고 있는 무기의 이름을 출력 
//		System.out.println(chr1.weapon.name);
		
		System.out.println("Name: " + chr1.name);
		System.out.println("level: " + chr1.level);
		System.out.println("hp: " + chr1.hp);
		System.out.println("mp: " + chr1.mp);
		System.out.println("gold: " + chr1.gold); //gold 값을 넣어주지 않아도 초기화가 자동으로 됨 (heap영역이기 때문)
		
		
		//몬스터 생성
		Monster m1 = new Monster(); 
		m1.name = "슬라임";
		m1.level = 2;
		m1.hp = 300;
		m1.mp = 100;
		m1.gold = 30;
		m1.weapon = new Weapon();
		m1.weapon.name = "몽둥이";
		m1.weapon.damage = 500;
		m1.weapon.critical = 0.8;
		m1.weapon.upgrade = 3;
		
		
		System.out.println("Name: " + m1.name);
		System.out.println("level: " + m1.level);
		System.out.println("hp: " + m1.hp);
		System.out.println("mp: " + m1.mp);
		System.out.println("gold: " + m1.gold);
		
		
		//무기 생성 
		Weapon wp1 = new Weapon();
		wp1.name = "마법봉";
		wp1.damage = 8;
		wp1.critical = 0.6;
		wp1.upgrade = 1;
		
		chr1.weapon = wp1;
		
		System.out.println(chr1.weapon.name);
		
		wp1.name = "더 큰 마법봉"; //주소가 같기 때문에 

		System.out.println(chr1.weapon.name);
		
		//ch = monster; <-이건 타입이 달라서 에러뜸 
		chr1.gold = chr1.gold + m1.gold;
		
		//몬스터의 무기를 내 무기로 바꾸기..
		chr1.weapon = m1.weapon;


		
		
		
		System.out.println("==== Ex1 Finish ====");
	}

}
