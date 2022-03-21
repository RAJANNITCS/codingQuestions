package lambdaExpression;

interface SumOfNumb {
	public int sumOfTwoNumber(int n1, int num2);
}

//class NumberSum implements SumOfNumb {
//
//	@Override
//	public int sumOfTwoNumber(int num1, int num2) {
//		return (num1 + num2);
//	}
//	
//}

public class LamdaExpressionExample {
	public static void main(String[] args) {
//		NumberSum obj = new NumberSum();
//		System.out.println(obj.sumOfTwoNumber(2, 3));
		SumOfNumb sum = (int n1,int n2)->{return (n1+n2);};
		System.out.println(sum.sumOfTwoNumber(5, 6));
	}
}
