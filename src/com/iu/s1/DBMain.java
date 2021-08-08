package com.iu.s1;

import com.iu.s1.employee.EmployeeDAO;
import com.iu.s1.location.LocationDAO;
import com.iu.s1.test.DBTest;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Start");
		
		DBTest dbTest = new DBTest();
		//dbTest.getOne();
		//dbTest.getCount();
		
		LocationDAO dao = new LocationDAO();
		//dao.getList();
		//dao.getOne(1800);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
//		employeeDAO.getList();
//		employeeDAO.getOne(100);
//		employeeDAO.getSal(10000, 20000);
		employeeDAO.search("a");
		
		System.out.println("DB Finish");
	}

}
