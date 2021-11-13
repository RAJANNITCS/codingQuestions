package sorting;

public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int hig) {
		if (low < hig) {
			int pi = partition(arr, low, hig);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, hig);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int low, int hig) {
		int pivot = arr[hig];
		
		int i = (low - 1);
		
		for (int j = low; j <= hig -1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, hig);
		return (i+1);
	}
	
	public static void printArray(int[] arr, int size) {
		for (int i = 0 ; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array is");
		printArray(arr, n);
	}
}
