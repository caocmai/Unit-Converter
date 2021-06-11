package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (menuSelection != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			menuSelection = scanner.nextInt();
			System.out.println(menuSelection);
			boolean isValidSelection = checkValidInput(menuSelection);
			if (isValidSelection) {
				break;
			} else {
				// do the processing here and continue
				continue;
			}
			
		}
		
	}
	
	public static boolean checkValidInput(int selectedNum) {
		if (selectedNum < 1 || selectedNum > 5) {
			System.out.println("Selection not valid, please choose 1-4.");
			return false;
		} else {
			return true;
		}
	}

}
