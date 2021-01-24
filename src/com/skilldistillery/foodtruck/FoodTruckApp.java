package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	Scanner kb = new Scanner(System.in);
	FoodTruck[] fTarr = new FoodTruck[5]; // TEST--- changeback!! -- only 5 food truck objects

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	} // end of main
	
	public void run() {       // run() think of it as main -- write your logic
		boolean keepGoing = true; // to allow user to quit
		// Start by making and populating the FoodTruck objects in the fTarr 
		makeTrucks();
		// Menu including list all, avg rating, highest rating, quit program (keepGoing to false)
		do {
			keepGoing = printMenuOptions(fTarr, keepGoing);
		} while (keepGoing);
		
		kb.close();
	} // end of run() method

	public void makeTrucks() {

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
	} // end of makeTrucks() method

	public boolean printMenuOptions(FoodTruck[] fTarr, Boolean keepGoing) {
		int uChoice;
		double avg, ratingSum = 0.0, ratingMax = 0.0;
		String hiRatedFT = "", hiFoodType = "";
		System.out.println("\n----------------------------------");
		System.out.println("     Please Select a Option:      \n");
		System.out.println(" 1 = List All Existing Food Trucks");
		System.out.println(" 2 = Average Rating of Food Trucks");
		System.out.println(" 3 = Highest-Rated Food Truck!!!!!");
		System.out.println("   Or                             ");
		System.out.println(" 9 = Quit                         ");
		System.out.println();
		System.out.println("----------------------------------\n");
		uChoice = kb.nextInt();
		// action of choices
		switch (uChoice) {
		case 1:
			System.out.println("All Existing Food Trucks: \n");
			// iterate thru the FoodTruck array and print them out
			for (int i = 0; i < fTarr.length; i++) {				
				System.out.println(fTarr[i]);
				System.out.println();
			}
			break;
		case 2:
			// avg rating of food trucks
			for (int i = 0; i < fTarr.length; i++) {
				ratingSum += fTarr[i].getNumRating();
			}
			avg = ratingSum / fTarr.length;
			System.out.println("\nThe Average Rating was: " + avg+ "\n");
			break;
		case 3:
			// display the highest rated food truck
			for (int i = 0; i < fTarr.length; i++) {
				if (fTarr[i].getNumRating() > ratingSum) {
					ratingMax = fTarr[i].getNumRating();
					hiRatedFT = fTarr[i].getTruckName();
					hiFoodType = fTarr[i].getFoodType();
				}
			}
			System.out.println("\nThe Winner is: " + hiRatedFT + " with: " + ratingMax + ", which has a food type of " + hiFoodType + ".\n");
			break;	
		case 9:
			System.out.println("\nYou Choose to Quit. Thank you and have a nice day!\n");
			keepGoing = false;
			break;
		default:
			System.out.println("\nOops! Seems we made an invalid entry...\n");
			break;
		} // end of switch st
		return keepGoing;
	} // end of printMenuOptions() method

} // end of class
