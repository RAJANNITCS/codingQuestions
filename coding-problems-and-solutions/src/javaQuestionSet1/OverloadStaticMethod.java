package javaQuestionSet1;

public class OverloadStaticMethod {
	
	public static int sum(int num1, int num2) {
		return (num1 + num2);
	}
	
	public static int sum(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	public static void main(String[] args) {
		System.out.println("Two number sum "+sum(2,3));
		System.out.println("Three number sum "+sum(2,4,6));
	}

}
