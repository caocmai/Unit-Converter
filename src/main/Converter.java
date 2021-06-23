package main;

import java.util.Scanner;

public class Converter {
	public static Scanner scanner = new Scanner(System.in);
	public static CheckDigit isDigit = new CheckDigit();

	public static void main(String[] args) {
		int menuSelection = -1;

		while (menuSelection != 3) {
			System.out.println("1. Volume Conversions");
			System.out.println("2. Distance Conversions");
			System.out.println("3. Quit");

			String input = scanner.next();
			if (isDigit.isNumeric(input)) {
				menuSelection = Integer.parseInt(input);
			}

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

	// should change name of this method so it doesn't clash with keyword
	public static int parseInt(String strNum) {
		if (isDigit.isNumeric(strNum)) {
			return Integer.parseInt(strNum);
		} else {
			return -1;
		}
	}

	public static void whichMenu(int num) {
		int selection = -1;
		System.out.println("Please select an option:");
		if (num == 1) {
			do {
				System.out.println("1. Cups to Teaspoons");
				System.out.println("2. US Gallons to Imperial Gallons");

				String input = scanner.next();
				selection = parseInt(input);

			} while (checkValidInput(selection, 1, 2) == false);

		} else if (num == 2) {
			do {
				System.out.println("3. Feet to Meters");
				System.out.println("4. Miles to Kilometers");

				String input = scanner.next();
				selection = parseInt(input);

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
		String input = "-1";
		do {
			System.out.println("Enter number of cups: ");
			input = scanner.next();
		} while (parseInt(input) == -1);

		int cups = parseInt(input);
		int teaspoons = cups * 16;

		String output = String.format("%d cups is %d teaspoons. \n", cups, teaspoons);
		System.out.println(output);
	}

	public static void gallonsToImperialGallons() {
		String input = "-1";
		do {
			System.out.println("Enter number of US gallons: ");
			input = scanner.next();
		} while (parseInt(input) == -1);

		double gallons = parseInt(input);
		double imperialGallons = gallons * 0.83267;
		System.out.println(gallons + " US gallons is " + imperialGallons + " Imperial gallons." + "\n");
	}

	public static void feetToMeters() {
		String input = "-1";
		do {
			System.out.println("Enter number of feet: ");
			input = scanner.next();
		} while (parseInt(input) == -1);

		double feet = parseInt(input);
		double meters = feet / 12;
		System.out.println(feet + " feet is " + meters + " meters." + "\n");
	}

	public static void milesToKilometer() {
		String input = "-1";
		do {
			System.out.println("Enter number of miles: ");
			input = scanner.next();
		} while (parseInt(input) == -1);
		
		double miles = parseInt(input);
		double kilometers = miles * 1.609344;
		System.out.println(miles + " miles is " + kilometers + " kilometers." + "\n");
	}

	public static void chosenConversion(int num) {
		// maybe loop here if I want to reuse the conversion
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
