package arrayProblems;
import java.util.Scanner;

public class InsertValueAtShortedPostion {
	
	public int sizeOfArray = 0;
	public int[] arr = null;
	public int numberOfElementInArray = 0;
	
	public void addElementInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array !!");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many elements you will enter ?");
		this.numberOfElementInArray = sc.nextInt();
		System.out.println("Enter array elements");
		for (int i = 0; i < this.numberOfElementInArray; i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void displayArray() {
		if (this.numberOfElementInArray > 0) {
			System.out.println("Array elements are");
			for (int i = 0; i < this.numberOfElementInArray; i++) {
				System.out.println(this.arr[i]);
			}
		}else {
			System.out.println("Array is empty");
		}
	}
	
	public void insertAtShotedPosition(int value) {
		int i = this.numberOfElementInArray - 1;
		while (i >= 0 && this.arr[i] > value) {
			this.arr[i + 1] = this.arr[i];
			i--;
		}
		this.arr[i + 1] = value;
		this.numberOfElementInArray++;
	}
	

	public static void main(String[] args) {
		InsertValueAtShortedPostion obj = new InsertValueAtShortedPostion();
		obj.addElementInArray();
		obj.displayArray();
		obj.insertAtShotedPosition(0);
		obj.displayArray();
	}
}
