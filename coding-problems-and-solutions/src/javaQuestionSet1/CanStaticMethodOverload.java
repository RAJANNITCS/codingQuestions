package javaQuestionSet1;

public class CanStaticMethodOverload {
	
	public static int sum(int num1, int num2) {
		return (num1 + num2);
	}
	
	public static int sum(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	public static void main(String[] args) {
		CanStaticMethodOverload obj = new CanStaticMethodOverload();
		System.out.println(obj.sum(2, 4));
		System.out.println(obj.sum(2, 4, 6));
	}
 }
