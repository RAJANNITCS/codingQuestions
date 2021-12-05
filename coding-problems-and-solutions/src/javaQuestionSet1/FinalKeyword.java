package javaQuestionSet1;

public class FinalKeyword {
	public final int a;
	
	public FinalKeyword(int value) {
		this.a = value;
	}
	
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword(5);
		System.out.println(obj.a);
	}
}
