package linkedlistProblems;

public class ReverseLinkedlistUsingSlideringPointer {
	
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
	
	public void reverseList() {
		Node tail2 = null;
		Node tail1 = null;
		Node currentNode = this.headNode;
		
		while (currentNode != null) {
			tail2 = tail1;
			tail1 = currentNode;
			currentNode = currentNode.next;
			tail1.next = tail2;
		}
		
		this.headNode = tail1;
	}
	
	public static void main(String[] args) {
		ReverseLinkedlistUsingSlideringPointer obj = new ReverseLinkedlistUsingSlideringPointer();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.displayList();
		obj.reverseList();
		obj.displayList();
	}
}
