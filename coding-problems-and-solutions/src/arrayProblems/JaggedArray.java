package arrayProblems;

public class JaggedArray {
	
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[5];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 50;
		arr[2][0] = 60;
		arr[2][1] = 70;
		arr[2][2] = 80;
		arr[2][3] = 90;
		arr[2][4] = 100;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
				
	}
}
