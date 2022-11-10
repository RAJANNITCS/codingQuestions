package javaTopicAndCodingQuestions;

public class SleepMethod extends Thread{
	
	@Override
	public void run() {
		synchronized (this) {
			try {
				for (int i = 0; i < 100; i++) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		SleepMethod t1 = new SleepMethod();
		t1.start();
	}
}
