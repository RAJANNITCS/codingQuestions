package arrayProblems;
import java.util.Scanner;

public class LeftRotationRightRotation {
	
	public int sizeOfArray = 0;
	public int[] arr = null;
	public int numberOfElements = 0;
	
	public void addElementsInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array !!");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many value you will enter ?");
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
		}else {
			System.out.println("Array is empty");
		}
	}
	
	public void rightRotation() {
		int tempValue = this.arr[this.numberOfElements - 1];
		
		for (int i = this.numberOfElements; i > 0; i--) {
			this.arr[i] = this.arr[i - 1];
		}
		
		this.arr[0] = tempValue;
	}
	
	public void leftRotation() {
		int tempValue = this.arr[0];
		
		for (int i = 0; i < this.numberOfElements; i++) {
			this.arr[i] = this.arr[i + 1];
		}
		
		this.arr[this.numberOfElements - 1] = tempValue;
	}
	
	public static void main(String[] args) { 
		LeftRotationRightRotation obj = new LeftRotationRightRotation();
		obj.addElementsInArray();
		obj.display();
//		obj.leftRotation();
//		obj.display();
		obj.rightRotation();
		obj.display();
	}

}
