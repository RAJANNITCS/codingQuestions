package lambdaExpression;

class SumOfNumber implements SumOf {

	@Override
	public int sum(int num1, int num2) {
		return (num1 + num2);
	}
	
}
public class MainTest {
	public static void main(String[] args) {
		SumOfNumber obj = new SumOfNumber();
		System.out.println(obj.sum(2, 4));
	}
}
