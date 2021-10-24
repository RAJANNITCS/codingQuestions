package arrayProblems;

public class QueueDataStructureArrayUsingTwoPointer {
	
	public int[] queueArr = new int[10];
	public int first = 0;
	public int last = -1;
	
	public void addDataInQueue(int data) {
		this.last++;
		this.queueArr[this.last] = data;
	}
	
	public void display() {
		if (this.last == -1) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("queue is");
			for (int i = 0; i < this.last; i++) {
				System.out.println(this.queueArr[i]);
			}
		}
	}
	
	public int deleteFromQueue() {
		int value = 0;
		if (this.last == -1) {
			System.out.println("Queue is empty");
		}else {
			value = this.queueArr[first];
			this.first++;
		}
		if (this.first)
		return value;
	}
 	
	public static void main(String[] args) {
		
	}
}
