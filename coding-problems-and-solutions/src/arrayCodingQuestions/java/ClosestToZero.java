package arrayCodingQuestions.java;
import java.util.Arrays;

public class ClosestToZero {
	public int[] arr = {-2,9,6,1,2,-5};
	
	public void  findTwoElements() {
		int front = 0, rear = arr.length - 1;
		int num1 = 0 , num2 =  0, sum = 0;
		
		// sort array start
		Arrays.sort(arr);
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		// sort array end
		
		num1 = arr[front]; num2 = arr[rear]; sum = arr[rear] + arr[front];
		
		while (front < rear) {
			if (sum > 0) {
				rear--;
				num2 = arr[rear];
				sum = num1 + num2;
			}else if (sum < 0){
				front++;
				num1 = arr[front];
				sum = num1 + num2;
			}else {
				break;
			}
		}
		
		System.out.println(num1+" "+num2+" "+sum);
	}
	
	public static void main(String[] args) {
		ClosestToZero obj = new ClosestToZero();
		obj.findTwoElements();
	}
}
