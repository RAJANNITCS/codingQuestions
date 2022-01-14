package arrayCodingQuestion;

public class LinerarSearch {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public int linsearch(int value) {
		int  index= -1;
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				index = i;
				return index;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		LinerarSearch obj = new LinerarSearch();
		System.out.println(obj.linsearch(10));
	}
}
