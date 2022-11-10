package linkedlistCodingQuestions;


public class DeleteNodeFromDoublyLinkedlist {
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
	
	public int deleteNode(int poss) {
		int value = 0;
		DNode currentNode = headNode;
		if (poss == 1) {
			value = currentNode.data;
			currentNode = currentNode.next;
			headNode = currentNode;
		}else {
			for (int i = 1; i < poss; i++) {
				currentNode = currentNode.next;
			}
			value = currentNode.data;
			currentNode.prev.next = currentNode.next;
			currentNode.next.prev = currentNode.prev;
		}
		return value;
	}
	
	public static void main(String[] args) {
		DeleteNodeFromDoublyLinkedlist obj = new DeleteNodeFromDoublyLinkedlist();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.display();
		System.out.println("Delete value is "+ obj.deleteNode(3));
		obj.display();
	}
}
