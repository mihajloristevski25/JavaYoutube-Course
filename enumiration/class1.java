package enumiration;

public enum class1 {
	mihajlo("nice","23"),
	stefan("hello","12"),
	bojan("haha","32"),
	viktor("good","22"),
	darko("smile","17"),
	aleksandar("fun","19");
	
	private final String desc;
	private final String year;
	
	class1(String description , String age){
		desc = description;
		year = age;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
	
}
