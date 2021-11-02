package regularTimeClass;


public class timeClass {
	public static void main(String[] args) {
		timeClass1 obj = new timeClass1();
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
		
		obj.setTime(13,27, 6);
		
		
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
	}
}
