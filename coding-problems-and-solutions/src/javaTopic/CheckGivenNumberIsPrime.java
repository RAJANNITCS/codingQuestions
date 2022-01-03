package javaTopic;

public class CheckGivenNumberIsPrime {
		
	public boolean checkGivenNumberIsPrimeV1(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		CheckGivenNumberIsPrime obj = new CheckGivenNumberIsPrime();
		System.out.println(obj.checkGivenNumberIsPrimeV1(19));
		System.out.println(obj.checkGivenNumberIsPrimeV1(49));
	}
}
