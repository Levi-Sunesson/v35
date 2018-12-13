package threadLearning;

public class threads {

	public static volatile boolean bool = false;

	public static void main(String[] args) {

		Runnable r = () -> {

			System.out.println("Här kommer en nummerföljd!");

			for (int i = 1; i <= 10; i++) {

				try {
					Thread.sleep(i*100);
				} catch (InterruptedException e) {e.printStackTrace();}

				System.out.println(i);

			}

			bool = true;
			
		};
		Thread t = new Thread(r);

		t.start();

		while (true) {
			
			if (bool) {
				
				t = new Thread(r);
				t.start();
				bool = false;
				
			}

		}

	}

}