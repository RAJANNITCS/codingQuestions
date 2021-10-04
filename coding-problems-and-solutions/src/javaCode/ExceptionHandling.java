package javaCode;

public class ExceptionHandling {
	public int num1 = 100, num2 = 0, num3;

	public int devide() {
		num3 = (num1 / num2);
		return num3;
	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		
		try {
			obj.devide();
		} catch (Exception e) {
			System.out.println("You can't devide with zero");
		}
		
		System.out.println("Hello world !!");

	}
   
}
