package com.iu.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {
	public static void main(String[] args) {
		
		File file = new File("/Users/ddu/Downloads/test/", "name.txt");
		
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); //문자열로 연결
			ArrayList<FileMember> ar = new ArrayList<>();
			
			while (true) {
				String str = br.readLine(); //한줄씩 읽어옴
				
				if (str == null) { //더이상 커서가 내려가지 않으면 null
					break;
				}
				FileMember fileMember = new FileMember();
				
				String[] ar2 = str.split(",");
				fileMember.setId(ar2[0]);
				fileMember.setPw(ar2[1]);
				fileMember.setAge(Integer.parseInt(ar2[2]));
				
				ar.add(fileMember);
//				System.out.println(str);
			}
			
			for (int i = 0; i < ar.size(); i++) {
				System.out.print("id: " + ar.get(i).getId() + "\t");
				System.out.print("pw: " + ar.get(i).getPw() + "\t");
				System.out.println("age: " + ar.get(i).getAge());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
