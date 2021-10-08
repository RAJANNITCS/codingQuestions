package arrayProblems;
import java.util.Scanner;

public class GetSetMinMaxReverse {
	
	public int[] arr = null;
	public int sizeOfArray = 0;
	public int numberOfElements;
	
	public void addElementsInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array !!");
		this.sizeOfArray = sc.nextInt();
		this.arr = new int[this.sizeOfArray];
		System.out.println("How many value you will enter !!");
		this.numberOfElements = sc.nextInt();
		System.out.println("Enter array elements !!");
		for (int i = 0; i < this.numberOfElements; i++) {
			this.arr[i] = sc.nextInt();
		}
 	}
	
	public int getElement(int index) {
		if (this.arr.length != 0) {
			return this.arr[index];
		}else {
			System.out.println("Array is Empty");
		}
		
		return -1;
	}
	
	public void setElement(int value, int index) {
		if (this.sizeOfArray > index) {
			this.arr[index] = value;
		}else {
			System.out.println("Given index is not currect");
		}
	}
	
	public int findMinValue() {
		int minValue = this.arr[0];
		
		for (int i = 0; i < this.numberOfElements; i++) {
			if (minValue > this.arr[i]) {
				minValue = this.arr[i];
			}
		}
		
		return minValue;
	}
	
	public int findMaxValue() {
		int maxValue = this.arr[0];
		
		for (int i = 0; i < this.numberOfElements; i++) {
			if (this.arr[i] > maxValue) {
				maxValue = this.arr[i];
			}
		}
		
		return maxValue;
	}
	
	public int[] reverseWithArray() {
		int[] temp = new int[this.numberOfElements];
		
		for (int i = this.numberOfElements - 1,j = 0; i >= 0; i--,j++) {
			temp[j] = this.arr[i];
		}
		
		return temp;
	}
	
	public void reverseArray() {
		
		for (int i = this.numberOfElements - 1, j = 0; j < i ; i--, j++) {
			int temp = this.arr[i];
			this.arr[i] = this.arr[j];
			this.arr[j] = temp;
		}
	}
	
	public void display() {
		
		if (this.numberOfElements > 0) {
			System.out.println("Array elements");
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}else {
			System.out.println("Array is empty");
		}
	}
	
	public static void main(String[] args) {
		GetSetMinMaxReverse obj = new GetSetMinMaxReverse();
		obj.addElementsInArray();
		obj.display();
//		System.out.println("Elements is "+ obj.getElement(4));
//		obj.setElement(55, 4);
//		obj.display();
//		System.out.println("min value is"+ obj.findMinValue());
//		System.out.println("max value is"+ obj.findMaxValue());
//		
//		int[] arr1 = null;
//		arr1 = obj.reverseWithArray();
//		System.out.println("Reverse array is");
//		for (int value: arr1) {
//			System.out.println(value);
//		}
		
		obj.reverseArray();
		obj.display();
	}
}
