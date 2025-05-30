package om.one.com;


class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(long i = 0;i<10000000;i++) {
			System.out.println("task: " +  i);
		}
	}
	
}


public class StartedLearning extends Thread{
			
	@Override
	public void run() {
		try {
			System.out.println("running thred");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		StartedLearning sl = new StartedLearning();
		Runnable task = new MyRunnable();
		Thread t2 = new Thread(task);
		Thread t1 = new Thread(()->{
			for(long i = 0;i<10000000;i++) {
				System.out.println("hello: " +  i);
			}
		});
		t1.start();
		t2.start();
		
		sl.start();
	}

}
