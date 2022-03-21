package arrayCodingQuestion;

public class FindIndexOneStart {
	public int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
	
	public void findIndexOneStart() {
		int i = 0, lengthValue = 10;
		while (i < lengthValue && i < this.arr.length) {
			if (i  != lengthValue - 1) {
				if (this.arr[i] == 1) {
					System.out.println(i);
					break;
				}
			}else {
				lengthValue += 10;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		FindIndexOneStart obj = new FindIndexOneStart();
		obj.findIndexOneStart();
	}
	
}
