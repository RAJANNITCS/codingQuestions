// Performing single task from multiple threads
package javaQuestionSet2;

public class MultithreadingCase2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Perform single task from multiple threads");
	}
	
	public static void main(String[] args) {
		MultithreadingCase2 obj = new MultithreadingCase2();
		obj.start();
		MultithreadingCase2 obj1 = new MultithreadingCase2();
		obj1.start();
	}
}
