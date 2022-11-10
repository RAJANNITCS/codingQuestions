package simpleJavaProgram;

public class PrintFabonacciNumber {
	
	public void printFabonacciNumber(int num) {
		int sum = 0;
		int first = 0, second = 1;
	
		for (int i = 0; i <= num; i++) {
			
			if (i <= 1) {
				sum = i;
				System.out.println(sum);
			}else {
				sum = first + second;
				first = second;
				second = sum;
				System.out.println(sum);
			}
		}
	}
	
	public static void main(String[] args) {
		PrintFabonacciNumber obj = new PrintFabonacciNumber();
		obj.printFabonacciNumber(8);
	}
}
