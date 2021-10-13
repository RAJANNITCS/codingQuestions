package multithreading;

//4. perform multipla task from multipal thread

class thread1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("thread1");
	}
}

class thread2 extends Thread {
	
	@Override
	public void run() {
		System.out.println("thread2");
	}
}
public class Case4 {
	public static void main(String[] args) {
		thread1 obj = new thread1();
		obj.start();
		thread2 obj1 = new thread2();
		obj1.start();
	}
}
