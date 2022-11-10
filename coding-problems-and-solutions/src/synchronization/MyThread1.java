package synchronization;

public class MyThread1 extends Thread{
	BooksThreaterSeatsV1 bs;
	int seats;
	
	public MyThread1(BooksThreaterSeatsV1 bs, int seats) {
		this.bs = bs;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		bs.booksThreaterSeats(seats);
	}
}
