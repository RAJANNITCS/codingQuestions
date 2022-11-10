package javaTopicAndCodingQuestions;

public class CreateThreadUsingThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("start thread");
	}
	
	public static void main(String[] args) {
		CreateThreadUsingThreadClass t1 = new CreateThreadUsingThreadClass();
		t1.start();
	}
}

