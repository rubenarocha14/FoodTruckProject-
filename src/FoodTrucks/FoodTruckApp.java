package FoodTrucks;

import java.util.Scanner;

public class FoodTruckApp {
	// open our scanner so it can be used throughout the app
	Scanner scan = new Scanner(System.in);

	// create the FoodTruck array with room for 5 indexes
	// this will be declared outside of our main so it's scope
	// extends to other class methods
	private FoodTruck[] ftArr = new FoodTruck[5];

	public static void main(String[] args) {
		// create our food truck app instance
		FoodTruckApp FTATester = new FoodTruckApp();
		// call our method to get the Food Truck info from user
		FTATester.getTruckData();
		// Display the menu options to the user once Truck info has been given
		FTATester.displayMenu();
		// Perform menu operations depending on the menu selection
		FTATester.menuOperations();

	}

	public void getTruckData() {
		for (int i = 0; i < ftArr.length; i++) {
			// get truck name
			System.out.println("Enter the name of the food truck");
			String name = scan.nextLine();
			// implement quit option to return to menu
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			// get truck food type
			System.out.println("Enter the food type");
			String foodType = scan.nextLine();
			// get users rating of food truck
			System.out.println("Enter the rating of the truck");
			double rating = scan.nextDouble();
			// must have scan.nextLine() after nextDouble() to prevent the code from
			// skipping
			// the next iteration of receiving the truck name
			scan.nextLine();
			// assign our values to an instance of Food Truck and assign
			// the values to the current index of the array
			ftArr[i] = new FoodTruck(name, foodType, rating);
		}

	}

	public void displayMenu() {
		System.out.println("Please select from the following menu");
		System.out.println("|=======================================|");
		System.out.println("\t 1) List all trucks");
		System.out.println("\t 2) List average rating");
		System.out.println("\t 3) List Highest rating");
		System.out.println("\t 4) Quit Program");
		System.out.println("|=======================================|");

	}

	private void menuOperations() {
		// take the menu selection from the user
		int selection = scan.nextInt();
		// use switch statements to convert the users input into a method call
		switch (selection) {
		case 1:
			// list the given food trucks and their attributes
			System.out.println("Food Trucks entered: ");
			listFoodTrucks();
			break;

		case 2:
			// calc the average rating of the food trucks given
			System.out.println("Average rating of all food trucks is: ");
			calculateAverage();
			break;

		case 3:
			// determine the highest rated food truck
			System.out.println("The highest rated food truck is: ");
			getHighestRating();
			break;
		case 4:
			// quit the program and display a message
			System.out.println("Thanks for using the Food Truck App!");
			System.exit(0);
		default:
			// promt user to enter a valid entry
			System.out.println("Please enter a valid entry!");

		}
		// if 4 is not selected run again
		displayMenu();
		menuOperations();
	}

	private void getHighestRating() {
		// assign our highest rating to the initial index
		double highestRating = ftArr[0].getRating();
		int arrIdx = 0;
		// index the array length
		for (int i = 0; i < ftArr.length; i++) {
			// only compare if there is a value in the index
			if (ftArr[i] != null) {
				if (ftArr[i].getRating() > highestRating) {
					highestRating = ftArr[i].getRating();
					ftArr[i].toString();
				}
			}
		}
		System.out.println(ftArr[arrIdx].toString());
	}

	private void calculateAverage() {
		// remember not to hardcode anything in
		double average = 0.0;
		double sum = 0.0;
		int ratings = 0;

		for (int i = 0; i < ftArr.length; i++) {
			if (ftArr[i] != null) {
				ratings++;
				sum += ftArr[i].getRating();
			}
		}
		average = sum / ratings;
		System.out.println(average);
	}

	private void listFoodTrucks() {
		for (int i = 0; i < ftArr.length; i++) {
			if (ftArr[i] != null) {
				System.out.println(ftArr[i].toString());
			}
		}
	}
}
