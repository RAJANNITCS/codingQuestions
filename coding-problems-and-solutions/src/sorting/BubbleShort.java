package sorting;

public class BubbleShort {
	public int[] arr = new int[]{8,5,7, 3,2};
	
	public void bubbleShort() {
		int flag;
		for (int i = 0; i < this.arr.length - 1; i++) {
			flag = 0;
			for (int j = i + 1; j < this.arr.length; j++) {
				if (this.arr[i] > this.arr[j]) {
					int temp = this.arr[i];
					this.arr[i] = this.arr[j];
					this.arr[j] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
	}
	
	public void display() {
		for (int i : this.arr) {
			System.out.println(i);
		}
	}
	    
	public static void main(String[] args) {
		BubbleShort obj = new BubbleShort();
		obj.bubbleShort();
		obj.display();
	}
}
