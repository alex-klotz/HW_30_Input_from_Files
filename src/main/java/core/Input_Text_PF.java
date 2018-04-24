package core;

import java.io.*;
import java.util.*;

public class Input_Text_PF {
	public static void main(String [] args) throws IOException{
		
		//String file = "./input.properties"; // Hardcoded path, no needs to give a path to a file
		String file = args[0]; // Dynamic launch from command line with passing the path to the file
		
		Properties p = new Properties();
		p.load(new FileInputStream(file));
		
		String first_name = p.getProperty("f_name");
		String last_name = p.getProperty("l_name");
		System.out.println("Full name is: " + first_name + " " + last_name);
		
		p.clear();
	}
}
