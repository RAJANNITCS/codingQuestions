package linkedlistPrograms;

public class MoveToFront {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public int moveToFront(int value) {
		Node currentNode = this.headNode;
		Node tailNode = null;
		int count = 0;
		if (currentNode.data == value) {
			count++;
			return count;
		}
		
		while (currentNode.next != null) {
			tailNode = currentNode;
			currentNode = currentNode.next;
			if (currentNode.data == value) {
				tailNode.next = currentNode.next;
				currentNode.next = this.headNode;
				this.headNode = currentNode;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		MoveToFront obj = new MoveToFront();
		obj.add(2);
		obj.add(4);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		obj.moveToFront(10);
		obj.display();

		
	}
}

