package com.iu.s1.string.ex1;

/*
 * WeatherView
 * 모든 지역의 날씨 정보를 출력하는 메서드 
 * 
 */

public class WeatherView {
	
	/*
	 * 메세지 출력  
	 */
	public void view(String message) {
		System.out.println(message);
	}
	
	/*
	 * 날씨정보 하나를 출력함
	 */
	public void view (WeatherDTO weather) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("==================================");
		System.out.print(weather.getCity() + " \t");
		System.out.print(weather.getTemperature() + " \t");
		System.out.print(weather.getHumidity() + " \t");
		System.out.println(weather.getCondition() + " \t");
		System.out.println("==================================");
	}
	
	/*
	 * 날씨정보를 모두 출력함 
	 */
	public void view (WeatherDTO[] weathers) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("==================================");
		for (int i = 0; i < weathers.length; i++) {
			System.out.print(weathers[i].getCity() + " \t");
			System.out.print(weathers[i].getTemperature() + " \t");
			System.out.print(weathers[i].getHumidity() + " \t");
			System.out.println(weathers[i].getCondition() + " \t");
		}
		System.out.println("==================================");
		
	}
	
}
