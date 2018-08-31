package v35;

public class Uppgift3 {

	public static void main(String[] args) {
		
		generik();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public static <T> T[] generik(T... gene) {
		
		return gene;
		
	}
	
}
