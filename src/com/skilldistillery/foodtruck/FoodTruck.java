// FoodTruck Class builds up to five food trucks to be rated by users when prompted
//
// Food Trucks by Walter S. Valdez
//
// HW for Week 2. See https://github.com/SkillDistillery/SD28/blob/master/java1/FoodTrucks/README.md
//
package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private double numRating; // scale from 1.0 (worst) to 10.0 (best)
	private static int NUMID = 2100; // each food truck will have a unique numeric Id

	// no-arg constructor
	public FoodTruck() {
		
	}
	
	// Constructor does not allow numId to be instantiated by the creation of an
	// object of this class
	public FoodTruck(String truckName, String foodType, double numRating, int NUMID) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.numRating = numRating;
		FoodTruck.NUMID = NUMID++;
	}
	

	
	

	public static int getNUMID() {
		return NUMID;
	}

	public static void setNUMID(int nUMID) {
		NUMID = nUMID;
	}

	public double getNumRating() {
		return numRating;
	}

	public void setNumRating(double numRating) {
		this.numRating = numRating;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String toString() {
		String output = "truckName=" + truckName + ", foodType=" + foodType + ", numRating=" + numRating + ", NUMID="
				+ NUMID;
		return output;
	}

	public void displayFoodTruck() {
		String fTData = this.toString();
		System.out.println(fTData);
	}

}
