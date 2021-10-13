package multithreading;

//1. perform single task from single thread

public class Case1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("single task");
	}
	
	public static void main(String[] args) {
		Case1 obj = new Case1();
		obj.start(); 
	}
}
