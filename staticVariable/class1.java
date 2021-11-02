package staticVariable;

public class class1 {
	public static void main(String[] args) {
		class2 member1 = new class2("Mihajlo","Ristevski");
		class2 member2 = new class2("Bojan","Petrovski");
		class2 member3 = new class2("Viktor","Stojanovski");
		
		System.out.println("\n");
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		System.out.println(class2.getMembers());
		
		
	}
}