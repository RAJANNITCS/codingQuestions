package arrayProblems;

public class ElementPriority {
	
	public int[] quArr = new int[10];
	public int rear = 0;
	
	public void enqueue(int data) {
		
	}
	
	public void display() {
		System.out.println("print queue");
		for(int i =  0; i < this.rear; i++) {
			System.out.println(this.quArr[i]);
		}
	}
	
	public static void main(String[] args) {
		ElementPriority obj = new ElementPriority();
		obj.enqueue(12);
		obj.enqueue(4);
		obj.enqueue(8);
		obj.enqueue(2);
		obj.display();
	}
}
