package com.test.jsonparser;

public class CalcSchedule{
	private String arrival;
	private String derival;

	public void setArrival(String arrival){
		this.arrival = arrival;
	}

	public String getArrival(){
		return arrival;
	}

	public void setDerival(String derival){
		this.derival = derival;
	}

	public String getDerival(){
		return derival;
	}

	@Override
 	public String toString(){
		return 
			"CalcSchedule{" + 
			"arrival = '" + arrival + '\'' + 
			",derival = '" + derival + '\'' + 
			"}";
		}
}
