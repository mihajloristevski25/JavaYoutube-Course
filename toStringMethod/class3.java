package toStringMethod;

public class class3 {
	private String name;
	private class2 birthday;
	
	public class3(String theName, class2 theDate) {
		name=theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday %s", name , birthday);
	}
}
