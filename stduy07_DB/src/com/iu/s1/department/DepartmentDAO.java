package com.iu.s1.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.s1.employee.EmployeeDTO;
import com.iu.s1.util.DBConnect;

public class DepartmentDAO {
	
	DBConnect dbConnect = null;
	
	public DepartmentDAO() {
		 dbConnect = new DBConnect();
	}

	
	/*
	 * insert
	 */
	public int setInsert(DepartmentDTO departmentDTO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		try {
			con = dbConnect.getConnection();
			
			String sql = "INSERT INTO DEPARTMENTS VALUES (?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, departmentDTO.getDepartment_id());
			pstmt.setString(2, departmentDTO.getDepartment_name());
			pstmt.setInt(3, departmentDTO.getManager_id());
			pstmt.setInt(4, departmentDTO.getLocation_id());
			
			result = pstmt.executeUpdate(); //insert, update, delete
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(pstmt, con);
		}
		
		return result;
	}
	
	
	
	/*
	 * getJoin
	 */
	public Depart_EmpDTO getJoin(int department_id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Depart_EmpDTO departEmpDTO = new Depart_EmpDTO();
		
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT FIRST_NAME, SALARY, HIRE_DATE, DEPARTMENT_NAME "
					+ "FROM EMPLOYEES e "
					+ "JOIN DEPARTMENTS d "
					+ "USING (department_id) "
					+ "WHERE DEPARTMENT_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, department_id);
			
			rs = pstmt.executeQuery();
			
			ArrayList<EmployeeDTO> dtoArr = departEmpDTO.getAr();
			while (rs.next()) {
				EmployeeDTO employeeDTO = new EmployeeDTO();
				
				departEmpDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
				
				employeeDTO.setFirst_name(rs.getString("FIRST_NAME"));
				employeeDTO.setSalary(rs.getInt("SALARY"));
				employeeDTO.setHire_date(rs.getString("HIRE_DATE"));
				
				dtoArr.add(employeeDTO);
				
				departEmpDTO.setAr(dtoArr);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return departEmpDTO;
		
		
		
	}
	
}
