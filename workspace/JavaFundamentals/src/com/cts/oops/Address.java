package com.cts.oops;

public class Address {
	
	int houseNumber;
	String locality;
	String city;
	
	
	
	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + "]";
	}
	
	
	
	
	
//	_Manager_____  IS A ___Employee____
//	
//	_EMployee_____  IS A ___Addresss____
//	
//	CAR IS A VEHICLE
//	CAR IS A ENGINE
//	
//	3D IS A 2D 

}
