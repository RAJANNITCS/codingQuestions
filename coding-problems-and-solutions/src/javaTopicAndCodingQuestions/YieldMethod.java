package javaTopicAndCodingQuestions;

public class YieldMethod extends Thread{
	
	@Override
	public void run() {
		try {
			for (int i = 0 ; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		YieldMethod t1 = new YieldMethod();
		t1.start();
		Thread.yield();
		for (int i = 0 ; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
