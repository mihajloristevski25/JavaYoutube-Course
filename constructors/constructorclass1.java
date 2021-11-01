package constructors;

public class constructorclass1 {
	private String girlName;
	
	public constructorclass1(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first name is %s\n", getName());
	}
}
