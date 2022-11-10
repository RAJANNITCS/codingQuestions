package javaTopicAndCodingQuestions;

@FunctionalInterface
interface SumOfNumberInt {
	
	public int sumOfNumber(int num1, int num2);
	
}

public class SumOfNumber {
	public static void main(String[] args) {
		SumOfNumberInt obj = (int num1, int num2)-> {
			return (num1 + num2);
		};
		
		System.out.println(obj.sumOfNumber(10, 20));
	}
}
