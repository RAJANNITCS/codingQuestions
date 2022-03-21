package codingQuestionAndTopicPractice;

public class CreateThreadUsingThreadClass extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		CreateThreadUsingThreadClass obj = new CreateThreadUsingThreadClass();
		obj.run();
	}
}
