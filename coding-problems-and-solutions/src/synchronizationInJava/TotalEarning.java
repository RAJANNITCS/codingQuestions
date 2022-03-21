package synchronizationInJava;

public class TotalEarning extends Thread{
	public int total = 0;
	
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				this.total += 100;
			}
			this.notify();
		}
		
	}
}
