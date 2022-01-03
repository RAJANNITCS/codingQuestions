package javaTopic;

public class LocalVariableAndInstanceVariable {
	public int[] arr = {2,4,6,8,10,12,14};// instance variable;
	
	public void display() {
		// i is a local variable
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		LocalVariableAndInstanceVariable obj = new LocalVariableAndInstanceVariable();
		obj.display();
	}
}
