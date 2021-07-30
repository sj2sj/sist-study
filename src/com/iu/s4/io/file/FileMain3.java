package com.iu.s4.io.file;

import java.io.File;

public class FileMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("/");
		String[] names = file.list();
		File [] files = file.listFiles(); //안에 있는 파일들을 모두 가져옴
		
		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i]);
			file = new File(file, names[i]);
			
//			System.out.println(file.length());
			
			if (file.isDirectory()) {
				System.out.println(names[i] + " 디렉토리");
			} else {
				System.out.println(names[i] + " 파일");
			}
		}
	}

}
