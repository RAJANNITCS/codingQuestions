package javaQuestionAndTopics;

public class SwapTwoNumber {
	
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 40;
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println(num1 +" "+num2);
	}
}
