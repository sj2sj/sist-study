package com.iu.s1.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.iu.s1.util.DBConnect;

public class EmployeeDAO {
	
	DBConnect dbConnect;
	
	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
		dbConnect = new DBConnect();
	}

	
	
	
	
	/* 
	 * getList
	 * 전체 정보 출력 */
	public ArrayList<EmployeeDTO> getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeDTO> employeeDTOs = new ArrayList<>();
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			
			while (rs.next()) {
				EmployeeDTO employeeDTO = new EmployeeDTO();
				
				employeeDTO.setEmployee_id(rs.getInt("employee_id"));
				employeeDTO.setFirst_name(rs.getString("first_name"));
				employeeDTO.setLast_name(rs.getString("last_name"));
				employeeDTO.setEmail(rs.getString("email"));
				employeeDTO.setPhone_number(rs.getString("phone_number"));
				employeeDTO.setHire_date(rs.getString("hire_date"));
				employeeDTO.setJob_id(rs.getString("job_id"));
				employeeDTO.setSalary(rs.getInt("salary"));
				employeeDTO.setCommission_pct(rs.getFloat("commission_pct"));
				employeeDTO.setManager_id(rs.getInt("manager_id"));
				employeeDTO.setDepartment_id(rs.getInt("department_id"));
				
				employeeDTOs.add(employeeDTO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return employeeDTOs;
	}
	
	
	/*
	 * getSaerch
	 * type: first_name / last_name
	 * name: 검색할 이름
	 */
	public ArrayList<EmployeeDTO> getSearch(String type, String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<EmployeeDTO> employeeDTOs = new ArrayList<>();
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES e WHERE UPPER("+type+") LIKE UPPER(?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmployeeDTO employeeDTO = new EmployeeDTO();
				
				employeeDTO.setEmployee_id(rs.getInt("employee_id"));
				employeeDTO.setFirst_name(rs.getString("first_name"));
				employeeDTO.setLast_name(rs.getString("last_name"));
				employeeDTO.setEmail(rs.getString("email"));
				employeeDTO.setPhone_number(rs.getString("phone_number"));
				employeeDTO.setHire_date(rs.getString("hire_date"));
				employeeDTO.setJob_id(rs.getString("job_id"));
				employeeDTO.setSalary(rs.getInt("salary"));
				employeeDTO.setCommission_pct(rs.getFloat("commission_pct"));
				employeeDTO.setManager_id(rs.getInt("manager_id"));
				employeeDTO.setDepartment_id(rs.getInt("department_id"));
				
				employeeDTOs.add(employeeDTO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return employeeDTOs;
	}
	
	
	
	/* 
	 * 
	 * getOne
	 * 사원 번호 받아서 사원 한 명의 정보 출력 
	 */
	public EmployeeDTO getOne(int employeeId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				employeeDTO.setEmployee_id(rs.getInt("employee_id"));
				employeeDTO.setFirst_name(rs.getString("first_name"));
				employeeDTO.setLast_name(rs.getString("last_name"));
				employeeDTO.setEmail(rs.getString("email"));
				employeeDTO.setPhone_number(rs.getString("phone_number"));
				employeeDTO.setHire_date(rs.getString("hire_date"));
				employeeDTO.setJob_id(rs.getString("job_id"));
				employeeDTO.setSalary(rs.getInt("salary"));
				employeeDTO.setCommission_pct(rs.getFloat("commission_pct"));
				employeeDTO.setManager_id(rs.getInt("manager_id"));
				employeeDTO.setDepartment_id(rs.getInt("department_id"));
			} else {
				System.out.println("데이터가 없습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return employeeDTO;
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
	
	
	/*
	 * getAvgSal
	 * 평균 급여 구하기
	 */
	public double getAvgSal() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		double avgSalary = 0;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT AVG(SALARY) AS AVG FROM EMPLOYEES";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			avgSalary = rs.getDouble("AVG");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
			
		}
		return avgSalary;
	}
	
	/*
	 * getDepartmentAvgSal
	 * 부서별 평균 급여 출력
	 */
	public HashMap<Integer, Double> getDepartmentAvgSal() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		HashMap<Integer, Double> departmentSal = new HashMap<Integer, Double>();

		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT DEPARTMENT_ID, AVG(SALARY) AS AVG FROM EMPLOYEES GROUP BY DEPARTMENT_ID";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				departmentSal.put(rs.getInt("DEPARTMENT_ID"), rs.getDouble("AVG"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return departmentSal;
	}
	
}

