package core;

import java.io.*;
import java.util.Scanner;

public class Input_Text_Scanner {
	public static void main(String [] args) throws FileNotFoundException{
		
		File file = new File ("inputScanner.txt"); // Hardcoded path, no needs to give a full path to a file
		//String file = args[0];  // Dynamic launch from command line with passing the path to the file
		Scanner s = new Scanner(file);
		while (s.hasNext()) {
			String first_name = s.next();
			String last_name = s.next();
			String middle_name = s.next();
			System.out.println("Full name is: " + first_name + " " + last_name + " " + middle_name);
		}
		s.close();
	}

}
