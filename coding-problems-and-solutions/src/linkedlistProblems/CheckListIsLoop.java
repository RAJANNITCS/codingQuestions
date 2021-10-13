package linkedlistProblems;

public class CheckListIsLoop {

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
	
	public static void makeLoop(Node currentNode) {
		Node tempNode = currentNode;
		if (currentNode == null) {
			System.out.println("list is empty");
		}else {
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = tempNode;
		}
	}
	
	public void displayList() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("Display list");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public boolean checkListHavingLoop() {
		boolean isLoop = false;
		Node currentNode = this.headNode;
		Node tailNode = this.headNode;
		while (currentNode != null && tailNode != null) {
			tailNode = tailNode.next;
			currentNode = currentNode.next;
			if (currentNode != null) {
				currentNode = currentNode.next;
			}
			if (currentNode != null && tailNode != null && tailNode.next == currentNode.next) {
				isLoop = true;
				return isLoop;
			}
		}
		return isLoop;
	}
	
	public static void main(String[] args) {
		CheckListIsLoop obj = new CheckListIsLoop();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(10);
		obj.addNode(12);
		obj.displayList();
//		makeLoop(obj.headNode);
//		obj.displayList();
		if (obj.checkListHavingLoop()) {
			System.out.println("list having loop");
		}else {
			System.out.println("list not have loop");
		}
	}
}
