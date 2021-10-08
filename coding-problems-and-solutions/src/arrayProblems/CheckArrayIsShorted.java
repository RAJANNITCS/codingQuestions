package arrayProblems;

public class CheckArrayIsShorted {
	
	public int[] arr = {2, 4, 6, 8, 19, 12, 14};
	
	public boolean checkArrayIsShorted() {
		boolean isShorted = true;
		for (int i = 0; i < this.arr.length - 1; i++) {
			if (this.arr[i] > this.arr[i + 1]) { 
				isShorted =false;
				return isShorted;
			}
		}
		return isShorted;
	}
	
	public static void main(String[] args) {
		CheckArrayIsShorted obj = new CheckArrayIsShorted();
		if (obj.checkArrayIsShorted()) {
			System.out.println("Array is shorted");
		}else {
			System.out.println("Array is not shoted");
		}
	}
}
