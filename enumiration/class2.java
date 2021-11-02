package enumiration;

import java.util.EnumSet;

public class class2 {
	public static void main(String[] args) {
		for(class1 name: class1.values()) {
			System.out.printf("%s\t%s\t%s \n", name , name.getDesc() , name.getYear());
		}
		System.out.println("\nAnd now for the range\n");
		
		for(class1 name: EnumSet.range(class1.stefan, class1.viktor))
		System.out.printf("%s\t%s\t%s \n", name , name.getDesc() , name.getYear());
	}
}
