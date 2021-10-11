package linkedlistProblems;

public class CreateAndDiplaySinglyLinkedlist {
	
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
	
	public void dispayV1() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void displayV2(Node current) {
		if (current != null) {
			System.out.println(current.data);
			displayV2(current.next);
		}
	}
	
	// we can use this method for reversing linkedlist
	public void displayV3(Node current) {
		if (current != null) {
			displayV3(current.next);
			System.out.println(current.data);
		}
	}
	
	
	public static void main(String[] args) {
		CreateAndDiplaySinglyLinkedlist obj = new CreateAndDiplaySinglyLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
//		obj.dispayV1();
//		obj.displayV2(obj.headNode);
		obj.displayV3(obj.headNode);
	}
}
