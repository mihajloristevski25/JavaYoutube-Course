import java.util.Scanner;

public class simpleAveragingProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while(counter < 10) {
			grade = sc.nextInt();
			total = total + grade;
			counter++;
		}
		average = total / 10;
		System.out.println("Your average is: " + average);
	}
}
