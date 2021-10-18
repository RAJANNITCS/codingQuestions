package stack;
import java.util.Scanner;

public class CreateStackAndPushPop {
	
	public int[] stackS1 = null;
	public int top = 0;
	public int sizeOfStack = 0;
	
	public void createStack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack");
		this.sizeOfStack = sc.nextInt();
		this.stackS1 = new int[this.sizeOfStack];
		System.out.println("how many value you will enter");
		this.top = sc.nextInt();
		System.out.println("Enter value in stack");
		for (int i = 0; i < this.top; i++) {
			this.stackS1[i] = sc.nextInt();
		}
		this.top--;
	}
	
	public void pushInStack(int value) {
		if (this.sizeOfStack > this.top) {
			this.stackS1[this.top + 1] = value;
			this.top++;
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public int popFromStack() {
		int value = 0;
		if (this.top == 0) {
			System.out.println("Stack is empty");
		}else {
			value = this.stackS1[top];
			this.top--;
		}
		return value;
	}
	
	public void displayStack() {
		System.out.println("stack display");
		for (int i = top; i >= 0; i--) {
			System.out.println(this.stackS1[i]);
		}
	}
	
	public static void main(String[] args) {
		CreateStackAndPushPop obj = new CreateStackAndPushPop();
		obj.createStack();
		obj.displayStack();
		obj.pushInStack(18);
		obj.displayStack();
		System.out.println("pop from stack="+obj.popFromStack());
		obj.displayStack();
	}
}
