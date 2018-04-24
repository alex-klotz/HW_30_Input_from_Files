package core;

import java.io.*;

public class Input_Text_FR {
	
	public static void main(String [] args) throws IOException{
		
		//File file = new File("input.txt"); // Hardcoded path,if so no needs to give a full path to a file
		String file = args[0]; // Dynamic launch from command line with passing the path to the file
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while(br.ready()) {
			String full_name = br.readLine(); // каждая переменная выводится на отдельной строчке
			//String last_name = br.readLine();
			System.out.println("Full name is: " + full_name); //+ " " + last_name)
		}
		br.close();
	}
}
