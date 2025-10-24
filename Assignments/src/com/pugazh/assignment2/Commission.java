package com.pugazh.assignment2;

import java.util.Scanner;

// Commission class to store employee details and commission calculations
public class Commission {
	
	private String name;
	private String address;
	private String phone;
	private double sales_amount;
	
	// Method 1 -> Getting User Inputs
	@SuppressWarnings("resource")
	public void userDetails() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
        name = in.nextLine();

        System.out.print("Enter Address: ");
        address = in.nextLine();

        System.out.print("Enter Phone: ");
        phone = in.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = in.nextDouble();
	}
	
	// Method 2 -> Commission Calculation
	public void commissionCalculation() {
		
		double commission;
		
		if(sales_amount >= 100000) {
			commission = sales_amount * 0.10;	// 10% Commission 
		} else if (50000 <= sales_amount && sales_amount < 100000) {
			commission = sales_amount * 0.05;
		} else if (30000 <= sales_amount && sales_amount < 50000) {
			commission = sales_amount * 0.03;
		} else {
			commission = 0;
		}
		
		// Displaying Details
		System.out.println("\n_____Employee Details_____");
	    System.out.println("Name: " + name);
	    System.out.println("Address: " + address);
	    System.out.println("Phone: " + phone);
	    System.out.println("Sales Amount: " + sales_amount);
	    System.out.println("Commission: " + commission);
	}
}
