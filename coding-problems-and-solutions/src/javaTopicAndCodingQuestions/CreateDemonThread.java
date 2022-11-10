package javaTopicAndCodingQuestions;

public class CreateDemonThread extends Thread{
	
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("it is daemon thread");
		}else {
			System.out.println("normal thread");
		}
	}
	
	public static void main(String[] args) {
		CreateDemonThread t1 = new CreateDemonThread();
		CreateDemonThread t2 = new CreateDemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}
