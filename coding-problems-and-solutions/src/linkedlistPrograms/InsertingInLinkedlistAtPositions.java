package linkedlistPrograms;

public class InsertingInLinkedlistAtPositions {
	
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
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are ");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void insertAtGivenPosition(int pos, int value) {
		Node currentNode = this.headNode;
		Node tailNode = null;
		int count = 0;
		Node newNode = new Node(value);
		if (pos == 1) {
			count++;
			newNode.next = this.headNode;
			this.headNode = newNode;
			return;
		}
		while (currentNode != null) {
			count++;
			tailNode = currentNode;
			currentNode = currentNode.next;
			if (pos == count ) {
				newNode.next = currentNode;
				tailNode.next = newNode;
			}
		}
	}
	
	public static void main(String[] args) {
		InsertingInLinkedlistAtPositions obj = new InsertingInLinkedlistAtPositions();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		obj.insertAtGivenPosition(6,22);
		obj.display();
	}
}
