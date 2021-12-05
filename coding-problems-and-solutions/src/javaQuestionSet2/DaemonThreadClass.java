package javaQuestionSet2;

public class DaemonThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("daemone thred");
	}
	public static void main(String[] args) {
		DaemonThreadClass obj = new DaemonThreadClass();
		System.out.println("working ");
		obj.setDaemon(true);
		obj.start();
	}
}
