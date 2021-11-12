package fileclass4;

import java.io.*;
import java.util.*;

public class readfile {
	private Scanner x; 
	
	
	public void openFile() {
		try {
			x = new Scanner(new File("mihajloo.txt"));
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
	public void readFile() {
		 while(x.hasNext()) {
			 String a = x.next();
			 String name = x.next();
			 String lastname = x.next();
			 
			 System.out.printf("%s %s %s \n" , a , name , lastname);
		 }
	}
	public void closeFile() {
		x.close();
	}
}
