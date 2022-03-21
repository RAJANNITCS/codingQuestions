package linkedlistCodingQuestion;

class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class ReverseLinkedlist {
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
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void reverseLinkedlist() {
		Node tail2 = null;
		Node tail1 = null;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			tail2 = tail1;
			tail1 = currentNode;
			currentNode = currentNode.next;
			tail1.next = tail2;
		}
		this.headNode = tail1;
	}
	
	public static void main(String[] args) {
		ReverseLinkedlist obj = new ReverseLinkedlist();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		obj.reverseLinkedlist();
		System.out.println("reverse");
		obj.display();
	}
}
