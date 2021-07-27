package com.iu.s1.string.ex1;

/*
 * WeatherView
 * 모든 지역의 날씨 정보를 출력하는 메서드 
 * 
 */

public class WeatherView {
	
	public void view() {
		WeatherInfo weatherInfo = new WeatherInfo();
		WeatherDTO[] weatherDTOs = weatherInfo.makeWeather();
		
		for (int i = 0; i < weatherDTOs.length; i++) {
			System.out.println(weatherDTOs[i].getCity());
			System.out.println(weatherDTOs[i].getTemperature());
			System.out.println(weatherDTOs[i].getHumidity());
			System.out.println(weatherDTOs[i].getCondition());
		}
		
		
	}
	
}
