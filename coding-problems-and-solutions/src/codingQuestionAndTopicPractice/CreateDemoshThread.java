package codingQuestionAndTopicPractice;

public class CreateDemoshThread extends Thread{
	
	@Override 
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("this is daemon thread");
		}else {
			System.out.println("user thread");
		}
	}
	
	public static void main(String[] args) {
		CreateDemoshThread obj = new CreateDemoshThread();
		obj.setDaemon(true);
		obj.run();
		obj.start();
	}
}
