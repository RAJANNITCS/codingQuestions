package linkedlistCodingQuestions;

public class CreateCircularDoublyLinkedList {
	public DNode headNode = null;
	public DNode tailNode = null;
	
	public void add(int data) {
		DNode newNode = new DNode(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
			tailNode.next = headNode;
		}else {
			newNode.prev = tailNode;
			tailNode.next = newNode;
			tailNode = newNode;
			tailNode.next = headNode;
		}
	}
	
	public void display() {
		DNode currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		CreateCircularDoublyLinkedList obj = new CreateCircularDoublyLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
	}
}
