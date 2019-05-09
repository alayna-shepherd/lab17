package CountriesLab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CountriesTextFile {

	public static ArrayList<Country> readFromFile(String fileName) {

		// 1.
		ArrayList<Country> countryList = new ArrayList<>();

		Path filePath = Paths.get(fileName);
		File f = filePath.toFile();
		BufferedReader br = null;
		try {
			// FileReader fr = new FileReader(f);
			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();

			while (line != null) {
				// 2.
				// String[] words = line.split(",");
				// 3.
				// String name = words[0];
				Country umm = new Country(countryName, population);
				// 4.
				countryList.add(umm);
				// System.out.println(line); // this is for printing each line to the console
				// this is grabbing the next line of data
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found...");
		} catch (IOException e) {
			System.out.println("Something crazy happened -- call someone who can help!");
		}
		// 5.
		return countryList;
	}

	public static void writeToFile(ArrayList<Country> Countries) {
		String fileName = "countries.txt";
		Path path = Paths.get(fileName);
		
		File file = path.toFile();
		Country one = new Country(countryName, population);
	
		if (Files.notExists(path)) {
		try {
			//the file output stream takes 2 parameters in constructor 
			//the second parameter is optional, and if not included will assume false
			//and overwrite the file
			//if not used it will add additional data to the file / append
			PrintWriter output = new PrintWriter(new FileOutputStream(file, false));
			
			
			for (int i = 0; i < Countries.size(); i++) {
				output.println(Countries.get(i));
			}
				output.close();
			System.out.println("Country has been added ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("yo idk whats happenin but you aint doin somethin right! ");
		} else {
			System.out.println("File already exists!");
		}

		try {
			PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
			output.println(countryName);
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("ya broke somethin");
		}
	
		

	}

	public static void createOurFile(String fileName) {
		// String fileName = "text.txt";

		// Path path = Paths.get("resources", fileName);
		Path path = Paths.get(fileName);
		if (Files.notExists(path)) {

			if (Files.notExists(path)) {
				try {
					Files.createFile(path);
					System.out.println("the file was created suceessfully");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("something went wrong with the file creation");
				}

			} else {
				System.out.println("that file already exists");
			}
		}
	}
}
