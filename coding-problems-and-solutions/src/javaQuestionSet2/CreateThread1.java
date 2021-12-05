package javaQuestionSet2;

public class CreateThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("thread run");
	}
	
	public static void main(String[] args) {
		CreateThread1 obj = new CreateThread1();
		Thread obj1 = new Thread(obj);
		obj1.start();
	}
}
