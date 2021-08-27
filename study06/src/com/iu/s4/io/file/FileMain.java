package com.iu.s4.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file = new File("/Users/ddu/Downloads/test/test.txt");
		
//		File file = new File("/Users/ddu/Downloads/test", "test.txt"); //폴더명과 파일명을 분리해서 사용
		
		File file = new File("/Users/ddu/Downloads/test");
		file = new File(file, "test.txt");
		
		
		boolean result = file.exists(); //해당 파일이 존재하는지
		System.out.println(result);
		
		
		result = file.isFile(); //file인지 물어봄
		boolean result2 = file.isDirectory(); //folder인지 물어봄 
		System.out.println(result);
		System.out.println("result2: "+result2);
		
		
		
		
		
		
	}

}
