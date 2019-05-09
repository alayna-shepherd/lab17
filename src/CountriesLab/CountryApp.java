package CountriesLab;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> menu = new ArrayList<>();
		menu.add("1. Display List of countries");
		menu.add("2. Add a Country to the List");
		menu.add("3. Exit program");
		int answer;
		String country;
		int pop;
		do {
			for (int i = 0; i < menu.size(); i++) {
				System.out.println(menu.get(i));
			}
			System.out.println("Please enter menu number ");
			answer = scan.nextInt();
			scan.nextLine();
			if (answer == 1) {
				CountriesTextFile.readFromFile(country);
			} else if (answer == 2) {
				System.out.println("What Country would you like to add?");
				country = scan.nextLine();
				
				System.out.println("What is the population of that Country?");
				pop = scan.nextInt();
				CountriesTextFile.writeToFile(country, population);
			} else if (answer == 3) {
				System.out.println("You are the Weakest Link GoodBye");
			} else {
				System.out.println("Input not found please try again");
				continue;
			}
		} while (answer != 3);

		scan.close();
	}

}

	

