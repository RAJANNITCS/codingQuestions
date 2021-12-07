package linkedlistPrograms;

public class DeleteANodeFromList {
	
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
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void disply() {
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
	
	public int deleteNode(int poss) {
		Node currentNode = this.headNode;
		Node tailNode = null;
		int data = 0;
		int count = 0;
		if (poss == 1) {
			data = currentNode.data;
			this.headNode = this.headNode.next;
			currentNode.next = null;
			return data;
		}
		
		while (currentNode != null) {
			count++;
			tailNode = currentNode;
			currentNode = currentNode.next;
			if (count == poss) {
				data = currentNode.data;
				tailNode.next = currentNode.next;
				currentNode.next = null;
			}
		}
		return data;
	}
	
	public static void main(String[] args) {
		DeleteANodeFromList obj = new DeleteANodeFromList();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.disply();
		System.out.println("delete data "+ obj.deleteNode(6));
		obj.disply();
	}
}
