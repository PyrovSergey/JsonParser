package com.test.jsonparser;

public class Maps{
	private Width width;

	public void setWidth(Width width){
		this.width = width;
	}

	public Width getWidth(){
		return width;
	}

	@Override
 	public String toString(){
		return 
			"Maps{" + 
			"width = '" + width + '\'' + 
			"}";
		}
}
