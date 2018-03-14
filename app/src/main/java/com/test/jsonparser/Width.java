package com.test.jsonparser;

public class Width{
	private JsonMember640 jsonMember640;
	private JsonMember960 jsonMember960;
	private JsonMember944 jsonMember944;

	public void setJsonMember640(JsonMember640 jsonMember640){
		this.jsonMember640 = jsonMember640;
	}

	public JsonMember640 getJsonMember640(){
		return jsonMember640;
	}

	public void setJsonMember960(JsonMember960 jsonMember960){
		this.jsonMember960 = jsonMember960;
	}

	public JsonMember960 getJsonMember960(){
		return jsonMember960;
	}

	public void setJsonMember944(JsonMember944 jsonMember944){
		this.jsonMember944 = jsonMember944;
	}

	public JsonMember944 getJsonMember944(){
		return jsonMember944;
	}

	@Override
 	public String toString(){
		return 
			"Width{" + 
			"640 = '" + jsonMember640 + '\'' + 
			",960 = '" + jsonMember960 + '\'' + 
			",944 = '" + jsonMember944 + '\'' + 
			"}";
		}
}
