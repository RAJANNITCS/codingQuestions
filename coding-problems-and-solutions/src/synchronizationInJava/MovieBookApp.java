package synchronizationInJava;

public class MovieBookApp extends Thread{
	public static void main(String[] args) {
		BookThreaterSheat b1 = new BookThreaterSheat();
		MyThread1 t1 = new MyThread1(b1, 7);
		t1.start();
		MyThread2 t2 = new MyThread2(b1, 6);
		t2.start();
		
		BookThreaterSheat b2 = new BookThreaterSheat();
		MyThread1 t3 = new MyThread1(b2, 7);
		t3.start();
		MyThread2 t4 = new MyThread2(b2, 6);
		t4.start();
	}
}
