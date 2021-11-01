package queue;

public class CreateQueueUsingLinkedlist {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node frontNode = null;
	public Node rearNode = null;
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (frontNode == null) {
			this.frontNode = newNode;
			this.rearNode = newNode;
		}else {
			this.rearNode.next = newNode;
			this.rearNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.frontNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public int dequeue() {
		int value = -1;
		Node currentNode = this.frontNode;
		value = currentNode.data;
		this.frontNode = this.frontNode.next;
		currentNode.next = null;
		return value;
	}
	
	public static void main(String[] args) {
		CreateQueueUsingLinkedlist obj = new CreateQueueUsingLinkedlist();
		obj.enqueue(2);
		obj.enqueue(4);
		obj.enqueue(6);
		obj.enqueue(8);
		obj.enqueue(10);
		obj.enqueue(12);
		obj.display();
		System.out.println("delete value is "+obj.dequeue());
		obj.display();
	}
}
