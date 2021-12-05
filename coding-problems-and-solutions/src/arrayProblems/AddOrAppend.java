package arrayProblems;

import java.util.Scanner;

public class AddOrAppend {
	
	public int sizeOfArray;
	public int[] arr;
	public int numOfValueInArray = 0;
	
	
	public void addDataInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array.");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many value you will enter ?");
		this.numOfValueInArray = sc.nextInt();
		System.out.println("Enter array value !!");
		for (int i = 0; i < numOfValueInArray; i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void displayArray() {
		if (this.numOfValueInArray != 0) {
			System.out.println("Array elements are.");
			for (int i = 0; i < this.numOfValueInArray; i++) {
				System.out.println(arr[i]);
			}
		}else {
			System.out.println("Array is empty.");
		}
	}
	
	public void appendData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of append !!");
		int value = sc.nextInt();
		this.arr[this.numOfValueInArray] = value;
		this.numOfValueInArray++;
	}
	
	public static void main(String[] args) {
		AddOrAppend obj = new AddOrAppend();
		obj.addDataInArray();
		obj.displayArray();
		obj.appendData();
		obj.displayArray();
	}
	
}
