
public class enhancedLoop {
	public static void main(String[] args) {
		
		int arr[] = {3,4,5,6,7};
		int total=0;
		
		for(int x: arr) {
			total += x;
		}
		System.out.println(total);
	}
}