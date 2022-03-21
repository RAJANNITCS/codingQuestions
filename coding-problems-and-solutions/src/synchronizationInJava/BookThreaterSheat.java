package synchronizationInJava;

public class BookThreaterSheat {
	public static int total_seats = 20;
	
	public synchronized static void  bookSeat(int seats) {	
			if (total_seats >= seats) {
				System.out.println(seats+" seats booked successfully");
				total_seats = total_seats - seats;
				System.out.println("seats left "+ total_seats);
			}else {
				System.out.println("seats can't be booked");
				System.out.println("seats left "+ total_seats);
			}
		}
}
