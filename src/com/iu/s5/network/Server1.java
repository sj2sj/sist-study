package com.iu.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Server용
		//Java에서의 네트워크 통신은 1:1 통신임
		//Client 연결 요청이 오면 1:1 Socket을 생성해주는 Server Socket이 있음
		ServerSocket ss = null;
		
		Socket sc = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Scanner scanner = new Scanner(System.in);
		try {
			ss = new ServerSocket(8282); //포트번호는 중복되면 X
			
			System.out.println("Client 접속을 기다리는 중...");
			
			sc = ss.accept();
			System.out.println("Client와 연결 성공됨...");
			
			boolean check = true;
			while (check) {
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				String message = br.readLine();
				
				if (message.toUpperCase().equals("Q")) {
					check = false;
					continue;
				}

				System.out.println("Client: " + message);
				
				System.out.println("클라이언트에게 보낼 메시지: ");
				message = scanner.nextLine();

				//메세지를 클라이언트로 전송
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(message +"\r\n");
				bw.flush();
				
				if (message.equals("Q") || message.equals("q")) {
					break;
				}
				
				System.out.println("Client로 전송 성공..");
			}
			
			
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
