package com.test.jsonparser;

public class AddressCode{
	private String streetCode;

	public void setStreetCode(String streetCode){
		this.streetCode = streetCode;
	}

	public String getStreetCode(){
		return streetCode;
	}

	@Override
 	public String toString(){
		return 
			"AddressCode{" + 
			"street_code = '" + streetCode + '\'' + 
			"}";
		}
}
