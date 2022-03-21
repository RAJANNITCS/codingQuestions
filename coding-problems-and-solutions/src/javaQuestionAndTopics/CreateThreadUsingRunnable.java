package javaQuestionAndTopics;

public class CreateThreadUsingRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("run thread");
	}
	
	public static void main(String[] args) {
		CreateThreadUsingRunnable obj = new CreateThreadUsingRunnable();
		Thread obj1 = new Thread(obj);
		obj1.run();
	}
}
