package synchronization;

public class MethodSynchronization extends Thread{
	public static BookThreaterSeats obj = new BookThreaterSeats();
	int seats = 0;
	
	@Override 
	public void run() {
		obj.bookSeats(seats);
	}
	
	public static void main(String[] args) {
		MethodSynchronization t1 = new MethodSynchronization();
		t1.seats = 15;
		t1.start();
		MethodSynchronization t2 = new MethodSynchronization();
		t2.seats = 10;
		t2.start();
	}
}
