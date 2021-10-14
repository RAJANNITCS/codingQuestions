package linkedlistProblems;

public class InsertingInCircularLinkedlist {
	
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
	
	public void displayCirculeLinkedlist() {
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
	
	public static void makeChicular(Node headNode) {
		Node currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = headNode;
	}
	
	public void insertDataInLinkedlist(int poss, int value) {
		Node currentNode = this.headNode;
		Node newNode = new Node(value);
		if (poss == 1) {
			newNode.next = this.headNode;
			while (currentNode.next != this.headNode) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			this.headNode = newNode;
		}else {
			for (int i = 1; i < poss - 1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}
	
	public static void main(String[] args) {
		InsertingInCircularLinkedlist obj = new InsertingInCircularLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		makeChicular(obj.headNode);
		obj.displayCirculeLinkedlist();
		obj.insertDataInLinkedlist(1, 22);
		obj.displayCirculeLinkedlist();
	}
}
