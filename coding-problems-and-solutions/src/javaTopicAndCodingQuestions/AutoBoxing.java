package javaTopicAndCodingQuestions;

public class AutoBoxing {
	public static void main(String[] args) {
		int value = 55;
		Integer value_1 = Integer.valueOf(value);
		System.out.println(value_1);
		System.out.println(value_1.getClass().getSimpleName());
	}
}
