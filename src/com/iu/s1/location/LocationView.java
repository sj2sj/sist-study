package com.iu.s1.location;

import java.util.ArrayList;

public class LocationView {

	//하나만 출력 
	public void view(LocationDTO locationDTO) {
		System.out.print(locationDTO.getLocation_id() + "\t");
		System.out.print(locationDTO.getStreet_address() + "\t");
		System.out.print(locationDTO.getPostal_code() + "\t");
		System.out.print(locationDTO.getCity() + "\t");
		System.out.print(locationDTO.getState_province() + "\t");
		System.out.println(locationDTO.getCountry_id());
		System.out.println("------------------------------------------------------------------");
	}
	
	
	//여러개 출력
	public void view(ArrayList<LocationDTO> locationDTOs) {
		
		final int SIZE = locationDTOs.size();
		for (int i = 0; i < SIZE; i++) {
			this.view(locationDTOs.get(i));
		}
	}
	
	
	
	public void view(int count) {
		System.out.println("count: " + count);
	}
	
}
