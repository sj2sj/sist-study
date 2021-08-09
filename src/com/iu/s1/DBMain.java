package com.iu.s1;

import com.iu.s1.location.LocationController;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Start");
		
		LocationController lc = new LocationController();
		lc.start();

		System.out.println("DB Finish");
	}

}
