package com.iu.s1.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iu.s1.util.DBConnect;

public class EmployeeDAO {
	
	DBConnect dbConnect;
	
	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
		dbConnect = new DBConnect();
	}

	/* 전체 정보 출력 */
	public void getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("EMPLOYEE_ID")+"\t");
				System.out.print(rs.getString("FIRST_NAME")+"\t");
				System.out.print(rs.getString("LAST_NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
				System.out.println("------------------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
	}
	
	
	/* 
	 * 사원 번호 받아서 사원 한 명의 정보 출력 
	 */
	public void getOne(int employeeId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.print(rs.getInt("EMPLOYEE_ID")+"\t");
				System.out.print(rs.getString("FIRST_NAME")+"\t");
				System.out.print(rs.getString("LAST_NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
				System.out.println("------------------------------------------");
			} else {
				System.out.println("데이터가 없습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
	}
	
	
	/* 
	 * LAST_NAME에 name값이 포함 된 사원들 출력
	 * ex. 매개변수 name에 a를 넣으면 a가 포함된 사원들 모두 출력
	 */
	public void search(String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("EMPLOYEE_ID")+"\t");
				System.out.print(rs.getString("FIRST_NAME")+"\t");
				System.out.print(rs.getString("LAST_NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
				System.out.println("------------------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
	}
	
	
	/*
	 * 급여가 min 이상 max 이하인 사원 출력
	 */
	public void getSal(int min, int max) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES WHERE SALARY BETWEEN ? AND ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);
			
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("EMPLOYEE_ID")+"\t");
				System.out.print(rs.getString("FIRST_NAME")+"\t");
				System.out.print(rs.getString("LAST_NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
				System.out.println("------------------------------------------");
			} 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
	}
}

