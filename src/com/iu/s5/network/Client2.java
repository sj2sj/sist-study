package com.iu.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. server와 접속 
		 * 2. 1번을 누르면 점심메뉴 
		 * 	  2번을 누르면 저녁메뉴 
		 *    3번을 누르면 종료
		 */
		
		Socket sc = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			//서버 접속 전
			sc = new Socket("127.0.0.1", 8282);
			
			System.out.println("서버 접속에 성공했습니다..");
			
			
			boolean check = true;
			while (check) {
				/* 서버로부터 메시지 받음 */
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
//				
//				String message = br.readLine();
//				System.out.println(message);
			
				
				
				
				/* 서버로 메시지 보내기 */
				System.out.println("번호를 입력하세요: ");
				int selNum = scanner.nextInt();
				String select = Integer.toString(selNum);
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(select+"\r\n");
				bw.flush();
				
				if (selNum > 2 || selNum < 0) {
					System.out.println("??");
					check = false;
					continue;
				}
				
				String message = br.readLine();
				System.out.println("메뉴: " + message);
			}
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
