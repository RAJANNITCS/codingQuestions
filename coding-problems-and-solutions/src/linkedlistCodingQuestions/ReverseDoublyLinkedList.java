package linkedlistCodingQuestions;

public class ReverseDoublyLinkedList {
	public DNode headNode = null;
	public DNode tailNode = null;
	
	public void add(int data) {
		DNode newNode = new DNode(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
		}else {
			newNode.prev = tailNode;
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void display() {
		DNode currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void reverseDoublyLinkedList() {
		DNode tailNo2 = null;
		DNode tailNo1 = null;
		DNode currentNode = headNode;
		while (currentNode != null) {
			tailNo2 = tailNo1;
			tailNo1 = currentNode;
			currentNode = currentNode.next;
			tailNo1.next = tailNo2;
			tailNo1.prev = currentNode;
		}
		
		headNode = tailNo1;
	}
	
	public static void main(String[] args) {
		ReverseDoublyLinkedList obj = new ReverseDoublyLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("After reverse");
		obj.reverseDoublyLinkedList();
		obj.display();
	}
}
