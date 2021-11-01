package arrayProblems;

public class CircularQueue {
	
	public int[] queueArr = new int[4];
	public int front = 0;
	public int rear = 0;
	
	public void enqueue(int data) {
		if ((this.rear + 1) % this.queueArr.length  != this.front) {
			this.rear = ((this.rear + 1) % this.queueArr.length);
			this.queueArr[this.rear] = data;
		}else {
			System.out.println("Queue is full");
		}
	}
	
	public int dequeue() {
		int value = -1;
		if (this.rear == this.front) {
			System.out.println("Queue is empty");
		}else {
			this.front = (this.front + 1) % this.queueArr.length;
			value = this.queueArr[this.front];
		}
		return value;
	}
	
	public void diplayQueue() {
		int i = this.front;
		while (i != this.rear) {
			i = (i + 1) % this.queueArr.length;
			System.out.println(this.queueArr[i]);
		}
	}
	
	public void isFull() {
		if ((this.rear + 1) % this.queueArr.length  == this.front) {
			System.out.println("Queue is full");
		}
	}
	
	public void isEmpty() {
		if ((this.rear + 1) % this.queueArr.length  != this.front) {
			System.out.println("Queue is empty");
		}
	}
	
	public static void main(String[] args) {
		CircularQueue obj = new CircularQueue();
		obj.enqueue(2);
		obj.enqueue(4);
		obj.enqueue(6);
		System.out.println("delete value is "+ obj.dequeue());
//		obj.enqueue(8);
//		obj.enqueue(9);
		obj.diplayQueue();
		obj.isFull();
		obj.isEmpty();
		
	}
}
