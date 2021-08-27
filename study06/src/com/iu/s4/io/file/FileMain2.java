package com.iu.s4.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("/Users/ddu/Downloads/test");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("폴더명 입력: ");
		String name = sc.next();
		
		file = new File (file, name);
//		if (file.exists()) {
//			System.out.println("해당 디렉토리 또는 파일이 존재합니다. ");
//		} else {
//			System.out.println("존재하는 디렉토리 또는 파일이 아닙니다. ");
//		}
		
//		if (!file.exists()) { //file이 존재하지 않으면 해당 이름으로 만드려고 함
////			file.mkdir(); //하나의 디렉토리만 생성할 수 있음! 상위 디렉토리와 하위 디렉토리를 한 번에 생성할 수는 없다.
//			file.mkdirs();
//		}
		
		
		if (file.exists()) {
			file.delete();
		} else {
			file.mkdirs();
		}
		
		
	}

}
