package com.iu.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {

	
	public void write2() {
		//id, pw, age를 입력받아서
		//test 폴더 밑에 member.text라는 파일을 만들고 입력받은 내용을 집어넣어라!
		//예시: id-pw-age 순으로 저장
		Scanner sc = new Scanner(System.in);
		File file = new File("/Users/ddu/Downloads/test", "member.txt");
		
		System.out.println("id를 입력하세요: ");
		String id = sc.next();
		System.out.println("pw를 입력하세요: ");
		String pw = sc.next();
		System.out.println("age를 입력하세요: ");
		int age = sc.nextInt();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(id+"-"+pw+"-"+age+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void write() {
		Scanner sc = new Scanner(System.in);
		File file = new File("/Users/ddu/Downloads/test", "test.txt");
		
		System.out.println("메시지를 입력하세요");
		String message = sc.next();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
