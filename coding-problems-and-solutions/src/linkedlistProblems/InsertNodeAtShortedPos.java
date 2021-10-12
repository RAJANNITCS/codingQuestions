package linkedlistProblems;

public class InsertNodeAtShortedPos {
	
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
	
	public void displayList() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("list is empty");
		}else {
			while(currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void insertAtShortedPos(int value) {
		Node currentNode = this.headNode;
		Node newNode = new Node(value);
		
		if (currentNode.data > value) {
			newNode.next = this.headNode;
			this.headNode = newNode;
		}else {
			while (currentNode.data < value) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		
	}
	
	public static void main(String[] args) {
		InsertNodeAtShortedPos obj = new InsertNodeAtShortedPos();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.displayList();
		obj.insertAtShortedPos(5);
		obj.displayList();
	}
}
