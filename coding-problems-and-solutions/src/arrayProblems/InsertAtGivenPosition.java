package arrayProblems;

import java.util.Scanner;

public class InsertAtGivenPosition {
	
	public int sizeOfArray = 0;
	public int[] arr;
	public int numberOfValueInArray = 0;
	
	public void addDataInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size !!");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many value you will enter ?");
		this.numberOfValueInArray = sc.nextInt();
		System.out.println("Enter array elenens10");
		for (int i = 0; i < this.numberOfValueInArray; i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void displayArr() {
		if (this.numberOfValueInArray != 0) {
			System.out.println("Array elements are !!");
			for (int i = 0; i < this.numberOfValueInArray; i++) {
				System.out.println(this.arr[i]);
			}
		}else {
			System.out.println("Array is empty");
		}
	}
	
	public void insertAtPosition(int value, int index) {
		for (int i = this.numberOfValueInArray; i > index; i--) {
			this.arr[i] = this.arr[i - 1];
		}
		this.arr[index] = value;
		this.numberOfValueInArray++;
	}

	public static void main(String[] args) {
		InsertAtGivenPosition obj = new InsertAtGivenPosition();
		obj.addDataInArray();
		obj.displayArr();
		obj.insertAtPosition(25, 2);
		obj.displayArr();
	}
}
