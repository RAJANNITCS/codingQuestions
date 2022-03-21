package javaQuestionAndTopics;

public class CreateThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("run thread");
	}
	
	public static void main(String[] args) {
		CreateThread obj = new CreateThread();
		obj.run();
	}
}
