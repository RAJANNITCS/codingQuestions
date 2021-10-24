package arrayProblems;

public class QueueDataStructureUsingArray {
	
	public int[] queueArr = new int[4];
	public int last = -1;
	
	public void addDataInQueue(int data) {
		this.last++;
		this.queueArr[last] = data;
	}
	
	public void displayQueue() {
		if (this.last == -1) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("Queue is");
			for (int i = 0; i <= last; i++) {
				System.out.println(this.queueArr[i]);
			}
		}
	}
	
	public int deleteFromQueue() {
		int value = 0;
		if (this.last == -1) {
			System.out.println("Queue is empty");
		}else {
			value = this.queueArr[0];
			for (int i = 0; i < this.last; i++) {
				this.queueArr[i] = this.queueArr[i+1];
			}
			this.last--;
		}
		return value;
	}
	
	public void isEmpty() {
		if (this.last == -1) {
			System.out.println("queue is empty");
		}
	}
	
	public void isFull() {
		if (this.last == (this.queueArr.length - 1)) {
			System.out.println("Queue is full");
		}
	}
	
	public int firstValue() {
		if (this.last != -1) {
			return this.queueArr[0];
		}
		return -1;
	}
	
	public int lastValue() {
		if (this.last != -1) {
			return this.queueArr[this.last];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		QueueDataStructureUsingArray obj = new QueueDataStructureUsingArray();
		obj.addDataInQueue(2);
		obj.addDataInQueue(4);
		obj.addDataInQueue(6);
//		obj.addDataInQueue(8);
		obj.displayQueue();
		System.out.println("first value "+ obj.firstValue());
		System.out.println("last value "+ obj.lastValue());
		
	}

}
