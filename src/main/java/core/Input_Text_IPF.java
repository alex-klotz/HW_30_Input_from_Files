package core;

import java.io.*;
import java.util.*;

public class Input_Text_IPF {
	public static void main(String [] args) throws IOException{
		
		Properties p = new Properties();
		p.load(ClassLoader.getSystemResourceAsStream("input.properties"));
		
		String first_name = p.getProperty("f_name1");
		String last_name = p.getProperty("l_name2");
		System.out.println("Full name is: " + first_name + " " + last_name);
		
		p.clear();
	}
}
