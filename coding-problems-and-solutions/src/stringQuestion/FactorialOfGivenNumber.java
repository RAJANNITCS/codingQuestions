package stringQuestion;

public class FactorialOfGivenNumber {
	
	public static int factorialOfGivenNumber(int number) {
		if (number == 0) {
			return 1;
		}else {
			return factorialOfGivenNumber(number - 1) * number;
		}
	}
	public static void main(String[] args) {
		System.out.println(factorialOfGivenNumber(3));
	}
}
