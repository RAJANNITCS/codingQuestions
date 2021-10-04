package javaCode;

public class MethodOverloading {
	
	public int addNumber(int numb1, int numb2) {
		return (numb1 + numb2);
	}
	
	public int addNumber(int numb1, int numb2, int numb3) {
		return (numb1 + numb2 + numb3);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println("Sum of Two number" + obj.addNumber(5, 10));
		System.out.println("Sum of Three number "+ obj.addNumber(5, 10, 15));
	}
}
