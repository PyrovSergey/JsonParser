package com.test.jsonparser;

public class CityItem{
	private String day2daySFRequest;
	private String freeStorageDays;
	private String code;
	private String latitude;
	private String requestEndTime;
	private int cityID;
	private String preorderRequest;
	private Terminals terminals;
	private String url;
	private String sfrequestEndTime;
	private String timeshift;
	private String day2dayRequest;
	private String name;
	private String id;
	private String longitude;

	public void setDay2daySFRequest(String day2daySFRequest){
		this.day2daySFRequest = day2daySFRequest;
	}

	public String getDay2daySFRequest(){
		return day2daySFRequest;
	}

	public void setFreeStorageDays(String freeStorageDays){
		this.freeStorageDays = freeStorageDays;
	}

	public String getFreeStorageDays(){
		return freeStorageDays;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setRequestEndTime(String requestEndTime){
		this.requestEndTime = requestEndTime;
	}

	public String getRequestEndTime(){
		return requestEndTime;
	}

	public void setCityID(int cityID){
		this.cityID = cityID;
	}

	public int getCityID(){
		return cityID;
	}

	public void setPreorderRequest(String preorderRequest){
		this.preorderRequest = preorderRequest;
	}

	public String getPreorderRequest(){
		return preorderRequest;
	}

	public void setTerminals(Terminals terminals){
		this.terminals = terminals;
	}

	public Terminals getTerminals(){
		return terminals;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setSfrequestEndTime(String sfrequestEndTime){
		this.sfrequestEndTime = sfrequestEndTime;
	}

	public String getSfrequestEndTime(){
		return sfrequestEndTime;
	}

	public void setTimeshift(String timeshift){
		this.timeshift = timeshift;
	}

	public String getTimeshift(){
		return timeshift;
	}

	public void setDay2dayRequest(String day2dayRequest){
		this.day2dayRequest = day2dayRequest;
	}

	public String getDay2dayRequest(){
		return day2dayRequest;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"CityItem{" + 
			"day2daySFRequest = '" + day2daySFRequest + '\'' + 
			",freeStorageDays = '" + freeStorageDays + '\'' + 
			",code = '" + code + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",requestEndTime = '" + requestEndTime + '\'' + 
			",cityID = '" + cityID + '\'' + 
			",preorderRequest = '" + preorderRequest + '\'' + 
			",terminals = '" + terminals + '\'' + 
			",url = '" + url + '\'' + 
			",sfrequestEndTime = '" + sfrequestEndTime + '\'' + 
			",timeshift = '" + timeshift + '\'' + 
			",day2dayRequest = '" + day2dayRequest + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}
