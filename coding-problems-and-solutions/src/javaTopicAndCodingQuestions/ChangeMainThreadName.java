package javaTopicAndCodingQuestions;

public class ChangeMainThreadName {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread_1");
		System.out.println(Thread.currentThread().getName());
	}
}
