package linkedlistCodingQuestions;

public class CreateAndDisplaySinglyLinkedList {
	public Node headNode = null;
	public Node tailNode = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = headNode;
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
