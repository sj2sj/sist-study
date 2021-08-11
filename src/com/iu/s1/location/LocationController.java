package com.iu.s1.location;

import java.util.ArrayList;

public class LocationController {

	private LocationDAO locationDAO;
	private LocationView locationView;
	
	public LocationController() {
		locationDAO = new LocationDAO();
		locationView = new LocationView();
	}
	
	
	public void start() {
		
		//DB에서 Location table의 모든 정보 조회
		//locationDAO.getList();
		
//		LocationDTO locationDTO = locationDAO.getOne(1000);
//		locationView.view(locationDTO);
		
	
//		ArrayList<LocationDTO> locationDTOs = locationDAO.getList();
//		locationView.view(locationDTOs);
		
//		ArrayList<LocationDTO> locationDTOs = locationDAO.getSearch("vi");
//		locationView.view(locationDTOs);
		
//		int count = locationDAO.getCount();
//		locationView.view(count);
		
		LocationDTO locationDTO = locationDAO.getLocation(100);
		locationView.view(locationDTO);
		
		
		
	}
}
