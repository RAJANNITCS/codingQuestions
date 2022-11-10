package simpleJavaProgram;

public class SwapTwoNumber {
	public int number1 = 10;
	public int number2 = 20;
	
	public void swapTwoNumber() {
		this.number1 = this.number1 + this.number2;
		this.number2 = this.number1 - this.number2;
		this.number1 = this.number1 - this.number2;
		
	}
	
	public static void main(String[] args) {
		SwapTwoNumber obj = new SwapTwoNumber();
		obj.swapTwoNumber();
		System.out.println(obj.number1);
		System.out.println(obj.number2);
	}
}
