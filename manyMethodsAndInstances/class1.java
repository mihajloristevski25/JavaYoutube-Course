package manyMethodsAndInstances;
import java.util.Scanner;
public class class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		class2 obj = new class2();
		System.out.println("Enter name here:" );
		String temp = sc.nextLine();
		
		obj.setName(temp);
		obj.saying();
	}
}
