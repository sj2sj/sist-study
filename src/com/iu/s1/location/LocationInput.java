package com.iu.s1.location;

import java.util.Scanner;

public class LocationInput {

	/*
	 * inputId
	 * locationID 받아서 DTO 보내주는 메서드
	 */
	public LocationDTO inputId(Scanner sc) {
		LocationDTO locationDTO = new LocationDTO();
		System.out.println("Location ID를 입력하세요: ");
		
		int location_id = sc.nextInt();
		locationDTO.setLocation_id(location_id);
		
		
		return locationDTO;
	}
	
	/*
	 * inputLocation
	 * location 정보 받아와서 DTO 보내주는 메서드
	 */
	public LocationDTO inputLocation(Scanner sc) {
		LocationDTO locationDTO = new LocationDTO();
		
		System.out.println("Location id: ");
		locationDTO.setLocation_id(sc.nextInt());
		
		System.out.println("Street address: ");
		locationDTO.setStreet_address(sc.next());
		
		System.out.println("Postal code: ");
		locationDTO.setPostal_code(sc.next());
		
		System.out.println("city: ");
		locationDTO.setCity(sc.next());
		
		System.out.println("state province: ");
		locationDTO.setState_province(sc.next());
		
		System.out.println("country id: ");
		locationDTO.setCountry_id(sc.next());
		
		return locationDTO;
	}
	

	
}
