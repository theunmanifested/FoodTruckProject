package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	Scanner kb = new Scanner(System.in);
	FoodTruck[] fTarr = new FoodTruck[2]; // only 5 food truck objects

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	} // end of main

	// run() think of it as main -- write your logic
	public void run() {
		makeTrucks();
		printMenuOptions(fTarr);

//		 TEST: print out the Food Trucks
//		for (int i = 0; i < fTarr.length; i++) {
////	fTarr[i].displayFoodTruck();
//	System.out.println(fTarr[i]);
//}
		// Menu including list all, avg rating, highest rating, quit program
//		do {
//			printMenu(fTarr);
//		} while (keepGoing);
//		
//		
//		}
		kb.close();
	} // end of run

	public void makeTrucks() {
		boolean keepGoing = true;

		// Prompt User to input the name, food type, and rating for up to five food
		// trucks
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
	}

	public void printMenuOptions(FoodTruck[] fTarr) {
		int uChoice;
		System.out.println("----------------------------------");
		System.out.println("..................................");
		System.out.println(".....Please Select a Option:......");
		System.out.println(" 1 = List All Existing Food Trucks");
		System.out.println(" 2 = Average Rating of Food Trucks");
		System.out.println(" 3 = Highest-Rated Food Truck!!!!!");
		System.out.println("...............Or.................");
		System.out.println(" 9 = Quit...If so, Thank You & Bye");
		System.out.println("..................................");
		System.out.println("----------------------------------");
		uChoice = kb.nextInt();

		switch (uChoice) {
		case 1:
			// iterate thru the FoodTruck array and print them out
			for (int i = 0; i < fTarr.length; i++) {
				System.out.println(fTarr[i]);
			}
			break;
		case 2:
			

		default:
			break;
		}

	}

} // end of class
