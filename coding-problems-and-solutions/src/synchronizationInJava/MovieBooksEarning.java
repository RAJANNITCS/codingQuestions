package synchronizationInJava;

public class MovieBooksEarning {
	public static void main(String[] args) throws InterruptedException {
		TotalEarning t1 = new TotalEarning();
		t1.start();
//		System.out.println(t1.total);
		
		synchronized (t1) {
			t1.wait();
			System.out.println(t1.total);
		}
	}
}
