package linkedlistProblems;

public class DeleteFromCircularLinkedlist {
	
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
	
	public static void makeCircularLinkedlist(Node headNode) {
		Node currentNode = headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			
			currentNode.next = headNode;
		}
	}
	
	public void displayCircularLinkedlist() {
		Node currentNode = this.headNode;
		System.out.println("List is");
		do {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}while(currentNode != this.headNode);
	}
	
	public void deleteNodeFromCircularLinkedlist(int poss) {
		Node currentNode = this.headNode;
		Node tailNode = null;
		if (poss == 1) {
			while (currentNode.next != this.headNode) {
				currentNode = currentNode.next;
			}
			currentNode.next = this.headNode.next;
			this.headNode = this.headNode.next;
		}else {
			for (int i = 1; i < poss; i++) {
				tailNode = currentNode;
				currentNode = currentNode.next;
			}
			
			tailNode.next = currentNode.next;
			currentNode.next = null;
			
		}
	}
	
	public static void main(String[] args) {
		DeleteFromCircularLinkedlist obj = new DeleteFromCircularLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		makeCircularLinkedlist(obj.headNode);
		obj.displayCircularLinkedlist();
		obj.deleteNodeFromCircularLinkedlist(2);
		obj.displayCircularLinkedlist();
	}
}
