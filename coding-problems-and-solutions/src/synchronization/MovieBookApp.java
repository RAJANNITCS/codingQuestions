package synchronization;

public class MovieBookApp {
	public static void main(String[] args) {
		BooksThreaterSeatsV1 obj = new BooksThreaterSeatsV1();
		MyThread1 t1 = new MyThread1(obj, 7);
		MyThread2 t2 = new MyThread2(obj, 3);
		t1.start();
		t2.start();
		
		BooksThreaterSeatsV1 obj_1 = new BooksThreaterSeatsV1();
		MyThread1 t3 = new MyThread1(obj_1, 7);
		MyThread2 t4 = new MyThread2(obj_1, 3);
		t3.start();
		t4.start(); 
	}
}
 