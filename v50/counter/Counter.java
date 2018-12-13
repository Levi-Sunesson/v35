package counter;

public class Counter {

	private static volatile int count = 0;
	
	public static synchronized int count() {
		
		count++;
		
		return count;
		
	}
		
}