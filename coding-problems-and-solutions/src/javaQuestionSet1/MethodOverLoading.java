package javaQuestionSet1;

class Sum {
	
	public int sumOfValue(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int sumOfValue(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Sum obj = new Sum();
		System.out.println(obj.sumOfValue(22, 44));
		System.out.println(obj.sumOfValue(22, 44, 55));
	}
}
