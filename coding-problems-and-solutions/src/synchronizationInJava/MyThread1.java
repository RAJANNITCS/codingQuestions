package synchronizationInJava;

public class MyThread1 extends Thread{
	public BookThreaterSheat b; 
	public int seats;
	
	public MyThread1(BookThreaterSheat b, int seats) {
		this.b = b;
		this.seats = seats;
	}
	
	public void run() {
		b.bookSeat(seats);
	}
}
