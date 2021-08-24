package com.iu.s1.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.s1.util.DBConnector;

public class BankBookDAO {

	DBConnector dbConnector;

	public BankBookDAO() {
		dbConnector = new DBConnector();
	}

	
	/*
	 * getList
	 */
	public ArrayList<BankBookDTO> getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BankBookDTO> bankBookDTOs = new ArrayList<>();
		
		
		try {
			con = dbConnector.getConnect();
			String sql = "SELECT * FROM BANKBOOK";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BankBookDTO dto = new BankBookDTO();
				dto.setBookNumber(rs.getLong("BOOK_NUMBER"));
				dto.setBookName(rs.getString("BOOK_NAME"));
				dto.setBookRete(rs.getDouble("BOOK_RATE"));
				dto.setBookSale(rs.getInt("BOOK_SALE"));
				bankBookDTOs.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnector.disConnect(con, pstmt, rs);
		}
		return bankBookDTOs;
	}
	
	
	
	/*
	 * getSelect
	 * book_number에 해당하는 bankbook정보
	 */
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BankBookDTO resultDTO = null;
		
		try {
			con = dbConnector.getConnect();
			String sql = "SELECT * FROM BANKBOOK WHERE BOOK_NUMBER = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, bankBookDTO.getBookNumber());
			
			rs = pstmt.executeQuery();
			
			
			if (rs.next()) {
				resultDTO = new BankBookDTO();
				resultDTO.setBookNumber(rs.getLong("BOOK_NUMBER"));
				resultDTO.setBookName(rs.getString("BOOK_NAME"));
				resultDTO.setBookRete(rs.getDouble("BOOK_RATE"));
				resultDTO.setBookSale(rs.getInt("BOOK_SALE"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnector.disConnect(con, pstmt, rs);
		}
		return resultDTO;
	}
	
}
