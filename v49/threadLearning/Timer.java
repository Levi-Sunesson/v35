package threadLearning;

public class Timer implements Runnable{

	private volatile Thread thread;

	private volatile int time;

	public volatile boolean stopper = false;
	public volatile boolean running = false;

	Runnable r = () -> {

		this.run();

	};
	
	Timer(){

		this.thread = new Thread(r);

	}

	@Override
	public void run() {

		this.running = true;

		for (int i = time; i > 0; i--)  {


			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (this.stopper) {
				this.stopper = false;
				this.running = false;
				return;
			}

			int p1 = i % 60;

			int p2 = i / 60;

			int p3 = p2 % 60;

			p2 = p2 / 60;
			
			String minutes = (p3 < 10) ? "0" + p3 : "" + p3;
			String hours = (p2 < 10 ) ? "0" + p2 : "" + p2;
			
			String seconds = (p1 < 10) ? "0" + p1 : "" + p1;
			minutes = (p3 < 1 ) ? "--" : minutes;
			hours = (p2 < 1 ) ? "--" : hours;
			
			System.out.println( hours + ":" + minutes + ":" + seconds);

		}

		System.out.println("KLART!");
		this.running = false;


	}

	public void start(int time) {

		if (!running) {

			this.time = time;

			thread.start();

		}		
	}


	public void stop() {
		
		this.thread = new Thread(r);
		
		this.running = false;
		this.stopper = true;

	}

}
