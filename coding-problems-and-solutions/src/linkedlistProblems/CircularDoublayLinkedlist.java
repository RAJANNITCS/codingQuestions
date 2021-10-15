package linkedlistProblems;

public class CircularDoublayLinkedlist {

	class Node {
		public Node prev;
		public int data;
		public Node next;
		
		public Node(int data) {
			this.prev = null;
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
			newNode.prev = tailNode;
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public static void makeCircularDoublayLinkedlist(Node headNode) {
		Node currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = headNode;
		headNode.prev = currentNode;
	}
	
	
	public void displayDoublyCircularLinkedlist() {
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
	
	public static void main(String[] args) {
		CircularDoublayLinkedlist obj = new CircularDoublayLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(9);
		obj.addNode(10);
		makeCircularDoublayLinkedlist(obj.headNode);
		obj.displayDoublyCircularLinkedlist();
	}

}
