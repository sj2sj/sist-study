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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lunch = new ArrayList<>();
		lunch.add("김치찌개");
		lunch.add("오므라이스");
		lunch.add("샌드위치");
		lunch.add("치즈라면");
		lunch.add("먹다남은 치킨");
		lunch.add("비빔밥");
		
		ArrayList<String> dinner = new ArrayList<>();
		dinner.add("된장찌개");
		dinner.add("샐러드");
		
		/*
		 * 1. 클라이언트 접속 준비
		 * 2. 클라이언트와 접속 성공 
		 * 3. 클라이언트로부터 메시지 받음 (1, 2, 3 )
		 * 		1- 점심메뉴 중 하나를 랜덤으로 전송 
		 * 		2- 저녁메뉴 중 하나를 랜덤으로 전송 
		 * 		3- 종료
		 */
		
		ServerSocket ss = null;
		
		Socket sc = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		
		try {
			System.out.println("client 접속 기다리는중...");
			ss = new ServerSocket(8282);
			
			sc = ss.accept();
			System.out.println("Client와 연결 성공!");
			
			
			boolean check = true;

			while (check) {
				/* 클라이언트로 메시지 전달 */
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
//				bw.write("===========");
//				bw.write("1.점심 메뉴");
//				bw.write("2.저녁 메뉴");
//				bw.flush();
				
				
				/* 클라이언트로부터 메시지 받음 */
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				String message = br.readLine();
				System.out.println(message);
				
				/* 받은걸로 메뉴 랜덤돌려서 다시 보내주기 */
				int select = Integer.parseInt(message);
				
				
				Calendar calendar = Calendar.getInstance();
				
				Random random = new Random(calendar.getTimeInMillis()); //랜덤 시드를 계속 바꾸기 위하여
				if (select == 1) { //점심메뉴 
					int r = random.nextInt(lunch.size());
					message = lunch.get(r);
					
				} else if (select == 2) { //저녁메뉴
					int r = random.nextInt(dinner.size());
					message = dinner.get(r);
					
				} else { //종료
					break;
				}
				
				
				bw.write(message+"\r\n");
				bw.flush();
				
				
			}
			
			
			
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
				ss.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
