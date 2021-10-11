package collectionsFrameworkProblems;

public class Test {
	public int[] arr = new int[5];
	public int[] arr1 = new int[10];
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.arr = obj.arr1;
		System.out.println(obj.arr.length);
	}
}
  