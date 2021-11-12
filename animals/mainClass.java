package animals;

public class mainClass {
	public static void main(String[] args) {
		
		animalList alo = new animalList();
		dog d= new dog();
		fish f = new fish();
		
		alo.add(d);
		alo.add(f);
		
		
		animal[] list = new animal[2];
		list[0]=d;
		list[1]=f;
		
		
		for(animal x : list ) {
			x.noise();
		}
		
	}
}
