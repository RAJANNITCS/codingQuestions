package linkedlistProblems;

public class InsertingLinkedlist {
		
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void displyList() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void insertNode(int pos, int value) {
		Node newNode = new Node(value);
		Node currentNode = this.headNode;
		if (pos == 1) {
			newNode.next = this.headNode;
			this.headNode = newNode;
		}else {
			for (int i = 1; i < pos - 1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}
	
	public static void main(String[] args) {
		InsertingLinkedlist obj = new InsertingLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.displyList();
		obj.insertNode(6, 22);
		obj.displyList();
	}
}
