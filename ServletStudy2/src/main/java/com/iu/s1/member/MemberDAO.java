package com.iu.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.iu.s1.util.DBConnector;

public class MemberDAO {

	DBConnector dbConnector = null;
	
	public MemberDAO() {
		dbConnector = new DBConnector();
	}
	
	
	/*
	 * join()
	 * 회원가입 메서드
	 */
	public int memberJoin(MemberDTO memberDTO) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int result = 0; //결과값
		

		con = dbConnector.getConnect();
		String sql = "INSERT INTO MEMBER (ID, PW, NAME, PHONE, EMAIL) "
				+ "VALUES (?, ?, ?, ?, ?)";
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, memberDTO.getId());
		pstmt.setString(2, memberDTO.getPw());
		pstmt.setString(3, memberDTO.getName());
		pstmt.setString(4, memberDTO.getPhone());
		pstmt.setString(5, memberDTO.getEmail());
		
		result = pstmt.executeUpdate();
		


		dbConnector.disConnect(con, pstmt);

		
		
		return result;
	}
	
}
