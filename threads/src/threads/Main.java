package threads;

import threads.methnods.Counter;
import threads.methnods.ThreadMethods;

public class Main {

	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		ThreadMethods t1 = new ThreadMethods(counter);
		ThreadMethods t2 = new ThreadMethods(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(counter.getVal());
	}

}
