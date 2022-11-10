package javaTopicAndCodingQuestions;

class OnlineEarning extends Thread{
	public int totalEarning = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			try {
				for (int i = 0; i < 10; i++) {
					this.totalEarning += 10;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			this.notify();
		}
	}
}

public class WaitMethod {
	public static void main(String[] args) {
		OnlineEarning obj = new OnlineEarning();
		obj.start();
		synchronized (obj) {
			try {
				obj.wait();
				System.out.println(obj.totalEarning);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
