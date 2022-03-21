package codingQuestionAndTopicPractice;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello World!1");
		Thread.currentThread().setName("rajan");
		System.out.println(Thread.currentThread().getName());
	}
}
