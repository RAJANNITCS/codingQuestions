package javaTopicAndCodingQuestions;

public class JoinMethod extends Thread{
	
	@Override
	public void run() {
		synchronized (this) {
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JoinMethod obj = new JoinMethod();
		obj.start();
		synchronized (obj) {
			try {
				obj.join();
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
