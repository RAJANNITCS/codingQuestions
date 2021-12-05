package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class FindNbyTwoTime {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,2,3,3,3,3,3,3,3,3,3,5,5));
	
	public void findNbyTwoTime() {
		int nValue = this.arr.size() / 2;
		int value = this.arr.get(0);
		int count = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			if (this.arr.get(i).equals(value)) {
				if (nValue > count) {
					count++;
				}else {
					System.out.println("value"+value+"count"+count);
					break;
				}
			}else {
				value = this.arr.get(i);
				count = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		FindNbyTwoTime obj = new FindNbyTwoTime();
		obj.findNbyTwoTime();
	}
}
