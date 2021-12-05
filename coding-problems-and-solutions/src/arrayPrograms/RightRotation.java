// wap for right rotaiton with number of time;
package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class RightRotation {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,15,16));
	
	public void rightRotation(int numberOfTime) {
		int i = 0; 
		while (i < numberOfTime) {
			int tempValue = 0;
			for (int j = 0; j < this.arr.size() - 1;j++) {
				if (j == 0) {
					tempValue = this.arr.get(j);
					this.arr.set(j, this.arr.get(j + 1));
				}else {
					this.arr.set(j, this.arr.get(j + 1));
				}
			}
			this.arr.set(this.arr.size() - 1, tempValue);
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		RightRotation obj = new RightRotation();
		System.out.println(obj.arr);
		obj.rightRotation(2);
		System.out.println(obj.arr);
	}
}
