package fileclass2;

import java.io.File;
import java.util.*;

public class file {
public static void main(String[] args) {
		
		final Formatter f;
	
		try {
			f = new Formatter("miksa.txt");
			System.out.println("you created a file");
		}catch(Exception e) {
			System.out.println("You got an error");
		}
		
	
	}
}
