package last;

public class glavna {
	public static void main(String[] args) {
		String a = "apple";
		String b = "mihajlo";
		String c = "MIHAJLO";
		System.out.println(a.length());
		
		if(a.equals("apple"))
			System.out.println("its the same");
		if(b.equalsIgnoreCase(c))
			System.out.println("they are the same");
			
	}
}
