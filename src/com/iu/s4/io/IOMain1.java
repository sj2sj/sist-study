package com.iu.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in; //byte로 처리
		InputStreamReader ir = new InputStreamReader(is); //byte여러개를 모아서 문자로 처리
		BufferedReader br = new BufferedReader(ir); //문자들을 모아서 문자열로 처리
		System.out.println("Start!");
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
