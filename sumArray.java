
public class sumArray {
	public static void main(String[] args) {
		int arr[] = {32,12,54,32,13,43};
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
