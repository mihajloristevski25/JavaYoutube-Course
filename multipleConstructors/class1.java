package multipleConstructors;

public class class1 {
	public static void main(String[] args) {
		class2 firstObj = new class2();
		class2 secondObj = new class2(5);
		class2 thirdObj = new class2(5,13);
		class2 fourthObj = new class2(5,13,43);
		
		System.out.printf("%s\n", firstObj.toMilitary());
		System.out.printf("%s\n", secondObj.toMilitary());
		System.out.printf("%s\n", thirdObj.toMilitary());
		System.out.printf("%s\n", fourthObj.toMilitary());
	}
}
