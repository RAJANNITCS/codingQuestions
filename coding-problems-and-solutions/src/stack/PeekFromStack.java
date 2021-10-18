package stack;
import java.util.Scanner;

public class PeekFromStack {
	
	public int[] stackS1 = null;
	public int sizeOfStack = 0;
	public int top = 0;
	
	public void addValueInStack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of stack");
		this.sizeOfStack = sc.nextInt();
		this.stackS1 = new int[this.sizeOfStack];
		System.out.println("How many value you will enter ?");
		this.top = sc.nextInt();
		System.out.println("Enter Stack value");
		for (int i = 0; i < top; i++) {
			this.stackS1[i] = sc.nextInt();
		}
		this.top--;
	}
	
	public void pushInStack(int value) {
		if (this.top >= this.sizeOfStack - 1) {
			System.out.println("Stack is full");
		}else {
			this.top++;
			this.stackS1[top] = value;
		}
	}
	
	public int peekFromStack(int index) {
		int value = 0;
		if (this.top == 0) {
			System.out.println("Stack is empty");
		}else {
			value = this.stackS1[this.top - index + 1];
		}
		
		return value;
	}
	
	public int stackTopValue() {
		int topOfStackValue = 0;
		if (this.top == 0) {
			System.out.println("Stack is empty");
		}else {
			topOfStackValue = this.stackS1[this.top];
		}
		
		return topOfStackValue;
	}
	
	public int popFromStack() {
		int value = 0;
		if (this.top == 0) {
			System.out.println("Stack is empty");
		}else {
			value = this.stackS1[this.top];
			this.top--;
		}
		return value;
	}
	
	public void displayStack() {
		System.out.println("Stack is");
		for (int i = top; i >= 0; i--) {
			System.out.println(this.stackS1[i]);
		}
	}
	
	public void isEmpty() {
		if (this.top == 0) {
			System.out.println("Stack is empty");
		}
	}
	
	public void isFull() {
		if (this.top >= this.sizeOfStack - 1) {
			System.out.println("Stack is full");
		}
	}
	
	public static void main(String[] args) {
		PeekFromStack obj = new PeekFromStack();
		obj.addValueInStack();
		obj.displayStack();
//		obj.pushInStack(22);
//		obj.displayStack();
//		System.out.println("pop value is "+ obj.popFromStack());
//		obj.displayStack();
//		System.out.println("peek value is 3 = "+ obj.peekFromStack(3));
//		System.out.println("Stack top value is "+ obj.stackTopValue());
//		obj.popFromStack();
//		obj.popFromStack();
		obj.pushInStack(2);
		obj.pushInStack(4);
		obj.pushInStack(8);
		obj.isEmpty();
		obj.isFull();
		
		
	}
}
