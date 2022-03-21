package javaQuestionAndTopicsPractice;

public class OverloadStaticMethod {
	
	public static int sumOfNumber(int num1, int num2) {
		return (num1 + num2);
	}
	
	public static int sumOfNumber(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfNumber(22, 23));
		System.out.println(sumOfNumber(22, 33, 44));
	}
}
