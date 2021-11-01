package queue;

public class CreatingQueueUsingTwoStack {
	
	public int[] data = {6,3,9,5,4,2,8,12,10};
	public int[] s1 = new int[15];
	public int[] s2 = new int[15];
	public int s1rear = -1;
	public int s2rear = 0;
	
	public void pushS1(int data) {
		if(this.s1rear != this.s1.length) {
			this.s1rear++;
			this.s1[s1rear] = data;
		}
	}
	
	public int popS1() {
		int value = -1;
		if(this.s1rear != -1) {
			value = this.s1[this.s1rear];
			this.s1[this.s1rear] = 0;
			this.s1rear--;
		}
		return value;
	}
	
	public void pushs2(int data) {
		if (this.s2rear != this.s2.length) {
			this.s2rear++;
			this.s2[this.s2rear] = data;
		}
	}
	
	public int popS2() {
		int value = -1;
		if (this.s2rear != -1) {
			value = this.s2[this.s2rear];
			this.s2[this.s2rear] = 0;
			this.s2rear--;
		}
		return value;
	}
	
	public static void main(String[] args) {
		CreatingQueueUsingTwoStack obj = new CreatingQueueUsingTwoStack();
		for (int i = 0; i < obj.data.length; i++) {
			obj.pushS1(obj.data[i]);
		}
		while (obj.s1rear != -1) {
			obj.pushs2(obj.popS1());
		}
		System.out.println("delete value is "+ obj.popS2());
		System.out.println("delete value is "+ obj.popS2());
		System.out.println("delete value is "+ obj.popS2());
	}
}
