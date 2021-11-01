package arrayProblems;

public class CreateDeque {
	
	public int[] deQue = new int[10];
	public int rear = 0;
	
	public void enQueueRear(int data) {
		if (this.rear != this.deQue.length) {
			this.deQue[this.rear] = data;
			this.rear++;
		}else {
			System.out.println("deque is full");
		}
	}
	
	public void display() {
		System.out.println("deque print");
		for (int i = 0; i < this.rear ; i++) {
			System.out.println(this.deQue[i]);
		}
	}
	
	public void enQueueFront(int data) {
		if (this.rear != this.deQue.length) {
			for (int i = this.rear; i > 0; i--) {
				this.deQue[i] = this.deQue[i - 1];
			}
			this.deQue[0] = data;
			this.rear++;
		}else {
			System.out.println("deQue is fulll");
		}
	}
	
	public int dequeueFront() {
		int value = -1;
		if (this.rear != 0) {
			value = this.deQue[0];
			for (int i = 0; i < this.rear - 1; i++) {
				this.deQue[i] = this.deQue[i + 1];
			}
			this.rear--;
		}
		return value;
	}
	
	public int dequeueRear() {
		int value = -1;
		if (this.rear != 0) {
			value = this.deQue[this.rear - 1];
			this.rear--;
		}
		return value;
	}
	
	public static void main(String[] args) {
		CreateDeque obj = new CreateDeque();
		obj.enQueueRear(2);
		obj.enQueueRear(4);
		obj.enQueueRear(6);
		obj.enQueueRear(8);
		obj.enQueueFront(10);
		obj.display();
		System.out.println("delete from front"+obj.dequeueFront());
		System.out.println("Delete from rear" +obj.dequeueRear());
		obj.display();
		
	}
}
