package java8newFeature;

public class SumOfNumberExample {
	public static void main(String[] args) {
		SumInterface twoNumberSum = (int num1,int num2) -> {
			return (num1 + num2);
		};
		
		System.out.println(twoNumberSum.sumOfTwoNumber(22, 33));
		StringLength sizeOfString = (str) -> {
			return str.length();
		};
		
		System.out.println(sizeOfString.lengthOfString("rajan"));
	}
}
