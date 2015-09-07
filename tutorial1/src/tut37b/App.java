package tut37b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {

		try {
			openFile();
		} catch (FileNotFoundException e) {
			// Message too vague. 
			System.out.println("Could not open or access file");
		}
		
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");

//		try {
			FileReader fr = new FileReader(file);
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found or accessible: " + file.toString());
//		}

		System.out.println("Finished!!");

	}
}
