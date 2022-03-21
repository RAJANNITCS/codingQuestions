package javaQuestionAndTopics;

public class CreateDaemonThread extends Thread{
	
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemone thred");
		}else {
			System.out.println("user thread");
		}
	}
	
	public static void main(String[] args) {
		CreateDaemonThread obj = new CreateDaemonThread();
		CreateDaemonThread obj1 = new CreateDaemonThread();
		obj.setDaemon(true);
		obj.start();
		obj1.start();
	}
}
