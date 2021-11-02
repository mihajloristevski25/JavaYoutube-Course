package timeClass;

public class timeClass1 {
	public static void main(String[] args) {
		timeClass2 obj = new timeClass2();
		System.out.println(obj.toMilitary());
		
		obj.setTime(13,27, 6);
		System.out.println(obj.toMilitary());
	}
}
