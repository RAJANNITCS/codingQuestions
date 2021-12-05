package javaQuestionSet2;

public class ChangeMainThreadName {
	
	public static void main(String[] args) {
		Thread.currentThread().setName("rajan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}
