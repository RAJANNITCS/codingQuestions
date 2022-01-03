package javaTopic;

public class SwapTwoNumberWithoutThirdVariable {
	
	public int value1 = 10;
	public int value2 = 20;
	
	public void swapTwoNumber() {
		this.value1 += value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
	}
	
	public static void main(String[] args) {
		SwapTwoNumberWithoutThirdVariable obj = new SwapTwoNumberWithoutThirdVariable();
		obj.swapTwoNumber();
		System.out.println("value 1= " + obj.value1);
		System.out.println("Value 2= " + obj.value2);
	}
}
