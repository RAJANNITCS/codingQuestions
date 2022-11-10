package simpleJavaProgram;

public class CheckGivenNumberIsPrime {
	
	public boolean checkGivenNumberIsPrime(int num) {
		boolean isNuberPrime = true;
		
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				isNuberPrime = false;
				break;
			}
		}
		
		return isNuberPrime;
	}
	
	public static void main(String[] args) {
		CheckGivenNumberIsPrime obj = new CheckGivenNumberIsPrime();
		if (obj.checkGivenNumberIsPrime(31)) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime");
		}
	}
}
