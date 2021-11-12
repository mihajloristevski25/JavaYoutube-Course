package exception;

import java.util.*;

public class glavna {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
		do {
		try {
		System.out.println("Enter first num");
		int n1 = input.nextInt();
		System.out.println("Enter second num");
		int n2 = input.nextInt();
		int sum = n1 / n2;
		System.out.println(sum);
		x=0;
		} catch(Exception e) {
			System.out.println("Error");
		}
		}while(x==1);
		
	}
}
//075 406 783