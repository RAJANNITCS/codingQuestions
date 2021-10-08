package arrayProblems;
import java.util.Scanner;

public class SiftRightSiftLift {
	
	public int sizeOfArray = 0;
	public int[] arr = null;
	public int numberOfElements = 0;
	
	public void addElements() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size !!");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many elements you will enter ?");
		this.numberOfElements = sc.nextInt();
		System.out.println("Enter array elements");
		for (int i = 0; i < this.numberOfElements; i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void display() {
		if (this.numberOfElements > 0) {
			System.out.println("Array elements are");
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public int shiftRight() {
		int shiftValue = this.arr[this.numberOfElements - 1];
		
		for (int i = this.numberOfElements - 1; i > 0; i--) {
			this.arr[i] = this.arr[i - 1];
		}
		
		this.arr[0] = 0;
		
		return shiftValue;
	}
	
	public int shiftLeft() {
		int shiftValue = this.arr[0];
		
		for (int i = 0; i < this.numberOfElements; i++) {
			this.arr[i] = this.arr[i + 1];
		}
		
		this.arr[this.numberOfElements - 1] = 0;
		
		return shiftValue;
	}
	
	public static void main(String[] args) {
		SiftRightSiftLift obj = new SiftRightSiftLift();
		obj.addElements();
		obj.display();
//		System.out.println("right shift value is " + obj.shiftRight());
//		obj.display();
		System.out.println("left shift value " + obj.shiftLeft());
		obj.display();
		
	}
}
