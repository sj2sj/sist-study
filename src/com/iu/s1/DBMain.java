package com.iu.s1;

import com.iu.s1.location.LocationDAO;
import com.iu.s1.test.DBTest;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Start");
		
		DBTest dbTest = new DBTest();
		//dbTest.getOne();
		dbTest.getCount();
		
		LocationDAO dao = new LocationDAO();
		//dao.getList();
		//dao.getOne(1800);
		
		
		System.out.println("DB Finish");
	}

}
