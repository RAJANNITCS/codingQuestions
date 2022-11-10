package simpleJavaProgram;

public class FindFactorialOfGivenNumber {
	
	public int findFactorialOfGivenNumberV1(int num) {
		if (num == 0) {
			return 1;
		}else {
			return findFactorialOfGivenNumberV1(num - 1) * num;
		}
	}
	
	public int findFactorialOfGivenNumberV2(int num) {
		int sum = 1;
		while (num != 0) {
			sum = sum * num;
			num--;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		FindFactorialOfGivenNumber obj = new FindFactorialOfGivenNumber();
		System.out.println(obj.findFactorialOfGivenNumberV1(5));
		System.out.println(obj.findFactorialOfGivenNumberV2(5));
	}
}
