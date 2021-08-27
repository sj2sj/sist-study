package com.iu.s1.string;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "Hello World!";
		String n2 = n.replace("ll", "korea");
	
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf("W"), 8);
		System.out.println(n3);
		
		System.out.println("======================");
		
		Scanner sc = new Scanner(System.in);
		
		//
		System.out.println("저장할 파일명을 입력: ");
		//a.text, iu.jpg, study.pdf, test.iu.gif ...
		//입력받은 파일이 이미지 파일인지 판단 
		//jpg, gif, png, svg 이면 이미지 파일로 판단.
		String fileName = sc.next();
		
		String[] files = {"jpg", "gif", "png", "svg"};
		
		String ext = fileName.substring(fileName.lastIndexOf('.')+1);
		boolean check = false; //이미지 파일인지 확인

		for (int i = 0; i < files.length; i++) {
			if (ext.equals(files[i])) {
				check = true;
				break;
			}
		}
		
		if (check) {
			System.out.println("이미지 파일입니다.");
		} else {
			System.out.println("이미지 파일이 아닙니다.");
		}
	}

}
