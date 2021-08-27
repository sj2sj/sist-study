package com.iu.s2.ex2;

public class StudentView {

	//학생 정보 모두 출력 
	public void viewAll(Student stds[]) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");
		
		for (int i = 0; i < stds.length; i++) {
			System.out.print(stds[i].name + "\t");
			System.out.print(stds[i].num + "\t");
			System.out.print(stds[i].kor + "\t");
			System.out.print(stds[i].eng + "\t");
			System.out.print(stds[i].math + "\t");
			System.out.print(stds[i].total + "\t");
			System.out.println(stds[i].avg);
		}
	}
	
	
	
	//학생 번호 검색 
	public void viewOne(Student std) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");
		
		System.out.print(std.name + "\t");
		System.out.print(std.num + "\t");
		System.out.print(std.kor + "\t");
		System.out.print(std.eng + "\t");
		System.out.print(std.math + "\t");
		System.out.print(std.total + "\t");
		System.out.println(std.avg);
	}
	
}
