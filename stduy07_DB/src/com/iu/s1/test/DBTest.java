package com.iu.s1.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.s1.util.DBConnect;

public class DBTest {
	private DBConnect dbConnect;
	
	public DBTest() {
		dbConnect = new DBConnect();
	}
	
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수])
	
	public void connetTest() {
		System.out.println("-----------connect Test Start-----------");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			//4. sql문 생성
			String sql = "SELECT * FROM DEPARTMENTS"; //자바에서는 sql문 끝에 ; 금지 (jdbc에서 알아서 붙임)
			
			//5. SQL문 미리 보내기
			pstmt =  con.prepareStatement(sql);
			
			//6. 최종 전송 후 결과 처리
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("DEPARTMENT_ID") + "\t");
				System.out.print(rs.getString("DEPARTMENT_NAME") + "\t");
				System.out.println(rs.getInt("MANAGER_ID") + "\t");
				System.out.println("--------------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		
		
		System.out.println("-----------connect Test Finish-----------");
	}
	
	
	public void getOne() {

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			int dId = 123;
			//?로 쓰는 이유 : SQL Injection 때문에 값을 직접적으로 넣지 않음 
			String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
			
			pstmt = con.prepareStatement(sql);
			
			//?값 설정 
			pstmt.setInt(1, dId);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getString("DEPARTMENT_NAME"));
			} else {
				System.out.println("데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
	}
	
	
	public void getCount() {
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT COUNT(DEPARTMENT_ID) FROM DEPARTMENTS";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getInt(1));
			} else {
				System.out.println("결과 X");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		
		
	}
	
	
	
}
