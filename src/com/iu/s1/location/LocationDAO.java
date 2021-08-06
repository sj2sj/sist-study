package com.iu.s1.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.s1.util.DBConnect;

//DB와 직접적으로 연결되는 것들 DAO
public class LocationDAO {

	DBConnect dbConnect;
	
	public LocationDAO() {
		dbConnect = new DBConnect();
	}
	
	public void getOne(int location_id) {

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, location_id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getString("CITY"));
			} else {
				System.out.println("데이터가 없습니다!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
	}
	
	
	public void getList() {

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {

			con = dbConnect.getConnection();
			System.out.println("연결 ok");

			//LOCATIONS TABLE을 조회해서 출력
			String sql = "SELECT * FROM LOCATIONS";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("LOCATION_ID") + "\t");
				System.out.print(rs.getString("STREET_ADDRESS") + "\t");
				System.out.print(rs.getString("POSTAL_CODE") + "\t");
				System.out.print(rs.getString("CITY") + "\t");
				System.out.print(rs.getString("STATE_PROVINCE") + "\t");
				System.out.println(rs.getString("COUNTRY_ID") + "\t");
				System.out.println("------------------------------------------------------------------------------");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}

	}
}
