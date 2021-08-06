package com.iu.s1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

	public Connection getConnection() throws SQLException {
		/*
		 * 1. DB 서버 접속
		 * 2. 로그인
		 * 3. SQL 작성
		 * 4. 결과
		 */

		
		String id = "USER01";
		String pw = "";
		
		//jdbc:oracle:thin:@ip:port:sid
		//express edition: xe
		//정식 버전: orcl
		
		String url = "";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
//		//2. 드라이버 로딩 작업
//		Class.forName(driver);
//		System.out.println("driver 로딩성공");
//	
		
		//3. 접속
		Connection con = DriverManager.getConnection(url, id, pw);
		System.out.println("접속 성공!");
		System.out.println(con);
		
		return con;
		
	}
	
	public void disConnect(ResultSet rs, PreparedStatement pstmt, Connection con) {
		
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
