package linkedlistCodingQuestions;

public class CreateDoublyLinkedList {
	public DNode headNode;
	public DNode tailNode;
	
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
	
	public static void main(String[] args) {
		CreateAndDisplaySinglyLinkedList obj = new CreateAndDisplaySinglyLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.display();
		
	}
}
