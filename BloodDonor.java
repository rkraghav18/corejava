package com.training;

public class BloodDonor {
	
	private String donorName;
	private String bloodType;
	private int donorAge;
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodDonor(String donorName, String bloodType, int donorAge) {
		super();
		this.donorName = donorName;
		this.bloodType = bloodType;
		this.donorAge = donorAge;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public int getDonorAge() {
		return donorAge;
	}
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}
	
	

}
