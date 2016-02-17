package tut36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		
		in.nextLine();
		
		System.out.println("Read value: " + value);
		
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(line);
			count++;
		}
		
		
		in.close();
		
	}
}
