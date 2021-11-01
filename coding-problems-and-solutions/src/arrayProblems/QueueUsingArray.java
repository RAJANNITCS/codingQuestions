package arrayProblems;

public class QueueUsingArray {
	
	public int[] queueArr = new int[10];
	public int length = 0;
	
	public void enqueue(int data) {
		if (this.length != this.queueArr.length) {
			this.queueArr[this.length] = data;
			this.length++;
		}else {
			System.out.println("Queue is full");
		}
	}
	
	public int dequeue() {
		int value = 0;
		if (this.length != 0) {
			value = this.queueArr[0];
			this.length--;
			for (int i = 0; i < this.length; i++) {
				this.queueArr[i] = this.queueArr[i+1];
			}
		}else {
			System.out.println("Queue is empty");
		}
		
		return value;
	}
	
	public void display() {
		if (this.length != 0) {
			for (int i = 0; i < this.length; i++) {
				System.out.println(this.queueArr[i]);
			}
 		}else {
 			System.out.println("Queue is empty");
 		}
	}
	
	public void isEmpty() {
		if (this.length == 0) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("Queue is not empty");
		}
	}
	
	public int firstValue() {
		if (this.length != 0) {
			return this.queueArr[0];
		}
		return -1;
	}
	
	public int lastValue() {
		if (this.length != 0) {
			return this.queueArr[this.length - 1];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		QueueUsingArray obj = new QueueUsingArray();
		obj.enqueue(2);
		obj.enqueue(4);
		obj.display();
		System.out.println("remove elements is "+ obj.dequeue());
		System.out.println("first value is "+ obj.firstValue());
		obj.enqueue(9);
		System.out.println("last value is "+ obj.lastValue());
		obj.display();
		
	}
	
}
