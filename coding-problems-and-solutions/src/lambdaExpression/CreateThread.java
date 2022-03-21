package lambdaExpression;

public class CreateThread {
	public static void main(String[] args) {
		Runnable thread1 = ()-> {
//			this is body of thread
			System.out.println("Hello World");
		};
		
		Thread t1 = new Thread(thread1);
		t1.start();
	}	
}
