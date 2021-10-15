package linkedlistProblems;

public class FindMiddleNodeOfLinkedlist {

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
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("list is");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void findMiddleNode() {
		int countNode = 0;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			countNode++;
			currentNode = currentNode.next;
		}
		
		int middleNode = (countNode/2);
		currentNode = this.headNode;
		for(int i = 1; i <=middleNode; i++) {
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);
	}
	
	public static void main(String[] args) {
		FindMiddleNodeOfLinkedlist obj = new FindMiddleNodeOfLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(6);
		obj.addNode(7);
		obj.addNode(9);
		obj.addNode(10);
		obj.display();
		System.out.println("mid data");
		obj.findMiddleNode();
	}
}


