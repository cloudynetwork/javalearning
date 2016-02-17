package tut49;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person person = new Person(1,"Sue");
		Person.setCount(88);
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
			
			os.writeObject(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
