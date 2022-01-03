package linkedlistPrograms;

public class CreateAndDisplayCircularLinkedlist {
	
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
			this.tailNode.next = this.headNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
			this.tailNode.next = this.headNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are");
			do {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}while(currentNode != this.headNode);
		}
	}
	
	public void displayV2() {
		Node currentNode = this.headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		CreateAndDisplayCircularLinkedlist obj = new CreateAndDisplayCircularLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.display();
	}
}
