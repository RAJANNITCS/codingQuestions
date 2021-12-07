package linkedlistPrograms;

public class ReverseLinkedlist {
	
	class Node {
		public int data;
		public Node next;
		
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addNode (int data) {
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
			System.out.println("List elments are");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void reverseLinkedlist() {
		Node currentNode = this.headNode;
		Node tail2Node = null;
		Node tail1Node = null;
		
		while (currentNode != null) {
			tail2Node = tail1Node;
			tail1Node = currentNode;
			currentNode = currentNode.next;
			tail1Node.next = tail2Node;
		}
		this.headNode = tail1Node;
	}
	
	public static void main(String[] args) {
		ReverseLinkedlist obj = new ReverseLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.display();
		obj.reverseLinkedlist();
		obj.display();
	}
}
