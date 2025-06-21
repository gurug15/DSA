package threads.methnods;

public class Counter {

	int val;
	
	public Counter() {
		this.val = 0;
	}

	public int getVal() {
		return val;
	}

	public synchronized void increment() {
		val = val + 1;
	}
	
	
}
