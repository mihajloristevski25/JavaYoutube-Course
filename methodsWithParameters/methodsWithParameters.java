package methodsWithParameters;

import java.util.Scanner;

public class methodsWithParameters {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		methodsWithParameters1 obj = new methodsWithParameters1();
		
		System.out.println("Enter your name here: ");
		String name = sc.nextLine();
		
		obj.simpleMessage(name);
		
	}
}
