package com.pugazh.assignment2;

public class Assignment2Main {

	public static void main(String[] args) {
		
		// Creating Student Object, prints default constructor message
		@SuppressWarnings("unused")
		Student s1 = new Student();
		
		Commission com = new Commission();
		com.userDetails();	// getting user inputs
		com.commissionCalculation();	// calculate and print user details with calculated commission
	}

}
