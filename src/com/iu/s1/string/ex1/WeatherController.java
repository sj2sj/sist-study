package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {

	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo(); //굳이 생성자에 생성 안해도 되고 start 메서드 안에서 만들어도 됨.
		weatherView = new WeatherView();
	}

	public void start() {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true; //while문 제어 flag 
		
		weatherInfo.makeWeather();
		while (flag) {
			
			System.out.println("1. 날씨 정보 전체 출력 ");
			System.out.println("2. 지역 검색 정보 출력");
			System.out.println("3. 지역 정보 추가");
			System.out.println("4. 종료");
			
			System.out.println("번호를 입력하세요: ");
			int select = sc.nextInt(); //입력받은 번호
			
			switch(select) {
				case 1: //----------------------------------------1. 날씨 정보를 전체 출력
					System.out.println("1. 날씨 정보 전체 출력 클릭함");
					weatherView.view();
					break;
				case 2: //----------------------------------------2. 지역 검색 정보 출력
					System.out.println("2. 지역 검색 정보 출력 클릭함 ");
					break;
				case 3: //----------------------------------------3. 지역 정보 추가
					System.out.println("3. 지역 정보 추가 클릭함 ");
					break;
				default:
					flag = false;
					break;
			}
		}
		
		System.out.println("Finish");
	}
	
}
