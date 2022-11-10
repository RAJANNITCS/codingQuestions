package javaTopicAndCodingQuestions;

public class PrintFibonacci {
	
	public void printFibonacciSerice(int number) {
		int first = 0;
		int second = 1;
		int sum = 0;
		
		for (int i = 0; i < number; i++) {
			if (i < 1) {
				System.out.println(i);
			}
			first = second;
			second = sum;
			sum = first + second;
			System.out.println(sum);
			
		}
	}
	
	public static void main(String[] args) {
		PrintFibonacci obj = new PrintFibonacci();
		obj.printFibonacciSerice(8);
	}
}
