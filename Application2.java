package com.training;

public class Application2 {
	
	public static void main(String[] args) {
		
		BloodDonor donor=new BloodDonor();
		
		donor.setDonorAge(23);
		donor.setDonorName("Akshay");
		donor.setBloodType("B+");
		
		BloodDonor donor2=new BloodDonor("Ramesh","A-",35);
		
		System.out.println(donor.getBloodType());
		System.out.println(donor2.getDonorAge());
	}

}
