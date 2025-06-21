package threads.methnods;

public class ThreadMethods extends Thread{
	Counter counter;
	public ThreadMethods(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
		
		
	}
}
