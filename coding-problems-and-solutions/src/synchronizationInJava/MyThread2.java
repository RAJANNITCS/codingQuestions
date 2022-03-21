package synchronizationInJava;

public class MyThread2 extends Thread{
	public BookThreaterSheat b; 
	public int seats;
	
	public MyThread2(BookThreaterSheat b, int seats) {
		this.b = b;
		this.seats = seats;
	}
	
	public void run() {
		b.bookSeat(seats);
	}
}
