package instanceVariableFinal;

public class class2 {
	private int sum;
	private final int NUMBER;
	
	public class2(int x) {
		NUMBER = x;
	}
	public void add() {
		sum +=NUMBER;
	}
	
	public String toString() {
		return String.format("sum = %d \n", sum);
	}
}
