package acess;

public class acessClass1 {
	public static void main(String[] args) {
		acessClass2 obj = new acessClass2();
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
		obj.setTime(0, 0, 0);
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
	}
}
