package arrayCodingQuestion;

public class FindIndexWhereOneStarted {
	public int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};
	
	public void findIndexWhereOneStarted() {
		int first = 0, last = 10;
		while (first < last) {
			if (this.arr[first] == 1) {
				System.out.println(first);
				break;
			}else {
				first++;
				if (first == last) {
					last += 10;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindIndexWhereOneStarted obj = new FindIndexWhereOneStarted();
		obj.findIndexWhereOneStarted();
	}
}
