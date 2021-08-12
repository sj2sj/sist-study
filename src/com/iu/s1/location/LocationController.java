package com.iu.s1.location;

import java.util.ArrayList;
import java.util.Scanner;

public class LocationController {

	private LocationDAO locationDAO;
	private LocationView locationView;
	private LocationInput locationInput;
	
	private Scanner sc;
	
	public LocationController() {
		locationDAO = new LocationDAO();
		locationView = new LocationView();
		locationInput = new LocationInput();
		sc = new Scanner(System.in);
	}
	
	
	public void start() {

		boolean check = true;
		
		while (check) {
			System.out.println("1. 전체 정보 출력 ");
			System.out.println("2. 하나의 정보 출력 ");
			System.out.println("3. 지역 정보 추가 ");
			//삭제 시 오류 발생하기 때문에 내가 추가한 정보를 삭제하자
			System.out.println("4. 지역 정보 삭제 ");
			System.out.println("5. exit ");
			System.out.println("번호를 입력하세요: ");
			
			int select = sc.nextInt();
			
			if (select == 1) {
				ArrayList<LocationDTO> ar = locationDAO.getList();
				
				if (ar.size() > 0) {
					locationView.view(ar);
				} else {
					System.out.println("데이터가 없어용..");
				}
				
			} else if (select == 2) {
				LocationDTO locationDTO = new LocationDTO();

				locationDTO = locationInput.inputId(sc);
				locationDTO = locationDAO.getOne(locationDTO);
				
				if (locationDTO != null) {
					locationView.view(locationDTO);
				} else {
					System.out.println("해당하는 location 정보가 없습니다...");
				}
				
			} else if (select == 3) {
				LocationDTO locationDTO = new LocationDTO();
				
				locationDTO = locationInput.inputLocation(sc);
				int result = locationDAO.setLocation(locationDTO);
				
				if (result > 0) {
					System.out.println("insert 성공! " + result);
				} else {
					System.out.println("insert 실패 ㅠㅠ ");
				}
				
			} else if (select == 4) {
				LocationDTO locationDTO = new LocationDTO();
				
				locationDTO = locationInput.inputId(sc);
				
				int result = locationDAO.delLocation(locationDTO);
				

				if (result > 0) {
					System.out.println("삭제 되었습니다.");
				} else {
					System.out.println("삭제 실패 했습니다..ㅠㅠ");
				}
			} else {
				check = false;
				break;
			}
		}
		
	}
}
