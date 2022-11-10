package synchronization;

public class BookThreaterSeats {
	public int totalSeats = 20;
	
	public synchronized void bookSeats(int seats) {
		if (this.totalSeats >= seats) {
			totalSeats -= seats;
			System.out.println("booked seat");
			System.out.println(this.totalSeats);
		}else {
			System.out.println("you can't book seats");
			System.out.println(this.totalSeats);
		}
	}
}
