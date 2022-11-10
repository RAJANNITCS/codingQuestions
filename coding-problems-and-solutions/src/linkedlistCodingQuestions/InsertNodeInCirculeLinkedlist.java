package linkedlistCodingQuestions;

public class InsertNodeInCirculeLinkedlist {
	public Node headNode;
	public Node tailNode;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
			tailNode.next = headNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
			tailNode.next = headNode;
		}
	}
	
	public void display() {
		Node currentNode = headNode;
		do {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}while (currentNode.next != headNode.next);
	}
	
	public void insertNode(int poss, int value) {
		Node newNode = new Node(value);
		Node currentNode = headNode;
		if (poss == 1) {
			newNode.next = currentNode;
			while (currentNode.next != headNode) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			headNode = newNode;
		}else {
			Node tailNo = null;
			for (int i = 1; i < poss; i++) {
				tailNo = currentNode;
				currentNode = currentNode.next;
			}
			newNode.next = tailNo.next;
			tailNo.next = newNode;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeInCirculeLinkedlist obj = new InsertNodeInCirculeLinkedlist();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("after insert");
		obj.insertNode(7, 22);
		obj.display();
	}
}
