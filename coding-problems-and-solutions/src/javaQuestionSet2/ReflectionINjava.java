package javaQuestionSet2;

public class ReflectionINjava {
	
	public int sum(int num1, int num2) {
		return (num1+num2);
	}
	
	public static void main(String[] args) {
		ReflectionINjava obj = new ReflectionINjava();
		Class cls = obj.getClass();
		System.out.println(cls.getModule());
	}
}
