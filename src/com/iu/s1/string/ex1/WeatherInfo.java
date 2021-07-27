package com.iu.s1.string.ex1;

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
	
	
	public WeatherDTO[] makeWeather() {
		info = sb.toString();
		String[] array = info.split(",");
		
		WeatherDTO[] dto = new WeatherDTO[array.length/4];
		
		int count = 0;
		for (int i = 0; i < dto.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			
			weatherDTO.setCity(array[count].trim());
			weatherDTO.setTemperature(array[++count].trim());
			weatherDTO.setHumidity(array[++count].trim());
			weatherDTO.setCondition(array[++count].trim()); 
			
			dto[i] = weatherDTO;

		}
		return dto;
	}
	
}
