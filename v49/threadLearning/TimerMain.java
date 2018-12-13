package threadLearning;

import java.util.Scanner;

public class TimerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Timer t = new Timer();
		
		t.start(3670);
		
		if (sc.nextLine().equals("stop")) {
			
			System.out.println("STOPPED TIMER");
			
			t.stop();
		
			t.start(10);
				
		}
		
		sc.close();
	}
	
}
