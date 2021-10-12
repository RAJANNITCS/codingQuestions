package linkedlistProblems;

public class DeleteFromList {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode;
	public Node tailNode;
	
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
	
	public void display() {
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
	
	public void deleteNode(int poss) {
		Node currentNode = this.headNode;
		Node tailNode = null;
		
		if (poss == 1) {
			this.headNode = this.headNode.next;
			currentNode.next = null;
		}else {
			for(int i = 1; i < poss; i++) {
				tailNode = currentNode;
				currentNode = currentNode.next;
			}
			
			tailNode.next = currentNode.next;
			currentNode.next = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteFromList obj = new DeleteFromList();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.display();
		obj.deleteNode(6);
		obj.display();
	}
}
