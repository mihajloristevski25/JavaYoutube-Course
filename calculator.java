import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fnum, snum , answer;
		System.out.println("First number: ");
		fnum = sc.nextDouble();
		System.out.println("Second number: ");
		snum = sc.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
