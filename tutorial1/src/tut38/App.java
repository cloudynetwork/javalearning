package tut38;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) {

		Test test1 = new Test();
		
//		try {
//			test1.run();
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			test1.run();
//		} catch (IOException e) {
//			System.out.println("Couldn't read file");
//			e.printStackTrace();
//		} catch (ParseException e) {
//			System.out.println("Couldn't parse command file");
//			
//			e.printStackTrace();
//		}
		
		try {
			test1.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test1.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
