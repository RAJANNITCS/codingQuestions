package linkedlistCodingQuestions;

public class InsertNodeInSinglyLinkedList {
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
	
	public void insertNode(int data, int pos) {
		Node currentNode = headNode;
		Node newNode = new Node(data);
		if (pos == 1) {
			newNode.next = currentNode;
			headNode = newNode;
		}else {
			for (int i = 1; i < pos; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeInSinglyLinkedList obj = new InsertNodeInSinglyLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("after inserting value");
		obj.insertNode(22, 6);
		obj.display();
		
	}
}
