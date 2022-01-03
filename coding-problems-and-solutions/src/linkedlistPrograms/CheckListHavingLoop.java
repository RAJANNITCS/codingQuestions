package linkedlistPrograms;

public class CheckListHavingLoop {
	
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
	
	public static void createLinkedlistLoop(Node currentNode) {
		Node tailNode = currentNode;
		tailNode = tailNode.next;
		tailNode = tailNode.next;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = tailNode;
	}
	
	public static void checkLinkedlistHavingLoop(Node currentNode) {
		Node tailNode = currentNode;
		boolean isHavingLoop = false;
		while (currentNode != null && tailNode != null) {
			tailNode = tailNode.next;
			currentNode = currentNode.next;
			if (currentNode != null && currentNode.next != null) {
				currentNode = currentNode.next;
			}
			
			if (currentNode != null && tailNode != null && tailNode.data == currentNode.data) {
				isHavingLoop = true;
				break;
			}
		}
		if (isHavingLoop) {
			System.out.println("List having loop");
		}else {
			System.out.println("list not having loop");
		}
	}
	
	public static void main(String[] args) {
		CheckListHavingLoop obj = new CheckListHavingLoop();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.display();
//		createLinkedlistLoop(obj.headNode);
//		obj.display();
		checkLinkedlistHavingLoop(obj.headNode);
	}
}
