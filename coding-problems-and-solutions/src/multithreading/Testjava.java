package multithreading;

public class Testjava extends Thread{
	
	@Override
	public void run() {
		System.out.println("thread task");
	}
	
	public static void main(String[] args) {
		Testjava obj = new Testjava();
		obj.start();
	}
}
