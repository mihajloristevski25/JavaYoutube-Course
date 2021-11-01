package RandomNumber;
import java.util.Random;

public class randomNumber {
	public static void main(String[] args) {
		Random kocka = new Random();
		int num;
		for(int counter = 1; counter <= 10 ; counter++) {
			num = 1+kocka.nextInt(6);
			System.out.println("  " + num);
		}
	}
}
