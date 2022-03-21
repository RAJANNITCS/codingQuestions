package arrayCodingQuestion;

public class OccureNBytwo {
	public int[] arr = {2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4};
	
	public void occureNbyTwo() {
		int value = 0;
		int count = 0;
		for (int i = 0; i < this.arr.length; i++) {
			if (value == this.arr[i]) {
				if (count != (this.arr.length / 2)) {
					count++;
				}else {
					System.out.println(value +" "+count);
					return;
				}
			}else {
				value = this.arr[i];
				count = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		OccureNBytwo obj = new OccureNBytwo();
		obj.occureNbyTwo();
	}
}
