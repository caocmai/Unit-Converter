package main;

import java.util.Scanner;

public class Converter {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int menuSelection = 0;

		while (menuSelection != 3) {

			System.out.println("1. Volumn Conversions");
			System.out.println("2. Distance Conversions");
			System.out.println("3. Quit");

			menuSelection = scanner.nextInt();
//			String nextIntString = scanner.nextLine(); 
//			menuSelection = Integer.parseInt(nextIntString); 
			
//			System.out.println(menuSelection);
			if (menuSelection == 3) {
				System.out.println("Good bye");
				break;
			}
			boolean isInputValid = checkValidInput(menuSelection, 1, 3);
			if (isInputValid) {
				whichMenu(menuSelection);
			} 
		}
	}

	public static void whichMenu(int num) {
//		Scanner scanner = new Scanner(System.in);
		int selection = -1;
		System.out.println("Please select an option:");
		if (num == 1) {
			do {
				System.out.println("1. Cups to Teaspoons");
				System.out.println("2. US Gallons to Imperial Gallons");
				selection = scanner.nextInt();
			} while (checkValidInput(selection, 1, 2) == false);

		} else if (num == 2) {
			do {
				System.out.println("3. Feet to Meters");
				System.out.println("4. Miles to Kilometers");
				selection = scanner.nextInt();
			} while (checkValidInput(selection, 3, 4) == false);
		}

		chosenConversion(selection);
	}

	public static boolean checkValidInput(int selectedNum, int minStart, int maxEnd) {
		if (selectedNum < minStart || selectedNum > maxEnd) {
			String output = String.format("Selection not valid, please choose %d - %d", minStart, maxEnd);
			System.out.println(output);
			return false;
		} else {
			return true;
		}
	}

	public static void cupsToTeaspoons() {
		System.out.println("Enter number of cups: ");
		int cups = scanner.nextInt();
		int teaspoons = cups * 16;

		String output = String.format("%d cups is %d teaspoons. \n", cups, teaspoons);
		System.out.println(output);
	}

	public static void gallonsToImperialGallons() {
		System.out.println("Enter number of US gallons: ");
		double gallons = scanner.nextInt();
		double imperialGallons = gallons * 0.83267;
		System.out.println(gallons + " US gallons is " + imperialGallons + " Imperial gallons." + "\n");
	}

	public static void feetToMeters() {
		System.out.println("Enter number of feet: ");
		int feet = scanner.nextInt();
		double meters = feet / 12;
		System.out.println(feet + " feet is " + meters + " meters." + "\n");
	}

	public static void milesToKilometer() {
		System.out.println("Enter number of miles: ");
		double miles = scanner.nextInt();
		double kilometers = miles * 1.609344;
		System.out.println(miles + " miles is " + kilometers + " kilometers." + "\n");
	}

	public static void chosenConversion(int num) {
		switch (num) {
		case 1:
			cupsToTeaspoons();
			break;
		case 2:
			gallonsToImperialGallons();
			break;
		case 3:
			feetToMeters();
			break;
		case 4:
			milesToKilometer();
			break;
		default:
			System.out.println("Conversion not yet implemented");
			break;
		}
	}

}
