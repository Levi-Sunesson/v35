package v35;

public class Uppgift1 {

	public static void main(String[] args) {
		
		sum(1, 1, 1, 2, 3, 4, 5, 6, 7);
		
	}
	
	public static int sum(int... ints) {
		
		int sum = 0;
		
		for (int n : ints) {
			sum += n;
		}
		
		return sum;
		
	}
	
}
