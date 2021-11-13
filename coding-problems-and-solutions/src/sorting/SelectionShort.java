package sorting;

public class SelectionShort {
	public int[] arr = new int[] {8,6,3,2,5,4};
	
	public void selectionShort() {
		int j = 0; 
		int k = 0;
		for (int i = 0 ; i < this.arr.length; i++) {
			j = i;
			k = i;
			while (k < this.arr.length) {
				if (this.arr[j] > this.arr[k]) {
					j = k;
				}else {
					k++;
				}
			}
			int temp = this.arr[i];
			this.arr[i] = this.arr[j];
			this.arr[j] = temp;   
		}
	}
	
	public void display() {
		for (int value: this.arr) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		SelectionShort obj = new SelectionShort();
		obj.selectionShort();
		obj.display();
	}
}
