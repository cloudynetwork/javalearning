package tut7;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a number: ");
		
		//Wait for the user to enter a line of text
		float value = input.nextFloat();
		
		// Tell them what they entered
		System.out.println("You entered: " + value);

	}
}
