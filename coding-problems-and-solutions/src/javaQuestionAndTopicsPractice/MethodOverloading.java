package javaQuestionAndTopicsPractice;

public class MethodOverloading {
	
	public int sumOfNumber(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int sumOfNumber(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.sumOfNumber(22, 44));
		System.out.println(obj.sumOfNumber(22, 44, 66));
	}
}
