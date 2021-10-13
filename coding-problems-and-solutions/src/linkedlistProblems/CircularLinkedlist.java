package linkedlistProblems;

public class CircularLinkedlist {

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
	
	public void displayCircularList() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			do {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}while(currentNode != this.headNode);
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void makeLoop(Node headNode) {
		Node currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = headNode;
	}

	public static void main(String[] args) {
		CircularLinkedlist obj = new CircularLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		makeLoop(obj.headNode);
//		obj.display();
		obj.displayCircularList();
	}
}
