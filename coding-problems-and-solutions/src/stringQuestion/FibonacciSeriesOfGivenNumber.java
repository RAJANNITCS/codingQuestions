package stringQuestion;

public class FibonacciSeriesOfGivenNumber {
	
	public static int fibonacciSeries(int number) {
		if (number <= 1) {
			return number;
		}else {
			return fibonacciSeries(number - 2) + fibonacciSeries(number - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacciSeries(6));
	}
}
