package com.iu.ex1;

public class Ex1Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Ex1Main_2 Start ====");
		
		Pet pet1 = new Pet();
		pet1.name = "두부";
		
		
		Pet pet2 = new Pet();
		pet2.name = "루피";
		
		
		//배열
		//배열은 같은 데이터 타입만 묶는다.
		//pet을 담을 수 있는 배열을 선언
		
		Pet[] pets = new Pet[2];
		
		pets[0] = pet1;
		pets[1] = new Pet();
		pets[1].name = "루피";
		
		
		for (int i = 0; i < pets.length; i++) {
			System.out.println(pets[i].name);
		}
		
		
		
		//캐릭터 생성 
		//이름, 레벨, 체력, 마나, 골드를 입력하고 각각 출력 
		Character chr1 = new Character(); //캐릭터 생성 
		chr1.name = "얍얍루피";
		
		

		//배열 
		
		System.out.println("==== Ex1Main_2 Finish ====");
	}

}
