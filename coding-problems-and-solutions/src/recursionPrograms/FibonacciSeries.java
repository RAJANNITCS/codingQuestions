package recursionPrograms;

public class FibonacciSeries {
	
	public int fibonacciNumber (int number) {
		if (number <= 1) {
			return number;
		}else {
			return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
		}
	}
	
	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		System.out.println(obj.fibonacciNumber(6));
	}
}
