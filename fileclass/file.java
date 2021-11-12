package fileclass;

import java.io.File;

public class file {
	public static void main(String[] args) {
		
		File x = new File("C:\\test\\mihajlo.txt");
		
		if(x.exists()) 
			System.out.println(x.getName()+"  file exists");
		else
			System.out.println("it doesnt exist");
	}
}
