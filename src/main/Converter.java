package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (menuSelection != 4) {
			System.out.println("1. Volumn Conversions");
			System.out.println("2. Distance Conversions");
			
			
			menuSelection = scanner.nextInt();
			System.out.println(menuSelection);
			
			
			
			boolean isInputValid = checkValidInput(menuSelection, 1, 2);
			if (isInputValid) {
				whichMenu(menuSelection);
				break;
			} else {
				// do the processing here and continue
				continue;
			}
			
		}
		
	}
	
	public static void whichMenu(int num) {
		Scanner scanner = new Scanner(System.in);
		int selection = -1;
		
		System.out.println("Please select an option:");
		if (num == 1) {
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. US Gallons to Imperial Gallons");
			
		} else if (num == 2) {
			System.out.println("3. Feet to Meters");
			System.out.println("4. Miles to Kilometers");
		}
		
		selection = scanner.nextInt();
		chosenConversion(selection);
		scanner.close();
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
	
	
//	public static boolean moreConversion(int selectedNum) {
//		if (selectedNum == 4) {
//			System.out.println("Thanks for using our program!");
//			return false;
//		} else if (selectedNum < 0 || selectedNum > 4) {
//			System.out.println("Selection not valid, please choose 1-4.");
//			return true;
//		} else 
//		{
//			return true;
//		}
//	}
	
	public static void cupsToTeaspoons() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cups: ");
		int cups = sc.nextInt();
		int teaspoons = cups * 16;
		
        String output = String.format("%d cups is %d teaspoons.", cups, teaspoons);
		
		System.out.println(output);	
			
		sc.close();
	}
	
	public static void gallonsToImperialGallons() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of US gallons: ");
		double gallons = sc.nextInt();
		double imperialGallons = gallons * 0.83267 ;
		System.out.println(gallons + " US gallons is " + imperialGallons + " Imperial gallons.");	
			
		sc.close();
	}
	
	public static void feetToMeters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of feet: ");
		int feet = sc.nextInt();
		double meters = feet / 12 ;
		System.out.println(feet + " feet is " + meters + " meters.");	
			
		sc.close();
	}
	
	public static void milesToKilometers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of miles: ");
		double miles = sc.nextInt();
		double kilometers = miles * 1.609344 ;
		System.out.println(miles + " miles is " + kilometers + " kilometers.");	
			
		sc.close();
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
			milesToKilometers();
			break;
		default:
			System.out.println("Conversion not yet implemented");
		}
	}

}
