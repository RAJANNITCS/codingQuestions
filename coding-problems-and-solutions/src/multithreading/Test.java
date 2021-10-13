package multithreading;

public class Test implements Runnable{

	@Override
	public void run() {
		System.out.println("this is thread");	
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		Thread objThread = new Thread(obj);
		objThread.start();
		
		System.out.println(Thread.currentThread());
		
	}

}
  