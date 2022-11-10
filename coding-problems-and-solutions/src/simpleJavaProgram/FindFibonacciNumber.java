package simpleJavaProgram;

public class FindFibonacciNumber {

	public int findFibonacciNumber(int num) {
		if (num <= 1) {
			return num;
		} else {
			return findFibonacciNumber(num - 2) + findFibonacciNumber(num - 1);
		}
	}

	public int findFiboonacciNumberV2(int num) {
		int sum = 0;
		int first = 0;
		int second = 1;

		for (int i = 0; i <= num; i++) {
			if (i <= 1) {
				sum = i;
			} else {
				sum = first + second;
				first = second;
				second = sum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		FindFibonacciNumber obj = new FindFibonacciNumber();
//		System.out.println(obj.findFibonacciNumber(8));
		System.out.println(obj.findFiboonacciNumberV2(8));
	}
}
