package arrayProblems;

public class QueueUsingArrayTwoPointer {
	
	public int[] queueArr = new int[10];
	public int front = 0;
	public int rear = 0;
	
	public void equeue(int data) {
		if (this.queueArr.length != this.rear) {
			this.queueArr[rear] = data;
			this.rear++;
		}else {
			System.out.println("Queue is full");
		}
	}
	
	public int dequeue() {
		int value = 0;
		if (this.rear != 0) {
			value = this.queueArr[front];
			this.front++;
		}else {
			System.out.println("Queue is empty");
		}
		return value;
	}
	 
	public void display() {
		if (this.rear != 0) {
			for (int i = this.front; i < this.rear; i++) {
				System.out.println(this.queueArr[i]);
			}
 		}else {
 			System.out.println("Queue is empty");
 		}
	}
	
	public void isEmpty() {
		if (this.rear == this.front) {
			System.out.println("Queue is empty");
		}
	}
	
	public void isFull() {
		if (this.rear == this.queueArr.length) {
			System.out.println("Queue is full");
		}
	}
	
	public int firstValue() {
		if (this.rear != 0) {
			return this.queueArr[this.front];
		}
		return -1;
	}
	
	public int rearValue() {
		if (this.rear != 0) {
			return this.queueArr[this.rear];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		QueueUsingArrayTwoPointer obj = new QueueUsingArrayTwoPointer();
		obj.equeue(2);
		obj.equeue(4);
		obj.equeue(6);
		obj.equeue(8);
		obj.equeue(10);
		obj.display();
		System.out.println("delete value is "+ obj.dequeue());
		obj.display();
		
	}
}
