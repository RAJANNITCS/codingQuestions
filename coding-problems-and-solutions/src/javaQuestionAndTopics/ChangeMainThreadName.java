package javaQuestionAndTopics;

public class ChangeMainThreadName {
	public static void main(String[] args) {
		Thread.currentThread().setName("not main");
		System.out.println(Thread.currentThread().getName());
	}
}
