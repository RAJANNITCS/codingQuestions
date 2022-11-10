package linkedlistCodingQuestions;

public class InsertNodeInDoublyLinkedList {
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
	
	public void insert(int poss, int data) {
		DNode newNode = new DNode(data);
		DNode currentNode = headNode;
		if (poss == 1) {
			currentNode.prev = newNode;
			newNode.next = currentNode;
			headNode = newNode;
		}else {
			for (int i = 1; i < poss; i++) {
				currentNode = currentNode.next;
			}
			
			newNode.prev = currentNode.prev;
			currentNode.prev.next = newNode;
			currentNode.prev = newNode;
			newNode.next = currentNode;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeInDoublyLinkedList obj = new InsertNodeInDoublyLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.display();
		System.out.println("after inserting ");
		obj.insert(4, 22);
		obj.display();
	}
}
