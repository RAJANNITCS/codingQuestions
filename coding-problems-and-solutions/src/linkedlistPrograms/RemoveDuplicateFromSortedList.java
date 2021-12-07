package linkedlistPrograms;

public class RemoveDuplicateFromSortedList {
	
	class Node {
		public int data;
		public Node next;
		
		public Node (int data) {
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
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void removeDuplicate() {
		Node currentNode = this.headNode;
		Node tailNode = this.headNode;
		currentNode  = currentNode.next;
		while (currentNode != null) {
			if (tailNode.data == currentNode.data) {
				tailNode.next = currentNode.next;
				currentNode = currentNode.next;
			}else {
				tailNode = currentNode;
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicateFromSortedList obj = new RemoveDuplicateFromSortedList();
		obj.addNode(2);
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(4);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(14);
		obj.display();
		obj.removeDuplicate();
		obj.display();
		
	}
}
