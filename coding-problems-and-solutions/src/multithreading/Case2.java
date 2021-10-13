package multithreading;

//2. performing single task from multiple thread
public class Case2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("thread");
	}
	
	public static void main(String[] args) {
		Case2 obj = new Case2();
		obj.start();
		Case2 obj1 = new Case2();
		obj1.start();
	}
}
