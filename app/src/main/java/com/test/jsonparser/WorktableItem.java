package com.test.jsonparser;

public class WorktableItem{
	private String sunday;
	private String saturday;
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	private String department;
	private String monday;
	private String timetable;

	public void setSunday(String sunday){
		this.sunday = sunday;
	}

	public String getSunday(){
		return sunday;
	}

	public void setSaturday(String saturday){
		this.saturday = saturday;
	}

	public String getSaturday(){
		return saturday;
	}

	public void setTuesday(String tuesday){
		this.tuesday = tuesday;
	}

	public String getTuesday(){
		return tuesday;
	}

	public void setWednesday(String wednesday){
		this.wednesday = wednesday;
	}

	public String getWednesday(){
		return wednesday;
	}

	public void setThursday(String thursday){
		this.thursday = thursday;
	}

	public String getThursday(){
		return thursday;
	}

	public void setFriday(String friday){
		this.friday = friday;
	}

	public String getFriday(){
		return friday;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public String getDepartment(){
		return department;
	}

	public void setMonday(String monday){
		this.monday = monday;
	}

	public String getMonday(){
		return monday;
	}

	public void setTimetable(String timetable){
		this.timetable = timetable;
	}

	public String getTimetable(){
		return timetable;
	}

	@Override
 	public String toString(){
		return 
			"WorktableItem{" + 
			"sunday = '" + sunday + '\'' + 
			",saturday = '" + saturday + '\'' + 
			",tuesday = '" + tuesday + '\'' + 
			",wednesday = '" + wednesday + '\'' + 
			",thursday = '" + thursday + '\'' + 
			",friday = '" + friday + '\'' + 
			",department = '" + department + '\'' + 
			",monday = '" + monday + '\'' + 
			",timetable = '" + timetable + '\'' + 
			"}";
		}
}
