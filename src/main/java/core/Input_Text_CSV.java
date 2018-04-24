package core;

import java.io.*;

public class Input_Text_CSV {
	public static void main(String [] args) throws IOException{
		
		 //String csvFile = "input.csv"; // Hardcoded path, no needs to give a full path to a file
		 String csvFile = args[0]; // Dynamic launch from command line with passing the path to the file
		
		BufferedReader br = new BufferedReader (new FileReader (csvFile));
		
		while(br.ready()) {
			String line = br.readLine(); //John, Smith
			String[] csv = line.split(","); //delimiter by comma (you can use any other delimiter)
			String first_name = csv[0]; // first word before comma
			String last_name = csv[1]; // second word after comma
			
			System.out.println("Full name is: " + first_name + " " + last_name);
		}
		 br.close();
	}
}
