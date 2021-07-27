package com.iu.s1.string.ex1;

public class WeatherDTO {

	private String city;		//지역 
	private String temperature; 	//기온
	private String humidity;		//습도
	private String condition;	//날씨 상태 (ex.흐림, 맑음, 비...)
	

	/* setter & getter */
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	
	
	
	
}
