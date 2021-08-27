package com.iu.s4;

public class S4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
//		tiger.sound();
		tiger.wash();
//		cat.sound();
		cat.drop();
//		dog.sound();
		dog.guard();
		
		
		//Tiger is Animal.
		//Tiger타입은 Animal타입이다. 
		Animal animal = tiger; //형변환 
		
		animal = cat;
		animal = dog;
		
		Animal[] animals = new Animal[3];
		
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
		
		System.out.println("==========================");
		
//		Tiger t = animals[0]; Animal 타입이 더 크기 때문에. 형변환을 명시해줘야함
		//Tiger t = (Tiger)animals[0];
		//t.sound();
		//t.wash();
		
		
		//System.out.println(t instanceof Tiger); //t가 Tiger타입인지 물어보는 것 .
		System.out.println(animals[0] instanceof Tiger);
		
		
		System.out.println("==========================");
		
		Tiger t = new Tiger();
		Animal a = t;
		
		//객체생성 때 부터 Animal타입으로 만들었기 때문에 
		//자식 객체 타입으로 형변환할 수 없다.
		//Animal animal2 = new Animal();
		//Tiger tiger2 = (Tiger)animal2;
		//tiger2.sound();
		//tiger2.wash();
	}

}
