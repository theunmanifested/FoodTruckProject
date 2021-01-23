package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruck[] fT= new FoodTruck[4]; // only 5 food truck objects
		
		// Prompt User to input the name, food type, and rating for up to five food trucks
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello There! Thanks for rating up to five food trucks.");
		System.out.println("For your first food truck review. Also, you can type 'quit' when entering the Food Truck Name to exit. Thanks!");		
		System.out.print("Please enter the Food Truck Name: ");
		
		// restrict to only five food trucks per user
		for (int i = 0; i < fT.length; i++) {
			// check if user's Truck Name Input was: quit
			if (kb.nextLine().toUpperCase().equals("QUIT")) {
				System.out.println("You've opted to quit");
				break;
			}
			// enter user's input data onto each FoodTruck object:
			// Food Truck Name
			fT[i].setTruckName(kb.nextLine());
			// Food Truck Type
			System.out.print("Please enter the Food Truck's Food Type: ");
			fT[i].setFoodType(kb.nextLine());
			// Food Truck Rating
			System.out.print("Using the scale from 1.0 (worse) to 10.0 (best), please rate the Food Truck: ");
			fT[i].setNumRating(kb.nextDouble());
			// NUMID is assigned automatically from the constructor
		}
		
		// TEST: print out the Food Trucks
		for (int i = 0; i < fT.length; i++) {
			fT[i].displayFoodTruck();
		}		
	} // end of main

} // end of class
