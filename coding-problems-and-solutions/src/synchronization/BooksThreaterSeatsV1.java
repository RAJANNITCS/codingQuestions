package synchronization;

public class BooksThreaterSeatsV1 {
	public static int totalSheats = 20;
	
	public static synchronized void booksThreaterSeats(int seats) {
		if (totalSheats >= seats) {
			totalSheats -= seats;
			System.out.println("left seats "+ totalSheats);
		}else {
			System.out.println("left seats "+ totalSheats);
		}
	}
}
