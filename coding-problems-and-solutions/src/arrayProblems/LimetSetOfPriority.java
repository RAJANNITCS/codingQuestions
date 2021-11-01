package arrayProblems;

public class LimetSetOfPriority {
	
	public int[] q1 = new int[10];
	public int[] q2 = new int[10];
	public int[] q3 = new int[10];
	public int q1rear = 0;
	public int q2rear = 0;
	public int q3rear = 0;
	
	
	public void enQueue(int data, int priority) {
		if (priority == 1) {
			if (this.q1rear != this.q1.length) {
				this.q1[this.q1rear] = data;
				this.q1rear++;
			}else {
				System.out.println("1 priority data full");
			}
		}else if (priority == 2) {
			if (this.q2rear != this.q2.length) {
				this.q2[this.q2rear] = data;
				this.q2rear++;
			}else {
				System.out.println("2 priority data full");
			}
		}else {
			if (this.q3rear != this.q3.length) {
				this.q3[this.q3rear] = data;
				this.q3rear++;
			}else {
				System.out.println("3 priority data full");
			}
		}
	}
	
	public int deQueue() {
		int value = -1;
		if(q1rear != 0) {
			value = this.q1[0];
			for (int i = 0; i < this.q1rear - 1; i++) {
				this.q1[i] = this.q1[i+1];
			}
			this.q1rear--;
			return value;
		}else if(q2rear != 0) {
			value = this.q2[0];
			for (int i = 0; i < this.q2rear - 1; i++) {
				this.q2[i] = this.q2[i+1];
			}
			this.q2rear--;
			return value;
		}else {
			value = this.q3[0];
			for (int i = 0; i < this.q3rear - 1; i++) {
				this.q3[i] = this.q3[i+1];
			}
			this.q3rear--;
			return value;
		}
	}
	
	public static void main(String[] args) {
		LimetSetOfPriority obj = new LimetSetOfPriority();
		obj.enQueue(2, 1);
		obj.enQueue(4, 1);
		obj.enQueue(6, 2);
		obj.enQueue(8, 2);
		obj.enQueue(10, 3);
		obj.enQueue(12, 3);
		System.out.println("value is "+obj.deQueue());
		System.out.println("value is "+obj.deQueue());
		System.out.println("value is "+obj.deQueue());
		System.out.println("value is "+obj.deQueue());
		System.out.println("value is "+obj.deQueue());
		System.out.println("value is "+obj.deQueue());
	}
}
