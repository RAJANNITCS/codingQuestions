package javaTopicAndCodingQuestions;

class BookSeat {
	public int numberOfSeats = 10;
	
	public void bookSeat(int seat) {
		synchronized (this) {
			if (this.numberOfSeats >= seat) {
				this.numberOfSeats -= seat;
				System.out.println("left seats "+ this.numberOfSeats);
			}else {
				System.out.println("Seats can't be booked");
			}
		}
	}
}
public class MovieBookApp extends Thread{
	public static BookSeat obj = new BookSeat();
	public int seats = 10;
	
	@Override
	public void run() {
		obj.bookSeat(this.seats);
	}
	
	public static void main(String[] args) {
		MovieBookApp ram = new MovieBookApp();
		MovieBookApp rohan = new MovieBookApp();
		System.out.println(obj.numberOfSeats);
		ram.seats = 7;
		ram.start();
		System.out.println(obj.numberOfSeats);
		rohan.seats = 6;
		rohan.start();
		
	}
}
