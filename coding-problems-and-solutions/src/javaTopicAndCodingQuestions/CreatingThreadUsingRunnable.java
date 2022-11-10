package javaTopicAndCodingQuestions;

public class CreatingThreadUsingRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("start thread");
	}
	
	public static void main(String[] args) {
		CreatingThreadUsingRunnable obj = new CreatingThreadUsingRunnable();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}