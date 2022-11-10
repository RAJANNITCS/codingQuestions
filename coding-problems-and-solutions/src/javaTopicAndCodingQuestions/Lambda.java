package javaTopicAndCodingQuestions;

public class Lambda {
	public static void main(String[] args) {
		Runnable obj = ()-> {
			System.out.println("start thread");
		};
		
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
