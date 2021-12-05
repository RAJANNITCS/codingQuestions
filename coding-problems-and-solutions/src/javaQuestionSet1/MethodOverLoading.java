package javaQuestionSet1;

public class MethodOverLoading {
	
	public int sumOfNumber(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int sumOfNumber(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println(obj.sumOfNumber(2, 5));
		System.out.println(obj.sumOfNumber(2, 4, 6));
	}
}
