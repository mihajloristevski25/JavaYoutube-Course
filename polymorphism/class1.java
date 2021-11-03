package polymorphism;

public class class1 {
	public static void main(String[] args) {
		
		class4 obj[] = new class4[2];
		obj[0]=new class3();
		obj[1]=new class2();
		
		for(int i = 0 ; i<2;i++) {
			obj[i].eat();
		}
	}
}
