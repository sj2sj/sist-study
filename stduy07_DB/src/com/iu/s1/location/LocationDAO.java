package com.iu.s1.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.s1.util.DBConnect;

//DB와 직접적으로 연결되는 것들 DAO
public class LocationDAO {
	
	

	DBConnect dbConnect;
	
	public LocationDAO() {
		dbConnect = new DBConnect();
	}
	
	/*
	 * delLocation
	 * location 삭제하는 메서드
	 */
	public int delLocation(LocationDTO locationDTO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "DELETE LOCATIONS WHERE LOCATION_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, locationDTO.getLocation_id());

			
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(pstmt, con);
		}
		
		return result;
	}
	
	/* 
	 * setLocation
	 * location 정보 추가하는 메서드
	 * */
	public int setLocation(LocationDTO locationDTO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		try {
			con = dbConnect.getConnection();
			
			String sql = "INSERT INTO LOCATIONS VALUES(?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, locationDTO.getLocation_id());
			pstmt.setString(2, locationDTO.getStreet_address());
			pstmt.setString(3, locationDTO.getPostal_code());
			pstmt.setString(4, locationDTO.getCity());
			pstmt.setString(5, locationDTO.getState_province());
			pstmt.setString(6, locationDTO.getCountry_id());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(pstmt, con);
		}
		return result;
	}
	
	
	/*
	 * getLocation
	 * employee_id를 받아서 해당하는 사원의 location정보 출력
	 */
	public LocationDTO getLocation(int employee_id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		LocationDTO locationDTO = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = "
					+ "(SELECT LOCATION_ID FROM DEPARTMENTS WHERE DEPARTMENT_ID = "
					+ "(SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = ?))";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employee_id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				locationDTO = new LocationDTO();
				
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		return locationDTO;
	}
	
	
	public LocationDTO getOne (LocationDTO locationDTO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		LocationDTO result = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, locationDTO.getLocation_id());
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				result = new LocationDTO();
				result.setLocation_id(rs.getInt("location_id"));
				result.setStreet_address(rs.getString("street_address"));
				result.setPostal_code(rs.getString("postal_code"));
				result.setCity(rs.getString("city"));
				result.setState_province(rs.getString("state_province"));
				result.setCountry_id(rs.getString("country_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return result;
	}
	 
	
	/* 
	 * getOne
	 * location_id를 매개변수로 받아 결과를 리턴
	 * */
	/*
	public LocationDTO getOne(int location_id) {

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		LocationDTO locationDTO = null;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, location_id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				//들고온 값이 있을 때 DTO 객체 생성
				locationDTO = new LocationDTO();
				
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
				
			} else {
				System.out.println("데이터가 없습니다!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return locationDTO;
	}
	*/
	
	/*
	 * getCount
	 * location의 주소 갯수를 return하고 출력.
	 */
	public int getCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT COUNT(*) AS COUNT FROM LOCATIONS";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();

			rs.next();
			count = rs.getInt("count");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		return count;
	}
	
	
	
	
	/*
	 * getSearch
	 * 입력받은 매개변수가 "주소" 포함된 STREET_ADDRESS 출력
	 * 대소문자 신경쓰지 않고!
	 */
	public ArrayList<LocationDTO> getSearch(String street_address) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<LocationDTO> locationDTOs = new ArrayList<LocationDTO>();
	
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM LOCATIONS WHERE UPPER(STREET_ADDRESS) LIKE UPPER(?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+street_address+"%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				LocationDTO locationDTO = new LocationDTO();

				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
				
				locationDTOs.add(locationDTO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		
		return locationDTOs;
	}
	
	
	/*
	 * getList
	 */
	public ArrayList<LocationDTO> getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<LocationDTO> locationDTOs = new ArrayList<>();
		
		try {
			con = dbConnect.getConnection();
			
			String sql = "SELECT * FROM LOCATIONS ORDER BY LOCATION_ID asc";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				LocationDTO locationDTO = new LocationDTO();
				
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
				
				locationDTOs.add(locationDTO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}
		return locationDTOs;
	}
	
	
	/*
	 * getList
	 * Locations 테이블의 값 모두 출력한다.
	 */
	/*
	public ArrayList<LocationDTO> getList() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<LocationDTO> locationDTOs = new ArrayList<LocationDTO>();
		
		try {

			con = dbConnect.getConnection();
			System.out.println("연결 ok");

			//LOCATIONS TABLE을 조회해서 출력
			String sql = "SELECT * FROM LOCATIONS";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				LocationDTO locationDTO = new LocationDTO();

				
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
				
				locationDTOs.add(locationDTO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, pstmt, con);
		}

		return locationDTOs;
	}
	 */
}
