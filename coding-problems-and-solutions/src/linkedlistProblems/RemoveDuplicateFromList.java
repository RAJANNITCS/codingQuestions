package linkedlistProblems;

public class RemoveDuplicateFromList {
	
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
			System.out.println("List is empty");
		}else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void removeDuplicate() {
		Node tailNode = this.headNode;
		Node currentNode = this.headNode.next;
		
		while (currentNode != null) {
			if (tailNode.data != currentNode.data) {
				tailNode = currentNode;
				currentNode = currentNode.next;
			}else {
				tailNode.next = currentNode.next;
				currentNode.next = null;
				currentNode = tailNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicateFromList obj = new RemoveDuplicateFromList();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(4);
		obj.addNode(4);
		obj.addNode(8);
		obj.addNode(8);
		obj.addNode(10);
		obj.displayList();
 		obj.removeDuplicate();
		obj.displayList();
	}
}
