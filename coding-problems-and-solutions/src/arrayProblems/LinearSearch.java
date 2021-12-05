package arrayProblems;

public class LinearSearch {
	
	public int[] arr = null;
			
	
	public int linearSearch(int value) {
		this.arr = new int[]{10, 20, 30, 40, 50, 60};
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		System.out.println("Index is "+obj.linearSearch(30));
	}
}
