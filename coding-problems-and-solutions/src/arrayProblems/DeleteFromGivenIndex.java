package arrayProblems;
import java.util.Scanner;

public class DeleteFromGivenIndex {
	
	public int sizeOfArray = 0;
	public int[] arr = null;
	public int numberOfeleInArray = 0;
	
	public void addElementInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many value you will Enter ?");
		this.numberOfeleInArray = sc.nextInt();
		System.out.println("Enter array elements !!");
		for (int i = 0; i < this.numberOfeleInArray; i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void displayArray() {
		if (this.numberOfeleInArray != 0) {
			System.out.println("Array elements are!!");
			for (int i = 0; i < this.numberOfeleInArray; i++) {
				System.out.println(this.arr[i]);
			}
		}else {
			System.out.println("Array is empty !!");
		}
	}
	
	public int deleteAtPosition(int index) {
		int value = this.arr[index];
		for (int i = index; i < this.numberOfeleInArray - 1; i++) {
			this.arr[i] = this.arr[i + 1];
		}
		return value;
	}
	public static void main(String[] args) {
		DeleteFromGivenIndex obj = new DeleteFromGivenIndex();
		obj.addElementInArray();
		obj.displayArray();
		System.out.println("Delete value is " + obj.deleteAtPosition(3));
		obj.displayArray();
	}
}
