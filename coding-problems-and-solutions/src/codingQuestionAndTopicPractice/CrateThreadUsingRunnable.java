package codingQuestionAndTopicPractice;

public class CrateThreadUsingRunnable implements Runnable{
	
	@Override 
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		CrateThreadUsingRunnable obj  = new CrateThreadUsingRunnable();
		Thread obj1 = new Thread(obj);
		obj1.run();
	}
}
