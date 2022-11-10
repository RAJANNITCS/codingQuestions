package synchronization;

public class MyThread2 extends Thread{
	BooksThreaterSeatsV1 bs;
	int seats = 0;
	
	public MyThread2(BooksThreaterSeatsV1 obj, int seats) {
		this.bs = obj;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		bs.booksThreaterSeats(seats);
	}
}
