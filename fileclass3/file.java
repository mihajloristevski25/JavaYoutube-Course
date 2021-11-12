package fileclass3;

import java.io.*;
import java.lang.*;
import java.util.*;


public class file {
	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter("mihajloo.txt");
			
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
	public void addRecords() {
		x.format("%s%s%s","20 " , "Mihajlo " , "Ristevski");
	}
	public void closeFile() {
		x.close();
	}
	
}
