package com.test.jsonparser;

import java.util.List;

public class Response{
	private List<CityItem> city;

	public void setCity(List<CityItem> city){
		this.city = city;
	}

	public List<CityItem> getCity(){
		return city;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"city = '" + city + '\'' + 
			"}";
		}
}