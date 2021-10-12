package linkedlistProblems;

public class MoveToFront {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
			return;
		}
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public int moveToFront(int value) {
		Node currentNode = this.headNode;
		int countNode = 0;
		Node tailNode = null;
		if (currentNode.data == value) {
			countNode++;
			return countNode;
		}
		while (currentNode != null) {
			countNode++;
			if (currentNode.data == value) {
				tailNode.next = currentNode.next;
				currentNode.next = this.headNode;
				this.headNode = currentNode;
				return countNode;
			}
			tailNode = currentNode;
			currentNode = currentNode.next;
		}
		return countNode;
	}
	
	public static void main(String[] args) {
		MoveToFront obj = new MoveToFront();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(8);
		obj.addNode(10);
		obj.display();
		System.out.println("position of the node is ="+ obj.moveToFront(10));
		obj.display();
	}
}
