package arrayCodingQuestions.java;
import java.util.ArrayList;

public class ReverseNumber {
	int number = 23456789;
	
	public void reverse() {
		int reverse = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		
		number = reverse;
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.reverse();
		
	}
}
