// Perform single task from single thread;
package javaQuestionSet2;

public class MultithreadingCase1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Perform single task from single thread");
	}
	
	public static void main(String[] args) {
		MultithreadingCase1 obj = new MultithreadingCase1();
		obj.start();
	}
}
