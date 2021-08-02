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

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Client용
		//IP+Port -> Socket
		
		//선언부터 해주는 이유:
		//연결을 끊어야하기때문
		//연결된 역순으로 끊는다.
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
			
			//접속 후 
			System.out.println("서버와 접속이 성공했습니다...");
			
			boolean check = true;
			//서버로 메시지 전송
			while (check) {
				System.out.println("서버로 보낼 메시지를 입력하세요: (q, Q입력 시 종료)");
				String message = scanner.nextLine();
	

				
				//byte처리 
				os = sc.getOutputStream();
				//char(문자)처리 
				ow = new OutputStreamWriter(os);
				//문자열 처리
				bw = new BufferedWriter(ow);
				bw.write(message+"\r\n");
				bw.flush();
				System.out.println("서버로 전송 성공");
				
				
				if (message.toUpperCase().equals("Q")) {
//					break;
					check = false;
					continue;
				}
				
				
				//server에서 메시지 받아오기..
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				message = br.readLine();
				
				System.out.println("서버에서 보낸 메시지");
				System.out.println("Server: " + message);
				if (message.toUpperCase().equals("Q")) {
					break;
				}
				
				
				
				
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
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
