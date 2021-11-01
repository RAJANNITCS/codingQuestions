package linkedlistProblems;

public class CheckLinkedlistHasAloop {
	
	class Node {
		public int data;
		public int tempValue;
		public Node next;
		
		public Node (int data) {
			this.data = data;
			this.tempValue = 0;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addData(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void checkListHasLoop() {
		boolean isLoop = false;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			if (currentNode.tempValue == 0) {
				currentNode.tempValue = 1;
				currentNode = currentNode.next;
			}else {
				isLoop = true;
				break;
			}
		}
		if (isLoop) {
			System.out.println("List has a loop");
		}
	}
	
	public void makeLoop() {
		Node currentNode = this.headNode;
		Node tempNode = this.headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		tempNode = tempNode.next;
		currentNode.next = tempNode;
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List is ");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
		CheckLinkedlistHasAloop obj = new CheckLinkedlistHasAloop();
		obj.addData(2);
		obj.addData(4);
		obj.addData(6);
		obj.addData(8);
		obj.addData(10);
		obj.addData(12);
		obj.addData(14);
		obj.display();
//		obj.makeLoop();
//		obj.display();
		obj.checkListHasLoop();
	}
}
