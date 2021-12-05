package arrayPrograms;

public class LinearSearchArray {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public int linearSearch(int value) {
		int tempValue = -1;
		if (this.arr.length > 0) {
			for (int i = 0; i < this.arr.length; i++) {
				if (this.arr[i] == value) {
					tempValue = i;
				}
			}
		}
		return tempValue;
	}
	
	public static void main(String[] args) {
		LinearSearchArray obj = new LinearSearchArray();
		if (obj.linearSearch(10) != -1) {
			System.out.println("index value is "+obj.linearSearch(10));
		}else {
			System.out.println("value is not present in array");
		}
	}
}
