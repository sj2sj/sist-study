package com.iu.s1.string.ex1;

import java.util.Scanner;

/* 기상청 데이터를 받아와서 준비하는 과정 */
public class WeatherInfo {
	
	private String info;
	
	private StringBuffer sb;
	
	//default 생성자 생성 
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비"); 
	}
	
	
	/*
	 * searchWeather
	 * 도시명을 입력받아서 전체정보에서 일치하는 도시를 찾아서 DTO 리턴
	 * return: WeatherDTO
	 */
	public WeatherDTO searchWeather(WeatherDTO[] weathers) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도시명을 입력하세요: ");
		String cityName = sc.next();
		
		WeatherDTO dto = null;
		
		for (int i = 0; i < weathers.length; i++) {
			if (weathers[i].getCity().equals(cityName)) {
				dto = weathers[i];
				break;
			}
		}
		
		return dto;

	}
	
	
	
	/*
	 * makeWeather()
	 * 날씨 정보 생성
	 * return: WeatherDTO[]
	 * */
	public WeatherDTO[] makeWeather() {
		info = sb.toString();
		String[] array = info.split(",");
		
		WeatherDTO[] weathers = new WeatherDTO[array.length/4];
		
		int count = 0;
		for (int i = 0; i < weathers.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			
			weatherDTO.setCity(array[count].trim());
			weatherDTO.setTemperature(array[++count].trim());
			weatherDTO.setHumidity(array[++count].trim());
			weatherDTO.setCondition(array[++count].trim()); 
			
			weathers[i] = weatherDTO;

		}
		return weathers;
	}
	
}
