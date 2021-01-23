package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruck[] fTarr = new FoodTruck[5]; // TEST---only 5 food truck objects

		// Prompt User to input the name, food type, and rating for up to five food
		// trucks
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello There! Thanks for rating up to five food trucks.");
		System.out.println(
				"For your first food truck review. Also, you can type 'quit' when entering the Food Truck Name to exit. Thanks!");
		
		// restrict to only five food trucks per user
		for (int i = 0; i < fTarr.length; i++) {
			// create a FoodTruck Object per food truck being reviewed
			FoodTruck fT = new FoodTruck();
			// prompt for Food Truck Name
			System.out.print("Please enter the Food Truck Name: ");
			// check if user's Truck Name Input was: quit
			// Food Truck Name
			String fTName = kb.nextLine();
			if (fTName.toUpperCase().equals("QUIT")) {
				System.out.println("You've opted to quit");
				break;
			}
			// keep enter user's input data onto each FoodTruck object:
			fT.setTruckName(fTName);
			// Food Truck Type
			System.out.print("Please enter the Food Truck's Food Type: ");
			String fTType = kb.nextLine();
			fT.setFoodType(fTType);
			// Food Truck Rating
			System.out.print("Using the scale from 1.0 (worse) to 10.0 (best), please rate the Food Truck: \n");
			double rating = kb.nextDouble();
			kb.nextLine(); // help with console flow after a double 
			fT.setNumRating(rating);
			// NUMID is assigned automatically from the constructor
			fTarr[i] = fT;
		} // end of For Loop of user input

		// TEST: print out the Food Trucks
		for (int i = 0; i < fTarr.length; i++) {
//			fTarr[i].displayFoodTruck();
			System.out.println(fTarr[i]);
		}
		kb.close();
	} // end of main

} // end of class
