package arrayCodingQuestion;

public class FindequilibreamIndex {
	public int[] arr = {10,5,15,3,4,21,2};
	
	public void findequilibreamIndex() {
		int first = 0, last = this.arr.length - 1;
		int firstSum = this.arr[first], lastSum = this.arr[last];
		while (first < last) {
			if (firstSum < lastSum) {
				firstSum += this.arr[first];
				first++;
			}else if(firstSum > lastSum){
				lastSum += this.arr[last];
				last--;
			}else {
				break;
			}
		}
		System.out.println("index is"+ first);
	}
	
	public static void main(String[] args) {
		FindequilibreamIndex obj = new FindequilibreamIndex();
		obj.findequilibreamIndex();
	}
}
