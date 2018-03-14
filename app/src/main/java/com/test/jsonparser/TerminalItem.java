package com.test.jsonparser;

public class TerminalItem{
	private AddressCode addressCode;
	private boolean isOffice;
	private CalcSchedule calcSchedule;
	private String address;
	private Maps maps;
	private String latitude;
	private int maxWeight;
	private int maxVolume;
	private Worktables worktables;
	private boolean jsonMemberDefault;
	private boolean giveoutCargo;
	private double maxHeight;
	private boolean isPVZ;
	private boolean receiveCargo;
	private String name;
	private String fullAddress;
	private String id;
	private int maxLength;
	private String longitude;
	private double maxWidth;

	public void setAddressCode(AddressCode addressCode){
		this.addressCode = addressCode;
	}

	public AddressCode getAddressCode(){
		return addressCode;
	}

	public void setIsOffice(boolean isOffice){
		this.isOffice = isOffice;
	}

	public boolean isIsOffice(){
		return isOffice;
	}

	public void setCalcSchedule(CalcSchedule calcSchedule){
		this.calcSchedule = calcSchedule;
	}

	public CalcSchedule getCalcSchedule(){
		return calcSchedule;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setMaps(Maps maps){
		this.maps = maps;
	}

	public Maps getMaps(){
		return maps;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setMaxWeight(int maxWeight){
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight(){
		return maxWeight;
	}

	public void setMaxVolume(int maxVolume){
		this.maxVolume = maxVolume;
	}

	public int getMaxVolume(){
		return maxVolume;
	}

	public void setWorktables(Worktables worktables){
		this.worktables = worktables;
	}

	public Worktables getWorktables(){
		return worktables;
	}

	public void setJsonMemberDefault(boolean jsonMemberDefault){
		this.jsonMemberDefault = jsonMemberDefault;
	}

	public boolean isJsonMemberDefault(){
		return jsonMemberDefault;
	}

	public void setGiveoutCargo(boolean giveoutCargo){
		this.giveoutCargo = giveoutCargo;
	}

	public boolean isGiveoutCargo(){
		return giveoutCargo;
	}

	public void setMaxHeight(double maxHeight){
		this.maxHeight = maxHeight;
	}

	public double getMaxHeight(){
		return maxHeight;
	}

	public void setIsPVZ(boolean isPVZ){
		this.isPVZ = isPVZ;
	}

	public boolean isIsPVZ(){
		return isPVZ;
	}

	public void setReceiveCargo(boolean receiveCargo){
		this.receiveCargo = receiveCargo;
	}

	public boolean isReceiveCargo(){
		return receiveCargo;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setFullAddress(String fullAddress){
		this.fullAddress = fullAddress;
	}

	public String getFullAddress(){
		return fullAddress;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setMaxLength(int maxLength){
		this.maxLength = maxLength;
	}

	public int getMaxLength(){
		return maxLength;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	public void setMaxWidth(double maxWidth){
		this.maxWidth = maxWidth;
	}

	public double getMaxWidth(){
		return maxWidth;
	}

	@Override
 	public String toString(){
		return 
			"TerminalItem{" + 
			"addressCode = '" + addressCode + '\'' + 
			",isOffice = '" + isOffice + '\'' + 
			",calcSchedule = '" + calcSchedule + '\'' + 
			",address = '" + address + '\'' + 
			",maps = '" + maps + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",maxWeight = '" + maxWeight + '\'' + 
			",maxVolume = '" + maxVolume + '\'' + 
			",worktables = '" + worktables + '\'' + 
			",default = '" + jsonMemberDefault + '\'' + 
			",giveoutCargo = '" + giveoutCargo + '\'' + 
			",maxHeight = '" + maxHeight + '\'' + 
			",isPVZ = '" + isPVZ + '\'' + 
			",receiveCargo = '" + receiveCargo + '\'' + 
			",name = '" + name + '\'' + 
			",fullAddress = '" + fullAddress + '\'' + 
			",id = '" + id + '\'' + 
			",maxLength = '" + maxLength + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",maxWidth = '" + maxWidth + '\'' + 
			"}";
		}
}
